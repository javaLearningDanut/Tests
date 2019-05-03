package test2.oop.prob5;

public class TestGeometricFigure {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        Square square = new Square();

        Rectangle mySpecialSquare = new Square();

        rectangle.getType();
        rectangle.getArea(5);
        rectangle.getPerimeter(2);

        square.getType();
        square.getArea(4);
        square.getPerimeter(4);


        square.getArea(4.2f);
        square.getPerimeter(4.2f);

        mySpecialSquare.getArea(3);
        mySpecialSquare.getPerimeter(2);


        /**
         Doesn't work because I have created an object of Square having reference of Rectangle. Can't access the overloaded
         methods because they are not present in parent class(Rectangle)
         **/
//        mySpecialSquare.getArea(4.5f);
//        mySpecialSquare.getPerimeter(float 3.7f);

    }

}
