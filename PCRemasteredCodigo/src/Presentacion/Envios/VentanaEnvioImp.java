/**
 * 
 */
package Presentacion.Envios;

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


public class VentanaEnvioImp extends VentanaEnvio {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private PanelAddEnvio anadir = new PanelAddEnvio();
	private PanelDeleteEnvio eliminar = new PanelDeleteEnvio();
	private PanelUpdateEnvio actualizar = new PanelUpdateEnvio();
	private PanelReadByIdEnvio mID = new PanelReadByIdEnvio();
	private PanelReadAllEnvio mAll = new PanelReadAllEnvio();
	
	
	public VentanaEnvioImp(){
		initPanel();
		initComponent();
	}
	
	public void initPanel(){
		anadir = new PanelAddEnvio();
		eliminar = new PanelDeleteEnvio();
		actualizar = new PanelUpdateEnvio();
		mID = new PanelReadByIdEnvio();
		mAll = new PanelReadAllEnvio();
	}
	
	public void initComponent() {
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
	
		
		JButton botonanadir = new JButton("Aï¿½adir Envï¿½o");
		
		botonanadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.removeAll();
				setTitle("Aï¿½adir envï¿½o");
				anadir.resetCamps();
				panel2.add(paneles.get(0),SwingConstants.CENTER);
				SwingUtilities.updateComponentTreeUI(getContentPane()); 
				
			}
		});
		panel_1.add(botonanadir);
		
		JButton botonEliminar = new JButton("<html>Eliminar <br /> envï¿½o</html>");
		botonEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.removeAll();
				setTitle("Eliminar envï¿½o");
				eliminar.resetCamps();
				panel2.add(paneles.get(1),SwingConstants.CENTER);
				SwingUtilities.updateComponentTreeUI(getContentPane()); 
			}
		});
		panel_1.add(botonEliminar);
		
		JButton botonActualizar = new JButton("<html>Actualizar<br /> envï¿½o</html>");
		botonActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.removeAll();
				setTitle("Actualizar envï¿½o");
				actualizar.resetCamps();
				panel2.add(paneles.get(2),SwingConstants.CENTER);
				SwingUtilities.updateComponentTreeUI(getContentPane()); 
			}
		});
		panel_1.add(botonActualizar);
		
		JButton botonMostrarID = new JButton("<html>Mostrar envï¿½o<br /> por su ID </html>");
		
		botonMostrarID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.removeAll();
				setTitle("Mostrar envï¿½o por ID");
				mID.resetCamps();
				panel2.add(paneles.get(3),SwingConstants.CENTER);
				SwingUtilities.updateComponentTreeUI(getContentPane());
			}
		});
		panel_1.add(botonMostrarID);
		
		JButton botonMostrarTodo = new JButton("<html>Mostrar todos<br /> los envï¿½os</html>");
		
		botonMostrarTodo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.removeAll();
				setTitle("Mostrar todos los envï¿½os ");
				mAll.resetCamps();
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
            VentanaEnvioImp.setInstance(null);        }
    });
	}
	
	@Override
	public void Actualizar(Contexto contexto) {
		Contexto c = (Contexto) contexto.getDatos();
		
		switch (c.getEvento()) {

		case createEnvioCommand: anadir.Actualizar(c);break;
		case readEnvioCommand: mID.Actualizar(c);break;
		case createEnvioErrorCommand:if(Integer.valueOf(c.getDatos().toString()) == -2)JOptionPane.showMessageDialog(null, "No se puede realizar el envío la compra no existe");
		else JOptionPane.showMessageDialog(null, "No se puede realizar el envío");break;
		case readEnvioErrorCommand: JOptionPane.showMessageDialog(null, "El envío no existe");break;
		case deleteEnvioCommand:JOptionPane.showMessageDialog(null, "Se ha cancelado el envío con id" +c.getDatos() + "\n existosamente") ;break;
		case deleteEnvioErrorCommand:if(Integer.valueOf(c.getDatos().toString()) == -2)JOptionPane.showMessageDialog(null, "Ese envío ya está cancelado");
		else JOptionPane.showMessageDialog(null, "No existe el envío");break;
		case readAllEnvioErrorCommand:JOptionPane.showMessageDialog(null, "No hay envíos registrados \n en la base de datos");break;
		case updateEnvioCommand:JOptionPane.showMessageDialog(null, "Se han actualizado los datos");break;
		case updateEnvioErrorCommand : JOptionPane.showMessageDialog(null, "No ha sido posible actualizar");break;
		default:
			break;
		}
	}
}