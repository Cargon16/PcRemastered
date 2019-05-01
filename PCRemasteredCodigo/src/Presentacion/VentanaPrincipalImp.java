package Presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;
import Presentacion.Controlador.Controller;

public class VentanaPrincipalImp extends VentanaPrincipal{
	
public VentanaPrincipalImp() {
	
		JFrame frame = new JFrame();
		frame = new JFrame();
		frame.setResizable(false);
		
		frame.setBounds(100, 100, 534, 360);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("PcRemastered");
		JButton botonVentas = new JButton("Clientes");
		botonVentas.setBounds(26, 32, 106, 56);
		botonVentas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Contexto contexto = new Contexto(Evento.crearVentanaCliente, null);
					Controller.getInstance().ejecutar(contexto);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(botonVentas);
		
		JButton botonModelo = new JButton("Productos");
		botonModelo.setBounds(144, 32, 106, 56);
		botonModelo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Contexto contexto = new Contexto(Evento.crearVentanaProductos, null);
					Controller.getInstance().ejecutar(contexto);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		frame.getContentPane().add(botonModelo);
		
		JButton botonCliente = new JButton("Ventas");
		botonCliente.setBounds(262, 32, 98, 56);
		botonCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Contexto contexto = new Contexto(Evento.crearVentanaVentas, null);
					Controller.getInstance().ejecutar(contexto);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		frame.getContentPane().add(botonCliente);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("top_c1_hd.png"));
		lblNewLabel.setBounds(99, 142, 232, 93);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnEnvios = new JButton("Envios");
		btnEnvios.setBounds(144, 103, 106, 59);
		frame.getContentPane().add(btnEnvios);
		
		JButton btnP = new JButton("Personal");
		btnP.setBounds(272, 103, 106, 59);
		frame.getContentPane().add(btnP);
		
		JButton btnProveedores = new JButton("Proveedores");
		btnProveedores.setBounds(26, 103, 106, 59);
		frame.getContentPane().add(btnProveedores);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
