package com.mycompany.fundamental;

import java.util.Arrays;

public class RandomDigits {
    public static void main(String[] args) {

        int size = 10;
        int[] digits = new int[size];
            System.out.println("Числа с перходом на новую строку: ");
        for (int i = 0; i < size; i++) {
            digits[i] = (int) (Math.random() * 100);
            System.out.println(digits[i]);
        }
        System.out.print("Числа без перехода на новую строку: " + Arrays.toString(digits));
    }
}

