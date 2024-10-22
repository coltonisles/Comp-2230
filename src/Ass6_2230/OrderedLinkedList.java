package Ass6_2230;

public class OrderedLinkedList<T extends Comparable<T>> {
    private int count;
    private LinearNode<T> head, tail;

    public OrderedLinkedList(){
        count = 0;
        head = tail = null;

    }
    public void add(T element){
        LinearNode<T> node = new LinearNode<T>(element);
        if(count == 0){
            head = tail = node;
        } else if(count == 1){
            tail.setNext(node);
            tail = node;
        } else if(element.compareTo(head.getNext().getElement()) <= 0){
            node.setNext(head);
            head = node;
        } else if(element.compareTo(tail.getElement()) >= 0){
            tail.setNext(node);
            tail = node;
        } else {
            LinearNode<T> current = head;
            while(current.getNext() != null && element.compareTo(current.getNext().getElement()) > 0){
                current = current.getNext();
            }
            node.setNext(current.getNext());
            current.setNext(node);
        }
        count++;

    }
    public void delete(T element){

    }

    public String toString(){
        if(count == 0){
            return "Empty List";
        }
        StringBuilder result = new StringBuilder();
        LinearNode<T> current = head;
        for (int i = 1; i <= count; i++) {
            result.append(current.getElement()).append(", ");
            current = current.getNext();
        }
        result.deleteCharAt(result.length()-2);
        return result.toString();
    }

}
