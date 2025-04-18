package com.shayan.springCoreConcepts.looseCouple;

public class Cat implements Animal{

    //overriding method from the Animal interface
    @Override
    public void play() {
        System.out.println("Cat is playing");
    }
}
