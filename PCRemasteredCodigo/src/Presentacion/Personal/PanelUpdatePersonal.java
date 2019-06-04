/**
 * 
 */
package Presentacion.Personal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import Integracion.Clientes.TCliente;
import Integracion.Personal.TPersonal;
import Negocio.ComprobadorSintactico.ComprobadorSintactico;
import Presentacion.Ventana;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;
import Presentacion.Controlador.Controller;
import java.awt.SystemColor;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author nacho710
 * @uml.annotations
 *     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_4Ao7AE8iEemfNOmfBQSQBw"
 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_4Ao7AE8iEemfNOmfBQSQBw"
 */
public class PanelUpdatePersonal extends JPanel implements Ventana {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField Nombre;
	private JTextField salario;
	private JTextField telefono;
	private JTextField contrasena;
	private JTextField botonfindtext;
	private JButton button;
	private JButton botonFind;
	private JRadioButton activoRB;
	private JRadioButton inactivoRB;

	private TPersonal c;

	/**
	 * Create the panel.
	 */
	public PanelUpdatePersonal() {
		setLayout(null);
		setOpaque(false);
		Nombre = new JTextField();
		Nombre.setColumns(10);
		Nombre.setBounds(49, 80, 279, 57);

		JLabel label = new JLabel("Nombre");
		label.setBounds(386, 101, 46, 14);

		salario = new JTextField();
		salario.setColumns(10);
		salario.setBounds(49, 148, 279, 57);

		JLabel label_1 = new JLabel("Salario");
		label_1.setBounds(386, 169, 46, 14);

		telefono = new JTextField();
		telefono.setColumns(10);
		telefono.setBounds(49, 216, 279, 57);

		JLabel label_2 = new JLabel("Telefono");
		label_2.setBounds(386, 237, 75, 14);

		contrasena = new JTextField();
		contrasena.setColumns(10);
		contrasena.setBounds(49, 284, 279, 57);

		JLabel label_3 = new JLabel("Contrase�a");
		label_3.setBounds(386, 305, 75, 14);


		button = new JButton("Actualizar");
		button.setBackground(SystemColor.textHighlight);

		button.setBounds(517, 329, 132, 43);
		add(button);
		button.setVisible(false);
		botonfindtext = new JTextField();
		botonfindtext.setBounds(49, 29, 368, 20);
		add(botonfindtext);
		botonfindtext.setColumns(10);

		botonFind = new JButton("Buscar");
		botonFind.setBackground(SystemColor.textHighlight);

		botonFind.setBounds(427, 28, 222, 23);
		add(botonFind);

		activoRB = new JRadioButton("En n�mina");
		inactivoRB = new JRadioButton("Despedido");
		activoRB.setVisible(false);
		inactivoRB.setVisible(false);
		activoRB.setToolTipText("En n�mina");
		activoRB.setBounds(49, 349, 109, 23);
		activoRB.setOpaque(false);

		botonFind.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					if(ComprobadorSintactico.getInstance().isNumeric(botonfindtext.getText())){
						Contexto contexto = new Contexto(Evento.readPersonalCommand, Integer.valueOf(botonfindtext.getText()));
						Controller.getInstance().ejecutar(contexto);
						c = (TPersonal) contexto.getDatos();
					}else{
						JOptionPane.showMessageDialog(null, "Datos incorrectos, el ID a eliminar debe ser un numero");
					}

					Nombre.setText(c.getNombre());
					add(Nombre);
					add(label);
					salario.setText(c.getSalario().toString());
					add(salario);
					add(label_1);
					telefono.setText(c.getTelefono().toString());
					add(telefono);
					add(label_2);
					contrasena.setText(c.getPass());
					add(contrasena);
					add(label_3);
					inactivoRB.setSelected(false);
					activoRB.setSelected(false);
					if (c.isActivo())
						activoRB.setSelected(true);
					else
						inactivoRB.setSelected(true);
					activoRB.setVisible(true);
					inactivoRB.setVisible(true);

					button.setVisible(true);

					repaint();
				}

				catch (Exception ex) {
					Nombre.setText("");
					contrasena.setText("");
					telefono.setText("");
					salario.setText("");

				}

			}
		});

		activoRB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				inactivoRB.setSelected(false);
				activoRB.setSelected(true);
			}
		});
		add(activoRB);

		inactivoRB.setBounds(158, 349, 109, 23);
		inactivoRB.setOpaque(false);
		add(inactivoRB);
		inactivoRB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				inactivoRB.setSelected(true);
				activoRB.setSelected(false);
			}
		});

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(ComprobadorSintactico.getInstance().nombreCorrect(Nombre.getText()) && ComprobadorSintactico.getInstance().isNumeric(salario.getText()) && ComprobadorSintactico.getInstance().isNumeric(telefono.getText())){
					boolean ok = false;
					if (activoRB.isSelected())
						ok = true;
					c.setNombre(Nombre.getText());
					c.setSalario(Double.valueOf(salario.getText()));
					c.setTelefono(Integer.valueOf(telefono.getText()));
					c.setPass(contrasena.getText());
					c.setActivo(ok);
					
					try {
						Contexto contexto = new Contexto(Evento.updatePersonalCommand, (TPersonal) c);
						Controller.getInstance().ejecutar(contexto);
					} catch (Exception ex) {;}
					
				}else{
					JOptionPane.showMessageDialog(null, "Datos incorrectos, comprueba sintacticamente los datos introducidos");
				}


			}
		});

	}

	@Override
	public void Actualizar(Contexto contexto) {
		// TODO Auto-generated method stub

		try{
			c = (TPersonal) contexto.getDatos();
			Nombre.setText(c.getNombre());
			add(Nombre);
			salario.setText(c.getSalario().toString());
			add(salario);
			telefono.setText(c.getTelefono().toString());
			add(telefono);
			contrasena.setText(c.getPass());
			add(contrasena);
			inactivoRB.setSelected(false);
			activoRB.setSelected(false);
			if (c.isActivo())
				activoRB.setSelected(true);
			else
				inactivoRB.setSelected(true);
			activoRB.setVisible(true);
			inactivoRB.setVisible(true);

			button.setVisible(true);

			repaint();
		}

		catch (Exception ex) {
			Nombre.setText("");
			contrasena.setText("");
			telefono.setText("");
			salario.setText("");

		}

	}

	public void resetCamps(){
		Nombre.setText(null);
		salario.setText(null);
		telefono.setText(null);
		contrasena.setText(null);
		activoRB.setSelected(false);
		inactivoRB.setSelected(false);
		botonfindtext.setText(null);


	}
}