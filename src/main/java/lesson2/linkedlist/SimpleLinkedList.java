package lesson2.linkedlist;

public class SimpleLinkedList<E> implements LinkedList<E> {
    protected Entry<E> firstElement;
    protected int size;

    public void insertFirst(E value) {
        Entry<E> entry = new Entry<E>(value);
        entry.next = firstElement;
        firstElement = entry;
        size++;
    }

    public E removeFirst() {
        if (isEmpty()) { return null; }
        E value = firstElement.value;
        firstElement = firstElement.next;
        size--;
        return value;
    }

    public boolean remove(E value) {
        Entry<E> previous = null;
        Entry<E> current = firstElement;
        while (current != null) {
            if (current.value.equals(value)) {
                break;
            }

            previous = current;
            current = current.next;
        }

        if (current == null) {
            return false;
        }

        if (current == firstElement) {
            firstElement = current.next;
        } else {
            previous.next = current.next;
        }

        size--;
        return true;
    }

    public boolean contains(E value) {
        Entry<E> current = firstElement;
        while (current != null) {
            if (current.value.equals(value)) {
                return true;
            } else {
                current = current.next;
            }
        }
        return false;
    }

    public void display() {
        System.out.println("--------");
        Entry<E> current = firstElement;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
        System.out.println("--------");
    }

    public E getFirstValue() {
        return firstElement != null ? firstElement.value : null;
    }

    public boolean isEmpty() {
        return firstElement == null;
    }

    public int size() {
        return size;
    }

    public boolean isFull() {
        return false;
    }
}
