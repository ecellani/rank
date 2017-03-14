package com.hackerrank.weekofcode.day2;

import java.util.Scanner;

/**
 * See FindMinimumNumber_%i.png.
 * Sample Input:
 * 4
 *
 * Sample Output:
 * min(int, min(int, min(int, int)))
 */
public class FindMinimumNumber {

    public static final String METHOD = "min(int, int)";
    public static void main(String... args) {
        final Scanner in = new Scanner(System.in);
        final int n = in.nextInt();
        System.out.println(call(n, METHOD));
    }

    private static String call(int n, String r) {
        if (n == 2) return r;
        final int index = r.lastIndexOf("int");
        final String replacement = METHOD;
        return call(n - 1, r.substring(0, index) + replacement + r.substring(index + 3));
    }
}
