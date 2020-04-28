import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FP02Functional {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        int sum = addListOfNumbers(numbers);

        System.out.println(sum);

    }

    private static int addListOfNumbers(List<Integer> numbers) {

        return numbers
                .stream()
                .reduce(0, FP02Functional::sum);


    }

    private static Integer sum(Integer aggregate, Integer nextNumber) {
        return aggregate + nextNumber;
    }


}
