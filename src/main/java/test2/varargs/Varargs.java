package test2.varargs;

public class Varargs {
    public static void main(String[] args) {
        sumOfDigits(2, 5,5, 8,23);
        sumOfDigits(2, 6);
        sumOfDigits(2);
        sumOfDigits();
    }

    public static void sumOfDigits(int... n) {
        int sum = 0;
        System.out.print("I received " + n.length + " parameters, which are: ");
        for (int i : n) {
            sum += i;
            System.out.print(i + ", ");
        }
        System.out.println("The sum is: " + sum);
    }

}
