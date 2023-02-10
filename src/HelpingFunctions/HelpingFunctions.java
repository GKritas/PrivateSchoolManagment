package HelpingFunctions;

import java.util.Scanner;

public class HelpingFunctions {

    public static Scanner scanner = new Scanner(System.in);

    public static String userInput() {
        System.out.print("Enter your choice: ");
        return scanner.nextLine();
    }

    public static void cls() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
