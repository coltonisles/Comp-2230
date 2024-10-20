package Ass6_2230;

import java.util.Arrays;

/**
 * ArrayOrderedList represents an array implementation of an ordered list.
 *
 * @author Colton Isles, Kaylee Crocker
 */
public class OrderedListArray<T extends Comparable> { // idk if this works to make sure T is comparable

        private static int MAX_CAPACITY = 10;
        private final static int NOT_FOUND = -1;

        protected T[] list;
        protected int rear;

    /**
     * Constructs the OrderedListArray with the maximum capacity
     * of 10.
     */
    OrderedListArray() {
            this(MAX_CAPACITY);
        }

    /**
     * Constructs the OrderedListArray with specified capacity
     * (sets capacity to 10 if it is over the maximum.
     *
     * @param capacity
     */
    OrderedListArray(int capacity) {
            if (capacity > MAX_CAPACITY) {
                list = (T[])(new Object[MAX_CAPACITY]);
            } else {
                list = (T[])(new Object[capacity]);
            }
            rear = 0;
        }

    /**
     * Adds the element to it's place in the list.
     *
     * @param element
     */
    public void add(T element) {

            int place = 0;
            while (element.compareTo(list[place]) < 0 && place < rear) {
                place++;
            }

            for (int i = rear; i > place; i--) {
                list[i] = list[i - 1];
            }

            list[place] = element;
            rear++
        }

    /**
     * Deletes the element if it is in the list.
     * @param element
     */
    public void delete(T element) {

        }

        private int find(T target) {
            int scan = 0;
            int result = NOT_FOUND;

            while (result == NOT_FOUND && scan < rear) {
                if (target.equals(list[scan])) {
                    result = scan;
                } else {
                    scan++;
                }
            }

            return result;
        }

        public String toString() {
            return Arrays.toString(list);
        }
}
