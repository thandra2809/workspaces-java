import java.util.List;
import java.util.function.Predicate;

public class CustomClasses {
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

        Predicate<Course> reviewGreaterThan90Predicate = course -> course.getReviewScore() > 90;
        Predicate<Course> reviewGreaterThan95Predicate = course -> course.getReviewScore() > 95;
        Predicate<Course> reviewLessThan90Predicate = course -> course.getReviewScore() < 90;

        System.out.println("*********************************");
        System.out.println(courses.stream().allMatch(reviewGreaterThan90Predicate));
        System.out.println("*********************************");
        System.out.println(courses.stream().noneMatch(reviewGreaterThan95Predicate));
        System.out.println("*********************************");
        System.out.println(courses.stream().anyMatch(reviewLessThan90Predicate));
        System.out.println("*********************************");


    }

}
