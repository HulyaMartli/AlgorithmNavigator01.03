package UI;


/**
 * Java Studies Week 01 - 03 | March 06-23, 2023
 * Project0103 - All Problems
 * Algorithm Navigator 01.03 Menu
 *
 * @author HulyaMartli
 */
public class Menu {
    public static int home(){
        System.out.println("=========================================================================");
        System.out.println("===================== ALGORITHM NAVIGATOR 01.03 =====================");
        System.out.println("=========================================================================");
        System.out.println("Welcome to Algorithm Navigator 01.03!");
        System.out.println("This program is designed so that the user can apply methods created from");
        System.out.println("the Algorithm problems.");
        System.out.println("=========================================================================");
        System.out.println("1 - Calculate the sum of two numbers.");
        System.out.println("2 - Find the max of three numbers.");
        System.out.println("3 - Find out if the entered number is a multiple of a specified number.");
        System.out.println("4 - Print a word/sentence to screen as much as desired.");
        System.out.println("0 - Exit the navigator");
        System.out.println("=========================================================================");
        int result = UserInput.userInputInt("Please enter the problem number of the method you want to apply:");
        return result;

    }
}
