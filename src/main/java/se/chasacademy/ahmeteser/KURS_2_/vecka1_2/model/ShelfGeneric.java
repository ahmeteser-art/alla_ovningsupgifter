package se.chasacademy.ahmeteser.KURS_2_.vecka1_2.model;

import java.util.ArrayList;
import java.util.List;

public class ShelfGeneric <T> {

    private List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public T get(int index) {
        return items.get(index);
    }
    public int size() {
        return items.size();
    }
}
