package sooper.demo.tkrun;

/*ventana para la gestion de pedidos. La ventana esta construida usando WindowsBuilder.
 * Se instala desde el Eclipse Marketplace. Una vez instalado, tan solo hay que abrir 
 * la clase con boton derecho-> abrir con WindowBuilder Editor  */

import net.miginfocom.swing.MigLayout;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import sooper.demo.tkrun.*;
import java.awt.BorderLayout;
import net.miginfocom.swing.MigLayout;

public class Supermercado {

	
	protected JFrame frmSooper;
	
	public Supermercado() {
		initialize();
	}
	
	private void initialize() {
		
		//inicializacion y parámetros del frame. Codigo auto-generado desde el WinBuilder
		frmSooper = new JFrame();
		frmSooper.setTitle("SOOPER");
		frmSooper.setBounds(0, 0, 496, 496);
		frmSooper.getContentPane().setLayout(new MigLayout("", "[grow][grow]", "[][][grow][][][][][][][][]"));
		frmSooper.setVisible(true);
		
	}
	
	

}
