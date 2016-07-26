package com.hackerrank.warmup;

import java.util.Scanner;
import java.util.stream.IntStream;

public class CompareTriplets {

    public static void main(String... args) {
        final Scanner scanner = new Scanner(System.in);
        final int[] aarr = new int[3];
        final int[] barr = new int[3];

        IntStream.range(0, aarr.length).forEach($i -> aarr[$i] = scanner.nextInt());
        IntStream.range(0, barr.length).forEach($i -> barr[$i] = scanner.nextInt());

        int a = 0, b = 0;
        for (int $i = 0; $i < aarr.length; $i++) {
            if (aarr[$i] > barr[$i])
                a++;
            else if (barr[$i] > aarr[$i])
                b++;
        }
        System.out.printf("%s %s", a, b);
    }
}
