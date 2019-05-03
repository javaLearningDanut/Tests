package test2.exceptions;

import static test2.exceptions.HttpStatusCode.NOT_FOUND;

public class Throw2 extends Throw {
    @Override
    public void throwException() throws MyCustomException2 {
        throw new MyCustomException2("New Exception", Priority.HIGH, "din cauza ta", NOT_FOUND);
    }
}
