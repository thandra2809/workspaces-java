import java.util.List;

public class FP01FunctionalFilterWithLambda {
    public static void main(String[] args) {
        printEvenNumbersFunctional(List.of(1, 5, 2, 4, 7, 3, 9, 8, 12, 17, 16));

    }

    private static <Integer> void printEvenNumbersFunctional(List<Integer> numbers) {
        numbers
                .stream()
                //.filter(FP01FunctionalFilterWithLambda::isEven)
                .filter(number -> (int)number % 2 == 0)
                .forEach(System.out::println);
    }

    private static <Integer> boolean isEven(Integer integer) {
        return ((int) integer) % 2 == 0;
    }


}

