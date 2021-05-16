package org.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayTwoPointer {
    public static void main(String[] args) {



        int[] intArray = {3,2,5,6,7,9,11,13,4,1};
        int leftIndex=0;
        int rightIndex = intArray.length-1;
        int temp =0;

        while(leftIndex<rightIndex){
            temp = intArray[rightIndex];
            intArray[rightIndex] = intArray[leftIndex];
            intArray[leftIndex] = temp;

            leftIndex++;
            rightIndex--;
        }

        System.out.printf("%s", Arrays.toString(intArray));
    }
}
