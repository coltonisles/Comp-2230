package Ass2_2230;

/**
 * An ArrayStack in which if the size is n, when the n+1 element is 
 * pushed, the oldest element (bottom of stack) is lost.
 * 
 * @author Kaylee Crocker and Colton Isles
 */
public class DropOutArrayStack extends ArrayStack {
    
    private int n;
    
    /**
     * Creates an empty stack using the default capacity.
     */
    public DropOutArrayStack() {
        DropOutArrayStack(DEFAULT_CAPACITY);
    }
    
    /**
     * Creates an empty stack with the size n.
     * @param n the initial size of the array
     */
    public DropOutArrayStack(int n) {
        super(n+1);
        this.n = n;
    }
    
    /**
     * Adds the specified element to the top of this stack and removes
     * the bottom element if the size exceeds n by overwriting it.
     * @param element generic element to be pushed onto stack
     */
     public void push(T element) {
         if (top >= n) {
             top = 0;
         }
         super.push(element);
     }
}
