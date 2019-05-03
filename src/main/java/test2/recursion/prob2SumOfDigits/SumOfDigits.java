package test2.recursion.prob2SumOfDigits;

public class SumOfDigits {

    public static void main(String[] args) {
        System.out.println(sumOfDigits(1895));
    }

    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            int r = 0;
            r = n % 10;
            n = n / 10;
            sum +=r;
        }
        return sum;
    }


}

