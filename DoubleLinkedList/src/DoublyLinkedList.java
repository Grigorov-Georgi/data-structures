import java.util.Iterator;

public class DoublyLinkedList<E> implements Iterable<E>{
    private Node<E> head;
    private Node<E> tail;
    private int size;

    private static class Node<E> {
        private E element;
        private Node<E> next;
        private Node<E> previous;

        public Node(E element) {
            this.element = element;
        }
    }

    public void addFirst(E element) {
        Node<E> newNode = new Node<>(element);

        if (head != null) {
            head.previous = newNode;
            newNode.next = head;
            head = newNode;
        }

        if (head == null) {
            head = tail = newNode;
        }

        size++;
    }

    public void addLast(E element) {
        Node<E> newElement = new Node<>(element);

        if (tail != null) {
            tail.next = newElement;
            newElement.previous = tail;
            tail = newElement;
        }

        if (tail == null) {
            head = tail = newElement;
        }
        size++;
    }

    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }
        E element = head.element;
        if (size == 1) {
            head = tail = null;
        } else {
            Node<E> newHead = this.head.next;
            newHead.previous = null;
            head.next = null;
            head = newHead;
        }
        size--;
        return element;
    }

    public E removeLast() {
        if (isEmpty()) {
            return null;
        }
        E element = tail.element;
        if (size == 1) {
            head = tail = null;
        } else {
            Node<E> newTail = this.tail.previous;
            newTail.next = null;
            tail.previous = null;
            tail = newTail;
        }
        size--;
        return element;
    }

    public E getFirst() {
        return head.element;
    }

    public E getLast() {
        return tail.element;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Iterator<E> iterator() {
        Iterator<E> iterator = new Iterator<>() {
            private Node<E> currentElement = head;

            @Override
            public boolean hasNext() {
                return currentElement != null;
            }

            @Override
            public E next() {
                if (hasNext()){
                    E element = currentElement.element;
                    currentElement = currentElement.next;
                    return element;
                }
                return null;
            }
        };

        return iterator;
    }
}
