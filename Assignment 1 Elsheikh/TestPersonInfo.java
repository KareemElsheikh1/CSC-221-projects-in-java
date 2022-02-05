import java.util.Scanner;

/***
 * class TestPersonInfo is designed to take information from the user and store it in PersonInfo.
 * To then output the information stored in PersonInfo to give a result of an individuals bmi class.
 * Including his age,name,height and weight and bmi class.
 */
public class TestPersonInfo {
    /***
     * To classify the which class of bmi an the individual falls in.
     * @param bmi The body mass index of an individual.
     */
    public static String classifyBMI(Double bmi) {
        if (bmi < 18.5) { return  "Underweight"; }
        else if (bmi >= 18.5 && bmi < 25) { return "Normal Weight"; }
        else if (bmi >= 25 && bmi < 30) { return "Overweight"; }
        else if (bmi >= 30) { return "Obese"; }
        else return "" ;
    }
    /***
     * The main method for class TestPersonInfo.
     * @param args the argument for the main method.
     */
    public static void main(String[] args) {

        System.out.printf("First Instance Prompts %n");

        PersonInfo person = new PersonInfo();   // creating a new instance class PersonInfo using default constructor.

        Scanner input = new Scanner(System.in); // creating a scanner to read user inputs.

        System.out.printf("Enter person's name: ");
        person.Setname(input.nextLine());       // using Accessors to set the values of name,year,height and weight.
        System.out.printf("Enter person's year of birth: ");
        person.Setyear(input.nextInt());
        System.out.printf("Enter person's height in meters: ");
        person.Setheight(input.nextDouble());
        System.out.printf("Enter person's weight in kilograms: ");
        person.Setweight(input.nextDouble());

        Scanner input1 = new Scanner(System.in); // creating another scanner to solve an issue with input.nexline().

        System.out.printf("%nSecond Instance Prompts %n");
        System.out.printf("Enter person's name: ");   // creating new variables to hold the values from the user to then place in the non default constructor.
        String Name = input1.nextLine();
        System.out.printf("Enter person's year of birth: ");
        int year = input.nextInt();
        System.out.printf("Enter person's height in meters: ");
        Double height = input.nextDouble();
        System.out.printf("Enter person's weight in kilograms: ");
        Double weight = input.nextDouble();

        System.out.printf("%n 1st instance Outputs %n");
        System.out.printf("     Full Name: %s%n",person.getName());    // outputting with a column width of 16 with the mutators in the PersonInfo class.
        System.out.printf("           Age: %d%n", person.CalculateAge());  // outputting with CalculateAge function from PersonInfo with column width 16.
        System.out.printf("        Height: %s%n", person.getheight());
        System.out.printf("        Weight: %s%n", person.getweight());
        System.out.printf("Classification: %s%n ",classifyBMI(person.calculateBMI())); // outputting with classifyBmi function from TestPersonInfo.

        PersonInfo person2 = new PersonInfo(Name,year,height,weight);   // creating another instance of PersonInfo using the non default constructor.

        System.out.printf("%n2nd instance Outputs %n");
        System.out.printf("     Full Name: %s%n", Name);    // outputting with the values obtained from the default constructor.
        System.out.printf("           Age: %d%n", person2.CalculateAge());  // outputting with CalculateAge function from PersonInfo with column width 16.
        System.out.printf("        Height: %.2f%n",height);
        System.out.printf("        Weight: %.2f%n",weight);
        System.out.printf("Classification: %s ",classifyBMI(person2.calculateBMI()));  // outputting with classifyBmi function from TestPersonInfo.
    }
}