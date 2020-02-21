public class Fibonacci {
    static int fib(int n) {
        int calValue = 0;
        if (n <= 1) {

            System.out.print(n);
            return n;
        } else {
            calValue = fib(n - 1) + fib(n - 2);
            System.out.print(calValue);
            return calValue;
        }
    }

    public static void main(String args[]) {
        int n = 9;
        System.out.println(fib(n));
    }
}
