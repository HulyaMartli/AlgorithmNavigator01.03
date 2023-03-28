package UI;

import java.util.Scanner;

public class Messages {

    public static void backToMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println(); // for visual purposes
        System.out.println("=========================================================================");
        System.out.println(); // for visual purposes
        System.out.println("Please press ENTER to return to the menu.");
        sc.nextLine();
    }

    /**
     * The exit message to show when user exits Navigation.
     */
    public static void exitMessage () {
        System.out.println("You have exited the Boost Problem Navigator. Hope you enjoyed the experience!");
    }
}
