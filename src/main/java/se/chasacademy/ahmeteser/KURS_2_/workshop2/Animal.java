package se.chasacademy.ahmeteser.KURS_2_.workshop2;

public abstract class Animal {

    private final String name;
    private SoundBehavior sound;

    public Animal(String name, SoundBehavior sound) {
        this.name = name;
        this.sound = sound;
    }

    public abstract String getFavoriteActivity();

    public String getSound() {
        return sound.makeSound();
    }

    public String getName() {
        return name;
    }

    public void setSound(SoundBehavior sound) {
        this.sound = sound;
    }
    public abstract String movement();
}
