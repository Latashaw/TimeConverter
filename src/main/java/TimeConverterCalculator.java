import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by latashawatson on 2/15/17.
 */
public class TimeConverterCalculator {
   HashMap<String,String> hm = new HashMap<>();
    String input = "03:07 pm";


    public void splitSortDigitalTime(String input) {
        Pattern pattern = Pattern.compile("([01]?[1-9]):([0-5][0-9])\\s?([a|A|p|P](.?)[M|m])");
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            hm.put("hour", matcher.group(1));
            hm.put("minutes", matcher.group(2));
            hm.put("meridian", matcher.group(3));
        }
    }

    public void splitSortMilitaryTime(String input) {
        Pattern patterns = Pattern.compile("([01]?[0-9]|2[0-3]):([0-5][0-9])");
        Matcher match = patterns.matcher(input);
        if (match.find()) {
            hm.put("hour", match.group(1));
            hm.put("minutes", match.group(2));
        }
    }


}
