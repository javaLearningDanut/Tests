package test2.exceptions;

public class Main {
    public static void main(String[] args) {
        Throw t = new Throw();
        Throw t1 = new Throw1();
        Throw t2 = new Throw2();
        Throw t3 = new Throw3();
        printExceptionDetails(t);
        printExceptionDetails(t1);
        printExceptionDetails(t2);
        printExceptionDetails(t3);
    }

    private static void printExceptionDetails(Throw t) {
        try {
            t.throwException();
        } catch (MyCustomException2 e) {
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            System.out.println(e.cause);
            System.out.println(e.priority);
            System.out.println(e.errorCode+"\n");
        }
        catch (MyCustomException1 e){
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            System.out.println(e.cause);
            System.out.println(e.priority+"\n");
        }catch (MyCustomException e){
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            System.out.println(e.priority+"\n");
        }
    }
}
