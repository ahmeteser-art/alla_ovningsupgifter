package se.chasacademy.ahmeteser.KURS_2_.vecka1_2.model1;
import se.chasacademy.ahmeteser.KURS_2_.vecka1_2.model1.Teacher;

import java.util.List;

public class main {

    void main(){

        Shelf<BookShelf> bookShelf = new Shelf<>();
        Shelf<MovieShelf> movieShelf = new Shelf<>();
        Shelf<GameShelf> gameShelf = new Shelf<>();
        Shelf<Integer> gameShelfInt = new Shelf<>();
        Shelf<String> gameShelfString = new Shelf<>();
        Shelf<Boolean> gameShelfBoolean = new Shelf<>();
        Shelf<List> gameShelist = new Shelf<>();



        //En generisk klass, Shelf<T>, kan återanvändas för olika typer av objekt.
        // Vi behöver inte skriva samma kod flera gånger för BookShelf, MovieShelf och GameShelf.
        // Generics ger också bättre typsäkerhet.

        System.out.println("========== REGISTRY ==========");

        Registry<Student> studentRegistry = new Registry<>();

        studentRegistry.register(new Student("Anna"));
        studentRegistry.register(new Student("Yavuz"));

        System.out.println(studentRegistry.get(0));
        System.out.println(studentRegistry.get(1));
        System.out.println("Student count: " + studentRegistry.size());

        System.out.println("------------------------------");
        System.out.println("------------------------------");
        System.out.println("------------------------------");

        Registry<Teacher> teacherRegistry = new Registry<>();

        teacherRegistry.register(new Teacher("Ahmet"));
        teacherRegistry.register(new Teacher("Maria"));

        System.out.println(teacherRegistry.get(0));
        System.out.println(teacherRegistry.get(1));
        System.out.println("Teacher count: " + teacherRegistry.size());

        System.out.println("========== CHECK-IN QUEUE ==========");

        CheckInQueue<Student> studentQueue = new CheckInQueue<>();

        studentQueue.add(new Student("Anna"));
        studentQueue.add(new Student("Yavuz"));

        System.out.println("First student: " + studentQueue.peek());
        System.out.println("Queue size: " + studentQueue.size());

        System.out.println("------------------------------------");
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");

        CheckInQueue<Teacher> teacherQueue = new CheckInQueue<>();

        teacherQueue.add(new Teacher("Ahmet"));
        teacherQueue.add(new Teacher("Maria"));

        System.out.println("First teacher: " + teacherQueue.peek());
        System.out.println("Queue size: " + teacherQueue.size());


    }
}
