package com.jacoco.jacocoexample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayListExamples {
    public List<Integer> getList() {
        Collection<Integer> numbers = IntStream.range(0, 10).boxed().collect(Collectors.toSet());

        System.out.println(numbers.getClass());
        List<Integer> listNumbers = new ArrayList<>(numbers);

        System.out.println(listNumbers);
        return listNumbers;
    }

    public List<Long> addElements() {
        List<Long> list = new ArrayList<>();
        list.add(1L);
        list.add(2L);
        list.add(1, 3L);
        return list;
    }


}
