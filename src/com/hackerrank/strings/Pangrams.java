package com.hackerrank.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pangrams {

    private static final Map<Character, Boolean> ALPHABET_MAP = new HashMap<>();
    static {
        for (int i = 'A'; i <= 'Z'; i++) {
            ALPHABET_MAP.put((char) i, false);
        }
    }

    public static void main(String... args) {
        final Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine().toUpperCase();
        for (int i = 0; i < sentence.length(); i++)
            if (ALPHABET_MAP.containsKey(sentence.charAt(i)))
                ALPHABET_MAP.put(sentence.charAt(i), true);
        Long unused = ALPHABET_MAP.entrySet().stream().filter(x -> !x.getValue()).count();
        System.out.println(unused == 0 ? "pangram" : "not pangram");
    }
}
