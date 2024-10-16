package Ass5_2230;
import Ass5_2230.exceptions.*;
public class UnorderedArrayListTest {
    public static void main(String[] args) {
        ArrayUnorderedList<String> list = new ArrayUnorderedList<String>(10);

        // Test addToRear method
        System.out.println("Testing addToRear method:");
        list.addToRear("Apple");
        list.addToRear("Banana");
        list.addToRear("Cherry");
        System.out.println("List after adding to rear: " + list);
        System.out.println("Size: " + list.size());
        System.out.println();

        // Test addToFront method
        System.out.println("Testing addToFront method:");
        list.addToFront("Dragon Fruit");
        System.out.println("List after adding to front: " + list);
        System.out.println();

        // Test addAfter method
        System.out.println("Testing addAfter method:");
        list.addAfter("Elderberry", "Banana");
        System.out.println("List after adding 'Elderberry' after 'Banana': " + list);
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
        System.out.println("Contains 'Banana': " + list.contains("Banana"));
        System.out.println("Contains 'Pear': " + list.contains("Pear"));
        System.out.println();

        // Test iterator
        System.out.println("Testing iterator:");
        System.out.print("Elements: ");
        for (String element : list) {
            System.out.print(element + " ");
        }
        System.out.println("\n");

        // Test remove by element
        System.out.println("Testing remove by element:");
        System.out.println("Removing 'Banana': " + list.remove("Banana"));
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

        // Test addAfter with non-existent target
        System.out.println("\nTesting addAfter with non-existent target:");
        try {
            list.addToRear("Apple");
            list.addAfter("Grape", "Pear");
        } catch (ElementNotFoundException e) {
            System.out.println("The ElementNotFoundException is thrown correctly");
        }
    }
}