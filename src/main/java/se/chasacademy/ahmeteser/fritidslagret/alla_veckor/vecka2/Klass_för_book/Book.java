package se.chasacademy.ahmeteser.fritidslagret.alla_veckor.vecka2.Klass_för_book;

public class Book {

    /*

    Uppgift 4: Klass för bok
    Skapa en klass Book.
    Krav:

    Skapa i en separat fil Book.java
    Fält för titel och författare
    Parameteriserad konstruktor
    Getters
    toString()
    Exempelutskrift av en bok:

    Sagan om ringen av J.R.R. Tolkien
    Skapa tre böcker och lagra dem i en array.
    Skriv sedan ut alla böcker med en for-each-loop.
     */
    private String title;
    private String author;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return title + " av " + author;
    }

    public Book(String title, String author) {
        this.author = author;
        this.title = title;


    }

}
