/**
 * 
 */
package Presentacion.Productos;

import java.awt.BorderLayout;
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
import java.awt.SystemColor;
import java.awt.Font;


public class VentanaProductosImp extends VentanaProducto {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPaneProducto;
	private PanelAddProducto anadir;
	private PanelDeleteProducto delete;
	private PanelReadAllProducto readAll;
	private PanelReadByIdProducto readById;
	private PanelUpdateProducto updateProducto;
	
	
	public VentanaProductosImp(){
		initPanels();
		initComponent();
	}
	
	public void initPanels(){
		anadir = new PanelAddProducto();
		delete = new PanelDeleteProducto();
		readAll = new PanelReadAllProducto();
		updateProducto = new PanelUpdateProducto();
		readById = new PanelReadByIdProducto();
		
	}
	
	public void initComponent(){
		setResizable(false);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 737, 598);
		
		contentPaneProducto = new JPanel();
		contentPaneProducto.setBackground(SystemColor.activeCaption);
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
		
		updateProducto.setVisible(true);
		paneles.add(updateProducto);
		
		readById.setVisible(true);
		paneles.add(readById);
		

		readAll.setVisible(true);
		paneles.add(readAll);
		
		
		
		JButton add = new JButton("<html>Anadir <br /> producto</html>");
		add.setFont(new Font("Consolas", Font.BOLD, 11));
		add.setBackground(SystemColor.activeCaptionBorder);
		add.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel2.removeAll();
				setTitle("Anadir Producto");
				anadir.resetCamps();
				panel2.add(paneles.get(0),SwingConstants.CENTER);
				SwingUtilities.updateComponentTreeUI(getContentPane());
			}
		});
		panel_1.add(add);
		
		JButton eliminar = new JButton("<html>Eliminar <br /> producto</html>");
		eliminar.setFont(new Font("Consolas", Font.BOLD, 11));
		eliminar.setBackground(SystemColor.activeCaptionBorder);
		eliminar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel2.removeAll();
				setTitle("Eliminar Producto");
				delete.resetCamps();
				panel2.add(paneles.get(1),SwingConstants.CENTER);
				SwingUtilities.updateComponentTreeUI(getContentPane());
			}
		});
		panel_1.add(eliminar);
		
		JButton actualizar = new JButton("<html>Actualizar <br /> producto</html>");
		actualizar.setFont(new Font("Consolas", Font.BOLD, 11));
		actualizar.setBackground(SystemColor.activeCaptionBorder);
		actualizar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel2.removeAll();
				setTitle("Actualizar Producto");
				updateProducto.resetCamps();
				panel2.add(paneles.get(2),SwingConstants.CENTER);
				SwingUtilities.updateComponentTreeUI(getContentPane());
			}
		});
		panel_1.add(actualizar);
		
		JButton mostrarID = new JButton("<html>Mostrar <br /> producto</html>");
		mostrarID.setFont(new Font("Consolas", Font.BOLD, 11));
		mostrarID.setBackground(SystemColor.activeCaptionBorder);
		mostrarID.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel2.removeAll();
				setTitle("Actualizar Producto");
				readById.resetCamps();
				panel2.add(paneles.get(3),SwingConstants.CENTER);
				SwingUtilities.updateComponentTreeUI(getContentPane());
			}
		});
		panel_1.add(mostrarID);
		
		JButton mostrarTodo = new JButton("<html>Mostrar todos <br />los productos</html>");
		mostrarTodo.setFont(new Font("Consolas", Font.BOLD, 11));
		mostrarTodo.setBackground(SystemColor.activeCaptionBorder);
		mostrarTodo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel2.removeAll();
				setTitle("Actualizar Producto");
				readAll.resetCamps();
				panel2.add(paneles.get(4),SwingConstants.CENTER);
				SwingUtilities.updateComponentTreeUI(getContentPane());
			}
		});
		panel_1.add(mostrarTodo);
		
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
		case createProductoCommand : JOptionPane.showMessageDialog(null, "Se ha creado el producto nuevo con id" + c.getDatos()); break;
		case createProductoErrorCommand : JOptionPane.showMessageDialog(null, "No se ha podido anadir el producto"); break;
		case readProductoCommand: readById.Actualizar(c); updateProducto.Actualizar(c);break;
		case readProductoErrorCommand : JOptionPane.showMessageDialog(null, "El producto no existe");break;
		case deleteProductoCommand : JOptionPane.showMessageDialog(null, "Se ha eliminado el producto con id " + c.getDatos()+"\n  exitosamente ");break;
		case deleteProductoErrorCommand: JOptionPane.showMessageDialog(null, "El producto est� agotado");break;
		case readAllProductoCommand : readAll.Actualizar(c);break;
		case readAllProductoErrorCommand : JOptionPane.showMessageDialog(null, "No hay productos registrados \n en la base de datos");break;
		case readByIDProdcutoErrorCommand : JOptionPane.showMessageDialog(null, "El producto no existe");break;
		case createProductoErrorExisteCommand : JOptionPane.showMessageDialog(null, "El producto ya existe");break;
		case updateProductoErrorCommand : JOptionPane.showMessageDialog(null, "El producto no existe");break;
		case updateProductoCommand : JOptionPane.showMessageDialog(null, "El producto con ID:  " + c.getDatos() +" ha sido actualizado.");break;
		default: 
			break;
			
		}
	
		
		
		
	}

	@Override
	public void resetCamps() {
		// TODO Auto-generated method stub
		
	}
	
}