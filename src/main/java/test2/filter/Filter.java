package test2.filter;

public interface Filter {

    long largerThan(long n,long target);

    long prime(long n);

    long even(long n);

    long connector(Filter[] filters);

}
