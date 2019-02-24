package de.zoo.enclosure;

import de.zoo.animals.Monkey;

public class EnclosureMain {

    public static void main(String[] args) {
        GeneralEnclosure monkey = new GeneralEnclosure(2);

        monkey.add(new Monkey("Joey", 2, true));
        monkey.add(new Monkey("Budd", 4, false));

        for (int i = 0; i < monkey.animals.length; i++){
            System.out.println(monkey.animals[i].isHappy);
        }
    }
}
