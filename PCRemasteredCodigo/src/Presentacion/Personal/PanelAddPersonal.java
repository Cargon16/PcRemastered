/**
 * 
 */
package Presentacion.Personal;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import Integracion.Personal.TPersonal;
import Negocio.ComprobadorSintactico.ComprobadorSintactico;
import Presentacion.Ventana;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;
import Presentacion.Controlador.Controller;
import java.awt.SystemColor;


public class PanelAddPersonal extends JPanel implements Ventana{
	private static final long serialVersionUID = 1L;

	private JTextField passText;
	private JTextField nombreText;
	private JTextField telefonoText;
	private JTextField salarioText;
	private JRadioButton activoRB;
	private JRadioButton inactivoRB;
	private JButton button;

	public PanelAddPersonal(){

		initComponent();


	}

	public void initComponent(){
		setLayout(null);
		setOpaque(false);

		nombreText = new JTextField();
		nombreText.setColumns(10);
		nombreText.setBounds(109, 58, 279, 57);
		add(nombreText);

		JLabel label_1 = new JLabel("Nombre");
		label_1.setBounds(37, 79, 75, 14);
		add(label_1);

		passText = new JTextField();
		passText.setColumns(10);
		passText.setBounds(109, 128, 279, 57);
		add(passText);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(37, 149, 75, 14);
		add(lblContrasea);

		telefonoText = new JTextField();
		telefonoText.setColumns(10);
		telefonoText.setBounds(109, 198, 279, 57);
		add(telefonoText);

		JLabel label_2 = new JLabel("Telefono");
		label_2.setBounds(37, 219, 75, 14);
		add(label_2);


		salarioText = new JTextField();
		salarioText.setColumns(10);
		salarioText.setBounds(109, 268, 279, 57);
		add(salarioText);

		JLabel labelDIreccion = new JLabel("Salario");
		labelDIreccion.setBounds(37, 289, 75, 14);
		add(labelDIreccion);

		activoRB = new JRadioButton("Activo");
		activoRB.setToolTipText("Activo");
		activoRB.setBounds(141, 350, 109, 23);
		activoRB.setOpaque(false);
		inactivoRB = new JRadioButton("Inactivo");
		activoRB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				inactivoRB.setSelected(false);
				activoRB.setSelected(true);
			}
		});
		add(activoRB);

		inactivoRB.setBounds(241, 350, 109, 23);
		inactivoRB.setOpaque(false);
		add(inactivoRB);
		inactivoRB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				inactivoRB.setSelected(true);
				activoRB.setSelected(false);
			}
		});
		button = new JButton("Añadir");
		button.setBackground(SystemColor.textHighlight);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean ok = false ;
				if(activoRB.isSelected()) 
					ok = true;
				if(ComprobadorSintactico.getInstance().isNumeric(salarioText.getText()) && ComprobadorSintactico.getInstance().isNumeric(telefonoText.getText())&& ComprobadorSintactico.getInstance().isAlphabetic(nombreText.getText()) ){
					TPersonal personal = new TPersonal(passText.getText(), ok, Double.valueOf(salarioText.getText()), null, Integer.valueOf(telefonoText.getText()), nombreText.getText());
					Contexto contexto = new Contexto(Evento.createPersonalCommand, personal);
					Controller.getInstance().ejecutar(contexto);
				}else{
					JOptionPane.showMessageDialog(null, "Datos incorrectos, comprueba sintacticamente los datos introducidos.");
				}
				

			}
		});
		button.setBounds(151, 382, 132, 40);
		add(button);

		JLabel lblAadirCliente = new JLabel("A\u00D1ADIR PERSONAL");
		lblAadirCliente.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAadirCliente.setBounds(37, 13, 162, 32);
		add(lblAadirCliente);


	}
	@Override
	public void Actualizar(Contexto contexto) {
		// TODO Auto-generated method stub
		this.revalidate();
		this.repaint();

	}
	
	public void resetCamps(){
		passText.setText(null);
		nombreText.setText(null);
		telefonoText.setText(null);
		salarioText.setText(null);
		activoRB.setSelected(false);
		inactivoRB.setSelected(false);
		
		
		
	}
}