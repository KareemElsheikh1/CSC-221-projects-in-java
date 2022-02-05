
import jdk.internal.icu.text.UnicodeSet;
import org.w3c.dom.Node;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StackOperations
{

    public static Stack<Character> stack = new Stack<>();

    public static void cc(Character c)
    {
        int x = 0;
        stack.add(x,c);
    }

    public static LinkedList<Character> list = new LinkedList<Character>();

    public static void c(Character c)
    {
        list.add(c);
    }

    /*
     * Converts from a stack to a Queue. The queue will be represented as a LinkedList
     */
    public static Queue<Character> toQueue(Stack<Character> stackOriginal)
    {
        list.clear();
        Character c = 0;
        stackOriginal.stream().forEach(StackOperations::c);
               return list;
    }

    /*
     * Returns a stack with items reversed from the original stack
     */
    public static Stack<Character> reverseStack(Stack<Character> stackOriginal)
    {
        stackOriginal.stream().forEach(StackOperations::cc);
        return stack;
    }

    /*
     * Returns the sum of integers between the start and end positions
     */
    public static int sumBetween(Stack<Integer> stack, int startPosition, int endPosition)
    {
        if (startPosition > stack.size() - 1  || endPosition > stack.size()) return -1;
        Integer sum1 = stack.stream().limit(startPosition).mapToInt(Integer::valueOf).sum();    // this is here just in case the start position isn't the first index.
        Integer sum2 = stack.stream().limit(endPosition + 1).mapToInt(Integer::valueOf).sum();
        return sum2 - sum1;
    }

    /*
     * Reads from an input file and returns the characters that are integers from the file.
     * The function will read the lines from the file, extract the characters, filter non-numeric characters (i.e. not 0,1,...9),
     * and place these character numbers on a stack
     */
    public static Stack<Character> readNumericFromFile(final String filePath) throws IOException
    {
        stack.clear();
        BufferedReader br = Files.newBufferedReader(Paths.get(filePath));
                       br.lines()
                         .forEach(x -> x.chars()
                         .mapToObj(y -> (char) y)
                         .filter(Character::isDigit)
                         .forEach(z -> stack.push(z)));
         return stack;
    }
}
