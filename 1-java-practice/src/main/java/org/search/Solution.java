package org.search;

class Solution {
    public static boolean isPossibleDivide(int[] nums, int k) {

        //int numOfSubArrays = nums.length / k;

        if (nums.length % k == 0) {
            return true;
        } else {
            return false;
        }
    }



    public static void main(String[] args) {
        int[] array = {2,5,6,8,9,10};
        System.out.println(isPossibleDivide(array, 3));
    }

}