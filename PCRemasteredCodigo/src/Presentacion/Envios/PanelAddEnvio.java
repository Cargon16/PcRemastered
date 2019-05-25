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
import java.awt.SystemColor;

public class PanelAddEnvio extends JPanel implements Ventana{
	
	private static final long serialVersionUID = 1L;
	private JTextField direccion;
	private JTextField idVenta;

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
		direccion.setBounds(37, 80, 279, 32);
		add(direccion);

		JLabel lblDireccin = new JLabel("Direccion");
		lblDireccin.setBounds(37, 58, 75, 14);
		add(lblDireccin);
		
		idVenta = new JTextField();
		idVenta.setColumns(10);
		idVenta.setBounds(37, 138, 279, 32);
		add(idVenta);

		JLabel lbVenta = new JLabel("Id de la compra a enviar");
		lbVenta.setBounds(37, 115, 140, 14);
		add(lbVenta);

		activoRB = new JRadioButton("En curso");
		activoRB.setToolTipText("Activo");
		activoRB.setBounds(101, 178, 109, 23);
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

		inactivoRB.setBounds(207, 178, 109, 23);
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
		button.setBackground(SystemColor.textHighlight);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean ok = false ;
				if(activoRB.isSelected()) 
					ok = true;
				TEnvio envio = new TEnvio(null, ok, direccion.getText(), Integer.valueOf(idVenta.getText()));
				Contexto contexto = new Contexto(Evento.createEnvioCommand, envio);
				Controller.getInstance().ejecutar(contexto);
				
			}
		});
		button.setBounds(137, 210, 132, 40);
		add(button);
		
		JLabel lblAadirCliente = new JLabel("AÑADIR ENVIO");
		lblAadirCliente.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAadirCliente.setBounds(37, 13, 162, 32);
		add(lblAadirCliente);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(37, 181, 56, 16);
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