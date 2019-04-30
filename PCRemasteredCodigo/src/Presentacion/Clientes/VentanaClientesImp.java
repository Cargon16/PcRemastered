/**
 * 
 */
package Presentacion.Clientes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

public class VentanaClientesImp extends VentanaClientes{
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	public VentanaClientesImp() {
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
		JPanel anadir = new PanelAddClientes();
		anadir.setVisible(true);
		paneles.add(anadir);
		JPanel eliminar = new PanelDeleteClientes();
		eliminar.setVisible(true);
		paneles.add(eliminar);
		JPanel actualizar = new PanelUpdateClientes();
		actualizar.setVisible(true);
		paneles.add(actualizar);
		JPanel mID = new PanelReadByIdClientes();
		mID.setVisible(true);
		paneles.add(mID);
		JPanel mAll = new PanelReadAllClientes();
		mAll.setVisible(true);
		paneles.add(mAll);
	
		
		JButton botonanadir = new JButton("Añadir Cliente");
		
		botonanadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.removeAll();
				setTitle("Añadir cliente");
				panel2.add(paneles.get(0),SwingConstants.CENTER);
				SwingUtilities.updateComponentTreeUI(getContentPane()); 
				
			}
		});
		panel_1.add(botonanadir);
		
		JButton botonEliminar = new JButton("<html>Eliminar <br /> clientes</html>");
		botonEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.removeAll();
				setTitle("Eliminar cliente");
				panel2.add(paneles.get(1),SwingConstants.CENTER);
				SwingUtilities.updateComponentTreeUI(getContentPane()); 
			}
		});
		panel_1.add(botonEliminar);
		
		JButton botonActualizar = new JButton("<html>Actualizar<br /> clientes</html>");
		botonActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.removeAll();
				setTitle("Actualizar cliente");
				panel2.add(paneles.get(2),SwingConstants.CENTER);
				SwingUtilities.updateComponentTreeUI(getContentPane()); 
			}
		});
		panel_1.add(botonActualizar);
		
		JButton botonMostrarID = new JButton("<html>Mostrar clientes<br /> por su ID </html>");
		
		botonMostrarID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.removeAll();
				setTitle("Mostrar clientes por ID");
				panel2.add(paneles.get(3),SwingConstants.CENTER);
				SwingUtilities.updateComponentTreeUI(getContentPane());
			}
		});
		panel_1.add(botonMostrarID);
		
		JButton botonMostrarTodo = new JButton("<html>Mostrar todos<br /> los clientes</html>");
		
		botonMostrarTodo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.removeAll();
				setTitle("Mostrar todos los clientes ");
				panel2.add(paneles.get(4),SwingConstants.CENTER);
				SwingUtilities.updateComponentTreeUI(getContentPane());
			}
		});
		panel_1.add(botonMostrarTodo);
		
		JButton btnQuery = new JButton("Query");
		btnQuery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.removeAll();
				setTitle("Query de cliente ");
				panel2.add(paneles.get(5),SwingConstants.CENTER);
				SwingUtilities.updateComponentTreeUI(getContentPane());
			}
		});
		panel_1.add(btnQuery);
	setLocationRelativeTo(null);
		
	}
	
	
	@Override
	public void Actualizar() {
		// TODO Auto-generated method stub
		
	}
}