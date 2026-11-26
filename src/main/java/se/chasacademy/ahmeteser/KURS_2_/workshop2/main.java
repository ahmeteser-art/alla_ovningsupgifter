package se.chasacademy.ahmeteser.KURS_2_.workshop2;

public class main {

    static void main() {

        Animal  dog = new Dog("Max");
        Animal  cat = new Cat("Luna");
        Animal bird = new Bird("Leyla");


        AnimalPrinter printer = new AnimalPrinter();

        System.out.println(printer.describe(dog));
        System.out.println(printer.describe(cat));

IO.println("_______________________________________");
IO.println("_______________________________________");
IO.println("_______________________________________");


        AnimalPrinterRefactor printer2 = new AnimalPrinterRefactor();

        System.out.println(printer2.describe(dog));
        System.out.println(printer2.describe(cat));



        System.out.println(printer2.describe(bird));//utbyggbarhet genişletebilmek open close


        IO.println("_______________________________________");
        IO.println("_______________________________________");
        IO.println("_______________________________________");



        printer2.describe(new Dog("Karabas"));

        IO.println(dog.getSound());
        IO.println(bird.getSound());
        IO.println(cat.getSound());

        IO.println((new Dog("Zera")).getSound());

        IO.println("_______________________________________");
        IO.println("_______________________________________");
        IO.println("_______________________________________");

        IO.println(new Duck("Duck", () -> "honk").getSound());//quack

        Animal animalDuck = new Duck("WildZita", () -> "quack" );

        animalDuck.setSound( () -> "honk");

        IO.println(animalDuck.getSound());//honk


    }
}
/**
 1. Varför skapar vi inte ett nytt Dog-objekt?**

 Vi har redan skapat ett Dog-objekt och sparat referensen i variabeln `dog`.
 Vi ändrar bara objektets sound behavior genom `setSound()`.

 **2. Varför använder vi SoundBehavior istället för String?**

 Med SoundBehavior kan vi ändra och byta beteenden dynamiskt.
 Det ger mer flexibilitet och minskar kopplingen mellan klasserna.
 Vi använder composition istället för att skapa många olika klasser.

 **3. Varför behöver vi tester vid refactoring?**

 Vi behöver tester för att säkerställa att programmets beteende fortfarande är detsamma efter refactoring.
 Vi vill förbättra kodens struktur, läsbarhet och underhållbarhet utan att ändra funktionaliteten.
 */