package Ass8_2230;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinaryArrayTree<T extends Comparable<T>> {

    private T[] tree;
    private static int DEFAULT_SIZE = 10;

    BinaryArrayTree() {
        tree = (T[]) Array.newInstance(Comparable.class, DEFAULT_SIZE);
    }

    public void insert(T element) {
        tree[findElementPos(element, 0)] = element;
    }

    private int findElementPos(T element, int node) {
        int result;
        if (tree[node] == null) {
            result = node;
        } else if (element.compareTo(tree[node]) < 0) {
            result = findElementPos(element, 2 * node + 1);
        } else {
            result = findElementPos(element, 2 * node +2);
        }
        return result;
    }

    private void expandCapacity() {
        // temp
    }

    public String toString() {
        return Arrays.toString(tree);
    }

    public String toString2() {
        return ""; //temp
    }
}
