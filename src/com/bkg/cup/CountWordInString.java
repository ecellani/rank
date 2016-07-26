package com.bkg.cup;

import java.util.Map;
import java.util.TreeMap;

public class CountWordInString {

    public static void main(String... args) {
        String sentence = "acacabcatghhellomvnsdb";
        Map<String, Integer> words = new TreeMap<>();

        words.put("aca", 0);
        words.put("cat", 0);
        words.put("hello", 0);
        words.put("world", 0);

        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            int indexOf = -1;
            while (true) {
                indexOf = sentence.indexOf(entry.getKey(), indexOf);
                if (indexOf != -1)
                    entry.setValue(entry.getValue() + 1);
                else
                    break;
                indexOf++;
            }
        }
        words.entrySet().stream().forEach(entry -> System.out.printf("%s: %s | ", entry.getKey(), entry.getValue()));
    }
}
