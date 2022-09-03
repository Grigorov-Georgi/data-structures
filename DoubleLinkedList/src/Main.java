import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        System.out.println(list.isEmpty());

        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addFirst(0);

//        System.out.println(list.removeFirst());
//        System.out.println(list.removeFirst());
//        System.out.println(list.removeFirst());
//
//        list.addLast(4);
//        list.addLast(5);
//
//        System.out.println(list.removeLast());
//
//        System.out.println(list.getFirst());
//        System.out.println(list.getLast());
//
//        System.out.println(list.isEmpty());
//
//        System.out.println(list.size());

        for (Integer integer : list) {
            System.out.println("Numbers in list: " + integer);
        }

//        Iterator<Integer> iterator = list.iterator();
//
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

    }
}
