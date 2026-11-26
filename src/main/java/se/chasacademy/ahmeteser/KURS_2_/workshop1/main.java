package se.chasacademy.ahmeteser.KURS_2_.workshop1;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {

//        Animal animal = new Dog();
//
//        System.out.println(animal.sound());

        List<Animal> animals = new ArrayList<>();

        animals.add(new Dog());

        animals.add(new Cat());

        animals.add(new Animal());

        for (Animal animal1 : animals) {
            System.out.println(animal1.sound());
        }

    }
}