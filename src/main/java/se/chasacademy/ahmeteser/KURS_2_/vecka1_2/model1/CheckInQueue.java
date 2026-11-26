
package se.chasacademy.ahmeteser.KURS_2_.vecka1_2.model1;

import java.util.LinkedList;
import java.util.Queue;

public class CheckInQueue<T> {

    private Queue<T> items = new LinkedList<>();

    public void add(T item) {
        items.add(item);
    }

    public T peek() {
        return items.peek();
    }

    public int size() {
        return items.size();
    }
}
