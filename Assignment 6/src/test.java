import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) throws IOException {
        String linehold = "";
        Pattern pattern = Pattern.compile("");
        Files.lines(Paths.get("TestFile.txt")).flatMap(line -> pattern.splitAsStream(line)).map(line ->line);

    }
}
