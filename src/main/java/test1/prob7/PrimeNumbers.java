package test1.prob7;

public class PrimeNumbers {
    public static void main(String[] args) {
//        primeNumbersWithForLoop();
        primeNumbersWithWhileLoop();
    }

    private static void primeNumbersWithWhileLoop() {
        int n = 100;
        int i = n;

        while (n > 0) {
            int counter = 0;
            while (i >0) {
                if (n % i == 0) {
                    counter++;
                }
                i--;
            }
            if(counter==2){
                System.out.println(n+" is a prime number");
            }
            n--;
            i=n;
        }

    }

    private static void primeNumbersWithForLoop() {
        for (int i = 2; i < 100; i++) {
            int counter = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                System.out.println(i + " is a prime number");
            }
        }
    }
}

