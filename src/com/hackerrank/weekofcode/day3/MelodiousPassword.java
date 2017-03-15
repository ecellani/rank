package com.hackerrank.weekofcode.day3;

import java.util.Scanner;

/**
 * See MelodiousPassword.png.
 *
 */
public class MelodiousPassword {

    private static final String VOWELS = "aeiou";
    private static final String CONSONANTS = "bcdfghjklmnpqrstvwxz";

    public static void main(String... args) {
        int n = 2;//new Scanner(System.in).nextInt();
        pass(n, "", 0, 0);
    }

    private static void pass(int n, String r, int consonant, int vowel) {
        if (n == r.length()) {
            if (n == 1 && r.equals("z")) {
                System.out.println(r);
                return;
            }
            String lastC = r.substring(r.length() - 1, r.length())
                    , lastOf = r.substring(r.length() - 2, r.length() - 1);
            System.out.println("lastC: " + (VOWELS.charAt(vowel)));
            if (VOWELS.charAt(vowel) == 'u') {
//                System.out.println("lastOf: " + lastOf);
                if (CONSONANTS.charAt(consonant) == 'z') {
                    return;
                }
            }
        }

        if (n == r.length()) {
            System.out.println(r);
            r = "";
        }


        if (!r.isEmpty() && CONSONANTS.contains(r.substring(r.length() - 1, r.length()))) {
            r += Character.toString(VOWELS.charAt(vowel));
            if (consonant != 0) consonant--;
            if (++vowel == VOWELS.length()) {
                vowel = 0;
                consonant++;
            }
        } else {
            r += Character.toString(CONSONANTS.charAt(consonant));
            if (++consonant == CONSONANTS.length()) {
                consonant = 0;
            }
        }
        pass(n, r, consonant, vowel);
    }
}
