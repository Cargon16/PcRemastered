package Presentacion;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;
import Presentacion.Controlador.Controller;

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
		initComponent();
	}

	public void initComponent() {



		setResizable(false);
		setBounds(100, 100, 534, 360);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("PcRemastered");
		botonVentas = new JButton("Clientes");
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
		getContentPane().setLayout(null);
		getContentPane().add(botonVentas);

		botonModelo = new JButton("Productos");
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
		getContentPane().add(botonModelo);

		botonCliente = new JButton("Ventas");
		botonCliente.setBounds(283, 72, 98, 56);
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
		getContentPane().add(btnEnvios);

		btnP = new JButton("Personal");
		btnP.setBounds(393, 72, 106, 56);
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

		btnProveedores = new JButton("Proveedores");
		btnProveedores.setBounds(144, 72, 106, 56);
		getContentPane().add(btnProveedores);

		JLabel lblPcremastered = new JLabel("PcRemastered");
		lblPcremastered.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblPcremastered.setBounds(177, 13, 168, 42);
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
