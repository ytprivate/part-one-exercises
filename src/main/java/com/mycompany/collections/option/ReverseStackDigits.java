package com.mycompany.collections.option;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;


public class ReverseStackDigits {
    public static void main(String[] args) {

        int a = 1234567;
        System.out.println("Исходное число: " + a);
        ArrayList<Integer> nums = new ArrayList<>();
        while (a > 0) {
            nums.add(a % 10);
            a /= 10;
        }
        System.out.println("Число в ArrayList: " + nums);
        nums.sort(Comparator.naturalOrder());

        ArrayDeque<Integer> digit = new ArrayDeque<>();

        for (int i = 1; i <= nums.size(); i++) {
            digit.add(i);
        }
        System.out.println("Число в ArrayList после сотрировки: " + nums);
        System.out.println("Число в ArrayDeque: " + digit);
        System.out.println("Показать и удалить (pollLast) последний элемент стека: "
                + digit.pollLast());
        System.out.println("Стек: " + digit);
    }
}
