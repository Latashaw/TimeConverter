import java.util.*;

/**
 * Created by latashawatson on 2/15/17.
 */
public class NumbersMapInitializer {

    String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    HashMap<Integer, String> numberConversionMap = new HashMap<>();

    public NumbersMapInitializer() {
        numberConversionMap.put(10, "ten");
        numberConversionMap.put(11, "eleven");
        numberConversionMap.put(12, "twelve");
        numberConversionMap.put(13, "thirteen");
        numberConversionMap.put(14, "fourteen");
        numberConversionMap.put(15, "fifteen");
        numberConversionMap.put(16, "sixteen");
        numberConversionMap.put(17, "seventeen");
        numberConversionMap.put(18, "eighteen");
        numberConversionMap.put(19, "nineteen");

        populate(0, "");
        populate(20, "twenty ");
        populate(30, "thirty ");
        populate(40, "forty ");
        populate(50, "fifty ");
    }

    private void populate(int startNum, String tensPlace) {
        for(int i=0;i<ones.length; i++) {
            String onesPlace = ones[i];
            numberConversionMap.put(startNum + i, tensPlace + onesPlace);
        }
    }
}



