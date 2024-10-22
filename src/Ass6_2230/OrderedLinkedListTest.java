package Ass6_2230;

public class OrderedLinkedListTest {
    public static void main(String[] args) {
        // Create new list
        OrderedLinkedList<Integer> list = new OrderedLinkedList<Integer>();

        System.out.println("Testing sorted add method:");
        System.out.println("--------------------------");

        System.out.println(list.toString());
        list.add(1);
        System.out.println(list.toString());
        list.add(2);
        System.out.println(list.toString());

    }

}

