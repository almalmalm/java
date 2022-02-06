package school.lesson2;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        isSumBetween10and20();
        positiveOrNegative();
        isPositiveOrNegative();
        printStringNTimes();
        array0and1();
        array100fill();
        arraymultiply();
        arraysecond();
    }

    public static void isSumBetween10and20() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два целых числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a + b;
        if (c >= 10 && c <= 20) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void positiveOrNegative() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a = scanner.nextInt();
        if (a >= 0) {
            System.out.println("Вы ввели положительное число.");
        } else {
            System.out.println("Вы ввели отрицательное число.");
        }
    }

    public static void isPositiveOrNegative() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a = scanner.nextInt();
        if (a >= 0) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }

    public static void printStringNTimes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String a = scanner.nextLine();
        System.out.println("Введите целое положительное число : ");
        int b = scanner.nextInt();
        int i;
        for (i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    public static void array0and1() {
        int[] numbers = {0, 1, 1, 0, 0, 1, 1, 1};
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] = 0;
            } else {
                numbers[i] = 1;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void array100fill() {
        int[] array = new int[100];
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) i + 1;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void arraymultiply() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void arraysecond() {
        int[][] arr = new int[10][10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, a = arr[i].length - 1; j < arr[i].length; j++, a--) {
                if (i == j || i == a) arr[i][j] = 1;
                else arr[i][j] = 0;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}