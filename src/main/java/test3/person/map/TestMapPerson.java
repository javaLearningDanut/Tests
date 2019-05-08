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
         * Metoda get(key) din HashMap utilizeaza hashcode-ul key-ului pentru a returna valoarea. Din moment ce am modificat varsta pentru person2, acest lucru va influenta
         * hashcode-ul key-ului. Atunci cand se cauta (get) o valoare utilizand key-ul "person2", aceasta nu va fi gasita deoarece hashcode-ul key-ului se calculeaza utilizand noua varsta,27
         * Prin urmare, se va returna null
         *
         */
        System.out.println(persons.get(person2));
        System.out.println(persons.size());
    }
}
