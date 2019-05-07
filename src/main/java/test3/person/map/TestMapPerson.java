package test3.person.map;

import test3.person.Address;
import test3.person.Person;

import java.util.HashMap;

public class TestMapPerson {
    static HashMap<Person, Integer> persons;

    public static void main(String[] args) {

        Address address1 = new Address();
        address1.setStreetName("Dr. Ioan Cantacuzino");
        address1.setStreetNumber(16);
        Person person1 = new Person("Danut CRISTEA", 26, address1);
        Person person2 = new Person("Danut CRISTEA", 26, address1);

        persons = new HashMap<>();
        persons.put(person1, person1.hashCode());
        System.out.println(persons.get(person1));

        persons.put(person2, person2.hashCode());
        System.out.println(persons.get(person2));
        System.out.println(persons.size());
        person2.setAge(27);
        /**
         *
         * pentru ca am suprascris metodele equals() si hashCode in clasa Person, atunci cand incerc sa adaug doua obiecte cu aceleasi date, se va
         * adauga de fapt o singura data, pentru ca este duplicat; in HashMap pot adauga perechi <Key, Value> cu conditia ca Key sa fie diferite
         *
         */
        System.out.println(persons.get(person2));
        System.out.println(persons.size());
    }
}
