package Presentacion.Ventas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.DefaultListSelectionModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Integracion.Productos.TProducto;
import Integracion.Ventas.TVentas;
import Presentacion.Ventana;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;
import Presentacion.Controlador.Controller;
import java.awt.Font;

public class PanelPago extends JPanel implements Ventana{
	private static final long serialVersionUID = 1L;
	private JTextArea textArea;
	private static ArrayList<TProducto> lista;
	private static int idventa;
	private static float total;
	private JButton btnProcesar;
	private JButton btnEliminar;
	private JTextField textField;

	
	public PanelPago(){
		
		initComponents();
	}
	
	public void initComponents() {
		setLayout(null);
		setOpaque(false);

		btnProcesar = new JButton("Pagar");
		btnProcesar.setBounds(274, 320, 135, 29);
		add(btnProcesar);

		textArea = new JTextArea();
		textArea.setBounds(31, 77, 221, 272);
		add(textArea);

		 btnEliminar = new JButton("Vincular cliente");
		btnEliminar.setBounds(274, 157, 135, 29);
		add(btnEliminar);


		JLabel lblIntroducirIdDe = new JLabel("Introducir ID del cliente");
		lblIntroducirIdDe.setBounds(274, 81, 135, 14);
		add(lblIntroducirIdDe);

		
		JLabel lblProductosAadidos = new JLabel("Ticket de compra");
		lblProductosAadidos.setBounds(31, 50, 151, 14);
		add(lblProductosAadidos);
		
		JLabel lblVentanaDePago = new JLabel("VENTANA DE PAGO");
		lblVentanaDePago.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblVentanaDePago.setBounds(31, 13, 159, 29);
		add(lblVentanaDePago);
		
		JLabel lblTotal = new JLabel("TOTAL:");
		lblTotal.setBounds(274, 291, 44, 16);
		add(lblTotal);
		
		textField = new JTextField();
		textField.setBounds(325, 288, 84, 22);
		add(textField);
		textField.setColumns(10);
		textField.setText(String.valueOf(total));
		
		btnEliminar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ArrayList<Object> lineaevento = new ArrayList<>();
				lineaevento.add(idventa);
				Contexto contexto = new Contexto(Evento.PagoProductoVentaCommand,lineaevento);
				Controller.getInstance().ejecutar(contexto);
			}
		});
		btnProcesar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ArrayList<Object> lineaevento = new ArrayList<>();
				lineaevento.add(idventa);
				Contexto contexto = new Contexto(Evento.procesarVenta,lineaevento);
				Controller.getInstance().ejecutar(contexto);
			}
		});


	}
	@SuppressWarnings("unchecked")
	public static  void Inicializar(Contexto contexto){
		Contexto cnx = (Contexto) contexto.getDatos();
		//ArrayList<Object> objects = (ArrayList<Object>) contexto.getDatos();
		ArrayList<Object> objects = (ArrayList<Object>) cnx.getDatos();
		TVentas venta = (TVentas) objects.get(1);
		idventa= venta.getID();
		total = venta.getPrecio();
		//int i =0;
		/*lista = (ArrayList<TProducto>) objects.get(0);
		for(TProducto p : lista){
			
		}*/
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
		textArea.setText(null);
		
	}
}
