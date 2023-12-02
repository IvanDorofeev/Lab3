package org.example;

public class Main {
    public static void main(String[] args) {
        int[] mas = {1000, 10000, 100000};
        Tester tester = new Tester(mas);
        tester.fillArrayTable();
        tester.fillLinkedTable();
        tester.printTable();
    }
}