package Ass2_2230;

/**
 * An ArrayStack in which, if the size is n, when the n+1 element is
 * pushed, the oldest element (bottom of stack) is lost.
 * 
 * @author Kaylee Crocker and Colton Isles
 */
public class DropOutArrayStack<T> extends ArrayStack<T> {

    private int n;  //the max size of the stack
    private int bottom = 0; //used only for calculating size() with O(1) efficency
    
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
        super(n + 1);   
        /* Why array length n+1? The stack will only ever contain n 
         * elements, however, ArrayStack.push() will expand the array
         * when the size of the stack reaches the length of the array. 
         * This insures that the stack sizes never reaches that so the 
         * array is not needlessly expanded. The last element of the
         * array will always be unused (null).
         */
        this.n = n;
    }

    
    /**
     * Adds the specified element to the top of this stack and removes
     * the bottom element if the size exceeds n by overwriting it.
     * @param element generic element to be pushed onto stack
     */
    @Override
     public void push(T element) {

        if (top >= n) {
            top = 0;
        }
        super.push(element);
        
        if (top == bottom + 1 && stack[top] != null) { //update the bottom
            bottom++;
        }
    }
    
    /** removes the element on the top of the stack.
     * @return the element removed from the top of the stack
     */
    @Override
    public T pop() {
        if (top == 0) {
            top = n;
        }
       return super.pop();
    }
    
    /**displays the element at the top of the stack
     * @return the element on the top of the stack without removing it.
     */
    @Override
     public T peek() {
         if (top == 0) {
             return stack[n - 1];
         } else {
             return super.peek();
         }
     }
     /** Displays the number of elements in this stack.
      * @return difference between top and bottom if top is greater than bottom, 0 if top == bottom, else n-bottom+top
      */
     @Override
      public int size() {
        int size = n;
          if (top > bottom) {
            size = top - bottom;
        } else if (top < bottom) {
            size = n - bottom + top;
        } else if (stack[bottom] == null) {
            size = 0;
        }
        return size;
      }
}
