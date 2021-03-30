package com.mycompany.fundamental;

public class ReverseArgList {
    public static void main(String[] args) {
        System.out.println("Arguments : ");
        int j;
        for (j = 0; j < args.length - 1; j++) {
            System.out.print(" " + args[j]);
        }
        System.out.println("" + args[j]);
        System.out.println("Reverse here: ");
        int i;
        for (i = args.length - 1; i >= 0; i--) {
            System.out.print(" " + args[i]);
        }
    }
}
