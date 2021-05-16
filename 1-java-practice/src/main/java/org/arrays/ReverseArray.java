package org.arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] intArray = {3,2,5,6,7,9,11,13,4,1};
        int j=0;
        int[] auxilaryArray = new int[intArray.length];

        for (int i = intArray.length-1; i >=0; i--,j++) {
            auxilaryArray[j] = intArray[i];
        }

        System.out.println("auxilaryArray:: "+ Arrays.toString(auxilaryArray));

        for(int i=0;i<auxilaryArray.length;i++){
            intArray[i] = auxilaryArray[i];
        }

        System.out.println("Reversed Array:: "+ Arrays.toString(intArray));
    }
}
