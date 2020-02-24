public class NumberRunner {
    public static void main(String[] args) {
        MyNumber number = new MyNumber(5);
        /**
         * Check if a Number is Prime Number
         */
        boolean isPrime = number.isPrime();
        System.out.println("isPrime:: " + isPrime);

        /**
         * Numbers Triangle
         * */
        number.printNumberTriangle();
    }
}
