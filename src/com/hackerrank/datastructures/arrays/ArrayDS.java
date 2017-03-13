package com.hackerrank.datastructures.arrays;

import java.util.Scanner;

public class ArrayDS {

    public static void main(String... args) {
        final Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++)
            arr[i] = scanner.nextInt();

        for (int i = arr.length - 1; i >= 0; i--)
            System.out.printf("%s ", arr[i]);
    }
}
