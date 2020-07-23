package Controller;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import Model.Background;
import Model.Box;

public class BoxController {
	List<Integer> xArr = new ArrayList<Integer>();
	List<Integer> yArr = new ArrayList<Integer>();
	Color[] colors = {Color.BLUE, Color.CYAN, Color.darkGray, Color.GRAY, Color.GRAY, Color.GREEN,
			Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color. PINK, Color.RED, Color.YELLOW};

	
	void drawBoxWText(String text, int loop_time, Background bg) {
		Random r = new Random();
		int xLocation, yLocation, chosenColor;
		Box box = new Box();
		
		for(int i = 0; i < loop_time; i++) {
			xLocation = r.ints(0, 400).findFirst().getAsInt();
			yLocation = r.ints(0, 360).findFirst().getAsInt();
			chosenColor = r.ints(0, 11).findFirst().getAsInt();
			
			this.xArr.add(xLocation);
			this.yArr.add(yLocation);
			
			box.changeLabel(text);
			box.setLocation(xLocation, yLocation);
			box.changeColor(colors[chosenColor]);
			bg.addBox(box);
			try {
			     Thread.sleep(500);
			   } catch (InterruptedException e) {}
		}
		for(int j = 0; j < loop_time; j++) 	
			System.out.println(j + "  -  " + "(" + this.xArr.get(j) +", " + this.yArr.get(j)+")");
	}
	
	
}
