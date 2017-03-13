package com.hackerrank.strings;

import java.util.Scanner;

public class SuperReducedString {

    public static void main(String... args) {
        final Scanner scanner = new Scanner(System.in);
        String reduced = reduce(scanner.nextLine());
        if (reduced.isEmpty())
            System.out.println("Empty String");
        else
            System.out.println(reduced);
    }

    private static String reduce(String arr) {
        for (int i = 0; i < arr.length(); i++) {
            if (i + 1 >= arr.length())
                break;
            char c1 = arr.charAt(i);
            char c2 = arr.charAt(i + 1);

            if (c1 == c2)
                return reduce(arr.substring(0, i) + arr.substring(i + 2, arr.length()));
        }
        return arr;
    }
}
