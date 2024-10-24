package Ass6_2230;

import Ass6_2230.Exceptions.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.*;

/**
 * ArrayOrderedList represents an array implementation of an ordered list.
 *
 * @author Colton Isles, Kaylee Crocker
 */
public class OrderedArrayList<T extends Comparable<T>> {

    private static final int MAX_CAPACITY = 10;
    private final static int NOT_FOUND = -1;

    protected T[] list;
    protected int rear;

    /**
     * Constructs the OrderedListArray with the maximum capacity
     * of 10.
     */
     public OrderedArrayList() {
         this(MAX_CAPACITY);
        }

    /**
     * Constructs the OrderedListArray with specified capacity
     * sets capacity to 10 if it is over the maximum.
     *
     * @param capacity Capacity of the arrayList with maximum of 10
     */
    OrderedArrayList(int capacity) {
            if (capacity >= MAX_CAPACITY) {
                list = (T[]) Array.newInstance(Comparable.class, MAX_CAPACITY);
            } else {
                list = (T[]) Array.newInstance(Comparable.class, capacity);
            }
            rear = 0;
        }

    /**
     * Adds the element to it's place in the list.
     * @param element element to be added
     */
    public void add(T element) {

            int index = 0;
            if(rear == MAX_CAPACITY){
                throw new FullCapacityException("list");
            }
            while (index < rear && element.compareTo(list[index]) > 0) {
                index++;
            }

            for (int i = rear; i > index; i--) {
                list[i] = list[i - 1];
            }

            list[index] = element;
            rear++;
        }

    /**
     * Deletes the element if it is in the list.
     * @param element element to delete
     */
    public void delete(T element) {

        int index = find(element);
        list[index] = null;

        for (int i = index; i < rear - 1; i++) {
            list[i] = list[i + 1];
        }
        rear--;
        list[rear] = null;
    }

    /**
     * Finds the index of the target in the list.
     * @param target element to search for
     * @return result of the search
     */
    private int find(T target) throws ElementNotFoundException {

        int result = NOT_FOUND;

        for (int index = 0; index < rear; index++) {
            if (list[index].equals(target)) {
                result = index;
                break;
            } else if (index == rear - 1 || list[index].compareTo(target) > 0) {
                throw new ElementNotFoundException("list");
            }
        }
        return result;
    }

    /**
     * Returns a string of items in the list.
     * @return string of list items
     */
    @Override
    public String toString() {
        return Arrays.toString(list);
        }
}
