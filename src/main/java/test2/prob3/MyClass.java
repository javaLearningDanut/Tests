package test2.prob3;

public class MyClass {
    public static void main(String[] args) throws A {
        try {
            f();
        }catch (A e) {
            throw e;
        }
        finally {
            System.out.println("Done.");
        }
    }
    public static void f() throws B {
        throw new B();
    }
}
class A extends Throwable {}
class B extends A {}