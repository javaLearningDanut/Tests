package test2.objectclass;

public class TestThreeDSpace {

    public static void main(String[] args) {
        ThreeDSpace point1 = new ThreeDSpace(2, 5, 7);
        ThreeDSpace point2 = new ThreeDSpace(2, 5, 7);

        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());
        if (point1.equals(point2) && point1.hashCode() == point2.hashCode()) {
            System.out.println("Point 1 and point 2 are the same");
        } else
            System.out.println("Point 1 is different from point 2");


    }
}
