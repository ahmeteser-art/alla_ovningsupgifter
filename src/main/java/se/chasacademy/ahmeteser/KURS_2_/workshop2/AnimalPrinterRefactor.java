package se.chasacademy.ahmeteser.KURS_2_.workshop2;

public class AnimalPrinterRefactor {


        public String describe(Animal animal) {

            return "Name: " + animal.getName()
                    + ", sound: " + animal.getSound()
                    + ", activity: " + animal.getFavoriteActivity();
        }
    }

