package test3.person;

public class Address implements Cloneable{

    private String streetName;
    private int streetNumber;

    public Address() {

    }

    public Address(String streetName, int streetNumber) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
