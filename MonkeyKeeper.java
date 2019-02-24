package de.zoo.staff;

import de.zoo.animals.Monkey;

public class MonkeyKeeper extends Person {

    public MonkeyKeeper(String firstName, String lastName, int age, int staffNumber){
        super(firstName, lastName, age, staffNumber);
    }

    void play(Monkey monkey){
        System.out.println(getName() +  " plays with " + monkey.getName());
        monkey.isHappy = true;
    }


}//END MonkeyKeeper
