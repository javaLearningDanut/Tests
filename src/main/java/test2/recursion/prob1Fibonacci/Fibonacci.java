package test2.recursion.prob1Fibonacci;

public class Fibonacci {

    public static void main(String[] args) {
        int n = 3;
        printFibonacciElementBasedOnPosition(n);
        printEntireSeries(n);
    }

    public static void printFibonacciElementBasedOnPosition(int n) {
        System.out.println(fibo(n));
    }

    private static void printEntireSeries(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print(fibo(i) + " ");
        }
    }

    public static int fibo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibo(n - 1) + fibo(n - 2);

    }
}
