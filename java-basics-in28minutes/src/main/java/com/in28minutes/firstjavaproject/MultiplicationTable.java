package com.in28minutes.firstjavaproject;

public class MultiplicationTable {

    public void print() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d * %d = %d", 5, i, 5 * i).println();
        }
    }


    public static void main(String args[]) {
        System.out.println("Hello in 28 Minutes");

        MultiplicationTable table = new MultiplicationTable();
        table.print();
    }
}
