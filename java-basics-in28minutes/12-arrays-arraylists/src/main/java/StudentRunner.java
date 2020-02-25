import java.math.BigDecimal;

public class StudentRunner {
    public static void main(String[] args) {
        int[] marks = {97, 99, 100};
        Student student = new Student("Srini", marks);
        int number = student.getNumberOfMarks();
        int sum = student.getTotalSumOfMarks();
        int maximumMark = student.getMaximumMark();
        int minimumMark = student.getMinimumMark();

        BigDecimal average = student.getAverageMarks();
        System.out.println(average);

        //  student.addMark(35);
        //  student.removeMarkAtIndex(5);
    }
}
