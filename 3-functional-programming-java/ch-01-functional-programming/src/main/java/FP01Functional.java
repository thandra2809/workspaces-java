import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {
        printAllNumbersFunctional(List.of(1, 5, 2, 4, 7, 3, 9));

    }

    private static <Integer> void printAllNumbersFunctional(List<Integer> numbers) {
     /*   for (Integer number : numbers) {
            System.out.println("" + number);
        }*/

        numbers.stream().forEach(number ->
                System.out.println(number));

    }

    private static void print(int number) {
        System.out.println(number);
    }
}
