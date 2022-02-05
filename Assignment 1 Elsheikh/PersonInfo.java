import java.time.Year;
import java.util.GregorianCalendar;

/***
 * The class PersonInfo stores data from the user and calculates his bmi value and his age.
 */
public class PersonInfo {

 // Four private variables representing the Users Name, Date of birth, Height in meters, and Weight in Kilograms.

 private String Name;
 private int year;
 private Double height;
 private Double weight;

 // This is the default constructor for the Class PersonInfo.

 public PersonInfo(){
     Name = "";
     year = 0;
     height = 0.;
     weight = 0.;
 }
    /***
     *The non default constructor for the Class Person Info.
     * @param Name Sets the value of the private variable name to the inputs name.
     * @param year Sets the value of the private variable year to the inputs date of birth.
     * @param height Sets the value of the private variable height to the inputs height in meters
     * @param weight Set the value of the private variable weight to the inputs weight in kg
     */
 public PersonInfo(String Name, int year, Double height, Double weight){
    this.Name = Name;
    this.year = year;
    this.height = height;
    this.weight = weight;
 }

 // Mutators for the four variables.

 public String getName(){ return Name; }
 public int getyear() { return this.year;}
 public Double getheight() { return this.height; }
 public Double getweight() { return this.weight; }

 // Accessors for the four variables.

 public void Setname (String Name){  this.Name = Name; }
 public void Setyear (int year){ this.year = year;  }
 public void Setheight (Double height){ this.height = height; }
 public void Setweight (Double weight){ this.weight = weight; }

    /***
     * To calculate the age of an individual using his date of birth and the current year.
     * @return Returns the individuals age.
     */

    public int CalculateAge (){
        int currentyear = new GregorianCalendar( ).get(GregorianCalendar.YEAR);
      return currentyear - year; }

    /***
     * Calculates the Bmi of an individuals by dividing his weight by his height squared.
     * @return Returns an individuals bmi.
     */

    public Double calculateBMI (){ Double bmi = weight / (height * height); return bmi;  }
}