package se.chasacademy.ahmeteser.fritidslagret.alla_veckor.vecka2.Klass_för_book;

public class Klass_for_book {

    void main() {

        Book books[] = new Book [3];

        books[0] = new Book ("Sagan om ringen", "J.R.R. Tolkien");
        books[1] =  new Book ("Harry Potter", "J.K. Rowling");
        books[2] =  new Book ("1984", "George Orwell");

     //   IO.println("book: " + books[0][0] + ", author: " + books[0][1]  );
     //   IO.println("book: " + books[1][0] + ", author: " + books[1][1]  );
     //   IO.println("book: " + books[2][0] + ", author: " + books[2][1]  );

        for (Book book : books) {
            IO.println(book);
        }
    }

}
