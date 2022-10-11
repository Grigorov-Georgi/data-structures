import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(123);
        linkedList.add(234);
        linkedList.add(567);

        System.out.println("----------------size()-------------------");
        System.out.println("Size is: " + linkedList.size());

        System.out.println("----------------getLast()-------------------");
        System.out.println("Last node value is : " + linkedList.getLast());

        System.out.println("----------------getFirst()-------------------");
        System.out.println("First node value is : " + linkedList.getFirst());

        System.out.println("----------------iterator()-------------------");
        for (Integer integer : linkedList) {
            System.out.println(integer);
        }

        System.out.println("----------------get()-------------------");
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));

        System.out.println("----------------contains()-------------------");
        System.out.println(linkedList.contains(123));
        System.out.println(linkedList.contains(1111));
    }
}
