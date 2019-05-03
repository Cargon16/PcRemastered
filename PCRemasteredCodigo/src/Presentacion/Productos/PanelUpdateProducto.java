/**
 * 
 */
package Presentacion.Productos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Integracion.Personal.TPersonal;
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
 *     derived_abstraction="platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_P4ykIlMOEemdZLpuw9I4eQ"
 * @generated "sourceid:platform:/resource/PCRemastered/Modelado%20de%20diseño.emx#_P4ykIlMOEemdZLpuw9I4eQ"
 */
public class PanelUpdateProducto extends JPanel implements Ventana {
	
	private JTextField nombre;
	private JTextField descripcion;
	private JTextField stock;
	private JTextField precio;
	private TProducto producto;
	private JTextField campoFindId;
	
	
	 public PanelUpdateProducto() {
		// TODO Auto-generated constructor stub
		 setLayout(null);
			setOpaque(false);
			nombre = new JTextField();
			nombre.setColumns(10);
			nombre.setBounds(49, 80, 279, 57);

			JLabel labelNombre = new JLabel("Nombre");
			labelNombre.setBounds(386, 101, 46, 14);

			descripcion = new JTextField();
			descripcion.setColumns(10);
			descripcion.setBounds(49, 148, 279, 57);

			JLabel labelDescripcion = new JLabel("Descripcion");
			labelDescripcion.setBounds(386, 169, 46, 14);

			stock = new JTextField();
			stock.setColumns(10);
			stock.setBounds(49, 216, 279, 57);

			JLabel labelStock = new JLabel("Stock");
			labelStock.setBounds(386, 237, 75, 14);
			
			precio = new JTextField();
			precio.setColumns(10);
			precio.setBounds(49, 284, 279, 57);
			
			JLabel labelPrecio = new JLabel("Precio");
			labelPrecio.setBounds(386, 305, 75, 14);
			
			JButton buttonActualizar = new JButton("Actualizar");
			buttonActualizar.setBounds(517, 329, 132, 43);
			add(buttonActualizar);
			
			campoFindId = new JTextField();
			campoFindId.setBounds(49, 29, 368, 20);
			add(campoFindId);
			campoFindId.setColumns(10);
			
			JButton botonBuscar = new JButton("Buscar");
			botonBuscar.setBounds(427, 28, 222, 23);
			add(botonBuscar);
			
		
			botonBuscar.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					try{
						
						Contexto contexto = new Contexto(Evento.readProductoCommand, Integer.valueOf(campoFindId.getText()));
						Controller.getInstance().ejecutar(contexto);
						producto = (TProducto) contexto.getDatos();
						
						nombre.setText(producto.getNombre());
						add(nombre);
						add(labelNombre);
						
						descripcion.setText(producto.getDescripcion());
						add(descripcion);
						add(labelDescripcion);
						
						stock.setText(Integer.toString( producto.getStock()));
						add(stock);
						add(labelStock);
						
						precio.setText(Float.toString(producto.getPrecio()));
						add(precio);
						add(labelPrecio);
						
						buttonActualizar.setVisible(true);
						repaint();
						
					}catch( Exception ex){
						System.out.println(Integer.valueOf(botonBuscar.getText()));
						nombre.setText("");
						descripcion.setText("");
						stock.setText("");
						precio.setText("");
						
					}
					
					
				}
			});
			
			buttonActualizar.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
				
					producto.setNombre(nombre.getText());
					producto.setDescripcion(descripcion.getText());
					producto.setStock(Integer.valueOf(stock.getText()));
					producto.setPrecio(Integer.valueOf(precio.getText()));
					
					try {
						Contexto contexto = new Contexto(Evento.updateProductoCommand, (TProducto) producto);
						Controller.getInstance().ejecutar(contexto);
					} catch (Exception ex) {;}
					
				}
			});

		 
		 
		 
	}
	
	@Override
	public void Actualizar(Contexto contexto) {
		// TODO Auto-generated method stub
		
		
	}
}