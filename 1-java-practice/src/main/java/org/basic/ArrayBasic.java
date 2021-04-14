package org.basic;

public class ArrayBasic {
    public static void main(String[] args) {
        int[] testIntegers = new int[5];

        for (int testInteger:testIntegers) {
            System.out.println(testInteger);
        }

        int[] testIntegers2 = {1,2,3};

        for (int testInteger2:testIntegers2) {
            System.out.println(testInteger2);
        }
    }
}
