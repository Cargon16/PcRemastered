package Presentacion.Ventas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Integracion.Productos.TProducto;
import Integracion.Ventas.TVentas;
import Negocio.ComprobadorSintactico.ComprobadorSintactico;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;
import Presentacion.Controlador.Controller;
import java.awt.Font;
import java.awt.SystemColor;

public class PanelPagoImp extends PanelPago{

	private static final long serialVersionUID = 1L;
	private JTextArea textArea;
	@SuppressWarnings("unused")
	private static ArrayList<TProducto> lista;
	private static int idventa;
	@SuppressWarnings("unused")
	private static float total;
	private JButton btnProcesar;
	private JTextField textField;
	private JLabel lblTotal;

	public PanelPagoImp() {
		setResizable(false);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 737, 598);
		getContentPane().setLayout(null);

		btnProcesar = new JButton("Pagar");
		btnProcesar.setBackground(SystemColor.textHighlight);
		btnProcesar.setBounds(429, 263, 170, 41);
		getContentPane().add(btnProcesar);

		textArea = new JTextArea();
		textArea.setBounds(31, 77, 221, 272);
		getContentPane().add(textArea);


		JLabel lblIntroducirIdDe = new JLabel("Introducir ID del cliente");
		lblIntroducirIdDe.setBounds(429, 81, 135, 14);
		getContentPane().add(lblIntroducirIdDe);


		JLabel lblProductosAadidos = new JLabel("Ticket de compra");
		lblProductosAadidos.setBounds(31, 50, 151, 14);
		getContentPane().add(lblProductosAadidos);

		JLabel lblVentanaDePago = new JLabel("VENTANA DE PAGO");
		lblVentanaDePago.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblVentanaDePago.setBounds(31, 13, 159, 29);
		getContentPane().add(lblVentanaDePago);

		textField = new JTextField();
		textField.setBounds(429, 108, 170, 22);
		getContentPane().add(textField);
		textField.setColumns(10);

		lblTotal = new JLabel("TOTAL");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTotal.setBounds(429, 223, 170, 27);
		getContentPane().add(lblTotal);
		btnProcesar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(ComprobadorSintactico.getInstance().isNumeric(textField.getText())){
					ArrayList<Object> lista = new ArrayList<Object>();
					lista.add(idventa);
					lista.add(textField.getText());
					Contexto contexto = new Contexto(Evento.PagoProductoVentaCommand, lista);
					Controller.getInstance().ejecutar(contexto);
					dispose();
				}else{
					JOptionPane.showMessageDialog(null, "Datos incorrectos, el Id debe ser un dato numerico");
				}

			}
		});
		addWindowListener(new WindowAdapter()
		{
			@Override
			public void windowClosing(WindowEvent e)
			{
				System.out.println("Closed");
				PanelPago.setInstance(null);        }
		});

	}

	@SuppressWarnings("unchecked")
	@Override
	public void Actualizar(Contexto contexto) {
		//Pillar HasHMap de TVenta
		Integer idP, precioP;
		String texto="";


		textArea.setText("");
		Contexto cnx = (Contexto) contexto.getDatos();
		ArrayList<Object> objects = (ArrayList<Object>) cnx.getDatos();
		TVentas venta = (TVentas) objects.get(0);
		lblTotal.setText("TOTAL: " + venta.getPrecio());
		idventa = venta.getID();
		HashMap<Integer, Integer> map = venta.getLineasVenta();
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			idP=entry.getKey();
			precioP = entry.getValue();

			texto=texto+"ID:"+ idP + " Cantidad: "+ precioP +"\n";  

		}
		textArea.setText(texto);

	}

	@Override
	public void resetCamps() {
		textArea.setText(null);

	}
}

