/**
 * 
 */
package Presentacion.Envios;

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
import java.awt.SystemColor;

public class PanelUpdateEnvio extends JPanel implements Ventana{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField Direccion;
	private JTextField botonfindtext;
	private JButton botonFind;
	private JButton button;
	private JRadioButton activoRB;
	private JRadioButton inactivoRB;

	private TEnvio c;

	/**
	 * Create the panel.
	 */
	
	public PanelUpdateEnvio(){
		initComponent();
	}
	
	public void initComponent() {
		setLayout(null);
		setOpaque(false);
		Direccion = new JTextField();
		Direccion.setColumns(10);
		Direccion.setBounds(49, 80, 279, 57);
	

		JLabel label = new JLabel("Direccion");
		label.setBounds(386, 101, 100, 14);

		button = new JButton("Actualizar");
		button.setBackground(SystemColor.textHighlight);

		button.setBounds(427, 206, 150, 33);

		add(button);
		button.setVisible(false);
		botonfindtext = new JTextField();
		botonfindtext.setBounds(49, 46, 366, 22);
		add(botonfindtext);
		botonfindtext.setColumns(10);

		botonFind = new JButton("Buscar");
		botonFind.setBackground(SystemColor.textHighlight);

		botonFind.setBounds(427, 45, 150, 23);
		add(botonFind);

		activoRB = new JRadioButton("En curso");
		inactivoRB = new JRadioButton("Entregado");
		activoRB.setVisible(false);
		inactivoRB.setVisible(false);
		activoRB.setToolTipText("En curso");
		activoRB.setBounds(49, 206, 109, 23);
		activoRB.setOpaque(false);
		botonFind.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					Contexto contexto = new Contexto(Evento.readEnvioCommand, Integer.valueOf(botonfindtext.getText()));
					Controller.getInstance().ejecutar(contexto);
					c = (TEnvio) contexto.getDatos();
					Direccion.setText(c.getDireccion());
					add(Direccion);
					add(label);
					inactivoRB.setSelected(false);
					activoRB.setSelected(false);
					if (c.isEstado())
						activoRB.setSelected(true);
					else
						inactivoRB.setSelected(true);
					activoRB.setVisible(true);
					inactivoRB.setVisible(true);

					button.setVisible(true);

					repaint();
				}

				catch (Exception ex) {
					Direccion.setText("");
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

		inactivoRB.setBounds(162, 206, 109, 23);
		inactivoRB.setOpaque(false);
		add(inactivoRB);
		
		JLabel lblIntroduceElId = new JLabel("Introduce el ID del env\u00EDo");
		lblIntroduceElId.setBounds(49, 17, 150, 16);
		add(lblIntroduceElId);
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
				c.setDireccion(Direccion.getText());
				c.setEstado(ok);
				try {
					Contexto contexto = new Contexto(Evento.updateEnvioCommand, (TEnvio) c);
					Controller.getInstance().ejecutar(contexto);
				} catch (Exception ex) {;}
			}
		});

	}

	@Override
	public void Actualizar(Contexto contexto) {
		// TODO Auto-generated method stub
		
	}
	
	public void resetCamps(){
		
		Direccion.setText(null);
		botonfindtext.setText(null);
		activoRB.setSelected(false);
		inactivoRB.setSelected(false);
		
	}
}