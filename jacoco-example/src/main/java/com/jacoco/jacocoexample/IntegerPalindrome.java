package com.jacoco.jacocoexample;

public class IntegerPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(101));
        System.out.println(isPalindrome(-101));
        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(12321));

    }

    public static boolean isPalindrome(int x) {
        int revX = 0;
        int x1 = x;
        while(x > 0){
            revX = (revX*10) + (x%10);
            x = x/10;
            //System.out.println(x +" - "+ revX);
        }

        return x1 == revX;
    }
}
