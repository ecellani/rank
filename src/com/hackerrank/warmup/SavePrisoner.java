package com.hackerrank.warmup;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SavePrisoner {

    public static final int PRISONER = 0, SWEET = 1, ID = 2;
    public static void main(String... args) {
        final Scanner scanner = new Scanner(System.in);
        int testCases = Integer.valueOf(scanner.nextLine().trim());

        IntStream.range(0, testCases).forEach($i -> {
            String[] line = scanner.nextLine().split(" ");
            long starts = Long.valueOf(line[ID])
                    , sweets = Long.valueOf(line[SWEET])
                    , prisoners = Long.valueOf(line[PRISONER])
                    , result = (starts + sweets - 1) % prisoners;

            if (result == 0)
                System.out.println(prisoners);
            else
                System.out.println(result);
        });
    }
}