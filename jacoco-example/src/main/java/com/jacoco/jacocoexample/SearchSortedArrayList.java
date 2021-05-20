package com.jacoco.jacocoexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.LongStream;

import static java.util.stream.Collectors.toCollection;

public class SearchSortedArrayList {
    public static void main(String[] args) {
        List<String> list = LongStream.range(0, 16)
                .boxed()
                .map(Long::toHexString)
                .collect(toCollection(ArrayList::new));


        List<String> stringsToSearch = new ArrayList<>(list);
        stringsToSearch.addAll(list);

        System.out.println("list is:: " + stringsToSearch);

        List<String> copy = new ArrayList<>(stringsToSearch);
        Collections.sort(copy);
        System.out.println("Copy is" + copy);

        int index = Collections.binarySearch(copy, "f");

        System.out.println("index is:: " + index);
    }
}
