package org.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.lang.System.out;

public class ConcatenateStream {
    public static void main(String[] args) {
        //list 1
        List<String> alphabets = Arrays.asList("A", "B", "C");
        //list 2
        List<String> names = Arrays.asList("Sansa", "Jon", "Arya");

        //creating two streams from the two lists and concatenating them into one
        Stream<String> stream = Stream.concat(alphabets.stream(), names.stream());

        //displaying the elements of the concatenated stream
        stream.forEach(str -> out.print(str + " "));
    }
}
