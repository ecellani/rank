package com.hackerrank.strings;

import java.util.Scanner;

public class AlternatingCharacters {

    public static void main(String... args) {
        final Scanner scanner = new Scanner(System.in);
        int tests = scanner.nextInt();

        for (int $i = 0; $i < tests; $i++) {
            String string = scanner.next();
            int deletes = 0;
            for (int $j = 1; $j < string.length(); $j++)
                if (string.charAt($j - 1) == string.charAt($j))
                    deletes++;
            System.out.println(deletes);
        }
    }
}
