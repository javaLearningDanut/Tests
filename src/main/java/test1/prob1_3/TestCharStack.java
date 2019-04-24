package test1.prob1_3;

import java.util.ArrayList;
import java.util.List;

public class TestCharStack {

    public static void main(String[] args) {
        String message = "!gnimmargorP evol I";
        String message2 = "Danut CRISTEA!!!";
        CharStack charStack = new CharStack(getStringLength(message));
        CharStack charStack1 = new CharStack(getStringLength(message));
        pushString(charStack, message);
        pushString(charStack1, message2);
        System.out.println("Number of instances: " + charStack.getInstanceCount());
        printOnlyCapitalLetters(charStack1);
        purgeStack(charStack1);

    }

    public static void pushString(CharStack charStack, String s) {
        char[] stack = s.toCharArray();
        for (char c : stack) {
            charStack.push(c);
            System.out.println(charStack.peek());
        }
    }

    public static int getStringLength(String s) {
        return s.length();
    }

    public static void purgeStack(CharStack charStack) {
        while (!charStack.isEmpty()) {
            charStack.pop();
        }
    }

    public static void printOnlyCapitalLetters(CharStack charStack) {
        List<Character> capitalLetters = new ArrayList<Character>();
        if (!charStack.isEmpty()) {
            for (char c : charStack.getStackArray()) {
                int ascii = (int) c;
                if (65 <= ascii && ascii <= 90) {
//                if (Character.isUpperCase(c)) {
                    capitalLetters.add(c);
                }
            }
        }
        System.out.println("Capital letters are: " + capitalLetters);
    }
}
