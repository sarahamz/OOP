package de.zoo.animals;

public class Sloth extends Animal implements Climbable {

    public Sloth(String name, int age){
        super(name, age, true);
    }

    @Override
    public void climb(String thing){
        System.out.println(getName() + " " + getClass().getName() + " is climbing "+thing+".");
    }


}
