package UI;

import java.util.Scanner;

public class UserInput {

    /**
     * Prints out the entered string (info about input) and gets integer input from the user.
     * @param str
     * @return double user input
     */
    public static int userInputInt(String str) {
        int result;
        Scanner sc = new Scanner(System.in);
        System.out.println(str);
        result= sc.nextInt(); sc.nextLine(); // sc.nextLine() to eliminate Enter button effect
        return result;
    }

    /**
     * Prints out the entered string (info about input) and gets double input from the user.
     * @param str
     * @return double user input
     */
    public static double userInputDouble(String str) {
        double result;
        Scanner sc = new Scanner(System.in);
        System.out.println(str);
        result= sc.nextInt(); sc.nextLine(); // sc.nextLine() to eliminate Enter button effect
        return result;
    }

    public static String userInputString(String str) {
        String result;
        Scanner sc = new Scanner(System.in);
        System.out.println(str);
        result= sc.nextLine();
        return result;
    }

}
