public class Node<E>{
    private E element;
    private Node<E> next;
    private Node<E> previous;

    public Node(E element, Node<E> next, Node<E> previous) {
        this.element = element;
        this.next = next;
        this.previous = previous;
    }

    public E getElement() {
        return element;
    }

    public Node<E> getNext() {
        return next;
    }

    public Node<E> getPrevious() {
        return previous;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public void setPrevious(Node<E> previous) {
        this.previous = previous;
    }
}
