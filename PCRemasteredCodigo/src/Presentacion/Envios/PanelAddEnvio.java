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
	private JRadioButton activoRB;
	private JRadioButton inactivoRB;
	private JButton button;
	
	public PanelAddEnvio(){
		
		initComponents();
	}
	
	
	public void initComponents() {
		setLayout(null);
		setOpaque(false);
		
		direccion = new JTextField();
		direccion.setColumns(10);
		direccion.setBounds(109, 86, 279, 32);
		add(direccion);

		JLabel lblDireccin = new JLabel("Direcci\u00F3n");
		lblDireccin.setBounds(37, 95, 75, 14);
		add(lblDireccin);

		activoRB = new JRadioButton("En curso");
		activoRB.setToolTipText("Activo");
		activoRB.setBounds(109, 165, 109, 23);
		activoRB.setOpaque(false);
		inactivoRB = new JRadioButton("Entregado");
		activoRB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				inactivoRB.setSelected(false);
				activoRB.setSelected(true);
			}
		});
		add(activoRB);

		inactivoRB.setBounds(279, 165, 109, 23);
		inactivoRB.setOpaque(false);
		add(inactivoRB);
		inactivoRB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				inactivoRB.setSelected(true);
				activoRB.setSelected(false);
			}
		});
		button = new JButton("Añadir Envío");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean ok = false ;
				if(activoRB.isSelected()) 
					ok = true;
				TEnvio envio = new TEnvio(null, ok, direccion.getText());
				Contexto contexto = new Contexto(Evento.createEnvioCommand, envio);
				Controller.getInstance().ejecutar(contexto);
				
			}
		});
		button.setBounds(162, 197, 132, 40);
		add(button);
		
		JLabel lblAadirCliente = new JLabel("A\u00D1ADIR ENVIO");
		lblAadirCliente.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAadirCliente.setBounds(37, 13, 162, 32);
		add(lblAadirCliente);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(37, 168, 56, 16);
		add(lblEstado);
		
		
	}
	public void Actualizar(Contexto contexto) {
		// TODO Auto-generated method stub
		this.revalidate();
		this.repaint();
	}
	
	public void resetCamps(){
		direccion.setText(null);
		activoRB.setSelected(false);
		inactivoRB.setSelected(false);
		
	}
}