package com.amz.apr25;

public class QuestionA {

    public static void main(String... args) {
        print("ABC", "ABC");
        print("AAAABCCDE", "AABCDEE");
        print("ABC", "ACB");
    }

    private static void print(String s1, String s2) {
        QuestionA questionA = new QuestionA();
        System.out.printf("Inputs: \"%s\" and \"%s\".\nOutput: %s\n", s1, s2, questionA.minimumRemovals(s1, s2));
    }

    private int minimumRemovals(String a, String b) {
        int mnr = 0;

        for (int i = 0; i < a.length(); i++) {
            char charA = a.charAt(i);
            for (int j = i; j < b.length(); j++) {
                char charB = b.charAt(j);
                if (charA == charB) {
                    if (b.length() > a.length() && i == a.length() - 1) {
                        if (charA == charB) {
                            b = b.substring(0, j) + b.substring(j + 1, b.length());
                            j--;
                            mnr++;
                        } else {
                            return -1;
                        }
                        continue;
                    }
                    break;
                }

                if (charA != charB) {
                    if (a.charAt(i - 1) == charA) {
                        a = a.substring(0, i) + a.substring(i + 1, a.length());
                        i--;
                        mnr++;
                        break;
                    } else {
                        return -1;
                    }
                }
            }
        }
        return mnr;
    }
}
