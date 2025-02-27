package sooper.demo.tkrun;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

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
		frmSooper = new JFrame();
		frmSooper.setTitle("SOOPER");
		frmSooper.getContentPane().setLayout(new MigLayout("", "[grow]", "[][][grow][][][][][][][][]"));
	}
	


	
	

}
