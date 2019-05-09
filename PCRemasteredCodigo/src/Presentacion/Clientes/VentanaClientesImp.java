/**
 * 
 */
package Presentacion.Clientes;

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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

import Presentacion.Command.Contexto;

public class VentanaClientesImp extends VentanaClientes{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private PanelAddClientes anadir;
	private PanelDeleteClientes eliminar;
	private PanelUpdateClientes actualizar;
	private PanelReadByIdClientes mID;
	private PanelReadAllClientes mAll;

	public VentanaClientesImp(){
		
		initComponent();
	}
	
	public void initPanel(){
		
		anadir = new PanelAddClientes();
		eliminar = new PanelDeleteClientes();
		actualizar = new PanelUpdateClientes();
		mID = new PanelReadByIdClientes();
		mAll = new PanelReadAllClientes();
		contentPane = new JPanel();
		
	}
	public void initComponent() {
		initPanel();
		
		setResizable(false);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 737, 598);

		
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


		JButton botonanadir = new JButton("AÒadir Cliente");

		botonanadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.removeAll();
				setTitle("AÒadir cliente");
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
		case createClienteCommnad: JOptionPane.showMessageDialog(null, "Se ha creado el cliente nuevo con id " +c.getDatos()); break;
		case createClienteErrorCommand: JOptionPane.showMessageDialog(null, "No se ha podido a√±adir el cliente"); break;
		case readClienteCommand: mID.Actualizar(c);actualizar.Actualizar(c);break;
		case readClienteErrorCommand: JOptionPane.showMessageDialog(null, "El cliente no existe");break;
		case deleteClienteCommand:JOptionPane.showMessageDialog(null, "Se ha eliminado el cliente con id" +c.getDatos() + "\n existosamente") ;break;
		case deleteClienteErrorCommand: if ( (int)c.getDatos() ==-1)
			JOptionPane.showMessageDialog(null, "El cliente no existe");
		else if( (int)c.getDatos()==-2)
			JOptionPane.showMessageDialog(null, "El cliente ya esta inactivo");
		;break;
		case readAllClienteCommand: mAll.Actualizar(c); break;
		case readAllClienteErrorCommand:JOptionPane.showMessageDialog(null, "No hay clientes registrados \n en la base de datos");break;
		case updateClienteErrorCommand : JOptionPane.showMessageDialog(null, "No ha sido posible actualizar");break;
		default:
			break;
		}
	}
}