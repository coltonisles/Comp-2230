package Ass3_2230;

import Ass2_2230.ArrayStack;
import Ass2_2230.exceptions.EmptyCollectionException;

public class LinkedStackTest {
    public static void main(String[] args){
        LinkedStack<Integer> linkStack = new LinkedStack<>();
        //empty stack initialization
        System.out.println("Fresh initialized stack: " + "Top -> " + linkStack.toString() + " <- Bottom");
        for(int i = 1; i < 6; i++){
            linkStack.push(i);

        }
        System.out.println("Filled Stack: " + "Top -> " + linkStack.toString() + " <- Bottom");

        System.out.println("-----pop() & peek() Test-----");
        System.out.println("Peek Top Value: " + linkStack.peek());
        for (int i = 1; i < 5; i++) {
            linkStack.pop();
        }
        System.out.println("Stack after pop test: " + "Top -> " + linkStack.toString() + " <- Bottom");
        System.out.println("Top Value after pop test: " + linkStack.peek());
        linkStack.pop();

        //test peek with empty method
        System.out.println("-----peek() with empty stack test-----");
        try{
            linkStack.peek();
        } catch (EmptyCollectionException e) {
            System.out.println("peek() throws empty collection exception correctly");
        }

        //test pop with empty stack
        System.out.println("-----pop() with empty stack test-----");
        try {
            linkStack.pop();
        } catch (EmptyCollectionException e) {
            System.out.println("pop() throws empty collection exception correctly");
        }
        System.out.println("Is the stack empty: " + linkStack.isEmpty());
        System.out.println("stack size: " + linkStack.size());

    }
}
