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

public class VentanaPrincipal {
private JFrame frame;

	
	public VentanaPrincipal() {
		initialize();
	}

	public void initialize() {
		
		frame = new JFrame();
		frame.setResizable(false);
		
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("PcRemastered");
		JButton botonVentas = new JButton("Clientes");
		botonVentas.setBounds(70, 45, 92, 59);
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
		botonModelo.setBounds(172, 45, 89, 59);
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
		
		JButton botonCliente = new JButton("Cliente");
		botonCliente.setBounds(271, 45, 98, 59);
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
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
