package se.chasacademy.ahmeteser.KURS_2_.workshop2;

public class AnimalPrinter {

    public String describe(Animal animal) {

        String result = "Name: " + animal.getName();

        if (animal instanceof Dog) { //varje klass typcontroll genom insteanceOf

            Dog dog = (Dog) animal;

            result += ", sound: woof";
            result += ", activity: " + dog.getFavoriteActivity();

        } else if (animal instanceof Cat) {//Bird, Monkey, Horse varje ny djur måste vi byta describe methoden
//kod blir beroende av andra klasser onödan
            Cat cat = (Cat) animal;//downcasting

            result += ", sound: meow";
            result += ", activity: " + cat.getFavoriteActivity(); //Problem 3: Code duplication
        }
        //Problem 4: Open/Closed Principle
        return result;
    }
}
//Koden använder instanceof för att kontrollera vilken typ av djur det är.
//Vi behöver casta Animal till Dog eller Cat för att komma åt deras specifika metoder.
//Det finns liknande kod för både Dog och Cat.
//Om vi lägger till en ny djurtyp måste vi ändra AnimalPrinter.

