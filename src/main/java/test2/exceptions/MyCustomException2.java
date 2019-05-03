package test2.exceptions;

public class MyCustomException2 extends MyCustomException1 {
    int errorCode;

    MyCustomException2(String message, Priority priority, String cause, int code) {
        super(message, priority, cause);
        errorCode = code;
    }
}
