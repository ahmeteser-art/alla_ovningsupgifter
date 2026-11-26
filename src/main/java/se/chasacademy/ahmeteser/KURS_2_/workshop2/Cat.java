package se.chasacademy.ahmeteser.KURS_2_.workshop2;

public class Cat extends Animal{
    public Cat(String name) {
        super(name, () -> "meow");
    }

    @Override
    public String getFavoriteActivity() {
        return "Sleeping";
    }
    @Override
    public String movement() {
        return "Walks";
    }
}
