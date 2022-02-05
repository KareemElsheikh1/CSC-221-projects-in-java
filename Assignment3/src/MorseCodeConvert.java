import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/*read me Issue with the TestMorseConverter file so commented out the catch (FileNotFoundException fnfe) when running the program and was able to print
and run the three functions without a problem.
*/

/***
 * class MorseCodeConvert to convert characters into a morse code value
 *@author Kareem Elsheikh
 */
public class MorseCodeConvert {
    private String encoding = "hello"; // initializing the String encoding.
    private ArrayList<MorseCode> listCodes = new ArrayList<>(); // An arraylist to hold objects morsecode.

    /***
     * Non default constructor to convert char into a morse code
     * @param MorseCodes Takes in a character and a string to represent the characters morse code.
     */
    public MorseCodeConvert(String MorseCodes) {
        Scanner file = null; // setting scanner to null
        try {
            file = new Scanner(new File(MorseCodes)); // using scanner new File to read a file from String MorseCodes.

            while (file.hasNextLine()) // While loop to keep going till file is empty
            {
                encoding = file.nextLine(); // setting encoding to the last read line from the file.
                String sample = encoding;       // initializing a new string to be equal to encoding
                if (sample.length() == 1)        // checking for to see for invalid line.
                {
                    try {
                        throw new IllegalArgumentException("Invalid Line: " + encoding);
                    }   //throwing and catching exception of invalid line.
                    catch (IllegalArgumentException E) {
                        System.out.println("Invalid Line: " + encoding);
                    }
                } else if (sample.length() > 1)   // checking if the line is not an empty space
                {
                    char test = sample.charAt(1);
                    if (test != 9)       // checking if the character at position two of string sample is not a tab.
                    {
                        try {
                            throw new IllegalArgumentException("Invalid Line: " + encoding);
                        }  //throwing and catching exception of invalid line.
                        catch (IllegalArgumentException E) {
                            System.out.println("Invalid Line: " + encoding);
                        }
                    } else if (test == 9)     // checking if character at position two of string sample is a tab.
                    {
                        test = sample.charAt(0);        // set character to the first position of string sample.
                        MorseCode morseCode = new MorseCode(test, sample);   // calling the non default constructor
                        listCodes.add(morseCode);   // adding morseCode constructor values to listCodes.
                    }
                }
            }
            file.close();   // closing the scanner
        } catch (FileNotFoundException e) // catching file not found exception and displaying it.
        {
            System.out.println("Failed to open file: Morsecodes");
        }
    }
    /***
     * printing the list of all valid characters and their morse codes in listCodes.
     */
    public void printEncodingList() {
        for (int i = 0; i < listCodes.size(); i++) {
            MorseCode print = listCodes.get(i);
            if (print.getEncoding() != null) {
                System.out.println("('" + print.getcharacter() + "', " + print.getEncoding() + ")");
            }
        }
    }
    /***
     * user inputs a string to convert it to morse code.
     * @param input is the users inputted String.
     */
    public void encodeString(String input) {
        String morsehold = "";      // initializing a string to store the morse codes.
        char character = 0;         // stores the character of the string to compare to the morse code characters.
        if (input != null)          //  checking if input is not null
        {
            for (int x = 0; x < input.length(); x++)    // using two for loops to check if the current String position matches any character in listCodes.
            {
                character = input.charAt(x);

                for (int y = 0; y < listCodes.size(); y++) {
                    MorseCode holder = listCodes.get(y);
                    if (holder.getcharacter() == Character.toUpperCase(character))  // The morse codes for lower and upper case letters are the same.
                    {
                        morsehold = morsehold + " " + holder.getEncoding();
                    }
                }
            }
            System.out.println(morsehold);         // printing the String holding the converted Strings morse code values.
        }
    }
    /***
     * reads into a file and converts all valid characters into morse code and invalid characters into ?s .
     * @param MorseCodes   A file name to be input by the user.
     */
    public void encodeFile(String MorseCodes) {
        try // try catch to catch the filenotfound exception.
        {
            Scanner file = null;    // creating a scanner
            file = new Scanner(new File(MorseCodes));   // scanning into the user inputted file.
            while (file.hasNextLine())      // loops till their is no more lines in the file.
            {
                encoding = file.nextLine();     // sets String encoding to the last read line of the file.
                String morsehold = "";      // String to hold all morse code values.
                char character = 0;
                int h = 0;

                for (int x = 0; x < encoding.length(); x++) {
                    character = encoding.charAt(x); // char set to the position of the String
                    h = Character.toUpperCase(character);   // getting the ascii value of the character.
                    if (h < 32 || h > 90)
                    {        // if statement to check if character is an invalid character.
                        morsehold = morsehold + " ?";
                    }
                    else
                        {              // character is now a valid character and receives the correct morse code value by iterating through the morsecodes in listCodes.
                        for (int y = 0; y < listCodes.size(); y++)
                        {
                            MorseCode holder = listCodes.get(y);

                            if (holder.getcharacter() == Character.toUpperCase(character))
                            {
                                morsehold = morsehold + " " + holder.getEncoding();
                            }
                        }
                        }
                }
                System.out.println(morsehold);      // outputs the converted String from characters to morse codes.
            }
            file.close();   // closing the scanner
        }
        // file not found exception
        catch (FileNotFoundException FILE) { System.out.println("file " + MorseCodes + " not found"); }
    }
}
