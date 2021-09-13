/*
 * Java 1. Home work 1
 *
 * @author Trushina Irina
 * @version 10.09.2021
 */
class HomeWork1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(4, 3);
        checkSumSign(3, -3);
        checkSumSign(-3, -4);
        printColor(-1);
        printColor(0);
        printColor(1);
        printColor(99);
        printColor(100);
        printColor(101);
        compareNumbers(5, 2);
        compareNumbers(5, 5);
        compareNumbers(2, 5);
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign(int a, int b) {
        System.out.println("Sum is " + (a + b >= 0? "positive" : "negative"));
    }

    static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Red");
        }
        if (value > 0 && value <= 100){
            System.out.println("Yellow");
        } 
        if (value > 100){
            System.out.println("Green");
        }
    }

    static void compareNumbers(int a, int b) {
        System.out.println(a >= b? "a>=b" : "a<b");
    }
}