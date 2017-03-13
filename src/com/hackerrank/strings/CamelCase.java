package com.hackerrank.strings;

import java.util.Scanner;

public class CamelCase {

    private static final int CAP_A = (int) 'A'
                            , CAP_Z = (int) 'Z';

    public static void main(String... args) {
        final Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int counter = 0;

        if (str == null || str.trim().isEmpty()) {
            System.out.println(counter);
            return;
        }

        counter++;
        for (int i = 0; i < str.length(); i++) {
            int c = (int) str.charAt(i);

            if (c >= CAP_A && c <= CAP_Z)
                counter++;
        }

        System.out.println(counter);
    }
}
