package com.bkg.jul17;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Question3 {

    private static final int TOKEN = -128;
    public static void main(String... args) {
        final Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");
        int[] arr = new int[line.length];
        for (int i = 0; i < line.length; i++)
            arr[i] = Integer.valueOf(line[i]);

        List<Integer> result = new ArrayList<>();
        result.add(arr[0]);

        int calc;
        for (int i = 1; i < arr.length; i++) {
            calc = arr[i] - arr[i-1];

            if (calc < -127 || calc > 127)
                result.add(TOKEN);
            result.add(calc);
        }

        print(result);
    }

    private static void print(List<Integer> result) {
        for (int i : result)
            System.out.printf("%s ", i);
        System.out.println();
    }
}
