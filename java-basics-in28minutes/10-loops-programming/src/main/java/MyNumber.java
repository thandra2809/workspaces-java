public class MyNumber {
    private int number;

    public MyNumber(int number) {
        this.number = number;

    }

    public boolean isPrime() {
        // 2 to number-1 division we need to check

        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
