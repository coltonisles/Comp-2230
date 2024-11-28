package Ass10_2230;

import java.util.Arrays;

public class SetADT {
    private int[] set;
    private static final int DEFAULT_SIZE = 5;

    SetADT() {
        set = new int[DEFAULT_SIZE];
    }

    public void add(int element) {
        if (!contains(element)) {
            for (int i = 0; i <= set.length; i++){
                if (i == set.length) {
                    expandCapacity();
                }
                if (set[i] == 0) {
                    set[i] = element;
                    break;
                }
            }
        }
    }

    private void expandCapacity() {
        set = Arrays.copyOf(set, set.length * 2);
    }

    public void remove(int element) {
        for (int i = 0; i < set.length; i++) {
            if (set[i] == element) {
                set[i] = 0;
                break;
            }
        }
    }

    public boolean contains(int element) {
        boolean result = false;
        for (int e : set) {
            if (e == element) {
                result = true;
                break;
            }
        }
        return result;
    }

    // just so we can see what's happening to test it
    public String toString() {
        return Arrays.toString(set);
    }
}
