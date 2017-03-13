package com.ml.sep2;

import java.util.Scanner;

public class Question {

    public static void main(String... args) {
        final Scanner scanner = new Scanner(System.in);
//        int lines = scanner.nextInt();
//        String[] stonesArr = new String[lines];
//        for (int i = 0; i < lines; i++)
//            stonesArr[i] = scanner.next();

        String[] stonesArr = {"abcddez", "bacczd", "eeabzg", "eeabgz"};

        int gems = 0;
        char[] anyStone = stonesArr[0].toCharArray();
        for (int i = 0; i < anyStone.length; i++) {
            int counter = 0;
            for (int s = 0; s < stonesArr.length; s++) {
                if (stonesArr[s].indexOf(anyStone[i]) >= 0)
                    counter++;
                else
                    break;
            }
            if (counter == stonesArr.length)
                gems++;
        }
        System.out.println(gems);
    }
}
