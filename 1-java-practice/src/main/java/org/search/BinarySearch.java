package org.search;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        int[] a = {2,3,4,5,6,7,8};

        var low = 0;
        var high = a.length-1;

        var keyIndex = binarySearch(a,low,high,5);

        System.out.println("The Key Index is::" + keyIndex);

    }

    public static int binarySearch(int a[],int low,int high,int key){
        int mid;

        while(low<=high){
            mid  = (low+high)/2;

            if(key== a[mid]) {return mid;}
            else if(key<a[mid]){
                high=mid-1;
            }else {
                low = mid +1;
            }

        }
        return -1;
    }

}
