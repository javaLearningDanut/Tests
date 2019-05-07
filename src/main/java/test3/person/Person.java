package test3.person;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address.getStreetName() + "," + address.getStreetNumber() +
                '}';
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person))
            return false;
        Person person = (Person) o;
        return age == person.age &&
                name.equals(person.name) &&
                address.equals(person.address);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age + address.hashCode();
    }

    @Override
    public int compareTo(Person o) {
        if (this.getAge() > o.getAge())
            return 1;
        else if (this.getAge() == o.getAge())
            return 0;
        else return -1;
    }
}
