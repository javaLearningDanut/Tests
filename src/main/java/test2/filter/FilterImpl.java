package test2.filter;

public class FilterImpl implements Filter {


    public long largerThan(long n, long target) {
        long larger = Long.MAX_VALUE;
        if (n > target) {
            larger = n;
        }
        return larger;
    }

    public long prime(long n) {
        long primeNumber = 0;
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                counter++;
            }
        }
        if (counter == 2) {
            primeNumber = n;
        }
        return primeNumber;
    }

    public long even(long n) {
        long evenNumber = Long.MAX_VALUE;
        if (n % 2 == 0) {
            evenNumber = n;
        }
        return evenNumber;
    }

    public long connector(Filter[] filters) {

        return 0;
    }
}
