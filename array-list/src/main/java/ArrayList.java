import java.util.Iterator;

public class ArrayList<E> implements Iterable<E>{
    private final int INITIAL_CAPACITY = 4;
    private Object[] array = new Object[INITIAL_CAPACITY];
    private int size = 0;

    public E get(int index) {
        if (checkIfInBounds(index)) {
            return (E) array[index];
        }
        return null;
    }

    public boolean add(E element) {
        array[size++] = element;

        if (size >= array.length) {
            Object[] newArray = new Object[size * 2];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }

        return true;
    }

    public boolean remove(int index) {
        if (checkIfInBounds(index)) {
            System.arraycopy(array, index + 1, array, index, size-- - index - 1);
            return true;
        }
        return false;
    }

    public boolean set(int index, E value) {
        if (checkIfInBounds(index)) {
            array[index] = value;
            return true;
        }
        return false;
    }

    public int contains(E value){
        for (int i = 0; i < size; i++) {
            if (array[i] == value){
                return i;
            }
        }
        return -1;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty(){
        if (size == 0){
            return true;
        }
        return false;
    }

    private boolean checkIfInBounds(int index) {
        if (index < 0 || index >= array.length) {
            return false;
        }
        return true;
    }

    @Override
    public Iterator<E> iterator() {
        Iterator<E> iterator = new Iterator<E>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size && array[currentIndex] != null;
            }

            @Override
            public E next() {
                return (E) array[currentIndex++];
            }
        };
        return iterator;
    }
}
