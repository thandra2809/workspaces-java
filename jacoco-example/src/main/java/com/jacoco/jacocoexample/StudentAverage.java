package com.jacoco.jacocoexample;

import java.util.*;

import static java.lang.Integer.parseInt;

public class StudentAverage {

    public static void main(String[] args) {
        String[][] listOfStudents = {{"Srini", "90"}, {"Priya", "80"}, {"Shreyus", "90"}, {"Srini", "100"}};

        HashMap<String, List<Integer>> studentMap = new HashMap<>();
        List<Integer> newMarksList = null;
        List<Integer> existingMarkList = null;

        for (int i = 0; i < listOfStudents.length; i++) {
            String studentName = listOfStudents[i][0];
            Integer marks = parseInt(listOfStudents[i][1]);

            if (studentMap.containsKey(studentName)) {
                existingMarkList = studentMap.get(studentName);
                existingMarkList.add(marks);
                studentMap.put(studentName, existingMarkList);
            } else {
                newMarksList = new ArrayList<>();
                newMarksList.add(marks);
                studentMap.put(listOfStudents[i][0], newMarksList);
            }
        }

        HashMap<String, Integer> studentAveragesMap = new HashMap<>();
        Set<Map.Entry<String, List<Integer>>> entrySet = studentMap.entrySet();

        for (Map.Entry<String, List<Integer>> entry : entrySet) {
            Integer average = calculateAverage(entry.getValue());
            studentAveragesMap.put(entry.getKey(), average);
        }
        List<Map.Entry<String, Integer>> averageMarksList =
                new LinkedList<>(studentAveragesMap.entrySet());
        Collections.sort(averageMarksList, (o1, o2) -> (o2.getValue()).compareTo(o1.getValue()));
        HashMap<String, Integer> temp = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> aa : averageMarksList) {
            temp.put(aa.getKey(), aa.getValue());
        }
        System.out.println(temp);

    }

    public static int calculateAverage(List<Integer> marks) {
        return (int) marks.stream()
                .mapToDouble(d -> d)
                .average()
                .orElse(0.0);
    }

}
