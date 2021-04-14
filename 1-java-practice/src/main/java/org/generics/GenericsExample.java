package org.generics;

import java.util.List;

import static java.lang.System.*;

public class GenericsExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4);

        out.println(numbers);
    }
}
