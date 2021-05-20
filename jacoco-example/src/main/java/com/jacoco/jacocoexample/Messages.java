package com.jacoco.jacocoexample;

public class Messages {

    public String getMessages(String name) {
        StringBuilder s = new StringBuilder();
        if (name == null || name.trim().length() == 0) {
            s = s.append("Please Provide a name");
        } else {
            s.append("Hello " + name + "!");
        }
        return s.toString();
    }

}
