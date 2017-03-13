package com.hackerrank.strings;

import java.util.Scanner;

public class MarsExploration {

    public static void main(String... args) {
        final Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int counter = 0;

        for (int i = 0; i < str.length(); i += 3) {
            if (str.charAt(i) != 'S')
                counter++;
            if (str.charAt(i + 1) != 'O')
                counter++;
            if (str.charAt(i + 2) != 'S')
                counter++;
        }
        System.out.println(counter);
    }
}
