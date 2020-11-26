package com.mycompany.fundamental;

import java.util.Arrays;
import java.util.Scanner;

public class OptionTaskOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество элементов: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int lengthMin;
        int lengthMax;
        System.out.println("Введите элементы массива: ");
        int i;
        try {
            for (i = 0; i < size; i++) {
                arr[i] = Integer.parseInt(input.next().trim());
            }
        } catch (NumberFormatException exception) {
            System.out.print("Введите число от 0 до ");
            System.out.printf("%,d", Integer.MAX_VALUE);
            System.exit(0);
        }

        System.out.print("Элементы массива: ");
        for (i = 0; i < size; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();

        System.out.println("Массив отсортирован:  ");
        Arrays.sort(arr);
        for (i = 0; i < arr.length; i++) {
            System.out.print("  " + arr[i]);
        }

        lengthMin = String.valueOf(arr[0]).length();
        lengthMax = String.valueOf(arr[arr.length - 1]).length();
        System.out.print(" \nМИН длина: " + arr[0] + " - " + lengthMin + " digit(s)");
        System.out.print(" \nМАКС длина: " + arr[arr.length - 1] + " - " + lengthMax + " digit(s)");
        System.out.println();

        System.out.println("Массив отсортирован по убыванию:  ");
        for (i = arr.length - 1; i >= 0; --i) {
            System.out.print("  " + arr[i]);
        }
    }
}


