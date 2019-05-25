package Presentacion.Ventas;

import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import Integracion.Factorias.FactoriaIntegracion;
import Integracion.Productos.TProducto;
import Integracion.Ventas.TLineaVentas;
import Integracion.Ventas.TVentas;
import Presentacion.Ventana;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;
import Presentacion.Controlador.Controller;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.DefaultListSelectionModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.SystemColor;

public class PanelAbrirVentas extends JPanel implements Ventana{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textcantidad;
	private JTextField textDelete;
	private static JComboBox<String> comboBox;
	private JTextArea textArea;
	private static ArrayList<TProducto> lista;
	private static int idventa;
	private JButton botonAnadir;
	private JButton btnProcesar;
	private JButton btnEliminar;

	
	public PanelAbrirVentas(){
		
		initComponents();
	}
	
	public void initComponents() {
		setLayout(null);
		setOpaque(false);
		comboBox = new JComboBox<String>();
		comboBox.setBounds(31, 83, 223, 29);
		add(comboBox);


		textcantidad = new JTextField();
		textcantidad.setBounds(298, 83, 204, 29);
		add(textcantidad);
		textcantidad.setColumns(10);

		 botonAnadir = new JButton("A\u00F1adir");
		 botonAnadir.setBackground(SystemColor.textHighlight);
		botonAnadir.setBounds(564, 83, 95, 29);
		add(botonAnadir);

		JLabel lblNewLabel = new JLabel("Producto");
		lblNewLabel.setBounds(122, 58, 85, 14);
		add(lblNewLabel);

		JLabel lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(388, 58, 85, 14);
		add(lblCantidad);

		btnProcesar = new JButton("Procesar");
		btnProcesar.setBackground(SystemColor.textHighlight);
		btnProcesar.setBounds(538, 334, 121, 41);
		add(btnProcesar);

		textArea = new JTextArea();
		textArea.setBounds(31, 198, 307, 177);
		add(textArea);

		 btnEliminar = new JButton("Eliminar");
		 btnEliminar.setBackground(SystemColor.textHighlight);
		btnEliminar.setBounds(564, 252, 95, 29);
		btnEliminar.setEnabled(false);
		add(btnEliminar);


		JLabel lblIntroducirIdDe = new JLabel("Introducir ID de producto \n a eliminar del carro");
		lblIntroducirIdDe.setBounds(420, 208, 318, 46);
		add(lblIntroducirIdDe);

		
		JLabel lblProductosAadidos = new JLabel("Productos anadidos");
		lblProductosAadidos.setBounds(133, 174, 151, 14);
		add(lblProductosAadidos);


		JLabel label = new JLabel("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		label.setBounds(31, 134, 696, 14);
		add(label);

		textDelete = new JTextField();
		textDelete.setBounds(422, 252, 132, 29);
		add(textDelete);
		textDelete.setColumns(10);

		botonAnadir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ArrayList<Object> lineaevento = new ArrayList<>();
				lineaevento.add(idventa);
				lineaevento.add(lista.get(comboBox.getSelectedIndex()).getId());
				lineaevento.add(Integer.valueOf(textcantidad.getText()));
				Contexto contexto = new Contexto(Evento.addProductoVentaCommand, lineaevento);
				Controller.getInstance().ejecutar(contexto);
			
				if(!contexto.getEvento().toString().contains("Error")){
					btnEliminar.setEnabled(true);
				}
				
			}
		});
		btnEliminar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ArrayList<Object> lineaevento = new ArrayList<>();
				lineaevento.add(idventa);
				lineaevento.add(Integer.valueOf(textDelete.getText()));
				lineaevento.add(Integer.valueOf(textcantidad.getText()));
				Contexto contexto = new Contexto(Evento.DeleteProductoVentaCommand,lineaevento);
				Controller.getInstance().ejecutar(contexto);
			}
		});
		btnProcesar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//ArrayList<Object> lineaevento = new ArrayList<>();
				Contexto contexto = new Contexto(Evento.procesarVenta,idventa);
				if(!textArea.getText().isEmpty()){
					Controller.getInstance().ejecutar(contexto);
				}
				
			}
		});


	}
	@SuppressWarnings("unchecked")
	public static  void Inicializar(Contexto contexto){
		ArrayList<Object> objects = (ArrayList<Object>) contexto.getDatos();
		idventa= (int) objects.get(0);
		int i =0;
		lista = (ArrayList<TProducto>) objects.get(1);
		DefaultListSelectionModel model = new DefaultListSelectionModel();
		for(TProducto p : lista){

			comboBox.addItem(p.getNombre());
			if(p.getStock()!=0){
				model.addSelectionInterval(i, i);
			}
			i++;
		}
		EnabledJComboBoxRenderer enableRenderer = new EnabledJComboBoxRenderer(model);

		comboBox.setRenderer(enableRenderer);
	}
	@Override
	public void Actualizar(Contexto contexto) {
		//Pillar HasHMap de TVenta
		Integer idP;
		String texto="";
		

		textArea.setText("");
		TVentas venta = (TVentas)contexto.getDatos();
		HashMap<Integer, Integer> map = venta.getLineasVenta();
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			idP=entry.getKey();
			String nombre = "";
			boolean ok= false;
			int i=0;
			while(!ok && i < lista.size()){
				if(lista.get(i).getId() ==idP){
					nombre = lista.get(i).getNombre();
					ok=true;
				}
				i++;
			}
			texto=texto+"ID:"+ idP + " Nombre:"+ nombre + " Cantidad: "+ venta.getLineasVenta().get(idP) +"\n";  

		}
		textArea.setText(texto);
	}

	public void resetCamps(){
		textcantidad.setText(null);
		textDelete.setText(null);
		textArea.setText(null);
		
	}


}
