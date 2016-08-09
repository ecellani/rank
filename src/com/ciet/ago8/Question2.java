package com.ciet.ago8;

public class Question2 {

    public static void main(String... args) {
        print(alternateSort(new int[]{1,2,3,4,5}));
        System.out.println();
        print(alternateSort(new int[]{10,5,7,9,2,2}));
    }

    static int[] alternateSort(int[] input) {
        // order
        for (int i = 0; i < input.length; i++) {
            for (int j = 1; j < input.length; j++) {
                if (input[j - 1] > input[j]) {
                    int box = input[j - 1];
                    input[j - 1] = input[j];
                    input[j] = box;
                }
            }
        }

        // lower | higher
        for (int i = 1; i < input.length; i = i + 2) {
            int box = input[i];
            input[i] = input[input.length - 1];

            for (int j = input.length -1; j > i + 1; j--)
                input[j] = input[j-1];

            if (i+1 < input.length)
                input[i + 1] = box;
        }
        return input;
    }

    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%s ", arr[i]);
        }
    }
}
