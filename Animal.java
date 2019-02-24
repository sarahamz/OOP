package de.zoo.animals;

public abstract class Animal {
    private final String name;
    private int age;
    public boolean isHappy;
    public static int numAnimals = 0;

    public Animal(String name, int age, boolean isHappy){
        this.name = name;
        this.age = age;
        this.isHappy = isHappy;
        numAnimals++;
    }

    public void walk(){
        System.out.println(name + " is walking.");
    }

    public boolean gettingBored(){
        System.out.println(name + " is bored.");
        isHappy = false;
        return false;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public boolean getIsHappy(){
        return isHappy;
    }
}