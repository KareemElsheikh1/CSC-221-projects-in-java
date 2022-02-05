/***
 * class MorseCode encodes values of type Morse code with a Char and String
 *
 * @author Kareem Elsheikh
 */
public class MorseCode
{
    // three private variables
    private String encoding;
    private char Character;
    private int value = 0;
    public MorseCode()  // default constructor
    {
        Character = 0;
        encoding = null;
    }
    /***
     * non default constructor
     * @param character holds a character
     * @param encoding  holds the morse code value for a specific character
     */
    public MorseCode(char character,String encoding)
    {
        try
        {   // try to be able to throw an Illegal arg exception.
            value = character; // setting value to character to get the ascii value.
// Setting the character ascii value range from 32 to 90 and not allowing encoding to be null or less than length one.
            if (value >= 32 && value <= 90 && encoding != null && encoding.length() >= 1)
            {

                this.Character = character; // setting the character value after checking if it is in range.
                this.encoding = encoding.substring(2); // allowing encoding to be the morse code value.

            } else
                {
            // throwing an exception for any character not in range.
                throw new IllegalArgumentException("The character " + character + "is not a supported Morse character");
                }
        }
        // catching the exception thrown.
        catch (IllegalArgumentException E){ System.out.println("The character " + character + "is not a supported Morse character");
        }
    }
    // Mutators for the two variables.
    public char getcharacter(){ return this.Character; }
    public String getEncoding() {return  this.encoding; }
    // Accessors for the two variables.
    public void setEncoding(String encoding) {this.encoding = encoding;}
    public void setcharacter(char character){ this.Character = character; }
}