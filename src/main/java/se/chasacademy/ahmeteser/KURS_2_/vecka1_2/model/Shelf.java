package se.chasacademy.ahmeteser.KURS_2_.vecka1_2.model;

import java.util.ArrayList;
import java.util.List;

public class Shelf {

    private List<Object> items = new ArrayList<>();

    public void add(Object item) {
        items.add(item);
    }

    public Object get(int index) {
        return items.get(index);
    }

    public int size() {
        return items.size();
    }
}