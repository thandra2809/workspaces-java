package org.sorting.bubble;

import java.util.Arrays;

public class BubbleSortNew {

    public static void main(String[] args) {

        int[] a = {3,4,2,1,6,7,4,9,0,1};

        for (int i = 0; i < a.length-1; i++) {
            for(int j=0; j<a.length-1-i;j++){
                System.out.printf("%d %d",i,j);
                System.out.println();
                if(a[j]>a[j+1]){
                    System.out.println("****************************");
                    System.out.println("Before Pass  "+ Arrays.toString(a));
                    swap(a,j,j+1);
                    System.out.println("After Pass  "+ Arrays.toString(a));
                    System.out.println("****************************");
                }else{
                    System.out.println("No Swaps");
                }
            }
        }

        System.out.println("Sorted Array:::  "+ Arrays.toString(a));

    }

    private static void swap(int[] a, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


}
