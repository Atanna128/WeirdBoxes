package Main;

import java.awt.Color;

import Controller.*;
import Model.Background;
import Model.Box;
public class Main {

    public static void main(String[] args) {
    	Background bg = new Background();
		Box b=new Box();
		bg.addBox(b);
        Controller controller = Controller.getInstance();
        try {
            controller.startApplication();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
