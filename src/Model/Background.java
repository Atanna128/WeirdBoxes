package Model;
import java.awt.*;  
import java.awt.event.WindowEvent;  
import java.awt.event.WindowListener;  
import Model.Box;

public class Background extends Frame implements WindowListener {	
	public Background(){                              // init background
		setSize(500, 400);
		setLayout(null);
		setVisible(true);
		addWindowListener(this);
	}
	
	public void addBox(Box b) {
		this.add(b);
	}
	
	public void windowClosing(WindowEvent e) {  
	    dispose();  
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
	}  
}
