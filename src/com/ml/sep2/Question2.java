package com.ml.sep2;

import java.util.Scanner;

public class Question2 {

    public static void main(String... args) {
        final Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();
        String[] strArr = new String[lines];
        for (int i = 0; i < lines; i++)
            strArr[i] = scanner.next();

        for (int $i = 0; $i < strArr.length; $i++) {
            int count = 0;
            char[] cArr = strArr[$i].toCharArray();
            for (int i = 1; i < strArr[$i].length(); i++) {
                for (int j = 0; j < strArr[$i].length() - i; j++) {
                    if (cArr[j] != cArr[j + i])
                        break;
                    count++;
                }
            }
            System.out.println(count + strArr[$i].length());
        }
    }
}
