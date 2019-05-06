/**
 * 
 */
package Presentacion.Clientes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import Integracion.Clientes.TCliente;
import Presentacion.Ventana;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;
import Presentacion.Controlador.Controller;

public class PanelUpdateClientes extends JPanel implements Ventana{
	private JTextField dni;
	private JTextField nombre;
	private JTextField telefono;
	private JTextField direccion;
	private JTextField botonfindtext;
	private JLabel label ;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private TCliente c;

	/**
	 * Create the panel.
	 */
	public PanelUpdateClientes() {
		setLayout(null);
		setOpaque(false);
		dni = new JTextField();
		dni.setColumns(10);
		dni.setBounds(49, 80, 279, 57);
		// add(dni);

		label = new JLabel("DNI");
		label.setBounds(386, 101, 46, 14);

		nombre = new JTextField();
		nombre.setColumns(10);
		nombre.setBounds(49, 148, 279, 57);

		label_1 = new JLabel("Nombre");
		label_1.setBounds(386, 169, 46, 14);

		telefono = new JTextField();
		telefono.setColumns(10);
		telefono.setBounds(49, 216, 279, 57);

		label_2= new JLabel("Telefono");
		label_2.setBounds(386, 237, 75, 14);
		
		direccion = new JTextField();
		direccion.setColumns(10);
		direccion.setBounds(49, 284, 279, 57);

		 label_3 = new JLabel("Direcci�n");
		label_3.setBounds(386, 305, 75, 14);


		JButton button = new JButton("Actualizar");

		button.setBounds(517, 329, 132, 43);
		// add(button);
		add(button);
		button.setVisible(false);
		botonfindtext = new JTextField();
		botonfindtext.setBounds(49, 29, 368, 20);
		add(botonfindtext);
		botonfindtext.setColumns(10);

		JButton botonFind = new JButton("Buscar");

		botonFind.setBounds(427, 28, 222, 23);
		add(botonFind);

		JRadioButton activoRB = new JRadioButton("Activo");
		JRadioButton inactivoRB = new JRadioButton("Inactivo");
		activoRB.setVisible(false);
		inactivoRB.setVisible(false);
		activoRB.setToolTipText("Activo");
		activoRB.setBounds(49, 349, 109, 23);
		activoRB.setOpaque(false);
		botonFind.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				
					Contexto contexto = new Contexto(Evento.readClienteCommand, Integer.valueOf(botonfindtext.getText()));
					Controller.getInstance().ejecutar(contexto);
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
				boolean ok = false;
				if (activoRB.isSelected())
					ok = true;
				c.setDNI(dni.getText());
				c.setNombre(nombre.getText());
				c.setTelefono(Integer.valueOf(telefono.getText()));
				c.setDireccion(direccion.getText());
				c.setActivo(ok);
				try {
					Contexto contexto = new Contexto(Evento.updateClienteCommand, (TCliente) c);
					Controller.getInstance().ejecutar(contexto);
				} catch (Exception ex) {;}
			}
		});

	}

	@Override
	public void Actualizar(Contexto contexto) {
		/*
		c = (TCliente) contexto.getDatos();
		dni.setText(c.getDNI());
		add(dni);
		add(label);
		nombre.setText(c.getNombre());
		add(nombre);
		add(label_1);
		telefono.setText(c.getTelefono().toString());
		add(telefono);
		add(label_2);
		direccion.setText(c.getDireccion().toString());
		add(direccion);
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
		dni.setText("");
		nombre.setText("");
		telefono.setText("");

	}

}
		*/
	}
}