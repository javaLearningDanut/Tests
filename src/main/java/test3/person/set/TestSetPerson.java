package test3.person.set;

import org.junit.Assert;
import org.junit.Test;
import test3.person.Address;
import test3.person.Person;

import java.util.HashSet;
import java.util.Set;

public class TestSetPerson {
    public static void main(String[] args) throws CloneNotSupportedException {
        Set<Person> personSet = new HashSet<>();
        String name = "Gigel";

        Address address1 = new Address();
        address1.setStreetName("Dr. Ioan Cantacuzino");
        address1.setStreetNumber(16);

        Address address2 = new Address("Uruguay", 11);
        Address address3 = (Address) address2.clone();
        address3.setStreetNumber(17);

        Person person1 = new Person("Danut CRISTEA", 26, address1);
        Person person2 = new Person("Stefan cel Mare", 35, address2);
        Person person3 = new Person("Mircea cel Batran", 20, address3);

        System.out.println("Dimensiunea colectiei/setului:" + getListSize(personSet));
        System.out.println("Este colectia/setul gol? -" + checkIfEmpty(personSet));
        personSet.add(person1);
        System.out.println("Este colectia/setul gol? -" + checkIfEmpty(personSet));
        personSet.add(person2);
        personSet.add(person3);
        System.out.println();
        printPersons(personSet);
        setIsEmptyTest(personSet);


        System.out.println("Colectia/setul de persoane contine numele " + name + "?: " + containsName(personSet, name));

        System.out.println("Dimensiunea colectiei/setului:" + getListSize(personSet));
        personSet.remove(person2);
        System.out.println("Dimensiunea colectiei/setului:" + getListSize(personSet));
        printPersons(personSet);

    }


    public static boolean containsName(Set<Person> personSet, String name) {
        boolean flag = false;
        for (Person person : personSet) {
            if (person.getName().contains(name)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static void printPersons(Set<Person> personSet) {
        for (Person p : personSet) {
            System.out.println(p.toString());
        }
        System.out.println();
    }

    public static boolean checkIfEmpty(Set<Person> personSet) {
        return personSet.isEmpty();
    }

    public static int getListSize(Set<Person> personSet) {
        return personSet.size();
    }

    @Test
    public static void setIsEmptyTest(Set<Person> personSet) {
        Assert.assertFalse(personSet.isEmpty());
    }

}

