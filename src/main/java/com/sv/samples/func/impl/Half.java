package com.sv.samples.func.impl;

import com.sv.samples.func.contract.Function;

public class Half implements Function {
    public int evaluate(int n) {
        return n / 2;
    }

    public int[] client(int[] arr) {
        int[] newArr = new int[arr.length];
        Half half = new Half();
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = half.evaluate(arr[i]);
        }
        return newArr;
    }

    public int[] client(int[] arr, Function function) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = function.evaluate(arr[i]);
        }
        return newArr;
    }

    public void printNewArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 8, 14, 17, 35, 67, 88};
        Function function = new Half();
        Half half = new Half();

        //exc  1
        int[] newArr = half.client(arr);
        half.printNewArray(newArr);

        //exc  2
        int[] newArr1 = half.client(arr, function);
        System.out.println();
        half.printNewArray(newArr1);

        int[] tenValuesArray = new int[10];
        for (int i = 1; i <= 10; i++) {
            tenValuesArray[i - 1] = i;
        }
        Print print = new Print();
        for (int i = 0; i < tenValuesArray.length; i++) {
            print.evaluate(tenValuesArray[i]);
        }

        int[] halfArr = half.client(tenValuesArray, function);
        for (int i = 0; i < halfArr.length; i++) {
            print.evaluate(halfArr[i]);
        }


    }


}
