package Ass5_2230;
import Ass5_2230.exceptions.*;
public class OrderedListTest {
    public static void main(String[] args) {
        ArrayOrderedList<Integer> list = new ArrayOrderedList<Integer>(5);

        // Test add method and expand capacity
        System.out.println("Testing add method and expand capacity:");
        list.add(7);
        list.add(85);
        list.add(1);
        list.add(15);
        list.add(7);
        list.add(42);
        System.out.println("List after adding: " + list);
        System.out.println("Size: " + list.size());
        System.out.println();

        // Test first and last methods
        System.out.println("Testing first and last methods:");
        System.out.println("First element: " + list.first());
        System.out.println("Last element: " + list.last());
        System.out.println();

        // Test remove methods
        System.out.println("Testing remove methods:");
        System.out.println("Removed first element: " + list.removeFirst());
        System.out.println("Removed last element: " + list.removeLast());
        System.out.println("List after removals: " + list);
        System.out.println();

        // Test contains method
        System.out.println("Testing contains method:");
        System.out.println("Contains 15: " + list.contains(15));
        System.out.println("Contains 102: " + list.contains(102));
        System.out.println();

        // Test iterator
        System.out.println("Testing iterator:");
        System.out.print("Elements: ");
        for (Integer element : list) {
            System.out.print(element + " ");
        }
        System.out.println("\n");

        // Test remove by element
        System.out.println("Testing remove by element:");
        System.out.println("Removing 15: " + list.remove(15));
        System.out.println("List after removal: " + list);
        System.out.println();

        // Test empty list behavior
        System.out.println("Testing empty list behavior:");
        try {
            while (!list.isEmpty()) {
                list.removeLast();
            }
            System.out.println("List is empty: " + list.isEmpty());
            list.first(); // This should throw an exception
        } catch (EmptyCollectionException e) {
            System.out.println("The EmptyCollectionException is thrown correctly");
        }

    }
}
