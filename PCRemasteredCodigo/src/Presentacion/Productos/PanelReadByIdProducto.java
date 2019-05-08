/**
 * 
 */
package Presentacion.Productos;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import Integracion.Productos.TProducto;
import Presentacion.Ventana;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;
import Presentacion.Controlador.Controller;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author nacho710
 * @uml.annotations
 *     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_P4ykJFMOEemdZLpuw9I4eQ"
 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_P4ykJFMOEemdZLpuw9I4eQ"
 */
public class PanelReadByIdProducto extends JPanel implements Ventana {
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JButton button;
	private JTextArea textArea ;
	
	
	public PanelReadByIdProducto() {
		setLayout(null);
		setOpaque(false);
		button = new JButton("Buscar Producto");
		button.setBounds(434, 68, 171, 42);
		add(button);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(83, 68, 339, 42);
		add(textField);
		textArea = new JTextArea();
		JScrollPane scroll = new JScrollPane(textArea);
	    scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	    scroll.setVisible(true);
	    scroll.setBounds(83, 136, 522, 281);
	    add(scroll);
	    textArea.setVisible(false);
	    textArea.setEditable(false);
	    
	    
	    JLabel lblIntroduceElId = new JLabel("Introduce el ID");
	    lblIntroduceElId.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    lblIntroduceElId.setBounds(83, 45, 110, 16);
	    add(lblIntroduceElId);
	    
	    button.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    	
	    		Contexto contexto = new Contexto (Evento.readProductoCommand,Integer.valueOf(textField.getText()));
	    		Controller.getInstance().ejecutar(contexto);
	    	}
	    });
	
	}
	

	@Override
	public void Actualizar(Contexto contexto) {
		// TODO Auto-generated method stub
		
		textArea.setVisible(true);
		TProducto p = (TProducto) contexto.getDatos();
		textArea.setText("Nombre: " + p.getNombre() + "\n" + "Descripcion: "+p.getDescripcion()+ "\n" + "Stock: "+p.getStock() + "\n" + "Precio: "+p.getPrecio()+"\n" );
		
	}
}