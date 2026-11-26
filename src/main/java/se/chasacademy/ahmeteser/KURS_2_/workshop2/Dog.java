package se.chasacademy.ahmeteser.KURS_2_.workshop2;

public class Dog extends Animal {
    public Dog(String name) {
        super(name, ()-> "woof");
    }

    @Override
    public String getFavoriteActivity() {
        return "Playing fetch";
    }
    @Override
    public String movement() {
        return "Runs";
    }

}
//SoundBehavior sound = new SoundBehavior() {
//
//    @Override
//    public String makeSound() {                   --->>>>>>>>>         SoundBehavior sound = () -> "woof";
//        return "woof";
//    }
//};

//public String makeSound() {
//    return "woof";
//}