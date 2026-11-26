package se.chasacademy.ahmeteser.KURS_2_.vecka1_2.model;

import java.util.Arrays;

public class mainn {

    void main() {

        //BOK

        Book book1 = new Book("Clean Code", "Robert C. Martin");
        Book book2 = new Book("Clean Code", "Robert C. Martin");
        Book book3 = new Book("Clean Code", "Robert C. Martin");
        Book book4 = new Book("Clean Code", "Robert C. Martin");

        //SHELF
        Shelf shelf = new Shelf();

        shelf.add(new Book("Harry Potter", "Stepen King"));
        shelf.add("Hello World!");
        shelf.add(22);

        IO.println(shelf.size());

        //SHELF GENERICS
        ShelfGeneric<Book> bookShelfGeneric = new ShelfGeneric<>();

        bookShelfGeneric.add(new Book("Clean Code", "Robert C. Martin"));
        bookShelfGeneric.add(new Book("Pragmatic Programmer", "Andrew Hunt"));

        Book bookGe = bookShelfGeneric.get(0);

        IO.println(bookGe.toString());

        IO.println(bookShelfGeneric.size());

        IO.println("-------------------------------------------------------");
        IO.println("-------------------------------------------------------");
        IO.println("-------------------------------------------------------");

        ShelfGeneric<String> nameShelf = new ShelfGeneric<>();

        nameShelf.add("Anna");
        nameShelf.add("Yavuz");

        String sc = nameShelf.get(0);
        String scc = nameShelf.get(1);

        IO.println(sc.toString());
        IO.println(scc.toString());


        ShelfGeneric<Book> nameShelf1 = new ShelfGeneric<>();

        nameShelf1.add(new Book("Clean Code", "Robert C. Martin"));
        nameShelf1.add(new Book("Pragmatic Programmer", "Andrew Hunt"));
        Book book123 = nameShelf1.get(0);
        Book book1234 = nameShelf1.get(1);

        IO.println(book123.toString());
        IO.println(book1234.toString());

        ShelfGeneric<Integer> nameShelf12 = new ShelfGeneric<>();
        nameShelf12.add(2133);
        nameShelf12.add(1232131);
        int a = nameShelf12.get(0);
        int b = nameShelf12.get(1);

        IO.println(a);
        IO.println(b);


    }
}
