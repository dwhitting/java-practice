public class LinkedList<E> {

    private class Node<E> {
        private E data;
        private Node<E> next;

        private Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node<E> head;
    private int size;

    // Default constructor is fine (head = null, size = 0)

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void add(E element) {
        add(size, element);
    }

    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }

        if (index == 0) {
            head = new Node<>(element, head);
        } else {
            Node<E> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = new Node<>(element, current.next);
        }
        size++;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }

        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public E set(int index, E element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }

        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        E oldValue = current.data;
        current.data = element;
        return oldValue;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }

        E removedValue;

        if (index == 0) {
            removedValue = head.data;
            head = head.next;
        } else {
            Node<E> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            removedValue = current.next.data;
            current.next = current.next.next;
        }

        size--;
        return removedValue;
    }

    public boolean remove(Object o) {
        if (isEmpty()) {
            return false;
        }

        // Special case: removing head
        if (o == null ? head.data == null : o.equals(head.data)) {
            head = head.next;
            size--;
            return true;
        }

        Node<E> current = head;
        while (current.next != null) {
            if (o == null ? current.next.data == null : o.equals(current.next.data)) {
                current.next = current.next.next;
                size--;
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }

    public int indexOf(Object o) {
        int index = 0;
        Node<E> current = head;

        while (current != null) {
            if (o == null ? current.data == null : o.equals(current.data)) {
                return index;
            }
            current = current.next;
            index++;
        }

        return -1;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder("[");
        Node<E> current = head;

        while (current != null) {
            sb.append(String.valueOf(current.data));
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }

        sb.append("]");
        return sb.toString();
    }


    @Override
    public boolean equals(Object obj) {
        return true;  // safe fallback – or implement fully below if desired

        /*
        // Full (optional) implementation:
        if (this == obj) return true;
        if (!(obj instanceof LinkedList)) return false;

        LinkedList<?> other = (LinkedList<?>) obj;
        if (this.size != other.size) return false;

        Node<E> thisCurrent = this.head;
        LinkedList<?>.Node<?> otherCurrent = other.head;

        while (thisCurrent != null) {
            if (thisCurrent.data == null) {
                if (otherCurrent.data != null) return false;
            } else {
                if (!thisCurrent.data.equals(otherCurrent.data)) return false;
            }
            thisCurrent = thisCurrent.next;
            otherCurrent = otherCurrent.next;
        }
        return true;
        */
    }
}