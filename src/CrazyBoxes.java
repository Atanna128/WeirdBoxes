
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CrazyBoxes {

    private static final int BG_HEIGHT = 400;
    private static final int BG_WIDTH = 500;
    private static final int HEIGHT = 30;
    private static final Color[] colors = {Color.BLUE, Color.CYAN, Color.darkGray, Color.GRAY, Color.GREEN,
            Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color. PINK, Color.RED, Color.YELLOW};

    private static String string_input; //THE LABEL OF THE BOX
    private static int loop_time; //NUMBERS OF JUMPS
    private static int leave_text ; //1: Yes. 0: No

    private static Frame bg = new Frame("CrazyBoxes");
    private static Panel box = new Panel();
    private static Label lb = new Label();
    private static Dimension size;

    private static List<Integer> xArr = new ArrayList<Integer>();
    private static List<Integer> yArr = new ArrayList<Integer>();
//    private static List<Integer> chosenColors= new ArrayList<Integer>();



    public static void drawBoxWText(String string_input, Panel box, Color[] chosenColors,
                                    List<Integer> xArr2, List<Integer> yArr2, int current) {
        int xLocation, yLocation;
        int currentColor;

        //Get 2 random numbers for x and y coordinates
//        xLocation = new Random().ints(0, BG_WIDTH-size.width-5).findFirst().getAsInt();
//        yLocation = new Random().ints(0, BG_HEIGHT-HEIGHT).findFirst().getAsInt();
        xLocation = new Random().nextInt(BG_WIDTH-size.width-5);
        yLocation = new Random().nextInt(BG_HEIGHT-HEIGHT);

        //Store coordinates in different arrays
        xArr.add(xLocation);
        yArr.add(yLocation);

        //Generate random number base on color array
//        currentColor = new Random().ints(0, 11).findFirst().getAsInt();
        currentColor = new Random().nextInt(11);

        //Set the color with the index of the random number just generated
        box.setBackground(chosenColors[currentColor]);

        //Draw the box
        box.setLocation(xArr2.get(current), yArr2.get(current));

        //Set the color to white

        //Draw the String shifting +5 in x and +15 in y
        lb.setText(string_input);
        bg.add(box);

        //Wait for half a second
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {}


//        chosenColors.add(chosenColor);
//        box.setLocation(xArr2.get(current), yArr2.get(current));
//        box.setBackground(colors[chosenColors2.get(current)]);



    }

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        bg.setSize(BG_WIDTH, BG_HEIGHT);
        bg.setLayout(null);
        bg.setVisible(true);

        //RUN TO GET INFO FROM USERS
        System.out.println("USTA - Summer 2020 - CS1083 - Project 2 - written BY YOURNAME ");
        System.out.println("Please, enter a string with no whitespaces:");
        string_input = myInput.nextLine();

        while(true){
            System.out.print("Please, enter a number (1 to 15) :");
            String input = myInput.nextLine();
            loop_time = Integer.parseInt(input);
            if(loop_time>0 && loop_time<16)
                break;
        }
        do {
            System.out.print("Do you want to leave the text? (1-Yes, 0-No): ");
            leave_text = myInput.nextInt();
        }while(leave_text<0 | leave_text>1);

        //SET UP BACKGROUND(FRAME), TEXT(LABEL), BOX(PANEL)

        lb.setSize(8*string_input.length(), 12);
        size = lb.getPreferredSize();
        lb.setBounds(5, 15, size.width, size.height);
        lb.setFont(new Font("Roboto Condensed Light", Font.PLAIN, 12));
        lb.setForeground(Color.WHITE);

        box.setSize(size.width+5, HEIGHT);
        box.setLayout(null);
        box.setVisible(true);
        box.add(lb);

        for(int i = 0; i < loop_time; i++) {
            //JUMP
            drawBoxWText(string_input, box, colors, xArr, yArr, i);
        }

        //PRINT THE OUTPUT OF LOCATIONS
        for(int i = 0; i < loop_time; i++)
            System.out.println(i + "  -  " + "(" + xArr.get(i) +", " + yArr.get(i)+")");


    }
}
