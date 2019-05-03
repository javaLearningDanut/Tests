package test2.exceptions;

public class MyCustomException1 extends MyCustomException {
    String cause;
    MyCustomException1(String message, Priority priority, String cause) {
        super(message, priority);
        this.cause = cause;
    }
}
