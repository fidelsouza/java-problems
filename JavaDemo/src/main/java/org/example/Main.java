package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Main {

//        final HashSet<Cat> cats = new HashSet<Cat>();
//        cats.add(new Cat("Snow", 5));
//        cats.add(new Cat("Little", 1));
//        cats.add(new Cat("Snow", 5));
//        System.out.println(cats.size());

//        final List<String> strings = new ArrayList<>();
//        strings.add("A");
//        strings.add("B");
//        strings.add("C");
//        strings.stream().filter(s -> {
//            System.out.print(s);
//            return true;
//        });

    public static void main(final String[] args) {

        int x = 11 % 2;

        System.out.println(x);

    }

    private static void changeArray( Integer[] array){




        HashSet<Number> hs = new HashSet<>();

        array[2] = 99;

        System.out.println("Interior metodo---" +array[2]);

    }

    public static class Animal {
        public String name;

        public Animal(final String name) {
            this.name = name;
        }

        public Animal() {

        }
    }

}