package org.sorting.selection;

public class SelectionSortNew {
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        int j,k;

        for (int i = 0; i < intArray.length-1 ; i++) {

            for(j=k=i;j<intArray.length;j++){
                if(intArray[j]<intArray[k]){
                    k=j;
                }
            }
            swap(intArray,i,k);

        }


        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }


    }

    public static void swap(int[] array, int i, int j) {

        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

}
