package com.epam;

public class Cat extends Animal implements Pet {


    //    constructor 2
    public Cat(String name) {
        this.setName(name);
    }

    //    constructor 3
    public Cat(String name, int weight) {
        this.setName(name);
        this.setWeight(weight);
    }

    @Override
    public void cuddle() {

    }

    @Override
    public void sit() {

    }

    @Override
    public void layDown() {

    }
}

