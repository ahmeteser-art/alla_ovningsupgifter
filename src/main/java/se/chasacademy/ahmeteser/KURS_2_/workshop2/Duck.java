package se.chasacademy.ahmeteser.KURS_2_.workshop2;

public class Duck extends Animal {

    public Duck(String name, SoundBehavior sound) {
        super(name, () -> "quack");
    }

    @Override
    public String getFavoriteActivity() {
        return "Swimming";
    }

    @Override
    public void setSound(SoundBehavior sound) {
        super.setSound(sound);
    }

    @Override
    public String movement() {
        return "Swim";
    }
}