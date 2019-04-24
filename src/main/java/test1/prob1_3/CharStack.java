package test1.prob1_3;

public class CharStack {
    private int size;
    private char[] stackArray;
    private int topOfStack;
    private static int instanceCount;

    public CharStack() {
        stackArray = new char[topOfStack];
    }

    public CharStack(int topOfStack) {
        size = 0;
        this.topOfStack = topOfStack;
        stackArray = new char[topOfStack];
        instanceCount++;
    }


    public void push(char element) {
        System.out.println("Trying to add \'" + element + "\' into the stack...");
        if (!isFull()) {
            stackArray[size++] = element;
            System.out.println("Element \'" + element + "\' was added in stack");
        } else {
            System.out.println("Can't push \'" + element + "\' ! The stack is full");
        }
    }


    public char pop() {
        char popElement = '\u0000';
        if (isEmpty()) {
            System.out.println("No element in stack. Can't pop any element!!!");
        } else {
            popElement = stackArray[--size];
            stackArray[size] = '\u0000';
            System.out.println("Removed \'" + popElement + "\' from the stack");

        }
        return popElement;
    }

    public char peek() {
        char peekElement = '\u0000';
        try {
            peekElement = stackArray[size - 1];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No element present in the stack. Can't peek!!");
        }
        return peekElement;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else
            return false;
    }

    public boolean isFull() {
        if (size == topOfStack) {
            return true;
        } else
            return false;
    }

    public int getInstanceCount() {
        return instanceCount;
    }

    public int getSize() {
        return size;
    }

    public char[] getStackArray() {
        return stackArray;
    }

    public int getTopOfStack() {
        return topOfStack;
    }
}
