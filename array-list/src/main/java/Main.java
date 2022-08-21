public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Is list empty in beginning: " + list.isEmpty());
        System.out.println("***********Adding elements***********");
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element " + i + ": " + list.get(i));
        }
        System.out.println("Size of list after adding is: " + list.size());
        System.out.println("***********Removing 3 elements***********");
        list.remove(1);
        list.remove(1);
        list.remove(1);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element " + i + ": " + list.get(i));
        }
        System.out.println("Size of list after removing is: " + list.size());

        System.out.println("***********Update value of element***********");
        System.out.println("Element on index, which value we want to update: " + list.get(0));
        System.out.println("Can we add element on existing index: " + list.set(0, 21));
        System.out.println("Element on index, which value we updated: " + list.get(0));

        System.out.println("Can we add element on non-existing index: " + list.set(-1, 21));

        System.out.println("Is list empty after adding a bunch of elements: " + list.isEmpty());

        System.out.println("***********Iterator***********");
        for (Integer integer : list) {
            System.out.println(integer);
        }

    }
}
