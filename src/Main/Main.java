package Main;

import Controller.*;
public class Main {
    public static void main(String[] args) {
        Controller controller = Controller.getInstance();
        try {
            controller.startApplication();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
