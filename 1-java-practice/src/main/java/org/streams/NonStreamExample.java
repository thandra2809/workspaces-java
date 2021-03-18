package org.streams;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.*;

public class NonStreamExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ajeet");
        names.add("Negan");
        names.add("Aditya");
        names.add("Steve");
        int count = 0;
        for (String str : names) {
            if (str.length() < 6)
                count++;
        }
        out.println("There are "+count+" strings with length less than 6");
    }
}
