package com.ciet.ago8;

public class Question1 {

    public static void main(String... args) {
        System.out.println(mergeString("Vem pra", "CI&T"));
    }

    static String mergeString(String a, String b) {
        int maior = a.length() > b.length() ? a.length() : b.length();
        String merged = "";
        for (int i = 0; i < maior; i++) {
            if (a.length() > i)
                merged += a.charAt(i);
            if (b.length() > i)
                merged += b.charAt(i);
        }
        return merged;
    }
}
