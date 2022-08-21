import java.util.Iterator;

public class LinkedList<E> implements Iterable<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

    public void add(E element) {
        Node<E> newNode = new Node<>(element, null, tail);
        if (head == null) {
            head = newNode;
        }

        if (tail != null) {
            tail.setNext(newNode);
        }

        tail = newNode;
        size++;
    }

    public void remove(Node<E> node) {
        if (node.getPrevious() != null) {
            node.getPrevious().setNext(node.getNext());
        }

        if (head == node) {
            head = node.getNext();
        }

        if (tail == node) {
            tail = node.getPrevious();
        }

        if (node.getNext() != null) {
            node.getNext().setPrevious(node.getPrevious());
        }
    }

    public E getLast() {
        return tail.getElement();
    }

    public E getFirst() {
        return head.getElement();
    }

    public E get(int index){
        if (index >= 0 || index < size){
            int currentIndex = 0;

            Iterator<E> iterator = iterator();
            while (iterator.hasNext()){
                E current = iterator.next();
                if (index == currentIndex){
                    return current;
                }
                currentIndex++;
            }
        }
        return null;
    }

    public boolean contains(E element){
        Iterator<E> iterator = iterator();
        while (iterator.hasNext()){
            E current = iterator.next();
            if (element == current){
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        Iterator<E> iterator = new Iterator<E>() {

            private Node<E> currentNode = head;

            @Override
            public boolean hasNext() {
                return currentNode != null;
            }

            @Override
            public E next() {
                if (hasNext()) {
                    E data = currentNode.getElement();
                    currentNode = currentNode.getNext();
                    return data;
                }
                return null;
            }
        };

        return iterator;
    }
}
