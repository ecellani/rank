package com.bkg.dor;

public class Fibonacci {

    public static void main(String... args) {
        System.out.println(printFibonacci1(8));
        System.out.println(printFibonacci2(8));
    }

    public static int printFibonacci1(int positions) {
        if (positions <= 0)
            return 0;
        else if (positions == 1)
            return 1;
        else {
            int i = 1, f = 0;
            for (int k = 1; k <= positions; k++) {
                f += i;
                i = f - i;
            }
            return f;
        }
    }

    public static int printFibonacci2(int positions) {
        if (positions <= 0)
            return 0;
        else if (positions == 1)
            return 1;
        else
            return printFibonacci2(positions - 1) + printFibonacci2(positions - 2);
    }
}
