package se.chasacademy.ahmeteser.fritidslagret.alla_veckor.vecka2.metoder_pssByValue;

public class Person {

    /*
    Uppgift 5: Metoder och pass-by-value
    Skapa en klass Person.
    Krav:

    Skapa i en separat fil Person.java
        Fält för namn och ålder
    En statisk metod birthday
    inget returvärde
    argument: Person person
    Metoden ökar personens ålder med 1
    En statisk metod createPerson
    returnerar Person
    argument: String name
    argument: int age
    Metoden skapar en ny Person med givna argument
    Observera: klassen Person måste skapas i en egen separat fil, och inte i en Java Compact File.

    Skriv sedan en main-metod som anropar båda metoderna.
     */
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    static void birthday (Person person){
        person.age+=1;
    }
    static Person createPerson (String name, int age){
        return new Person(name,age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
