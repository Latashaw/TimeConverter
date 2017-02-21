/**
 * Created by latashawatson on 2/15/17.
 */
public class TimeConverter {
    Display display = new Display();
    TimeConverterCalculator tCC = new TimeConverterCalculator();
    NumbersMapInitializer nMI = new NumbersMapInitializer();


    public void runTimeConverter(){
        display.println("Welcome to the Time Converter");
        String convertType = display.getStringInput("Would you like to convert from [ digital ] or [ military ] time?");
        switch(convertType.toLowerCase()) {
            case "digital":
                System.out.println(handleDigital());
                break;
            case "military":
                System.out.println(handleMilitary());
                break;
        }

    }

    public String handleDigital() {
        String digitalInput = display.getStringInput("Input time formatted as HH:MM");
        tCC.splitSortTime(digitalInput, tCC.digitalPattern);
        int hour = tCC.givenTime.get("hour");
        String verbalHour = nMI.numberConversionMap.get(hour);
        int minute = tCC.givenTime.get("minutes");
        String verbalMinutes = nMI.numberConversionMap.get(minute);
        return verbalHour + " " + verbalMinutes;
    }

    public String handleMilitary() {
        String militaryInput = display.getStringInput("Input time");
        tCC.splitSortTime(militaryInput, tCC.militaryPattern);
        int hour = tCC.givenTime.get("hour");
        String verbalHour = nMI.numberConversionMap.get(hour);
        int minute = tCC.givenTime.get("minutes");
        String verbalMinutes = nMI.numberConversionMap.get(minute);
        return verbalHour + " " + verbalMinutes + "hours";
    }
}
