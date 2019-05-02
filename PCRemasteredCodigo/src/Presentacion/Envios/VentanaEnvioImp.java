/**
 * 
 */
package Presentacion.Envios;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

import Presentacion.Ventana;
import Presentacion.Clientes.PanelAddClientes;
import Presentacion.Clientes.PanelDeleteClientes;
import Presentacion.Clientes.PanelReadAllClientes;
import Presentacion.Clientes.PanelReadByIdClientes;
import Presentacion.Clientes.PanelUpdateClientes;
import Presentacion.Clientes.VentanaClientes;
import Presentacion.Command.Contexto;


public class VentanaEnvioImp extends VentanaEnvio {
	private JPanel contentPane;
	private PanelAddEnvio anadir = new PanelAddEnvio();
	private PanelDeleteEnvio eliminar = new PanelDeleteEnvio();
	private PanelUpdateEnvio actualizar = new PanelUpdateEnvio();
	private PanelReadByIdEnvio mID = new PanelReadByIdEnvio();
	private PanelReadAllEnvio mAll = new PanelReadAllEnvio();
	
	
	public VentanaEnvioImp() {
		setResizable(false);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 737, 598);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(5, 5, 706, 93);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(1, 1, 0, 0));
		JPanel panel2 = new JPanel();
		panel2.setOpaque(false);
		panel2.setBounds(5, 109, 706, 439);
		contentPane.add(panel2);
		panel2.setLayout(new BorderLayout(0, 0));
		
		ArrayList<JPanel> paneles = new ArrayList<JPanel>();
		anadir.setVisible(true);
		paneles.add(anadir);
		
		eliminar.setVisible(true);
		paneles.add(eliminar);
		
		actualizar.setVisible(true);
		paneles.add(actualizar);
		
		mID.setVisible(true);
		paneles.add(mID);
		
		mAll.setVisible(true);
		paneles.add(mAll);
	
		
		JButton botonanadir = new JButton("Añadir Envío");
		
		botonanadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.removeAll();
				setTitle("Añadir envío");
				panel2.add(paneles.get(0),SwingConstants.CENTER);
				SwingUtilities.updateComponentTreeUI(getContentPane()); 
				
			}
		});
		panel_1.add(botonanadir);
		
		JButton botonEliminar = new JButton("<html>Eliminar <br /> envío</html>");
		botonEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.removeAll();
				setTitle("Eliminar envío");
				panel2.add(paneles.get(1),SwingConstants.CENTER);
				SwingUtilities.updateComponentTreeUI(getContentPane()); 
			}
		});
		panel_1.add(botonEliminar);
		
		JButton botonActualizar = new JButton("<html>Actualizar<br /> envío</html>");
		botonActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.removeAll();
				setTitle("Actualizar envío");
				panel2.add(paneles.get(2),SwingConstants.CENTER);
				SwingUtilities.updateComponentTreeUI(getContentPane()); 
			}
		});
		panel_1.add(botonActualizar);
		
		JButton botonMostrarID = new JButton("<html>Mostrar envío<br /> por su ID </html>");
		
		botonMostrarID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.removeAll();
				setTitle("Mostrar envío por ID");
				panel2.add(paneles.get(3),SwingConstants.CENTER);
				SwingUtilities.updateComponentTreeUI(getContentPane());
			}
		});
		panel_1.add(botonMostrarID);
		
		JButton botonMostrarTodo = new JButton("<html>Mostrar todos<br /> los envíos</html>");
		
		botonMostrarTodo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.removeAll();
				setTitle("Mostrar todos los envíos ");
				panel2.add(paneles.get(4),SwingConstants.CENTER);
				SwingUtilities.updateComponentTreeUI(getContentPane());
			}
		});
		panel_1.add(botonMostrarTodo);
		
		JButton btnQuery = new JButton("Query");
		btnQuery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.removeAll();
				setTitle("Query de envío");
				panel2.add(paneles.get(5),SwingConstants.CENTER);
				SwingUtilities.updateComponentTreeUI(getContentPane());
			}
		});
		panel_1.add(btnQuery);
	setLocationRelativeTo(null);
	addWindowListener(new WindowAdapter()
    {
        @Override
        public void windowClosing(WindowEvent e)
        {
            System.out.println("Closed");
            VentanaClientes.setInstance(null);        }
    });
	}
	
	@Override
	public void Actualizar(Contexto contexto) {
		Contexto c = (Contexto) contexto.getDatos();
		
		switch (c.getEvento()) {

		case createEnvioCommand: anadir.Actualizar(c);
		case readEnvioCommand: mID.Actualizar(c);
			break;

		default:
			break;
		}
	}
}