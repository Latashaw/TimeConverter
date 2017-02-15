import java.util.Scanner;

/**
 * Created by latashawatson on 2/15/17.
 */
public class Display {

    public static void println(String str) {
        System.out.println(str);
    }

    public static String getStringInput(String prompt) {
        println(prompt);
        System.out.print("user input >> ");
        Scanner scanner = new Scanner(System.in);
        String userStringInput = scanner.nextLine();
        return userStringInput;
    }
}
