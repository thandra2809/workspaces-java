import java.util.List;

public class FP01Structured {
    public static void main(String[] args) {
        printAllNumbers(List.of(1, 5, 2, 4, 7, 3, 9));

    }

    private static <Integer> void printAllNumbers(List<Integer> numbers) {
        for (Integer number : numbers) {
            System.out.println("" + number);
        }
    }
}