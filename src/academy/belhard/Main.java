package academy.belhard;

import java.util.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("тип List :");

        Person person1 = new Person("Andrey","Rof");
        Person person2 = new Person("Sergey","Azz");
        Person person3 = new Person("Vika","Cop");
        Person person4 = new Person("Dik","Hok");
        Person person5 = new Person("Rita","Zpp");

        List<Person> list = new ArrayList<>();
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        System.out.println("Количесво элементов в коллекции : " + list.size());
        System.out.println("--------------------------------------------------------");

        System.out.println("тип Set : ");

        Person person6 = new Person("Vitaliy","Ntt");
        Person person7 = new Person("Sonya","Lis");
        Person person8 = new Person("Nick","Sob");
        Person person9 = new Person("Sonya","Lis");
        Person person10 = new Person("Vitaliy","Ntt");

        Set<Person> set = new HashSet<>();
        set.add(person6);
        set.add(person7);
        set.add(person8);
        set.add(person9);
        set.add(person10);

        for ( Person person: set) {
            System.out.println(person);}

        System.out.println("Количесво элементов в коллекции : " + set.size());

        System.out.println("--------------------------------------------------------");

        System.out.println("тип Map : ");

        Person person11 = new Person("Jack", "Ntt");
        Person person12 = new Person("Sonya", "Lis");
        Person person13 = new Person("Nick", "Sob");
        Person person14 = new Person("Bob", "Noq");
        Person person15 = new Person("Sam", "Vud");

        Map<Integer,Person> map = new HashMap<>();

        map.put(45,person11);
        map.put(28,person12);
        map.put(50,person13);
        map.put(41,person14);
        map.put(47,person15);

        for ( Map.Entry<Integer,Person>  entry : map.entrySet()) {
            System.out.println("Ключ : " + entry.getKey() + "  Значение : " + entry.getValue());}

        System.out.println("Количесво элементов в коллекции : " + map.size());
    }
}
