package Ass3_2230;

public class LinkedDropOutStack<T> extends LinkedStack<T> {
    
    private int n;
    private static final int DEFAULT_N = 100;
    
    LinkedDropOutStack() {
        this(DEFAULT_N);
    }
    
    LinkedDropOutStack(int n) {
        super();
        this.n = n;
    }
    
    public void push(T element) {
        super.push(element);
        
        if (size() > n) {
            deleteBottomElement();
        }
    }
    
    private void deleteBottomElement() {
        
        LinearNode newBottomNode = top;
		for (int i = 1; i < size()-1; i++) {
            newBottomNode = newBottomNode.getNext();
        }
        newBottomNode.setNext(null);
        count--;
    }
}
