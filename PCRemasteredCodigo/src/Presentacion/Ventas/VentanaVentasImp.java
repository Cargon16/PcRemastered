/**
 * 
 */
package Presentacion.Ventas;

import java.awt.BorderLayout;
import java.awt.Color;
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

import Presentacion.Clientes.PanelDeleteClientes;
import Presentacion.Clientes.PanelReadAllClientes;
import Presentacion.Clientes.PanelReadByIdClientes;
import Presentacion.Clientes.PanelUpdateClientes;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;
import Presentacion.Controlador.Controller;

public class VentanaVentasImp extends VentanaVentas {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private PanelAbrirVentas anadir = new PanelAbrirVentas();
	private PanelReadVentas mID = new PanelReadVentas();
	private PanelReadAllVentas mAll = new PanelReadAllVentas();
	private	 static int Empleado;
	
	public VentanaVentasImp() {
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
		
	
		
		mID.setVisible(true);
		paneles.add(mID);
		
		mAll.setVisible(true);
		paneles.add(mAll);
	
		
		JButton botonanadir = new JButton("Abrir Venta");
		
		botonanadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.removeAll();
				panel2.add(paneles.get(0),SwingConstants.CENTER);
				SwingUtilities.updateComponentTreeUI(getContentPane());
				Contexto c = new Contexto(Evento.abrirVentaCommand,getTitle());
				Controller.getInstance().ejecutar(c);
				
				
			}
		});
		panel_1.add(botonanadir);
		
	
		
		JButton botonMostrarID = new JButton("<html>Mostrar venta<br /> por su ID </html>");
		
		botonMostrarID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.removeAll();
				setTitle("Mostrar ventas por ID");
				panel2.add(paneles.get(1),SwingConstants.CENTER);
				SwingUtilities.updateComponentTreeUI(getContentPane());
			}
		});
		panel_1.add(botonMostrarID);
		
		JButton botonMostrarTodo = new JButton("<html>Mostrar todos<br /> las ventas</html>");
		
		botonMostrarTodo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.removeAll();
				setTitle("Mostrar todas las ventas ");
				panel2.add(paneles.get(2),SwingConstants.CENTER);
				SwingUtilities.updateComponentTreeUI(getContentPane());
			}
		});
		panel_1.add(botonMostrarTodo);
		setLocationRelativeTo(null);
		addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				System.out.println("Closed");
				VentanaVentas.setInstance(null);        }
		});
	}
	@Override
	public void Actualizar(Contexto contexto) {
		
		Contexto c = (Contexto) contexto.getDatos();
		switch (c.getEvento()) {
		case abrirVentaCommand:PanelAbrirVentas.Inicializar(c); break;
		case addProductoVentaCommand:anadir.Actualizar(c); break;
		case DeleteProductoVentaCommand:anadir.Actualizar(c); break;
		case SetEmpleado:Empleado = (int) c.getDatos(); break;
		case readAllVentasCommand: mAll.Actualizar(c);
		default:
			break;
		}
	}
	@Override
	public void resetCamps() {
		// TODO Auto-generated method stub
		
	}

	
}