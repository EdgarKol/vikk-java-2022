package ee.vikk.course;

import java.util.Scanner;

public class UserInput {

    /**
     * Prints the prompt to the console and awaits user input.
     * Supports any kind of input value!
     */
    public static String ask(String prompt) {
        System.out.print(prompt + ": ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    /**
     * Prints the prompt to the console and awaits user input.
     * Supports only integers!
     */
    public static int askForNumber(String prompt) {
        System.out.print(prompt + ": ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
