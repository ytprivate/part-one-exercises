package com.mycompany.fundamental;

public class DigitsLine {

    public static void main(String[] args) {

        int result_sum = 0;
        int result_mult = 1;

        for (int i = 0; i < args.length; i++) {

            result_sum += Integer.parseInt(args[i]);
            result_mult *= Integer.parseInt(args[i]);
        }
        System.out.println(" result_sum: " + result_sum);
        System.out.println("result_mult: " + result_mult);
    }
}


