package Ass6_2230;

import Ass6_2230.Exceptions.ElementNotFoundException;

public class OrderedLinkedListTest {
    public static void main(String[] args) {
        // Create new list
        OrderedLinkedList<Integer> list = new OrderedLinkedList<Integer>();

        System.out.println("Testing sorted add method:");
        System.out.println("--------------------------");

        System.out.println(list.toString());
        list.add(2);
        System.out.println(list.toString());
        list.add(9);
        System.out.println(list.toString());
        list.add(1);
        System.out.println(list.toString());
        list.add(6);
        System.out.println(list.toString());
        list.add(8);
        System.out.println(list.toString());
        list.add(4);
        System.out.println(list.toString());
        list.add(3);
        System.out.println(list.toString());
        list.add(5);

        System.out.println("Testing delete method:");
        System.out.println("--------------------------");
        System.out.println(list.toString());
        list.delete(6);
        System.out.println(list.toString());
        list.delete(1);
        System.out.println(list.toString());
        list.delete(9);
        System.out.println(list.toString());
        System.out.println("Trying to delete absent element:");
        System.out.println("--------------------------");
        try {
            list.delete(11);
        } catch (ElementNotFoundException e) {
            System.out.println("Throws ElementNotFoundException correctly.");
        }

    }

}

