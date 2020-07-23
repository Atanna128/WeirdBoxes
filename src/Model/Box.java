package Model;
import java.awt.*;  

public class Box extends Panel {
	private int width = 100;
	private int height = 40;
	private int x = 300;
	private int y = 300;
	private Label lb = new Label("First Label");  
	private Color cl = Color.BLUE;
	private Font myFont = new Font("Roboto Condensed Light", Font.PLAIN, 15);
	
	public Box(){
		lb.setSize(width,height);
		lb.setAlignment(Label.CENTER);
		lb.setFont(myFont);
		lb.setForeground(Color.WHITE);
		add(lb);
	    setSize(width, height);
	    setLocation(x, y);    
	    setBackground(cl);
	    setLayout(null);
	    setVisible(true); 
	}
	
	public void changeLocation(int x, int y) {
		this.x = x;
		this.y = y;
		this.setLocation(x, y);
	}
	
	public void changeSize(int width, int height) {
		this.width = width;
		this.height = height;
		this.setSize(width,height);
		this.lb.setSize(width, height);
	}
	
	public void changeColor(Color cl) {
		this.cl = cl;
		this.setBackground(cl);
	}
	
	public void changeLabel(String str) {
		this.lb.setText(str);
	}
	
	public void changeVisible(boolean visible) {
		this.setVisible(visible);
	}
}
