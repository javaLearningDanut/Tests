package test2.oop.prob5;

public abstract class RegularShape implements Shape {

    public String getType() {
        String message = "Inside getType method from RegularShape class";
        System.out.println(message);
        return message;
    }

    public abstract int getArea(int d);

    public abstract int getPerimeter(int d);
}
