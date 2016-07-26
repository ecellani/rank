package com.hackerrank.sorting;

import java.util.Scanner;

public class InsertionSortPart1 {

    public static void main(String... args) {
        final Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        int box = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++)
            arr[i] = scanner.nextInt();

        for (int i = size - 1; i > 0; i--) {
            if (arr[i] < arr[i-1]) {
                box = arr[i];
                arr[i] = arr[i-1];
            } else if (box > arr[i-1]) {
                arr[i] = box;
                print(arr);
                break;
            } else {
                arr[i] = arr[i-1];
                if (i == 1) {
                    if (box < arr[0] && box != Integer.MIN_VALUE) {
                        print(arr);
                        arr[0] = box;
                    }
                }
            }
            print(arr);
        }
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.printf("%s ", arr[i]);
        System.out.println();
    }
}
