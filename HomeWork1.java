class HomeWork1 {
    public static void main (String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() {
        int a = -4, b = 4;
        if (a + b >= 0) {
            System.out.println("sum is positive");
        } else {
            System.out.println("Sum is negative");
        }
    }
    public static void printColor() {
        int value = -5;
        if (value <= 0) {
            System.out.println("Red");
        }
        if (value > 0 && value <= 100){
            System.out.println("Yellow");
        } 
        if (value >= 100){
            System.out.println("Green");
        }
    } 
    public static void compareNumbers() {
        int a = 585, b = 35;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
}