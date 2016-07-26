package com.bkg.dor;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class SortContent {

    public static void main(String... args) {
        String line1 = "Jervie,12,M"
                , line2 = "Jaimy,11,F"
                , line3 = "Tony,23,M"
                , line4 = "Janey,11,F";
        SortContent sort = new SortContent();
        sort.orderPersonsByAgeUsingAPI(line1, line2, line3, line4);
        sort.orderPersonsByAge(line1, line2, line3, line4);
    }

    public void orderPersonsByAge(String... lines) {
        List<Person> persons = load(lines);
        System.out.println("\nBefore: ");
        print(persons);

        for (int i = 1; i < lines.length; i++) {
            for (int j = i; j > 0; j--) {
                int ageA = Integer.valueOf(lines[j].split(",")[1]);
                int ageB = Integer.valueOf(lines[j - 1].split(",")[1]);
                if (ageA < ageB) {
                    String box = lines[j];
                    lines[j] = lines[j - 1];
                    lines[j - 1] = box;
                }
            }
        }
        persons = load(lines);
        System.out.println("\nBefore: ");
        print(persons);
    }

    public void orderPersonsByAgeUsingAPI(String... lines) {
        List<Person> persons = load(lines);
        System.out.println("\nBefore: ");
        print(persons);
        Collections.sort(persons);
        System.out.println("\nAfter: ");
        print(persons);
    }

    private void print(List<Person> persons) {
        persons.forEach(System.out::println);
    }

    private List<Person> load(String... lines) {
        String[] splitedLine;
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < lines.length; i++) {
            splitedLine = lines[i].split(",");
            persons.add(new Person(splitedLine[0], Integer.valueOf(splitedLine[1]), splitedLine[2].charAt(0)));
        }
        return persons;
    }

    private static class Person implements Comparable<Person> {
        private String name;
        private int age;
        private char gender;

        public Person(String name, int age, char gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return String.format("%s,%s,%s", name, age, gender);
        }

        @Override
        public int compareTo(Person person) {
            return Integer.compare(age, person.age);
        }

        public void updateMe(Person p2) {
            name = p2.name;
            age = p2.age;
            gender = p2.gender;
        }
    }
}
