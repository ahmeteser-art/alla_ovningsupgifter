package se.chasacademy.ahmeteser.fritidslagret.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestGenerics {

    public static void main(String[] args) {

        Integer[] numbers = {10, 20, 30, 40, 50};

        Double[] decimals = {1.5, 2.5, 3.5, 4.5, 5.5};

        Character[] characters = {'A', 'B', 'C', 'D', 'E'};

        String[] strings = {"Java", "Python", "SQL", "Wooden Spoon"};

        IO.println("__________________________");
        IO.println("__________________________");
        IO.println("static method anrop");
//        Generics.printEach(numbers);
//        Generics.printEach(decimals);
//        Generics.printEach(characters);
//        Generics.printEach(strings);

        IO.println("__________________________");
        IO.println("__________________________");
        IO.println("objeckt instance anrop");
//        Generics generics = new Generics();
//        generics.printEach(numbers);
//        generics.printEach(decimals);
//        generics.printEach(characters);
//        generics.printEach(strings);

        IO.println("__________________________");
        IO.println("__________________________");


        List<Integer> list = new ArrayList<>();
        //list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        list.addAll(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

//        Generics.printEach(list);
        Generics <Integer> generics = new Generics<>();
        generics.printEach(list);
        generics.printEach(numbers);

        Generics <String> stringsobj = new Generics<>();
        stringsobj.printEach(strings);


    }
}
