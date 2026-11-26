package se.chasacademy.ahmeteser.KURS_2_.workshop2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void shouldReturnDogName() {

        // Arrange
        Dog dog = new Dog("Max");

        // Act
        String name = dog.getName();

        // Assert
        assertEquals("Max", name);
    }
    @Test
    void shouldReturnWoofSound() {

        // Arrange
        Dog dog = new Dog("Max");

        // Act
        String sound = dog.getSound();

        // Assert
        assertEquals("woof", sound);
    }
    @Test
    void shouldReturnFavoriteActivity(){
        // Arrange
        Dog dog = new Dog("Max");

        // Act
        String activity  = dog.getFavoriteActivity();

        // Assert
        assertEquals("Playing fetch",activity );
    }
    @Test
    void shouldReturnMovement(){

        // Arrange
        Dog dog = new Dog("Max");

        // Act
        String movement = dog.movement();

        // Assert
        assertEquals("Runs",movement );

    }
    @Test
    void shouldChangeSoundBehavior(){

        // Arrange
        Dog dog = new Dog("Max");

        // Assert initial behavior
        assertEquals("woof", dog.getSound());

        // Act
        dog.setSound(()-> "honk");

//        SoundBehavior soundBehavior = new SoundBehavior() {
//            @Override
//            public String makeSound() {
//                return "honk";
//            }
//        };

        // Assert changed behavior
        assertEquals("honk", dog.getSound() );//Dynamiskt beteende
        // -Dog sınıfını değiştirmedik. Yeni bir Dog sınıfı da oluşturmadık. Sadece nesnenin sahip olduğu davranışı değiştirdik.
    }
}