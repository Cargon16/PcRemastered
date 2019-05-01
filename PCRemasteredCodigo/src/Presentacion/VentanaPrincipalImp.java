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
import java.awt.Font;

public class VentanaPrincipalImp extends VentanaPrincipal{
	private JFrame frame = new JFrame();
public VentanaPrincipalImp() {
	
		
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 534, 360);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("PcRemastered");
		JButton botonVentas = new JButton("Clientes");
		botonVentas.setBounds(26, 72, 106, 56);
		botonVentas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Contexto contexto = new Contexto(Evento.VentanaCliente, null);
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
		botonModelo.setBounds(393, 142, 106, 56);
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
		botonCliente.setBounds(283, 72, 98, 56);
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
		
		JButton btnEnvios = new JButton("Envios");
		btnEnvios.setBounds(26, 141, 106, 59);
		btnEnvios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Contexto contexto = new Contexto(Evento.crearVentanaEnvios, null);
					Controller.getInstance().ejecutar(contexto);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		frame.getContentPane().add(btnEnvios);
		
		JButton btnP = new JButton("Personal");
		btnP.setBounds(393, 72, 106, 56);
		frame.getContentPane().add(btnP);
		
		JButton btnProveedores = new JButton("Proveedores");
		btnProveedores.setBounds(144, 72, 106, 56);
		frame.getContentPane().add(btnProveedores);
		
		JLabel lblPcremastered = new JLabel("PcRemastered");
		lblPcremastered.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblPcremastered.setBounds(177, 13, 168, 42);
		frame.getContentPane().add(lblPcremastered);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}


@Override
public void Actualizar(Contexto contexto) {
	// TODO Auto-generated method stub
	
}
}
