import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by latashawatson on 2/15/17.
 */
public class TimeConverterCalculator {
    Pattern digitalPattern = Pattern.compile("([01]?[1-9]):([0-5][0-9])");
    Pattern militaryPattern = Pattern.compile("([01]?[0-9]|2[0-3]):([0-5][0-9])");
    HashMap<String, Integer> givenTime = new HashMap<>();
    //String input = "03:07 pm";


    public void splitSortTime(String input, Pattern pattern) {
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            int hour = Integer.parseInt(matcher.group(1));
            givenTime.put("hour", hour);
            int minutes = Integer.parseInt(matcher.group(2));
            givenTime.put("minutes", minutes);

        }

    }


}
