package test2.exceptions;

public class Throw {

    public void throwException() throws MyCustomException {
        throw new MyCustomException1("Exceptie de la b", Priority.LOW, "din cauza mea");
    }

}
