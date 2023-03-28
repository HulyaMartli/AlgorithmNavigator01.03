package ProblemMethods;

public class Methods {

    // ======== QUESTION 1 - SUM OF TWO NUMBERS ========
    /**
     * Calculates the sum of two integers.
     *
     * @param number1
     * @param number2
     * @return integer sum value
     */
    public static int sumOftwo(int number1, int number2){
        int result = number1+number2;
        return result;
    }

    /**
     * Calculates the sum of two double values.
     *
     * @param number1
     * @param number2
     * @return double sum value
     */
    public static double sumOftwo(double number1, double number2){
        double result = number1+number2;
        return result;
    }

    // ==================================================================================================
    // ==================================================================================================
    // ==================================================================================================

    // ======== QUESTION 2 - MAX OF 3 NUMBERS ========

    /**
     * Finds the max of two numbers.
     *
     * @param number1
     * @param number2
     * @return max value
     */
    public static double maxOf(double number1, double number2) {
        double max = number1;
        if (number2>max) {
            max = number2;
        }
        return max;
    }

    /**
     * Finds the max of three numbers.
     *
     * @param number1
     * @param number2
     * @param number3
     * @return max value
     */
    public static double maxOf(double number1, double number2, double number3) {
        double max = number1;
        if (number2>max && number2>number3) {
            max = number2;
        } else if (number3>max && number3>number2) {
            max = number3;
        }
        return max;
    }

    // ==================================================================================================
    // ==================================================================================================
    // ==================================================================================================

    // ======== QUESTION 3 - MULTIPLE OF A SPECIFIC NUMBER ========

    /**
     * Controls if the first number is a multiple of second number and prints out the result.
     *
     * @param number1
     * @param number2
     */
    public static void multipleOf(double number1, double number2){
        if (number1 % number2 == 0) {
            System.out.println(number1+" is a multiple of "+number2);
        } else {
            System.out.println(number1+" is NOT a multiple of "+number2+".");
        }
    }

    // ==================================================================================================
    // ==================================================================================================
    // ==================================================================================================

    // ======== QUESTION 4 - PRINT WORD MULTIPLE TIMES ========

    public static void printWordMultipleTimes (String str, int number){
        for (int i=0; i<number; i++) {
            System.out.println(str);
        }
    }

}
