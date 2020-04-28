import com.sun.tools.javac.util.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

public class StudentCollectionRunner {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student(1, "Srini"),
                new Student(4, "Shreyus"),
                new Student(3, "Priya"),
                new Student(2, "Lakshmi"));

        ArrayList<Student> studentAl = new ArrayList<>(students);
        TreeSet set = new TreeSet();

        System.out.println(studentAl);

        Collections.sort(studentAl);
        System.out.println(studentAl);

    }
}
