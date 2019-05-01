/**
 * 
 */
package Presentacion.Envios;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import Integracion.Envios.TEnvio;
import Presentacion.Ventana;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;
import Presentacion.Controlador.Controller;

public class PanelAddEnvio extends JPanel implements Ventana{
	
	private static final long serialVersionUID = 1L;
	private JTextField direccion;
	
	public PanelAddEnvio() {
		setLayout(null);
		setOpaque(false);
		
		direccion = new JTextField();
		direccion.setColumns(10);
		direccion.setBounds(109, 148, 279, 57);
		add(direccion);

		JLabel label_1 = new JLabel("Direccion");
		label_1.setBounds(37, 169, 75, 14);
		add(label_1);

		JRadioButton activoRB = new JRadioButton("Activo");
		activoRB.setToolTipText("Activo");
		activoRB.setBounds(141, 350, 109, 23);
		activoRB.setOpaque(false);
		JRadioButton inactivoRB = new JRadioButton("Inactivo");
		activoRB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				inactivoRB.setSelected(false);
				activoRB.setSelected(true);
			}
		});
		add(activoRB);

		inactivoRB.setBounds(255, 350, 109, 23);
		inactivoRB.setOpaque(false);
		add(inactivoRB);
		inactivoRB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				inactivoRB.setSelected(true);
				activoRB.setSelected(false);
			}
		});
		JButton button = new JButton("Añadir Envío");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean ok = false ;
				if(activoRB.isSelected()) 
					ok = true;
				TEnvio envio = new TEnvio((Integer) null, ok, direccion.getText());
				Contexto contexto = new Contexto(Evento.createEnvioCommand, envio);
				Controller.getInstance().ejecutar(contexto);
				
			}
		});
		button.setBounds(169, 382, 132, 40);
		add(button);
		
		JLabel lblAadirCliente = new JLabel("A\u00D1ADIR ENVIO");
		lblAadirCliente.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAadirCliente.setBounds(37, 13, 162, 32);
		add(lblAadirCliente);
		
		
	}
	public void Actualizar(Contexto contexto) {
		// TODO Auto-generated method stub
		
	}
}