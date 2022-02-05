import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

/**
 * @author Elsheikh Kareem
 * Class SkeeBall simulates the same actions of your standard SkeeBall machine
 * by asking the user the number of plays and assigning a random score based on a specific probability.
 * Then outputting the score on a table.
 */
public class SkeeBall {
    static final int MAX_PLAYS = 8; // Determines max plays value should never change.
    private int plays;  // value to determine how many plays the user inputs

    public SkeeBall() { // Default constructor
        plays = 0;
    }   //  default constructor

    public SkeeBall(int plays) { // Non default constructor
        this.plays = plays;
    }   // Non default constructor

    private ArrayList<Integer> score = new ArrayList<Integer>();    // Arraylist to hold all the hall values.

    /**
     * This is the main method for running SkeeBall. It requests an input from the user based on
     * certain instructions. Then calls the method simulate play and display stats.
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner to get the input from the user.
        int plays;  // the place holder for the amount of plays the user inputs
        boolean value = false;
        do {    // a do while loop to make sure the user input the correct amount of plays.
            System.out.printf("Enter the number of plays (1-8)? ");
            plays = input.nextInt();
            if (plays > MAX_PLAYS || plays < 1) {
                value = true;
                System.out.printf("Invalid input. Please enter a number between 1 and 8. %n");
            } else value = false;
        } while (value);
        input.close();  // Closing the Scanner since it is no longer used.
        SkeeBall Skeeball1 = new SkeeBall(plays);   // Creating a new instance of Skeeball using the non default constructor.
        Skeeball1.simulatePlay();   // Calling simulatePlays
        Skeeball1.displayStats();   // Calling displayStats
    }

    /**
     * The method simulatePlay generates a random int from 0 to 99 to get percentages 1 - 100.
     * Then assigns a percentage based on the number chosen.
     * This is then put in to a switch to determine the Hall Value.
     * Then outputs to the console to tell the user which value the ball landed in.
     */
    public void simulatePlay() {
        Random rand = new Random();
        int percentage = 0;
        int HallValue = 0;
        for (int i = 0; i < plays; i++) {
            int rand_x = rand.nextInt(100); // randomizing a value from 0 to 100.

            if ( rand_x < 35) percentage = 35;      // determining the percentages to table 1.
            else if (rand_x < 54) percentage = 55;
            else if (rand_x < 69) percentage = 70;
            else if (rand_x < 84) percentage = 85;
            else if (rand_x < 94) percentage = 95;
            else  percentage = 100;

            switch (percentage) {       // switch to determine the HallValues according to percentages.
                case 35: {
                    HallValue = 0;
                    break;
                }
                case 55: {
                    HallValue = 10;
                    break;
                }
                case 70: {
                    HallValue = 20;
                    break;
                }
                case 85: {
                    HallValue = 40;
                    break;
                }
                case 95: {
                    HallValue = 60;
                    break;
                }
                case 100: {
                    HallValue = 80;
                    break;
                }
            }

            score.add(HallValue);
            System.out.printf("Rolling ball #%d", i + 1);       // Outputting that the ball was rolled and what Hall Values it landed in.
            System.out.printf(". Landed in  %d%n", HallValue);

        }
        }

    /**
     * The method display stats displays a table with a catagory of which play and the Hall value for that play.
     * Then displays the total score.
     */
    public void displayStats() {
        System.out.printf("%n+-------+-------+%n");     // Outputting the table of plays and Hall Values
        System.out.printf("%2sPlay #","");
        System.out.printf("%4sScore%n","");
        System.out.printf("+-------+-------+%n");
        int Total = 0;
        for (int i = 0; i < plays; i++) {              // Calculating the total score.
            System.out.printf("%6d%7d%n", i + 1, score.get(i));
            Total = Total + score.get(i);
        }
        System.out.printf("%nTotal: %d", Total);       // Outputting the total score.
    }
}




