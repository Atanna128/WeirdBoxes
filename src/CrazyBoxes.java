
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
    private static final Color[] colors = {Color.BLUE, Color.CYAN, Color.darkGray, Color.GRAY, Color.GRAY, Color.GREEN,
            Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color. PINK, Color.RED, Color.YELLOW};

    private static String string_input; //THE LABEL OF THE BOX
    private static int loop_time; //NUMBERS OF JUMPS
    private static int leave_text ; //1: Yes. 0: No

    static Frame bg = new Frame("CrazyBoxes");
    static Panel box = new Panel();
    static Label lb = new Label();

    static List<Integer> xArr = new ArrayList<Integer>();
    static List<Integer> yArr = new ArrayList<Integer>();
    static List<Integer> chosenColors= new ArrayList<Integer>();


    public static void drawBoxWText(String string_input, Panel box, List<Integer> chosenColors2,
                                    List<Integer> xArr2, List<Integer> yArr2, int loop_time) {

        lb.setText(string_input);

        for(int i = 0; i < CrazyBoxes.loop_time; i++) {
            box.setLocation(xArr2.get(i), yArr2.get(i));
            box.setBackground(colors[chosenColors2.get(i)]);
            bg.add(box);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
    }

    public static void main(String[] args) {
        int i;
        int xLocation, yLocation;
        int chosenColor;

        Random r = new Random();
        Scanner myInput = new Scanner(System.in);


        //RUN TO GET INFO FROM USERS
        System.out.println("USTA - Summer 2020 - CS1083 - Project 2 - written BY YOURNAME ");
        System.out.println("Please, enter a string with no whitespaces:");
        string_input = myInput.nextLine();

        while(true){
            System.out.println("Please, enter a number (1 to 15) :");
            String input = myInput.nextLine();
            loop_time = Integer.parseInt(input);
            if(loop_time>0 && loop_time<16)
                break;
        }

        //SET UP BACKGROUND(FRAME), TEXT(LABEL), BOX(PANEL)

        bg.setSize(BG_WIDTH, BG_HEIGHT);
        bg.setLayout(null);
        bg.setVisible(true);

        lb.setSize(8*string_input.length(), 12);
        Dimension size = lb.getPreferredSize();
        lb.setBounds(5, 15, size.width, size.height);
        lb.setFont(new Font("Roboto Condensed Light", Font.PLAIN, 12));
        lb.setForeground(Color.WHITE);

        box.setSize(size.width+5, HEIGHT);
        box.setLayout(null);
        box.setVisible(true);
        box.add(lb);

        //GET ALL THE LOCATIONS AND COLORS PER JUMP RANDOMLY 1ST THEN STORE IN ARRAYLIST
        for(i = 0; i < loop_time; i++) {
            xLocation = r.ints(0, BG_WIDTH-size.width-5).findFirst().getAsInt();
            yLocation = r.ints(0, BG_HEIGHT-HEIGHT).findFirst().getAsInt();
            chosenColor = r.ints(0, 11).findFirst().getAsInt();

            xArr.add(xLocation);
            yArr.add(yLocation);
            chosenColors.add(chosenColor);
        }

        //JUMP
        drawBoxWText(string_input, box, chosenColors, xArr, yArr, loop_time);

        //PRINT THE OUTPUT OF LOCATIONS
        for(int j = 0; j < loop_time; j++)
            System.out.println(j + "  -  " + "(" + xArr.get(j) +", " + yArr.get(j)+")");

        do {
            System.out.println("Do you want to leave the text? (1-Yes, 0-No): ");
            leave_text = myInput.nextInt();
        }while(leave_text<0 | leave_text>1);
    }
}
