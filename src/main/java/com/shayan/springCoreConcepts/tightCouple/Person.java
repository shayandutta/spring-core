//person is tightly coupled with animal


package com.shayan.springCoreConcepts.couple;

public class Person {


    Animal animal = new Animal(); //object of the animal class
    //will run the constructor automatically


    public void playWithAnimal(){
        //using animal
        animal.play(); //calling the play method for animal object from Animal class
    }
}
