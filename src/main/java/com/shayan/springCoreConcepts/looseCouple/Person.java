package com.shayan.springCoreConcepts.looseCouple;

public class Person {
    //we can create an object of Animal interface(because of being interface)


    Animal animal;

    //Person constructor -> passing the animal object
    public Person(Animal animal) {
        this.animal = animal;
    }

    public void playWithAnimal(){

        animal.play();
    }
}
