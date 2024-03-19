package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Collection collection = Arrays.asList("a1","a4","a3","a2","a1","a4");
        Collection<People> peoples = Arrays.asList(new People("Вася", 16, Sex.MAN), new People("Петя", 23, Sex.MAN),
                new People("Елена", 42, Sex.WOMEN), new People("Иван Иванович", 69, Sex.MAN));

        Collection collection_ord = Arrays.asList(collection.stream().sorted().collect(Collectors.toList()));
        collection_ord.stream().forEach(System.out::print);
        System.out.println();
        Collection collectionInvOrd = Arrays.asList(collection.stream().sorted((o1,o2)-> -o1.toString().compareTo(o2.toString())).collect(Collectors.toList()));
        collectionInvOrd.stream().forEach(System.out::print);
        System.out.println();
        Collection collectionDist = Arrays.asList(collection.stream().sorted().distinct().collect(Collectors.toList()));
        collectionDist.stream().forEach(System.out::print);
        System.out.println();
        Collection collectionInvDist = Arrays.asList(collection.stream().sorted(((o1, o2) -> -o1.toString().compareTo(o2.toString()))).distinct().collect(Collectors.toList()));
        collectionInvDist.stream().forEach(System.out::print);
        System.out.println();
        Collection<People> peoplesSrt = new ArrayList(peoples.stream().sorted((o1, o2) -> -o1.getName().compareTo(o2.getName())).collect(Collectors.toList()));
        peoplesSrt.stream().forEach(s->System.out.println(s.getName()));
        System.out.println();
        Collection<People> bySexAndAge = peoples.stream().sorted((o1, o2) -> o1.getSex() != o2.getSex() ? o1.getSex().
                compareTo(o2.getSex()) : o1.getAge().compareTo(o2.getAge())).collect(Collectors.toList());
        bySexAndAge.stream().forEach(s-> System.out.println(s.getName() + s.getAge() + s.getSex()));

    }
}
