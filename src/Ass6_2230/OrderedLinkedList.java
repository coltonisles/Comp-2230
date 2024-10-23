package Ass6_2230;

import Ass2_2230.exceptions.EmptyCollectionException;

public class OrderedLinkedList<T extends Comparable<T>> {
    private int count;
    private LinearNode<T> head, tail;

    public OrderedLinkedList(){
        count = 0;
        head = tail = null;

    }
    public void add(T element){
        LinearNode<T> node = new LinearNode<T>(element);
        if(head == null){
            head = tail = node;
            count++;
            return;
        }

        if(element.compareTo(head.getElement()) <= 0){
            node.setNext(head);
            head = node;
            count++;
            return;
        }

        LinearNode<T> current = head;
        while(current.getNext() != null && element.compareTo(current.getNext().getElement()) > 0){
            current = current.getNext();
        }

        node.setNext(current.getNext());
        current.setNext(node);

        if(current == tail){
            tail = node;
        }

        count++;

    }
    public void delete(T element) throws EmptyCollectionException {
         LinearNode<T> current = head;
         LinearNode<T> previous = head;

         if(head == null){
             throw new EmptyCollectionException("LinkedList");
         }
         if(head.getElement().equals(element)){
             head = head.getNext();
             if(head == null){
                 tail = null;
             }
             count--;
             return;
         }

         while(current != null && !current.getElement().equals(element)){
             previous = current;
             current = current.getNext();
         }
         if(current != null){
            previous.setNext(current.getNext());

            if(current == tail){
                tail = previous;
            }
            count--;
         }

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
