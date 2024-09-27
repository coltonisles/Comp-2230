package Ass3_2230;

import Ass2_2230.ArrayStack;
import Ass2_2230.DropOutArrayStack;
import Ass2_2230.exceptions.EmptyCollectionException;

public class DOLSTest {
    public static void main(String[] args){

        LinkedDropOutStack<Integer> dols = new LinkedDropOutStack<>(5);
        //initialization with null values and capacity 5
        System.out.println("Current stack: " + "Top -> " + dols.toString() + " <- Bottom");

        //populate stack to fill the initial capacity
        for (int i = 1; i < 6; i++) {
            dols.push(i);
        }
        System.out.println("Full stack: " + "Top -> " + dols.toString() + " <- Bottom");
        dols.push(6);
        dols.push(7);
        System.out.println("Full stack after dropout occurs : " + "Top -> " + dols.toString() + " <- Bottom");
        
        //test pop and peek
        System.out.println("-----pop() & peek() Test-----");
        System.out.println("Peek Top Value: " + dols.peek());
        for (int i = 1; i < 5; i++) {
            dols.pop();
        }
        System.out.println("Stack after pop test: " + "Top -> " + dols.toString() + " <- Bottom");
        System.out.println("Top Value after pop test: " + dols.peek());
        dols.pop();

        //test peek with empty method
        System.out.println("-----peek() with empty stack test-----");
        try{
            dols.peek();
        } catch (EmptyCollectionException e) {
            System.out.println("peek() throws empty collection exception correctly");
        }

        //test pop with empty stack
        System.out.println("-----pop() with empty stack test-----");
        try {
            dols.pop();
        } catch (EmptyCollectionException e) {
            System.out.println("pop() throws empty collection exception correctly");
        }
        System.out.println("Is the stack empty: " + dols.isEmpty());
        System.out.println("stack size: " + dols.size());
    }
}
