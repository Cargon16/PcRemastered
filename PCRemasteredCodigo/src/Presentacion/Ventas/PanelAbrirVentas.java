package Presentacion.Ventas;

import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import Integracion.Factorias.FactoriaIntegracion;
import Integracion.Productos.TProducto;
import Presentacion.Ventana;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;
import Presentacion.Controlador.Controller;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class PanelAbrirVentas extends JPanel implements Ventana{
	private JTextField textcantidad;
	private JTextField textDelete;
	private JComboBox comboBox;
	/**
	 * Create the panel.
	 */
	public PanelAbrirVentas() {
		setLayout(null);
		setOpaque(false);
		comboBox = new JComboBox();
		comboBox.setBounds(31, 83, 223, 29);
		add(comboBox);
		Contexto c = new Contexto(Evento.readAllProductoCommand,null);
		Controller.getInstance().ejecutar(c);
		
		textcantidad = new JTextField();
		textcantidad.setBounds(298, 83, 204, 29);
		add(textcantidad);
		textcantidad.setColumns(10);
		
		JButton botonAñadir = new JButton("Add");
		botonAñadir.setBounds(564, 83, 95, 29);
		add(botonAñadir);
		
		JLabel lblNewLabel = new JLabel("Producto");
		lblNewLabel.setBounds(122, 58, 85, 14);
		add(lblNewLabel);
		
		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(388, 58, 85, 14);
		add(lblCantidad);
		
		JButton btnProcesar = new JButton("Procesar");
		btnProcesar.setBounds(538, 334, 121, 41);
		add(btnProcesar);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(31, 198, 307, 177);
		add(textArea);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(564, 252, 95, 29);
		add(btnEliminar);
		
		JLabel lblIntroducirIdDe = new JLabel("Introducir ID de producto \n a eliminar del carro");
		lblIntroducirIdDe.setBounds(420, 208, 318, 46);
		add(lblIntroducirIdDe);
		
		JLabel lblProductosAadidos = new JLabel("Productos a\u00F1adidos");
		lblProductosAadidos.setBounds(133, 174, 151, 14);
		add(lblProductosAadidos);
		
		
		JLabel label = new JLabel("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		label.setBounds(31, 134, 696, 14);
		add(label);
		
		textDelete = new JTextField();
		textDelete.setBounds(422, 252, 132, 29);
		add(textDelete);
		textDelete.setColumns(10);
		
		botonAñadir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		

	}
	public void Inicializar(Contexto contexto){
		for(TProducto p : (ArrayList<TProducto>)contexto.getDatos()){
			comboBox.addItem(p.getNombre());
		}
	}
	@Override
	public void Actualizar(Contexto contexto) {
		Contexto c = (Contexto) contexto.getDatos();
	}
	
	
	
}
