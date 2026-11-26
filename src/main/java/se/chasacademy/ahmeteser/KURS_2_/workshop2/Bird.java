package se.chasacademy.ahmeteser.KURS_2_.workshop2;

public class Bird extends  Animal {

    public Bird(String name) {
        super(name, ()-> "tweet");
    }

    @Override
    public String getFavoriteActivity() {
        return "Flying";
    }
    @Override
    public String movement() {
        return "Flies";
    }
}
