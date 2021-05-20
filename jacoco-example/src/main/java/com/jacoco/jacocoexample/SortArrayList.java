package com.jacoco.jacocoexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortArrayList {
    public static void main(String[] args) {
        int[] listOfIntegersOld = {9, 3, 2, 4, 1, 0, 7, 6, 8, 5};
        Integer[] listOfIntegers = new Integer[]{9, 3, 2, 4, 1, 0, 7, 6, 8, 5};

        List<Integer> listInts = new ArrayList<>(Arrays.asList(listOfIntegers));

        List<Integer> list = Arrays.stream(listOfIntegersOld)
                .boxed()
                .collect(Collectors.toList());

        Collections.sort(listInts);

        System.out.println(listInts);

    }
}
