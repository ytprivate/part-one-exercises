package com.mycompany.fundamental;

import java.util.Arrays;
import java.util.Scanner;

public class AverageLength {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество элементов: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("Введите элементы массива: ");
        int i = 0;

        try {
            for (i = 0; i < size; i++) {
                arr[i] = Integer.parseInt(input.next().trim());
            }
        } catch (NumberFormatException exception) {
            System.out.print("Введите число от 0 до ");
            System.out.printf("%,d", Integer.MAX_VALUE);
            System.exit(0);
            double tempSum = 0;
            System.out.print("Элементы массива: ");
            for (i = 0; i < size; i++) {
                System.out.print(" " + arr[i]);

                double temp = String.valueOf(arr[i]).length();
                tempSum = tempSum + temp;
            }
            int averageLength = (int) Math.round(tempSum / (size));
            System.out.println();
            System.out.println("Средняя длина чисел:  = " + averageLength);

            Arrays.sort(arr);
            for (i = 0; i < arr.length; i++) {
                int elementLength = String.valueOf(arr[i]).length();
                if (averageLength < (elementLength)) {
                    System.out.println("Это число больше: " + arr[i] + " -> " + elementLength);
                } else if (averageLength == (elementLength)) {
                    System.out.println();
                } else {
                    System.out.println("Это число меньше: " + arr[i] + " -> " + elementLength);
                }
            }
        }
    }
}

