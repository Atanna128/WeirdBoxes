package Controller;
import java.util.Scanner;

import Model.Background;
public class Controller {
	
    private static Controller instance = new Controller();
    public static Controller getInstance() {
        return instance;
    }
    
    private static BoxController boxCtrl = new BoxController();
    
    Scanner myInput = new Scanner(System.in);
        
    int number, i; // numbers of jumb
    int leave_text ; //1: Yes. 0: No
    String string_input; // text in box

	Background bg = new Background();
	
    public void startApplication(){

    	System.out.println("USTA - Summer 2020 - CS1083 - Project 2 - written BY YOURNAME ");
    	System.out.println("Please, enter a string with no whitespaces:");
        string_input = myInput.nextLine();	
    	do {
    		System.out.println("Please, enter a number (1 to 15) :");
    		String input = myInput.nextLine();
    		number = Integer.parseInt(input);
    		
//    		System.out.println(number);
//    		System.out.println(string_input);
    	}while(number<1 | number >15);   
    	
//make jump and change color in for loop below here !!!
    	
    	boxCtrl.drawBoxWText(string_input, number, bg);
    	
    	do {
        	System.out.println("Do you want to leave the text? (1-Yes, 0-No): ");
    		leave_text = myInput.nextInt();
//        	System.out.println(leave_text);
    	}while(leave_text<0 | leave_text>1);
    	
    }
}
