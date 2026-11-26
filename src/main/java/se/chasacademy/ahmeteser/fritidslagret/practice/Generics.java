package se.chasacademy.ahmeteser.fritidslagret.practice;

import java.util.List;

public class Generics<T> {

    //generics -> parameterized types- same code with different types
    //we can apply class method and interfaces
    //if we give generic type to them we have to specify exact type  later on when we create object of them
    // by using generics we will be able to achieve type safety and code reusability in java
    //T blir dynamic in runtime and we can use any type of data in it
    String name = "Yavuz";
    Integer age = 31;

//   Object d <String> = "Yavuz";
//   Object d <String> = "Yavuz";

//    public static void printEach(Integer[] array) {
//        for (Integer each : array) {
//            System.out.println(each);
//        }
//    }
//
//    public static void printEach(Character[] array) {
//        for (Character each : array) {
//            System.out.println(each);
//        }
//    }
//
//    public static void printEach(Double[] array) {
//        for (Double each : array) {
//            System.out.println(each);
//        }
//    }
//
//    public static void printEach(String[] array) {
//        for (String each : array) {
//            System.out.println(each);
//        }
//
//    }

    public void printEach(T[] array) {
        for (T each : array) {
            IO.println(each);
        }
    }
    public void printEach(List<T> list){
        for (T t : list) {
            IO.println(t);
        }


    }
}
