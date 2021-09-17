/**
 * Java 1. Home work 3
 *
 * @author Trushina Irina
 * @version 16.09.2021
 */
import java.util.Arrays;
import java.util.Random;

class HomeWork3 {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        int[] arr = {1, 0, 1, 1, 0, 1, 0, 1, 0, 0};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(changeZeroAndOne(arr)));
        System.out.println();

        System.out.println("Задание №2");
        int[] arr2 = new int[100];
        System.out.println(Arrays.toString(fillingArr(arr2)));
        System.out.println();

        System.out.println("Задание №3");
        System.out.println(Arrays.toString(doublingIfLess6()));
        System.out.println();

        System.out.println("Задание №4");
        fillArr();
        System.out.println();

        System.out.println("Задание №5");
        System.out.println(Arrays.toString(returnArr(4, 5)));
        System.out.println();

        System.out.println("Создание массива для следующих заданий");
        int[] arr5 = {1, 7, 3, 5};

        System.out.println("Задание №6");
        System.out.println(Arrays.toString(arr5));
        minAndMax(arr5);
        System.out.println();

        System.out.println("Задание №7");
        System.out.println(Arrays.toString(arr5));
        System.out.println(sum(arr5));
        int[] arr6 = {1, 7, 3, 6};
        System.out.println(Arrays.toString(arr6));
        System.out.println(sum(arr6));
        System.out.println();

        System.out.println("Задание №8");
        System.out.println(Arrays.toString(arr5));
        System.out.println("Сместим массив на 1 элемент влево, на 0 элементов и на 2 элемента вправо");
        System.out.println(Arrays.toString(shift(arr5, -1)));
        System.out.println(Arrays.toString(shift(arr5, 0)));
        System.out.println(Arrays.toString(shift(arr5, 2)));
    }

    //Задание 1.
    static int[] changeZeroAndOne(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 0? 1 : 0);
        }
        return(arr);
    }

    //Задание 2.
    static int[] fillingArr(int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
        }
        return(arr2);
    }

    //Задание 3.
    static int[] doublingIfLess6() {
        int[] arr3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println(Arrays.toString(arr3));
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
        }
        return(arr3);
    }

    //Задание 4.
    static int[][] fillArr() {
        int[][] table = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == j || i + j == table.length - 1) {
                    table[i][j] = 1;
                }
                System.out.print(table[i][j] + "  ");
            }
        System.out.println();
        }
        return(table);
    }

    //Задание 5.
    static int[] returnArr(int len, int initialValue) {
        int[] arr4 = new int[len];
        Arrays.fill(arr4, initialValue);
        return (arr4);
    }

    //Задание 6.
    static void minAndMax (int[] arr5) {
        int min = arr5[0];
        int max = arr5[0];
        for (int i = 1; i < arr5.length; i++) {
            if (arr5[i] < min) {
                min = arr5[i];
            } else {
                if (arr5[i] > max) {
                max = arr5[i];
                }
            }
        }
        System.out.println("min=" + min + "\nmax=" + max);
    }

    //Задание 7.
    static boolean sum(int[] arr5) {
        int arrSum = 0;
        for (int i = 0; i < arr5.length; i++) {
            arrSum += arr5[i];
        }
        int sumFirstPart = 0;
        int sumSecondPart = 0;
        boolean result = false;
        for (int i = 0; i < arr5.length-1; i++) {
            sumFirstPart += arr5[i];
            sumSecondPart = arrSum - sumFirstPart;
            if (sumFirstPart == sumSecondPart) {
                result = true;
                break;
            }
        }
        return result;
    }

    //Задание 8.
    static int[] shift(int[] arr5, int n) {
        int x;
        if (n >= 0) { //Вправо
            for ( int count = 0; count < n; count++) {
                x = arr5[arr5.length-1];
                for (int i = arr5.length-1; i > 0; i--) {
                    arr5[i] = arr5[i-1];
                }
                arr5[0] = x;
            }
        } else {    //Влево
            for ( int count = 0; count > n; count--) {
                x = arr5[0];
                for (int i = 1; i <= arr5.length-1; i++) {
                    arr5[i-1] = arr5[i];
                }
                arr5[arr5.length-1] = x;
            }
        }
        return(arr5);
    }
}