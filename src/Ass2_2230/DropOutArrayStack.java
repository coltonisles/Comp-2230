package Ass2_2230;

import java.util.Arrays;
import java.util.Objects;

/**
 * An ArrayStack in which, if the size is n, when the n+1 element is
 * pushed, the oldest element (bottom of stack) is lost.
 * 
 * @author Kaylee Crocker and Colton Isles
 */
public class DropOutArrayStack<T> extends ArrayStack<T> {
    private int upper;
    private int bottom;
    private int n;
    
    /**
     * Creates an empty stack using the default capacity.
     */
    public DropOutArrayStack() {
        this(DEFAULT_CAPACITY);
    }
    
    /**
     * Creates an empty stack with the size n.
     * @param n the initial size of the array
     */
    public DropOutArrayStack(int n) {
        super(n+1);
        this.n = n;
        this.bottom = 0;
    }

    
    /**
     * Adds the specified element to the top of this stack and removes
     * the bottom element if the size exceeds n by overwriting it.
     * @param element generic element to be pushed onto stack
     */
    @Override
     public void push(T element) {

        if (top <= n) {
            super.push(element);

        } else {
            //top = (top + 1) % n;
            stack[bottom] = null;
            bottom = (bottom + 1) % n;
            super.push(element);
            //bottom++;

            //top--;
            //*stack = (T[]) Arrays.stream(stack).filter(Objects::nonNull).toArray(Object[]::new);
        }

    }


        /* if (top >= n) {
             top = 0;
         }
         super.push(element);
        stack[top] = element;
         top = (top + 1) % n;*/

}
