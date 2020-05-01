import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomClassesSorted {
    public static void main(String[] args) {

        List<Course> courses = List.of(new Course("Spring", "Framework", 98, 2000000),
                new Course("Spring Boot", "Framework", 92, 20000),
                new Course("API", "Framework", 91, 50000),
                new Course("Microservices", "Framework", 96, 80000),
                new Course("Full Stack", "Framework", 91, 20000),
                new Course("AWS", "Framework", 98, 300000),
                new Course("Azure", "Cloud", 92, 20000),
                new Course("Docker", "Cloud", 99, 100000),
                new Course("Kubernetes", "Cloud", 95, 20000));


        Comparator<Course> comparator = Comparator.comparing(Course::getNoOfStudents);

        System.out.println(courses.stream().sorted(comparator).collect(Collectors.toList()));

    }
}
