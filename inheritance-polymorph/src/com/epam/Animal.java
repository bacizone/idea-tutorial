package com.epam;

public class Animal {
    private String name;

    private int weight;

    public void makeSound() {
        System.out.println("AAAAAAA");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}