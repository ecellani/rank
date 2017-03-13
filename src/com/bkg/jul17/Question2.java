package com.bkg.jul17;

import java.util.Scanner;

public class Question2 {

    public static final int SQUARE = 0, RECTANGLE = 1, OTHER = 2;
    public static void main(String... args) {
        final Scanner scanner = new Scanner(System.in);
        int[] result = new int[]{0,0,0};

        while (scanner.hasNextLine()) {
            String s = scanner.nextLine().trim();
            if (s.length() == 0) break;
            String[] line = s.split(" ");
            int[] arr = new int[line.length];
            for (int i = 0; i < line.length; i++)
                arr[i] = Integer.valueOf(line[i]);

            int sides = 0;
            l: for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] < 0 || arr[j] < 0) {
                        sides = Integer.MAX_VALUE;
                        break l;
                    }
                    if (arr[i] == arr[j])
                        sides++;
                }
            }
            if (sides == 6)
                result[SQUARE]++;
            else if (sides == 2)
                result[RECTANGLE]++;
            else
                result[OTHER]++;
        }
        print(result);
    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.printf("%s ", arr[i]);
        System.out.println();
    }
}
