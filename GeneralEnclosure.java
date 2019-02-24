package de.zoo.enclosure;

import de.zoo.animals.Animal;

public class GeneralEnclosure {

    Animal[] animals;

    public GeneralEnclosure(int size) {
        animals = new Animal [size];
    }

    public void add(Animal animal){
        for(int i = 0; i<animals.length; i++){
            if(animals[i] == null){
                animals[i] = animal;
                break;
            }else if(i == animals.length - 1){
                System.out.println("Enclosure is full.");
            }
        }
    }

    public int countMonkey(){
        int count = 0;
        for(int i = 0; i < animals.length)
    }

    public void
    for(Animal anAnimal : animals){

    }
}
