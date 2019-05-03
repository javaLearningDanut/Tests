package test2.filter;

public class TestFilter {
    public static void main(String[] args) {
        Filter filter = new FilterImpl();
        long[] arr = {23, 14, 18, 29, 0, 30, -17, -30, 59, 71, 66};
        long target = 30;
        System.out.println("The following elements passed the even filter: ");
        evenFilter(filter, arr);
        System.out.println("\nThe following elements passed the prime filter: ");
        primeFilter(filter, arr);
        System.out.println("\nThe following elements passed the largerThanFilter filter: ");
        largerThanFilter(filter, arr, target);
        System.out.println("\nThe following elements passed both the largerThan and prime filters: ");
        primeAndLargerThanFilter(filter, arr, target);
    }

    public static long[] evenFilter(Filter filter, long[] inputArray) {
        long[] outputArray = new long[inputArray.length];
        int j = 0;
        for (int i = 0; i < inputArray.length; i++) {
            long result = filter.even(inputArray[i]);
            if (result != Long.MAX_VALUE) {
                outputArray[j] = result;
                System.out.print(outputArray[j] + ", ");
                j++;
            }
        }
        return outputArray;
    }

    public static long[] primeFilter(Filter filter, long[] inputArray) {
        long[] outputArray = new long[inputArray.length];
        int j = 0;
        for (int i = 0; i < inputArray.length; i++) {
            long result = filter.prime(inputArray[i]);
            if (result != 0) {
                outputArray[j] = result;
                System.out.print(outputArray[j] + ", ");
                j++;
            }
        }
        return outputArray;
    }

    public static long[] largerThanFilter(Filter filter, long[] inputArray, long target) {
        long[] outputArray = new long[inputArray.length];
        int j = 0;
        for (int i = 0; i < inputArray.length; i++) {
            long result = filter.largerThan(inputArray[i], target);
            if (result != Long.MAX_VALUE) {
                outputArray[j] = result;
                System.out.print(outputArray[j] + ", ");
                j++;
            }
        }
        return outputArray;
    }

    public static long[] primeAndLargerThanFilter(Filter filter, long[] inputArray, long target) {
        long[] intermediaryArray = new long[inputArray.length];
        long[] outputArray = new long[intermediaryArray.length];
        int j = 0;
        int k = 0;
        for (int i = 0; i < inputArray.length; i++) {
            long result = filter.largerThan(inputArray[i], target);
            if (result != Long.MAX_VALUE) {
                intermediaryArray[j] = result;
                j++;
            }
        }
        for (int i = 0; i < intermediaryArray.length; i++) {
            long result = filter.prime(intermediaryArray[i]);
            if (result != 0) {
                outputArray[k] = result;
                System.out.print(outputArray[k] + ", ");
                k++;
            }
        }

        return outputArray;
    }

}
