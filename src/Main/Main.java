package Main;

import Controller.*;
import Model.Background;
public class Main {

    public static void main(String[] args) {
    	Background gb = new Background();
        Controller controller = Controller.getInstance();
        try {
            controller.startApplication();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
