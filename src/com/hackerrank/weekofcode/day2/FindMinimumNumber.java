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

    public static void main(String... args) {
        System.out.println(call(new Scanner(System.in).nextInt(), null));
    }

    private static String call(int n, String r) {
        if (r == null) r = "min(int, int)";
        if (n == 2) return r;
        final int index = r.lastIndexOf("int");
        return call(n - 1, r.substring(0, index) + "min(int, int)" + r.substring(index + 3));
    }
}
