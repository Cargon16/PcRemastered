/**
 * 
 */
package Presentacion.Personal;

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



public class VentanaPersonalImp extends VentanaPersonal {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private PanelAddPersonal anadir;
	private PanelDeletePersonal eliminar;
	private PanelUpdatePersonal actualizar;
	private PanelReadByIDPersonal mID;
	private PanelReadAllPersonal mAll;
	
	public VentanaPersonalImp(){
		initPanel();
		initComponents();
		
	}
	
	public void initPanel(){
		anadir = new PanelAddPersonal();
		eliminar = new PanelDeletePersonal();
		actualizar = new PanelUpdatePersonal();
		mID = new PanelReadByIDPersonal();
		mAll = new PanelReadAllPersonal();
		
	}
	
	
	public void initComponents() {
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
	
		
		JButton botonanadir = new JButton("A�adir Personal");
		
		botonanadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.removeAll();
				setTitle("A�adir personal");
				anadir.resetCamps();
				panel2.add(paneles.get(0),SwingConstants.CENTER);
				SwingUtilities.updateComponentTreeUI(getContentPane()); 
				
			}
		});
		panel_1.add(botonanadir);
		
		JButton botonEliminar = new JButton("<html>Eliminar <br /> personal</html>");
		botonEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.removeAll();
				setTitle("Eliminar Personal");
				eliminar.resetCamps();
				panel2.add(paneles.get(1),SwingConstants.CENTER);
				SwingUtilities.updateComponentTreeUI(getContentPane()); 
			}
		});
		panel_1.add(botonEliminar);
		
		JButton botonActualizar = new JButton("<html>Actualizar<br /> personal</html>");
		botonActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.removeAll();
				setTitle("Actualizar personal");
				actualizar.resetCamps();
				panel2.add(paneles.get(2),SwingConstants.CENTER);
				SwingUtilities.updateComponentTreeUI(getContentPane()); 
			}
		});
		panel_1.add(botonActualizar);
		
		JButton botonMostrarID = new JButton("<html>Mostrar empleado<br /> por su ID </html>");
		
		botonMostrarID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.removeAll();
				setTitle("Mostrar empleado por ID");
				mID.resetCamps();
				panel2.add(paneles.get(3),SwingConstants.CENTER);
				SwingUtilities.updateComponentTreeUI(getContentPane());
			}
		});
		panel_1.add(botonMostrarID);
		
		JButton botonMostrarTodo = new JButton("<html>Mostrar todos<br /> los empleados</html>");
		
		botonMostrarTodo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.removeAll();
				setTitle("Mostrar todos los empleados ");
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
            VentanaPersonalImp.setInstance(null);        }
    });
	}
	
	
	@Override
	public void Actualizar(Contexto contexto) {
		Contexto c = (Contexto) contexto.getDatos();
		
		switch (c.getEvento()) {
		case createPersonalCommand:JOptionPane.showMessageDialog(null, "Se ha creado el cliente nuevo con id " +c.getDatos()); anadir.Actualizar(c);break;
		case createPersonalErrorCommand: JOptionPane.showMessageDialog(null, "El empleado ya existe.");break;
		case readPersonalCommand: mID.Actualizar(c);break;
		case readPersonalErrorCommand: JOptionPane.showMessageDialog(null, "El empleado no existe");break;
		case deletePersonalCommand:JOptionPane.showMessageDialog(null, "Se ha eliminado el empleado con id" +c.getDatos() + "\n existosamente") ;break;
		case deletePersonalErrorCommand:if(Integer.valueOf(c.getDatos().toString()) == -2)JOptionPane.showMessageDialog(null, "El empleado ya fue despedido");
		else JOptionPane.showMessageDialog(null, "No existe el empleado");break;
		case readAllPersonalErrorCommand:JOptionPane.showMessageDialog(null, "No hay empleados registrados \n en la base de datos");break;
		case updatePersonalCommand:JOptionPane.showMessageDialog(null, "Se han actualizado los datos");break;
		case updatePersonalErrorCommand : JOptionPane.showMessageDialog(null, "No ha sido posible actualizar");break;
		case readAllPersonalCommand : mAll.Actualizar(c);
		
			

		default:
			break;
		}
	}

	@Override
	public void resetCamps() {
		// TODO Auto-generated method stub
		
	}
}