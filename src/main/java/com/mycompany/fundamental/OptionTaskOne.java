package com.mycompany.fundamental;

import java.util.Arrays;
import java.util.Scanner;

public class OptionTaskOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество элементов: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Введите элементы массива: ");
        int i;
        try {
            for (i = 0; i < size; i++) {
                arr[i] = Integer.parseInt(input.next().trim());
            }
        } catch (NumberFormatException exception) {
            System.out.print("Введите число от 1 до ");
            System.out.printf("%,d", Integer.MAX_VALUE);
            System.exit(0);
        }

        System.out.print("Элементы массива: ");
        for (i = 0; i < size; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();

        System.out.println("Массив отсортирован по возрастанию:  ");
        Arrays.sort(arr);
        for (i = 0; i < arr.length; i++) {
            System.out.print("  " + arr[i]);
        }
        System.out.println();

        System.out.println("Массив отсортирован по убыванию:  ");
        for (i = arr.length - 1; i >= 0; --i) {
            System.out.print("  " + arr[i]);
        }

        int lengthMin;
        int lengthMax;
        lengthMin = String.valueOf(arr[0]).length();
        lengthMax = String.valueOf(arr[arr.length - 1]).length();
        System.out.print(" \n МИН длина: " + arr[0] + " - " + lengthMin + " digit(s)");
        System.out.print(" \nМАКС длина: " + arr[arr.length - 1] + " - " + lengthMax + " digit(s)");
        System.out.println();

        int averageLength;
        double totalLength = 0;
        int counter = 0;
        for (i = 0; i < size; i++) {
            totalLength += String.valueOf(arr[i]).length();
            counter++;
        }

        averageLength = (int) Math.round(totalLength / (counter));
        System.out.println();
        System.out.println("Средняя длина чисел:  = " + averageLength);
        System.out.println();

        for (i = 0; i < arr.length; i++) {
            int elementLength = String.valueOf(arr[i]).length();
            if (averageLength < (elementLength)) {
                System.out.println("Это число длиннее: " + arr[i] + " -> " + elementLength);
            } else if (averageLength == (elementLength)) {
                System.out.println();
            } else {
                System.out.println("Это число короче: " + arr[i] + " -> " + elementLength);
            }
        }
    }
}


