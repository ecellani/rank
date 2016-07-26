package com.bkg.jul17;

import java.util.Scanner;

public class Question4 {

    public static void main(String... args) {
        final Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++)
            arr[i] = scanner.nextInt();

        int total = 0;
        l: for (int i = 0; i < size; i++) {
            int $i = arr[i];
            for (int j = i; j < size; j++) {
                int $j = arr[j];

                if ($i + $j == sum) {
                    total++;
                    break l;
                }
            }
        }
        System.out.println(total);
    }
}
