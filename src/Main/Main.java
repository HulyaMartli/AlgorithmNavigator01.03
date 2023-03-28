package Main;

import UI.Menu;

import java.util.Scanner;

import static ProblemMethods.Methods.*;
import static UI.Messages.*;
import static UI.UserInput.*;


/**
 * Java Studies Week 01 - 03 | March 06-23, 2023
 * Project0103 - All Problems
 * Algorithm Navigator 01.03
 *
 * @author HulyaMartli
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ======== NAVIGATOR MENU START ========
        int choice = UI.Menu.home();
        // ======== NAVIGATOR MENU END ========

        // ======== APPLICATION OF METHODS DEPENDING ON CHOICE =======
        do {
            switch (choice) {
                case 1: // ======== QUESTION 1 - SUM OF TWO NUMBERS =======
                    System.out.println("This method calculates the sum of two numbers.");
                    double number1 = userInputDouble("Please enter the first number:");
                    double number2 = userInputDouble("Please enter the second number:");
                    System.out.println("The sum of "+number1+" and "+number2+" is "+ sumOftwo(number1,number2)+".");

                    backToMenu();
                    choice = Menu.home();
                    break;

                case 2: // ======== QUESTION 2 - MAX OF 3 NUMBERS =======
                    System.out.println("This method finds the max of three numbers.");
                    number1 = userInputDouble("Please enter the first number:");
                    number2 = userInputDouble("Please enter the second number:");
                    double number3 = userInputDouble("Please enter the third number:");
                    System.out.println("The max value in ["+number1+", "+number2+", "+number3+"] is "+ maxOf(number1,number2,number3)+".");

                    backToMenu();
                    choice = Menu.home();
                    break;

                case 3: // ======== QUESTION 3 - MULTIPLE OF A SPECIFIC NUMBER =======
                    System.out.println("This method finds if the entered number is a multiple of the specified number.");
                    number1 = userInputDouble("Please enter the number that you want to check if it is multiple of a specific number:");
                    number2 = userInputDouble("Please enter the specific number to be taken as a basis for the operation:");
                    multipleOf(number1,number2);

                    backToMenu();
                    choice = Menu.home();
                    break;

                case 4: // ======== QUESTION 4 - PRINT WORD MULTIPLE TIMES =======
                    System.out.println("This method prints a word/sentence to the screen as many times as specified.");
                    String str = userInputString("Please input the word/sentence you want to print:");
                    int repeat = userInputInt("Please enter how many times you want it to be printed:");
                    printWordMultipleTimes(str,repeat);

                    backToMenu();
                    choice = Menu.home();
                    break;

                default:
                    System.out.println("Please enter a valid number from the options in the menu");
                    backToMenu();
                    choice = Menu.home();

            }

        } while (choice!=0); // If user presses 0 exit the program.
        UI.Messages.exitMessage();
    }
}