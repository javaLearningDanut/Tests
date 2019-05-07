package test3.person.list;

import test3.person.Address;
import test3.person.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestListPerson {

    public static void main(String[] args) throws CloneNotSupportedException {

        List<Person> personList = new ArrayList<>();
        String name = "Danut";

        Address address1 = new Address();
        address1.setStreetName("Dr. Ioan Cantacuzino");
        address1.setStreetNumber(16);

        Address address2 = new Address("Uruguay", 11);
        Address address3 = (Address) address2.clone();
        address3.setStreetNumber(17);

        Person person1 = new Person("Danut CRISTEA", 26, address1);
        Person person2 = new Person("Stefan cel Mare", 35, address2);
        Person person3 = new Person("Mircea cel Batran", 20, address3);

        System.out.println("Dimensiunea listei:" + getListSize(personList));
        System.out.println("Este lista goala? -" + checkIfEmpty(personList));
        personList.add(person1);
        System.out.println("Este lista goala? -" + checkIfEmpty(personList));
        personList.add(person2);
        personList.add(person3);

        System.out.println("\nLista inainte de sortare este:");
        printPersons(personList);

        Collections.sort(personList);
        System.out.println("Lista dupa sortare(dupa varsta) este:");
        printPersons(personList);

        Collections.sort(personList, compareByNameLength);
        System.out.println("\nLista dupa sortare(dupa lungimea numelui) este:");
        printPersons(personList);

        Collections.sort(personList, compareByAddressNumber);
        System.out.println("\nLista dupa sortare(dupa numarul strazii) este:");
        printPersons(personList);

        System.out.println("Lista de persoane contine numele " + name + "?: " + containsName(personList, name));

        System.out.println("Dimensiunea listei:" + getListSize(personList));
        personList.remove(2);
        personList.remove(person2);
        System.out.println("Dimensiunea listei:" + getListSize(personList));
        printPersons(personList);

    }


    public static boolean containsName(List<Person> personList, String name) {
        boolean flag = false;
        for (Person person : personList) {
            if (person.getName().contains(name)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static void printPersons(List<Person> personList) {
        for (Person p : personList) {
            System.out.println(p.toString());
        }
        System.out.println();
    }

    public static boolean checkIfEmpty(List<Person> personList) {
        return personList.isEmpty();
    }

    public static int getListSize(List<Person> personList) {
        return personList.size();
    }

    static Comparator<Person> compareByNameLength = new Comparator<Person>() {
        @Override
        public int compare(Person p1, Person p2) {
            if (p1.getName().length() > p2.getName().length()) {
                return 1;
            } else if (p1.getName().length() < p2.getName().length()) {
                return -1;
            } else
                return 0;
        }
    };

    static Comparator<Person> compareByAddressNumber = new Comparator<Person>() {
        @Override
        public int compare(Person p1, Person p2) {
            if (p1.getAddress().getStreetNumber() > p2.getAddress().getStreetNumber()) {
                return 1;
            } else if (p1.getAddress().getStreetNumber() < p2.getAddress().getStreetNumber()) {
                return -1;
            } else
                return 0;
        }
    };
}

