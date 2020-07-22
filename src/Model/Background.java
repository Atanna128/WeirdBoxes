package Model;
import java.awt.*;  
import java.awt.event.WindowEvent;  
import java.awt.event.WindowListener;  


public class Background extends Frame implements WindowListener {
	public Background(){
		setSize(500, 450);
		setLayout(null);
		setVisible(true);
		addWindowListener(this);   
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
