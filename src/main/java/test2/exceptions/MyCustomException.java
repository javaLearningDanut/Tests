package test2.exceptions;

public class MyCustomException extends Exception {
    Priority priority;

    MyCustomException(String message, Priority priority) {
        super(message);
        this.priority = priority;
    }
}

enum Priority {
    LOW, MEDIUM, HIGH
}