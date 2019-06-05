/**
 * 
 */
package Presentacion.Productos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Integracion.Productos.TProducto;
import Negocio.ComprobadorSintactico.ComprobadorSintactico;
import Presentacion.Ventana;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;
import Presentacion.Controlador.Controller;
import java.awt.SystemColor;


public class PanelUpdateProducto extends JPanel implements Ventana {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField nombre;
	private JTextField descripcion;
	private JTextField stock;
	private JTextField precio;
	private TProducto producto;
	private JTextField campoFindId;
	private JLabel labelNombre;
	private JLabel labelDescripcion;
	private JLabel labelStock;
	private JLabel labelPrecio;
	private JButton buttonActualizar;
	private JButton botonBuscar;
	


	public PanelUpdateProducto(){
		
		initComponent();
	}

	public void initComponent() {
		// TODO Auto-generated constructor stub
		setLayout(null);
		setOpaque(false);
		nombre = new JTextField();
		nombre.setColumns(10);
		nombre.setBounds(49, 80, 279, 57);
		add(nombre);

		labelNombre = new JLabel("Nombre");
		labelNombre.setBounds(386, 101, 46, 14);
		add(labelNombre);

		descripcion = new JTextField();
		descripcion.setColumns(10);
		descripcion.setBounds(49, 148, 279, 57);
		add(descripcion);

		labelDescripcion = new JLabel("Descripcion");
		labelDescripcion.setBounds(386, 169, 46, 14);
		add(labelDescripcion);

		stock = new JTextField();
		stock.setColumns(10);
		stock.setBounds(49, 216, 279, 57);
		add(stock);

		labelStock = new JLabel("Stock");
		labelStock.setBounds(386, 237, 75, 14);
		add(labelStock);;

		precio = new JTextField();
		precio.setColumns(10);
		precio.setBounds(49, 284, 279, 57);
		add(precio);

		labelPrecio = new JLabel("Precio");
		labelPrecio.setBounds(386, 305, 75, 14);
		add(labelPrecio);

		buttonActualizar = new JButton("Actualizar");
		buttonActualizar.setBackground(SystemColor.textHighlight);
		buttonActualizar.setBounds(517, 329, 132, 43);
		add(buttonActualizar);

		campoFindId = new JTextField();
		campoFindId.setBounds(49, 29, 368, 20);
		campoFindId.setColumns(10);
		add(campoFindId);

		botonBuscar = new JButton("Buscar");
		botonBuscar.setBackground(SystemColor.textHighlight);
		botonBuscar.setBounds(427, 28, 222, 23);
		add(botonBuscar);


		botonBuscar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// TODO Auto-generated method stu

				if(ComprobadorSintactico.getInstance().isNumeric(campoFindId.getText())){

					Contexto contexto = new Contexto(Evento.readProductoCommand, Integer.valueOf(campoFindId.getText()));
					Controller.getInstance().ejecutar(contexto);

				}else{
					JOptionPane.showMessageDialog(null, "Datos incorrectos, el ID a eliminar debe ser un numero");
				}
			}
		});

		buttonActualizar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					if(ComprobadorSintactico.getInstance().nombreCorrect(nombre.getText()) && ComprobadorSintactico.getInstance().isNumericFloat(precio.getText()) && ComprobadorSintactico.getInstance().isNumeric(stock.getText())){

						producto.setNombre(nombre.getText());
						producto.setDescripcion(descripcion.getText());
						producto.setStock(Integer.valueOf(stock.getText()));
						producto.setPrecio(Float.valueOf(precio.getText()));

						Contexto contexto = new Contexto(Evento.updateProductoCommand, (TProducto) producto);
						Controller.getInstance().ejecutar(contexto);
					}else{
						JOptionPane.showMessageDialog(null, "Datos incorrectos, comprueba sintacticamente los datos introducidos");
					}

				} catch (Exception ex) {;}

			}
		});





	}

	@Override
	public void Actualizar(Contexto contexto) {
		// TODO Auto-generated method stub
		try{

			if(contexto.getDatos()!=null){
				producto = (TProducto) contexto.getDatos();
				nombre.setText(producto.getNombre());
				descripcion.setText(producto.getDescripcion());
				stock.setText(Integer.toString( producto.getStock()));
				precio.setText(Float.toString(producto.getPrecio()));
				buttonActualizar.setVisible(true);

			}

			repaint();

		}catch( Exception ex){
			nombre.setText("");
			descripcion.setText("");
			stock.setText("");
			precio.setText("");

		}


	}

	public void resetCamps(){
		nombre.setText(null);
		descripcion.setText(null);
		stock.setText(null);
		precio.setText(null);
		campoFindId.setText(null);


	}
}