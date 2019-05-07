package test3.autoboxing;

public class SumOfDigitsWrapper {

    public static void main(String[] args) {
        Integer integer = new Integer(1895);
        System.out.println(sumOfDigits(integer));  //unboxing
    }

    public static int sumOfDigits(int n) {
        Integer sum = 0;  //autoboxing
        while (n != 0) {
            int r = 0;
            r = n % 10;
            n = n / 10;
            sum += r;
        }
        return sum;
    }


}
