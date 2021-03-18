package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatStreams {
    public static void main(String[] args) {
        //list 1
        List<String> alphabets = Arrays.asList("A","B","C");
        //list 2
        List<String> names = Arrays.asList("Sansa","Jon","Arya");

        //creating two streams from the two lists and concatenating them into one
        List<String> opstream = Stream.concat(alphabets.stream(), names.stream()).collect(Collectors.toList());

        //displaying the elements of the concatenated stream
        opstream.forEach(str->System.out.print(str+" "));
    }
}
