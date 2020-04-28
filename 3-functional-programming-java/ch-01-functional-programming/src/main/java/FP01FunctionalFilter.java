import java.util.List;

public class FP01FunctionalFilter {
    public static void main(String[] args) {
        printEvenNumbersFunctional(List.of(1, 5, 2, 4, 7, 3, 9, 8, 12, 17, 16));

    }

    private static <Integer> void printAllNumbersFunctional(List<Integer> numbers) {
        numbers.stream().forEach(System.out::println);
    }

    private static <Integer> void printEvenNumbersFunctional(List<Integer> numbers) {
        numbers.
                stream().
                filter(FP01FunctionalFilter::isEven).
                forEach(System.out::println);
    }

    private static <Integer> boolean isEven(Integer integer) {
        return ((int) integer) % 2 == 0;
    }


}
