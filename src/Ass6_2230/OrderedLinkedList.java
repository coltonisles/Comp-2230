package Ass6_2230;

public class OrderedLinkedList<T extends Comparable<T>> {
    private int count;
    private LinearNode<T> head, tail;

    public OrderedLinkedList(){
        count = 0;
        head = null;

    }
    public void add(T element){
        LinearNode<T> node = new LinearNode<T>(element);
        if(count == 0){
            head = node;
        } else {
            tail.setNext(node);
        }

    }
    public void delete(T element){

    }
    public String toString(){

        return "";
    }
}
