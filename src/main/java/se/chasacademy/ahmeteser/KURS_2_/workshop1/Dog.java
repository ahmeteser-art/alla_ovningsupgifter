package se.chasacademy.ahmeteser.KURS_2_.workshop1;

public class Dog extends Animal {
    @Override
    public String sound() {
        return "Woof";
    }
    public void fetch() {
        System.out.println("Fetching");
    }
}
