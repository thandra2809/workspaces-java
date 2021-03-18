package org.streams.map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import static java.lang.System.*;

public class MapWithStreams {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "linode.com");
        map.put(2, "heroku.com");
        map.put(3, "linkedin.com");

        //Map -> Stream -> Filter -> String
        Supplier<Function<Map.Entry<Integer, String>, String>> functionSupplier = () -> x -> x.getValue();
        String result;
        result = map.entrySet().stream()
                .filter(x -> "something".equals(x.getValue()))
                .map(functionSupplier.get())
                .collect(Collectors.joining());

        out.println(result);

        //Map -> Stream -> Filter -> MAP
        Map<Integer, String> collect1 = map.entrySet().stream()
                .filter(x -> x.getKey() == 2)
                .collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));

        out.println(collect1);
        // or like this
        Map<Integer, String> collect2 = map.entrySet().stream()
                .filter(x -> x.getKey() == 3)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));


        out.println(collect2);

    }
}
