/**
 * 
 */
package Presentacion.Envios;

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

import Integracion.Envios.TEnvio;
import Presentacion.Ventana;
import Presentacion.Command.Contexto;
import Presentacion.Command.Evento;
import Presentacion.Controlador.Controller;

public class PanelReadByIdEnvio extends JPanel implements Ventana{
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JButton button;
	private JTextArea textArea ;
	private JLabel lblIntroduceElId;
	/**
	 * Create the panel.
	 */
	
	public PanelReadByIdEnvio(){
		
		initComponent();
		
	}
	
	public void initComponent() {
		setLayout(null);
		setOpaque(false);
		button = new JButton("Buscar Env�o");
		button.setBounds(425, 75, 180, 37);
		add(button);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(82, 75, 331, 36);
		add(textField);
		textArea = new JTextArea();
		JScrollPane scroll = new JScrollPane(textArea);
	    scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	    scroll.setVisible(true);
	    scroll.setBounds(83, 136, 522, 281);
	    add(scroll);
	    textArea.setVisible(false);
	    textArea.setEditable(false);
	    
	    lblIntroduceElId = new JLabel("Introduce el ID");
	    lblIntroduceElId.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    lblIntroduceElId.setBounds(82, 50, 113, 16);
	    add(lblIntroduceElId);
	
	    button.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    	//	textArea.setVisible(true);
	    		Contexto contexto = new Contexto (Evento.readEnvioCommand,Integer.valueOf(textField.getText()));
	    		Controller.getInstance().ejecutar(contexto);

	    	}
	    });

	}
	@Override
	public void Actualizar(Contexto contexto) {
		textArea.setVisible(true);
		String s = null;
		TEnvio c = (TEnvio) contexto.getDatos();
		if(c.isEstado())
			s= "En curso";
		else s= "Entregado";
		textArea.setText("ID: " + c.getID() + "\n" +"Direcci�n: " + c.getDireccion()+ "\n" +"Estado: "+s+  "\n" );
		
		
	}
	
	public void resetCamps() {
		textField.setText(null);
		textArea.setText(null);
		
	}
}