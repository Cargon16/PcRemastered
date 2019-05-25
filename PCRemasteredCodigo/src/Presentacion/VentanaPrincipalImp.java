package Presentacion;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;
import Presentacion.Controlador.Controller;
import java.awt.Color;
import java.awt.SystemColor;

public class VentanaPrincipalImp extends VentanaPrincipal{


	private static final long serialVersionUID = 1L;
	private static int empleado;
	private JButton botonVentas;
	private JButton botonModelo;
	private JButton botonCliente;
	private JButton btnEnvios;
	private JButton btnP;
	private JButton btnProveedores;

	public VentanaPrincipalImp(){
		getContentPane().setBackground(SystemColor.textInactiveText);
		getContentPane().setForeground(Color.GREEN);
		initComponent();
	}

	public void initComponent() {



		setResizable(false);
		setBounds(100, 100, 531, 361);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("PcRemastered");
		
		
		ImageIcon imageIcon = new ImageIcon("src/logoPc.png"); 
		Image im = imageIcon.getImage();
		ImageIcon iconoEscalado = new ImageIcon(im.getScaledInstance(100,100,Image.SCALE_SMOOTH));
		JLabel imagen = new JLabel();
		imagen.setLocation(201, 176);
		imagen.setSize(100, 100);
		imagen.setIcon(iconoEscalado);
		getContentPane().add(imagen);
		

		
		botonVentas = new JButton("Clientes");
		botonVentas.setBackground(SystemColor.activeCaption);
		botonVentas.setBounds(342, 223, 103, 53);
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
		getContentPane().setLayout(null);
		
	
		getContentPane().add(botonVentas);

		botonModelo = new JButton("Productos");
		botonModelo.setBackground(SystemColor.activeCaption);
		botonModelo.setBounds(342, 105, 103, 53);
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
		getContentPane().add(botonModelo);

		botonCliente = new JButton("Ventas");
		botonCliente.setBackground(SystemColor.activeCaption);
		botonCliente.setBounds(56, 105, 103, 53);
		botonCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

					Contexto contexto = new Contexto(Evento.crearVentanaVentas, getTitle());
					Controller.getInstance().ejecutar(contexto);

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		getContentPane().add(botonCliente);

		btnEnvios = new JButton("Envios");
		btnEnvios.setBackground(SystemColor.activeCaption);
		btnEnvios.setBounds(201, 105, 103, 53);
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
		getContentPane().add(btnEnvios);

		btnP = new JButton("Personal");
		btnP.setForeground(Color.BLACK);
		btnP.setBackground(SystemColor.activeCaption);
		btnP.setBounds(56, 223, 103, 53);
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Contexto contexto = new Contexto(Evento.crearVentanaPersonal, null);
					Controller.getInstance().ejecutar(contexto);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		getContentPane().add(btnP);

		JLabel lblPcremastered = new JLabel("Menu principal");
		lblPcremastered.setFont(new Font("Segoe Print", Font.BOLD, 23));
		lblPcremastered.setBounds(167, 41, 183, 53);
		getContentPane().add(lblPcremastered);
		setLocationRelativeTo(null);
		setVisible(true);
	}


	@Override
	public void Actualizar(Contexto contexto) {
		empleado= (int) contexto.getDatos();


	}


	@Override
	public void resetCamps() {
		// TODO Auto-generated method stub

	}
}
