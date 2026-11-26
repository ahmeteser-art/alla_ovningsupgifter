package se.chasacademy.ahmeteser.KURS_2_.workshop2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BirdTest {

    @Test
    void shouldReturnBirdName() {

        // Arrange
       Bird bird = new Bird("Rio");

        // Act
        String name = bird.getName();

        // Assert
        assertEquals("Rio", name);
    }
    @Test
    void shouldReturnBirdSound() {

        // Arrange
        Bird bird = new Bird("Rio");


        // Act
        String sound = bird.getSound();

        // Assert
        assertEquals("tweet", sound);
    }
    @Test
    void shouldReturnFavoriteActivity(){
        // Arrange
        Bird bird = new Bird("Rio");

        // Act
        String activity  = bird.getFavoriteActivity();

        // Assert
        assertEquals("Flying",activity );
    }
    @Test
    void shouldReturnMovement(){

        // Arrange
        Bird bird = new Bird("Rio");

        // Act
        String movement = bird.movement();

        // Assert
        assertEquals("Flies",movement );

    }
}
