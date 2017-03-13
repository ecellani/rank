package com.bkg.dor;

public class InputIntOutputString {

    public static void main(String... args) {
        int n = 1234;
        String sb = "";

        while (n != 0) {
            sb += n % 10;
            n /= 10;
        }

        String s = sb;
        sb = "";
        for (int i = s.length() -1; i >= 0; i--)
            sb += s.charAt(i);

        System.out.println(sb);
    }
}
