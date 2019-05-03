/**
 * 
 */
package Presentacion.Productos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
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
 *     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_P4zLMFMOEemdZLpuw9I4eQ"
 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_P4zLMFMOEemdZLpuw9I4eQ"
 */
public class PanelReadAllProducto extends JPanel implements Ventana {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JButton buttonRead;
	JTextArea text;
	
	public  PanelReadAllProducto() {
		// TODO Auto-generated constructor stub
		
		setLayout(null);
		setOpaque(false);
		buttonRead = new JButton("Ver los Productos");
		buttonRead.setBounds(208, 36, 262, 57);
		add(buttonRead);
		
		text=new JTextArea();
		
		JScrollPane scroll = new JScrollPane(text);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setVisible(true);
		scroll.setBounds(83, 136, 522, 281);
		add(scroll);
		
		text.setVisible(false);
		text.setEditable(false);
		buttonRead.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Contexto contexto = new Contexto(Evento.readAllProductoCommand, 1);
				Controller.getInstance().ejecutar(contexto);
				
			}
		});
	}

	@Override
	public void Actualizar(Contexto contexto) {
		// TODO Auto-generated method stub
		text.setVisible(true);
		@SuppressWarnings("unchecked")
		ArrayList<TProducto> lista = (ArrayList<TProducto>) contexto.getDatos();
		String texto = "";
		for(TProducto c : lista){
			texto = texto + "ID: " + c.getId() + "\n" + "Nombre: " + c.getNombre() +"\n"+ "Descripcion: " + c.getDescripcion()
			+ "\n"+ "Stock: " + c.getStock() + "\n" + "Precio: " + c.getPrecio() + "\n\n";
		}
		text.setText(texto);
	}
	
}