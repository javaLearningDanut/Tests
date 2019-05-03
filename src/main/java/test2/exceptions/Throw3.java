package test2.exceptions;

public class Throw3 extends Throw {
    @Override
    public void throwException() throws ArithmeticException {
        throw new ArithmeticException("Can't divide by zero");


    }
}
