package com.mycompany.fundamental;

public class ReverseArgList {
    public static void main(String[] args ) {
        for(int i= args.length-1; i>= 0;  i-- )
            System.out.println("Reverse here: " + args[i]);
    }
}
