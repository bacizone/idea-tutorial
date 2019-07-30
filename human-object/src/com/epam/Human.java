package com.epam;

public class Human {
    private String name;
    private int age;

/**  writeMyName is a method that displays my name with a prefix text**/
    void writeMyName() {
        System.out.println("My name is " + this.name);
    }

    //Getter - this.name always refers to the class String name!
    public String getName() {
        return this.name;

    }

    //Setter - this.name always refers to the class String name!
    public void setName(String name) {
        this.name = name;

    }


    //Getter
    public int getAge() {
        return age;
    }

    //Setter
    public void setAge(int age) {
        this.age = age;
    }
}