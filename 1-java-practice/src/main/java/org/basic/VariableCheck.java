package org.basic;

import static java.lang.System.out;

public class VariableCheck {

    public static void main(String[] args) {
        VariableCheck testObject = new VariableCheck();
        out.println("Testing: " + testObject.testVariables());
    }

    private int testVariables() {
        final int i;
        i = 10;
        float testFloat = 0.2f;
        out.println(testFloat);

        return i;
    }
}
