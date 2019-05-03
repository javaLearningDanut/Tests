package test2.oop.prob5;

public final class Square extends Rectangle {
    @Override
    public int getArea(int d) {
        int area = d * d;
        System.out.println("Inside getArea-int method from Square class. Area is: " + area);
        return area;
    }

    @Override
    public int getPerimeter(int d) {
        int perimeter = 4 * d;
        System.out.println("Inside getPerimeter-int method from Square class. Perimeter is: " + perimeter);
        return perimeter;
    }

    public int getArea(float d) {
        float area = d * d;
        int a = (int) area;
        System.out.println("Inside getArea-float method from Square class. Area is: " + a);
        return a;
    }


    public int getPerimeter(float d) {
        float perimeter = 4 * d;
        int perim = Math.round(perimeter);
        System.out.println("Inside getPerimeter-float method from Square class. Perimeter is: " + perim);
        return perim;
    }
}
