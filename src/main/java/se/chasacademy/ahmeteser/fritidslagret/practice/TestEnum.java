package se.chasacademy.ahmeteser.fritidslagret.practice;

import com.github.javafaker.Faker;

import java.util.Arrays;

public class TestEnum {

    static void main() {

        String day = "MONDAY";

        Day day1 = Day.MONDAY;

        Day days = Day.MONDAY;

//        Faker fake = new Faker();
//
//        fake.name().firstName();

//fixed set of  number of element -> enum
// case block, desaicion makin each block they have own value,
        String weekofdays = switch (days) {
            case MONDAY -> "Today is Monday";
            case TUESDAY -> "Today is Tuesday";
            case WEDNESDAY -> "Today is Wednesday";
            case THURSDAY -> "Today is Thursday";
            case FRIDAY -> "Today is Friday";
            case SATURDAY -> "Today is Saturday";
            case SUNDAY -> "Today is Sunday";
        };

        IO.println(weekofdays);

       Day[]  weekdays = Day.values();
        IO.println(Arrays.toString(weekdays));
    }
}
