package de.zoo.animals;

public class Monkey extends Animal implements Climbable {
    Monkey partner;

    public Monkey(String name, int age, boolean isHappy, Monkey partner){
        super(name, age, isHappy);
        this.partner = partner;
    }

    public Monkey(String name, int age, boolean isHappy){
        this(name, age, isHappy, null);
    }

    @Override
    public void climb(String thing){
        System.out.println(getName() + ",the " + getClass().getSimpleName() + " is climbing a " + thing);
    }

    public void groom(Monkey otherMonkey){
        System.out.println(getName() +  " is grooming " + otherMonkey.getName());
        this.isHappy = true;
        otherMonkey.isHappy = true;
    }

    public void setPartner(Monkey partner){
        this.partner = partner;
    }
}
