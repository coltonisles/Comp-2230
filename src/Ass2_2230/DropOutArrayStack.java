package Ass2_2230;

/**
 * An ArrayStack in which, if the size is n, when the n+1 element is
 * pushed, the oldest element (bottom of stack) is lost.
 * 
 * @author Kaylee Crocker and Colton Isles
 */
public class DropOutArrayStack<T> extends ArrayStack<T> {

    private int n;  //the max size of the stack
    private int bottom = 0; //used for calculating size() with O(1) 
    
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
         * array is not needlesly expanded. The last element of the 
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
    
    /**
     * Returns and removes the element on the top of the stack.
     */
    @Override
    public T pop() {
        if (top == 0) {
            top = n;
        }
       return super.pop();
    }
    
    /**
     * Returns the element on the top of the stack without removing it.
     */
    @Override
     public T peek() {
         if (top == 0) {
             return stack[n - 1];
         } else {
             return super.peek();
         }
     }
     
     /**
      * Returns the number of elements in this stack.
      */
     @Override
      public int size() {
          if (top > bottom) {
            return top - bottom;
        } else if (top == 0) {
            return 0;
        } else {
            return n - bottom + top;
        }
      }
      @Override
      public boolean isEmpty(){
          return stack[top] == null && stack[bottom] == null;
      }
}
