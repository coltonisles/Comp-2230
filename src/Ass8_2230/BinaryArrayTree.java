package Ass8_2230;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinaryArrayTree<T extends Comparable<T>> {

    private T[] tree;
    private static final int DEFAULT_SIZE = 10;

    @SuppressWarnings("unchecked")
    BinaryArrayTree() {
        tree = (T[]) new Comparable[DEFAULT_SIZE];
    }

    public void insert(T element) {
        int position =  findElementPos(element, 0);
        if(position >= tree.length) {
            expandCapacity();
        }
        tree[position] = element;
    }

    private int findElementPos(T element, int node) {
        int result;
        if (node >= tree.length || tree[node] == null) {
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

    public String toStringPreOrder() {
        String result = preOrder(0, "");
        return result.substring(0, result.length() - 2);
    }

    private String preOrder(int node, String s) {
        String result = s;
        if(node < tree.length && tree[node] != null) {
            //visit root
            result += tree[node] + ", ";
            //traverse left side
            result = preOrder(2 * node + 1, result);
            //traverse right side
            result = preOrder(2 * node + 2, result);
        }
        return result;
    }
}
