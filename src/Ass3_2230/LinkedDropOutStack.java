package Ass3_2230;

public class LinkedDropOutStack<T> extends LinkedStack<T> {
    
    private int n;
    private final int DEFAULT_N = 100;
    
    LinkedDropOutStack() {
        super();
        this.n = DEFAULT_N;
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
		for (int i = 1; i <= size(); i++) {
            newBottomNode = newBottomNode.getNext();
        }
    }
}
