package com.bkg.dor;

public class BalancedParenthesis {

    public static void main(String... args) {
        String s1 = "a(bcd)d"
                , s2 = "(kjds(hfkj)sdhf"
                , s3 = "(sfdsf)(fsfsf"
                , s4 = "{[]}()"
                , s5 = "{[}]"
                , s6 = "(()()()())"
                , s7 = "(((())))"
                , s8 = "(()((())()))"
                , s9 = "((((((())"
                , s10 = "()))"
                , s11 = "(()()(()"
                , s12 = ")";


        print(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12);
    }

    public static void print(String... strings) {
        BalancedParenthesis bp = new BalancedParenthesis();
        for (String s : strings) {
            System.out.printf("%s => %s\n", s, bp.isBalanced(s));
        }
    }

    private static final String OPEN = "({[";
    private static final String CLOSE = ")}]";

    public boolean isBalanced(String s) {
        char c;
        String open = "";
        int closeIndexOf;
        for (int i = 0; i < s.length(); i++) {
            if (OPEN.indexOf(c = s.charAt(i)) != -1) {
                open += c;
                continue;
            }
            if ((closeIndexOf = CLOSE.indexOf(c)) != -1) {
                if (open.length() == 0) return false;
                int lastOpen = open.charAt(open.length() - 1);
                if (OPEN.indexOf(lastOpen) != closeIndexOf) {
                    return false;
                } else {
                    open = open.substring(0, open.length() - 1);
                }
            }
        }
        if (open.length() > 0) return false;
        return true;
    }
}
