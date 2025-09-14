package SixthChallenge;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
ArrayList<Animal> animals = new ArrayList<>();
Animal animal1 = new Animal("Junior", "Cat");
Animal animal2 = new Animal("Leonardo", "Dog");
animals.add(animal1);animals.add(animal2);
animals.forEach(System.out::println);

        System.out.println("Only cats:");
for(Animal animal : animals){
    if (animal.getSpecies() == "Cat"){
        System.out.println(animal);
    }
}


    }
}
