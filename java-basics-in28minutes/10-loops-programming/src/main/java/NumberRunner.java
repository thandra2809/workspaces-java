public class NumberRunner {
    public static void main(String[] args) {
        MyNumber number = new MyNumber(9);
        boolean isPrime = number.isPrime();
        System.out.println("isPrime:: " +isPrime);
    }
}
