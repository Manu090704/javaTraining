package ReadRegex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadRegex{
    public static final String ReadMatch = null;


    public static void ReadMatch(String input){
        // matcher objeto que sirve para buscar el match.
        //pattern objeto que define el patron con el que se compara.
        Matcher match;
        Pattern pat = Pattern.compile("[a-z]+@ge.com");
        match = pat.matcher(input);
        System.out.println("Regex: " + match.matches());
    }
}