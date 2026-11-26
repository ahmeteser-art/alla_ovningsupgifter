package se.chasacademy.ahmeteser.KURS_2_.vecka1_2.model1;

import java.util.ArrayList;
import java.util.List;

public class BookShelf {
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
