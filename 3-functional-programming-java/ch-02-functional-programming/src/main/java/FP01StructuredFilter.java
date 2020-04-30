import java.util.List;

public class FP01StructuredFilter {

    public static void main(String[] args) {
        printAllNumbers(List.of(1, 5, 2, 4, 7, 3, 9,8,12,17,16));
    }

    private static <Integer> void printAllNumbers(List<Integer> numbers) {
        for (Integer number : numbers) {
            if ((int) number % 2 == 0) {
                System.out.println("" + number);
            }
        }
    }
}
