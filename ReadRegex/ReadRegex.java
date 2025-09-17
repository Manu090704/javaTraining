package ReadRegex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadRegex{
    public static void ReadMatch(String input){
        Matcher match;
        Pattern pat = Pattern.compile("[a-z]+@ge.com");
        match = pat.matcher(input);
        System.out.println("Regex: " + match.matches());
    }
}