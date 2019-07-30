package com.epam;

public class Main {

    public static void main(String[] args) {
        Human first = new Human();
        String thing = "almapaprika";

        thing.length();
        System.out.println(thing.length());
        thing.eq


//        Human second = new Human();
//
        first.setName("Péter");
//        second.setName("Marika");

//        System.out.println(first.getAge());
//        System.out.println(first.getName());
//        System.out.println(second.getName());

        first.setName("Gyula");
        first.setAge(32);
        first.writeMyName();

        boolean empty = (first.getName() == null); //default value is false. If the expression evaluation is equal to zero, then it returns true. If not zero, then it returns false.

        System.out.println(first.getName() == null ? "Empty" : "Not empty, its value is " + first.getName());

        System.out.println(empty);

        String firstName = first.getName();

//        This has been the original if / else form
//        if (first.getName() == null) {
//            System.out.println("There is no name");
//        } else {
//            System.out.println("There is a name: " + firstName);
//        }


    }
}
