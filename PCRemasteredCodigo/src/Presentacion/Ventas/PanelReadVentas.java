/**
 * 
 */
package Presentacion.Ventas;

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
import Integracion.Ventas.TVentas;
import Presentacion.Ventana;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;
import Presentacion.Controlador.Controller;


public class PanelReadVentas extends JPanel implements Ventana {
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JButton button;
	private JTextArea textArea ;
	private JScrollPane scroll;
	
	
	public PanelReadVentas(){
		initComponent();
	}
	
	public void initComponent() {
		setLayout(null);
		setOpaque(false);
		button = new JButton("Buscar Venta");
		button.setBounds(434, 68, 171, 42);
		add(button);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(83, 68, 339, 42);
		add(textField);
		textArea = new JTextArea();
		scroll = new JScrollPane(textArea);
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
	    	
	    		Contexto contexto = new Contexto (Evento.readVentasCommand,Integer.valueOf(textField.getText()));
	    		Controller.getInstance().ejecutar(contexto);
	    	}
	    });
	
	}
	

	@Override
	public void Actualizar(Contexto contexto) {
		// TODO Auto-generated method stub
		
		textArea.setVisible(true);
		TVentas c = (TVentas) contexto.getDatos();
		textArea.setText("ID: " + c.getID() + "\n" + "Atendido por: " + c.getIDPersonal() +"\n"+ "Importe: " + c.getPrecio()
		+ "\n"+ "Fecha: " + c.getFecha() + "\n\n");
		
	}
	
	public void resetCamps(){
		textField.setText(null);
		textArea.setText(null);
		
	}
}