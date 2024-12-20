package Ass6_2230;

import Ass6_2230.Exceptions.*;

public class OrderedLinkedList<T extends Comparable<T>> {
    private int count;
    private LinearNode<T> head;

    public OrderedLinkedList(){
        count = 0;
        head = null;

    }

    /**
     * Adds an element to its place in the list.
     * @param element element to add
     */
    public void add(T element){
        LinearNode<T> node = new LinearNode<T>(element);
        if(head == null){
            head = node;
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

        count++;

    }

    /**
     * Deletes an element from the list.
     * @param element element to delete
     * @throws EmptyCollectionException
     * @throws ElementNotFoundException
     */
    public void delete(T element) throws EmptyCollectionException, ElementNotFoundException {
         LinearNode<T> current = head;

         if(head == null){
             throw new EmptyCollectionException("LinkedList");
         }
         if(head.getElement().equals(element)){
             head = head.getNext();
             count--;
             return;
         }

        for (int i = 0; i < count; i++) {
            if (current.getNext() == null || current.getNext().getElement().compareTo(element) > 0) {
                throw new ElementNotFoundException("Arraylist");
            } else if (current.getNext().getElement().equals(element)) {
                current.setNext(current.getNext().getNext());
                count--;
                return;
            }
            current = current.getNext();
        }

    }

    /**
     * Returns a string of items in the list.
     * @return string of list items
     */
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
