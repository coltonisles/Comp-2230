package Ass4_2230;

public class ArrQTest {
    public static void main(String[] args){
        CircularArrayQueue<Integer> arrQ = new CircularArrayQueue<>(5);

        arrQ.enqueue(1);
        arrQ.enqueue(2);
        arrQ.enqueue(3);
        arrQ.enqueue(4);
        arrQ.enqueue(5);
        System.out.println(arrQ.toString());
        System.out.println("next: " + arrQ.first());
        System.out.println("size: " + arrQ.size());
        arrQ.enqueue(6);
        System.out.println(arrQ.toString());
        System.out.println("next: " + arrQ.first());
        System.out.println("size: " + arrQ.size());
        arrQ.dequeue();
        arrQ.dequeue();
        arrQ.dequeue();
        arrQ.dequeue();
        System.out.println(arrQ.toString());
        System.out.println("next: " + arrQ.first());
        System.out.println("size: " + arrQ.size());
        arrQ.enqueue(1);
        arrQ.enqueue(2);
        arrQ.enqueue(3);
        arrQ.enqueue(4);
        arrQ.enqueue(5);
        System.out.println(arrQ.toString());
        System.out.println("next: " + arrQ.first());
        System.out.println("size: " + arrQ.size());

    }
}
