/*
 * Java 1. Home work 2
 *
 * @author Trushina Irina
 * @version 12.09.2021
 */
class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(sumBetween(1, 5));
        System.out.println(sumBetween(10, 0));
        System.out.println(sumBetween(10, 5));
        System.out.println(sumBetween(10, 10));
        System.out.println(sumBetween(10, 20));
        System.out.println(" ");
        positiveOrNegative (-5);
        positiveOrNegative (0);
        positiveOrNegative (5);
        System.out.println(" ");
        System.out.println(returnPositiveOrNegative (-5));
        System.out.println(returnPositiveOrNegative (0));
        System.out.println(returnPositiveOrNegative (5));
        System.out.println(" ");
        printText ("Hello", 5);
        System.out.println(" ");
        System.out.println(leapYear(1763));
        System.out.println(leapYear(1764));
        System.out.println(leapYear(1800));
        System.out.println(leapYear(2000));
    }

    static boolean sumBetween (int a, int b) {
        boolean result = false;
        if ((a + b) >= 10 && (a + b) <= 20 ) {
            result = true;
        }
        return result;
    }

    static void positiveOrNegative (int a) {
        System.out.println("Number is " + (a >= 0? "positive" : "negative"));
    }

    static boolean returnPositiveOrNegative (int a) {
        boolean result = true;
        if (a >= 0) {
            result = false;
        }
        return result;
    }

    static void printText (String a, int b) {
        for (int i = 0; i < b; i++){
            System.out.println(a);
        }
    }

    static boolean leapYear (int a) {
        boolean result = false;
        if (((a % 4) == 0 && (a % 100) != 0 && (a % 400) != 0) || ((a % 4) == 0 && (a % 400) == 0)) {
            result = true;
        }
        return result;
    }
}