package com.jacoco.jacocoexample;

import java.util.*;
import java.util.stream.LongStream;

import static java.util.stream.Collectors.toCollection;

public class SearchArrayList {
    public static void main(String[] args) {
        List<String> list = LongStream.range(0, 16)
                .boxed()
                .map(Long::toHexString)
                .collect(toCollection(ArrayList::new));


        List<String> stringsToSearch = new ArrayList<>(list);
        stringsToSearch.addAll(list);

        System.out.println("list is:: " + stringsToSearch);


        Set<String> matchingStrings = new HashSet<>(Arrays.asList("a", "c", "9"));

        List<String> result = stringsToSearch
                .stream()
                .filter(matchingStrings::contains)
                .collect(toCollection(ArrayList::new));

        System.out.println("result is:: " + result);
    }
}
