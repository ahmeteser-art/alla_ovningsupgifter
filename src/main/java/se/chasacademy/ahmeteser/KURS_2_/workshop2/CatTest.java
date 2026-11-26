package se.chasacademy.ahmeteser.KURS_2_.workshop2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void shouldReturnCatName() {

        Cat cat = new Cat("Luna");

        assertEquals("Luna", cat.getName());
    }
    @Test
    void shouldReturnMeowSound() {

        // Arrange
        Cat cat = new Cat("Luna");

        // Act
        String sound = cat.getSound();

        // Assert
        assertEquals("meow", sound);
    }
    @Test
    void shouldReturnFavoriteActivity(){
        // Arrange
        Cat cat = new Cat("Luna");

        // Act
        String activity  = cat.getFavoriteActivity();

        // Assert
        assertEquals("Sleeping",activity );
    }
    @Test
    void shouldReturnMovement(){

        // Arrange
        Cat cat = new Cat("Luna");

        // Act
        String movement = cat.movement();

        // Assert
        assertEquals("Walks",movement );

    }
}