package lesson2.arraylist;

import lesson2.ICollection;


public interface ArrayList<E> extends ICollection {
    void add(E value);

    default void addAll(E... values) {
        for (E value : values) {
            add(value);
        }
    }

    boolean remove(E value);
    boolean remove(int index);
    E get(int index);
    boolean contains(E value);
    int indexOf(E value);
    void display();
}
