package com.mycompany.fundamental;

public class DigitsLine {

    public static void main(String[] args) {
        int result_sum = 0;
        int result_mult = 1;
        System.out.println("Arguments : " );
        int j;
        for (j = 0; j < args.length ; j++) {
            System.out.print(" " + args[j] + "\n");
        }
        for (String arg : args) {
            result_sum += Integer.parseInt(arg);
            result_mult *= Integer.parseInt(arg);
        }
        System.out.println(" result_sum: " + result_sum);
        System.out.println("result_mult: " + result_mult);
    }
}


