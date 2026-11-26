package se.chasacademy.ahmeteser.KURS_2_.workshop2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class AnimalPrinterRefactorTest {

    @Test
    void shouldDescribeDogCorrectly(){

//Arrange –
        AnimalPrinterRefactor animalPrinterRefactor = new AnimalPrinterRefactor();
// Act –
        String result =animalPrinterRefactor.describe(new Dog("Max"));
// Assert
        Assertions.assertEquals("Max", new Dog("Max").getName());
        Assertions.assertEquals("woof", new Dog("Max").getSound());
        Assertions.assertEquals("Playing fetch", new Dog("Max").getFavoriteActivity());

        Dog dog = new Dog("Max");

        dog.setSound(() -> "DENEMEEEE");

        IO.println(dog.getSound());

        Assertions.assertEquals("Name: Max, sound: woof, activity: Playing fetch",result);
        //Name: Max, sound: woof, activity: Playing fetch
    }
    @Test
    void shouldDescribeCatCorrectly(){
        //Arrange –
        AnimalPrinterRefactor animalPrinterRefactor = new AnimalPrinterRefactor();
        // Act –
        String result =animalPrinterRefactor.describe(new Cat("Luna"));
        // Assert
        Assertions.assertEquals("Name: Luna, sound: meow, activity: Sleeping",result);
    }
    @Test
    void shouldDescribeBirdCorrectly(){
        //Arrange –
        AnimalPrinterRefactor animalPrinterRefactor = new AnimalPrinterRefactor();
        // Act –
        String result =animalPrinterRefactor.describe(new Bird("Rio"));
        // Assert
        Assertions.assertEquals("Name: Rio, sound: tweet, activity: Flying",result);
    }
}
