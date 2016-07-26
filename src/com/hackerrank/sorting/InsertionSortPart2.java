package com.hackerrank.sorting;

import java.util.Scanner;

public class InsertionSortPart2 {

    public static void main(String... args) {
//        final Scanner scanner = new Scanner(System.in);
//        int size = scanner.nextInt();
//        int[] arr = new int[size];
//
//        for (int i = 0; i < size; i++)
//            arr[i] = scanner.nextInt();

        int size = 6;
        int[] arr = {1, 4, 3, 5, 6, 2};

        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] > arr[j - 1]) {
                    int box = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = box;
                }
            }
            print(arr);
        }
    }

    private static void print(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.printf("%s ", arr[i]);
        System.out.println();
    }
}
