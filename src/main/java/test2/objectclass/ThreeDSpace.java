package test2.objectclass;

public class ThreeDSpace {

    int x;
    int y;
    int z;

    public ThreeDSpace(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ThreeDSpace))
            return false;
        ThreeDSpace point = (ThreeDSpace) o;
        return point.x == x && point.y == y && point.z == z;
    }

    @Override
    public int hashCode() {
        return x + y + z;
    }
}
