/**
 * Created by latashawatson on 2/15/17.
 */
public class TimeConverter {
    Display display = new Display();
    TimeConverterCalculator tMC = new TimeConverterCalculator();


    public void runTimeConverter(){
        display.println("Welcome to the Time Converter");
        String convertType = display.getStringInput("Would you like to convert from [ digital ] or [ military ] time?");
        String input = display.getStringInput("What time would you like to convert?");
        switch(convertType.toLowerCase()) {
            case "digital":
                break;
            case "military":
                break;

        }
    }
}
