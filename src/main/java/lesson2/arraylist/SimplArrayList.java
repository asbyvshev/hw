package lesson2.arraylist;

import java.util.Arrays;

public class SimplArrayList<E> implements ArrayList<E> {

    private static final int DEFAULT_CAPACITY = 16;

    protected E[] data;
    protected int size;

    public SimplArrayList() {this(DEFAULT_CAPACITY);}

    public SimplArrayList(int defaultCapacity) {
        this.data = (E[]) new Object[DEFAULT_CAPACITY];
    }

    @Override
    public void add(E value) {
        if (value == null) {
            throw new IllegalArgumentException("Not null value is required");
        }
        checkGrow();
        data[size++] = value;
    }

    protected void checkGrow() {
        if (size == data.length) {
            data = grow();
        }
    }

    private E[] grow() {
        return Arrays.copyOf(data, data.length * 2);
    }

    @Override
    public boolean remove(E value) {
        return remove(indexOf(value));
    }

    @Override
    public boolean remove(int index) {
        if (index < 0 || index >= size) {
            return false;
        }

        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }

        data[--size] = null;
        return true;
    }

    @Override
    public E get(int index) {
        if (index > 0 && index < size) {
            return data[index];
        }
        return null;
    }

    @Override
    public boolean contains(E value) {
        return indexOf(value) != -1;
    }

    @Override
    public int indexOf(E value) {
        if (value == null) {
            return -1;
        }
        for (int i = 0; i < size; i++) {
            if (data[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(data[i]);
        }
        System.out.println("--------");
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    public E[] getArray() {
        return Arrays.copyOf(data, size);
    }
}
