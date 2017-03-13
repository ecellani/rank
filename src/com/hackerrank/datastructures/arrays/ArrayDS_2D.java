package com.hackerrank.datastructures.arrays;

import java.util.Scanner;

public class ArrayDS_2D {

public static void main(String... args) {
    final Scanner scanner = new Scanner(System.in);

    int[][] arr2D = new int[6][6];
    for (int i = 0; i < arr2D.length; i++)
        for (int j = 0; j < arr2D[i].length; j++)
            arr2D[i][j] = scanner.nextInt();

    int sum, box = Integer.MIN_VALUE;
    for (int i = 0; i + 2 < arr2D.length; i++) {
        for (int j = 0; j + 2 < arr2D[i].length; j++) {
            sum = arr2D[i][j];
            sum += arr2D[i][j + 1];
            sum += arr2D[i][j + 2];
            sum += arr2D[i + 1][j + 1];
            sum += arr2D[i + 2][j];
            sum += arr2D[i + 2][j + 1];
            sum += arr2D[i + 2][j + 2];
            if (box < sum) box = sum;
        }
    }
    System.out.println(box);
}
}
