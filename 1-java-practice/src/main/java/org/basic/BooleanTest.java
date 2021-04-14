package org.basic;

public class BooleanTest {
    private static Boolean checkReturnBoolean(){
        return true;
    }

    public static void main(String[] args) {
        boolean testValue = checkReturnBoolean();

        System.out.println("Test Value is:: "+testValue);
    }

}
