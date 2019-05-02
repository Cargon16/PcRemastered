/**
 * 
 */
package Presentacion.Productos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Presentacion.Clientes.VentanaClientes;
import Presentacion.Command.Contexto;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author nacho710
 * @uml.annotations
 *     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_FJOqJVMOEemdZLpuw9I4eQ"
 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_FJOqJVMOEemdZLpuw9I4eQ"
 */
public class VentanaProductosImp extends VentanaProducto {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPaneProducto;
	private PanelAddProducto anadir = new PanelAddProducto();
	private PanelDeleteProducto delete = new PanelDeleteProducto();
	private PanelReadAllProducto readAll = new PanelReadAllProducto();
	private PanelReadByIdProducto readById = new PanelReadByIdProducto();
	private PanelUpdateProducto updateProducto = new PanelUpdateProducto();
	
	public VentanaProductosImp(){
		setResizable(false);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 737, 598);
		
		contentPaneProducto = new JPanel();
		contentPaneProducto.setBackground(new Color(204, 255, 255));
		contentPaneProducto.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPaneProducto);
		contentPaneProducto.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(5, 5, 706, 93);
		contentPaneProducto.add(panel_1);
		panel_1.setLayout(new GridLayout(1, 1, 0, 0));
		JPanel panel2 = new JPanel();
		panel2.setOpaque(false);
		panel2.setBounds(5, 109, 706, 439);
		contentPaneProducto.add(panel2);
		panel2.setLayout(new BorderLayout(0, 0));
		
		ArrayList<JPanel> paneles = new ArrayList<JPanel>();
		anadir.setVisible(true);
		paneles.add(anadir);
		
		delete.setVisible(true);
		paneles.add(delete);
		
		readAll.setVisible(true);
		paneles.add(readAll);
		
		readById.setVisible(true);
		paneles.add(readById);
		
		updateProducto.setVisible(true);
		paneles.add(updateProducto);
		
		
		setLocationRelativeTo(null);
		addWindowListener(new WindowAdapter()
	    {
	        @Override
	        public void windowClosing(WindowEvent e)
	        {
	            System.out.println("Closed");
	            VentanaProducto.setInstance();        }
	    });
		
	}

	@Override
	public void Actualizar(Contexto contexto) {
		// TODO Auto-generated method stub
		
		Contexto c = (Contexto) contexto.getDatos();
		
		switch(c.getEvento()){
		case readProductoCommand: readById.Actualizar(c); 
		break;
		
		default: 
			break;
			
		}
	
		
		
		
	}
	
}