package Ass4_2230;

public class LinkedQueueTest {
    public static void main(String[] args){
        LinkedQueue<Integer> lqueue = new LinkedQueue<Integer>();

        lqueue.enqueue(1);
        lqueue.enqueue(2);
        lqueue.enqueue(3);
        System.out.println(lqueue.toString());
        System.out.println("next in line: " + lqueue.first());
        System.out.println("line size: " + lqueue.size());
        lqueue.dequeue();
        System.out.println(lqueue.toString());
        System.out.println("next in line: " + lqueue.first());
        System.out.println("line size: " + lqueue.size());
        lqueue.dequeue();
        System.out.println(lqueue.toString());
        System.out.println("next in line: " + lqueue.first());
        System.out.println("line size: " + lqueue.size());
        lqueue.dequeue();
        System.out.println(lqueue.toString());
        System.out.println("line size: " + lqueue.size());
        lqueue.dequeue();
        System.out.println(lqueue.toString());
    }
}
