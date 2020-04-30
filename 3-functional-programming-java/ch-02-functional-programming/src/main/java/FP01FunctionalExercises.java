import java.util.List;

public class FP01FunctionalExercises {
    public static void main(String[] args) {

        printOddNumbersFunctional(List.of(1, 5, 2, 4, 7, 3, 9, 8, 12, 17, 16));

        List<String> courses = List.of("Spring", "SpringBoot", "API", "Microservices", "AWS", "Azure", "Docker");

        printCourses(courses);

    }

    private static void printCourses(List<String> courses) {
        courses
                .stream()
                .filter(course-> course.length()>3)
                .forEach(System.out::println);
    }

    private static void printOddNumbersFunctional(List<Integer> numbers) {
        numbers
                .stream()
                .filter(number -> (int) number % 2 != 0)
                .forEach(System.out::println);
    }
}
