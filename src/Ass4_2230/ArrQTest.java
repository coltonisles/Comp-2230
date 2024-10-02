package Ass4_2230;

import Ass2_2230.exceptions.EmptyCollectionException;

import java.util.Arrays;

public class ArrQTest {
    public static void main(String[] args) {
        CircularArrayQueue<Integer> arrq = new CircularArrayQueue<>(5);

        // Initialization with null values and capacity 5
        System.out.println("Current Queue: Front <- " + arrq.toString() + " <- Rear");

        // Populate the queue to fill the initial capacity
        for (int i = 1; i <= 5; i++) {
            arrq.enqueue(i);
        }
        System.out.println("Current Queue: Front <- " + arrq.toString() + " <- Rear");

        // Test isEmpty and size
        System.out.println("Is the queue empty: " + arrq.isEmpty());
        System.out.println("Queue size: " + arrq.size());

        // Test expandCapacity() method
        System.out.println("-----expandCapacity() Test-----");
        for (int i = 6; i <= 10; i++) {
            arrq.enqueue(i);
        }
        System.out.println("Current Queue: Front <- " + arrq.toString() + " <- Rear");

        // Test dequeue() and first() methods
        System.out.println("-----dequeue() & first() Test-----");
        System.out.println("First Value before dequeue: " + arrq.first());
        System.out.println("Queue before dequeue: Front <- " + arrq.toString() + " <- Rear");
        for (int i = 0; i < 5; i++) {
            arrq.dequeue();
        }
        System.out.println("First Value after dequeue half the queue: " + arrq.first());
        System.out.println("Queue after dequeue half the queue: Front <- " + arrq.toString() + " <- Rear");
        for (int i = 0; i < 5; i++) {
            arrq.dequeue();
        }
        System.out.println("First Value after dequeue the entire queue: " + arrq.first());
        System.out.println("Queue after dequeue the entire queue: Front <- " + arrq.toString() + " <- Rear");

        // Test first() with empty queue
        System.out.println("-----first() with empty queue test-----");
        try {
            arrq.first();
        } catch (EmptyCollectionException ece) {
            System.out.println("first() throws empty collection exception correctly");
        }

        // Test dequeue() with empty queue
        System.out.println("-----dequeue() with empty queue test-----");
        try {
            arrq.dequeue();
        } catch (EmptyCollectionException ece) {
            System.out.println("dequeue() throws empty collection exception correctly");
        }

        // Final checks
        System.out.println("Is the queue empty: " + arrq.isEmpty());
        System.out.println("Queue size: " + arrq.size());
    }
}