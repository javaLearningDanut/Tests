package test2.exceptions;

public class Throw1 extends Throw {
    @Override
    public void throwException() throws MyCustomException{
        throw new MyCustomException("exceptie noua", Priority.MEDIUM);
    }



}
