package Ass8_2230;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinaryArrayTree<T extends Comparable<T>> {

    private T[] tree;
    private static int DEFAULT_SIZE = 10;
    private int size;

    BinaryArrayTree() {
        tree = (T[]) Array.newInstance(Comparable.class, DEFAULT_SIZE);
    }

    public void insert(T element) {
        if(size == tree.length){
            expandCapacity();
        }
        tree[findElementPos(element, 0)] = element;
        size++;
    }

    private int findElementPos(T element, int node) {
        int result;
        if (tree[node] == null) {
            result = node;
        } else if (element.compareTo(tree[node]) < 0) {
            result = findElementPos(element, 2 * node + 1);
        } else {
            result = findElementPos(element, 2 * node + 2);
        }
        return result;
    }

    private void expandCapacity() {
       tree = Arrays.copyOf(tree, tree.length * 2);

    }

    public String toString() {
        return Arrays.toString(tree);
    }
    //replaces toString2 for better readability
    public void printPreOrder(int node) {
        if(node < tree.length && tree[node] != null) {
            //visit root
            System.out.println(tree[node] + " ");
            //traverse left side
            printPreOrder(2 * node + 1);
            //traverse right side
            printPreOrder(2 * node + 2);
        }
    }
}
