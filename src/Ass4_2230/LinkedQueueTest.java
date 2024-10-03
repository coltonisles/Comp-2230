package Ass4_2230;

import Ass2_2230.exceptions.EmptyCollectionException;


public class LinkedQueueTest {
    public static void main(String[] args){
        LinkedQueue<Integer> linkQ = new LinkedQueue<>();
        //empty stack initialization
        System.out.println("empty Queue: Front <- " + linkQ.toString() + " <- Rear");
        for(int i = 1; i < 6; i++){
            linkQ.enqueue(i);

        }
        System.out.println("Filled Queue: " + "Front <- " + linkQ.toString() + " <- Rear");

        //test dequeue and first
        System.out.println("-----dequeue() & first() Test-----");
        System.out.println("first Value: " + linkQ.first());
        for (int i = 1; i < 5; i++) {
            linkQ.dequeue();
        }
        System.out.println("Queue after dequeue test: " + "Front <- " + linkQ.toString() + " <- Rear");
        System.out.println("Top Value after dequeue test: " + linkQ.first());
        linkQ.dequeue();

        //test first with empty method
        System.out.println("-----first() with empty stack test-----");
        try{
            linkQ.first();
        } catch (EmptyCollectionException e) {
            System.out.println("first() throws empty collection exception correctly");
        }

        //test dequeue with empty stack
        System.out.println("-----dequeue() with empty stack test-----");
        try {
            linkQ.dequeue();
        } catch (EmptyCollectionException e) {
            System.out.println("dequeue() throws empty collection exception correctly");
        }
        System.out.println("Is the queue empty: " + linkQ.isEmpty());
        System.out.println("queue size: " + linkQ.size());

    }
}
