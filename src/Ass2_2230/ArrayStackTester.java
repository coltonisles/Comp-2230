package Ass2_2230;

import Ass2_2230.exceptions.EmptyCollectionException;

public class ArrayStackTester {
	
	public static void main (String[] args) throws Exception {
		
        ArrayStack<Integer> array = new ArrayStack<>(5);
        //initialization with null values and capacity 5
        System.out.println("Current stack: " + "Bottom -> " + array.toString() +" <- Top");

        //populate stack to fill the initial capacity
        for (int i = 1; i < 6; i++) {
            array.push(i);
        }
        System.out.println("Current stack: " + "Bottom -> " + array.toString() +" <- Top");

        System.out.println("Is the stack empty: " + array.isEmpty());

        //test expandCapacity() method
        System.out.println("-----expandCapacity() Test-----");
        for (int i = 1; i < 6; i++) {
            array.push(i);
        }
        System.out.println("Current stack: " + "Bottom -> " + array.toString() +" <- Top");

        //test pop and peek method
        System.out.println("-----pop() & peek() Test-----");
        for(int i = 0; i < 10; i++){
                System.out.println("Top Value: " + array.peek());
                array.pop();
                System.out.println("Current stack: " + "Bottom -> " + array.toString() +" <- Top");
        }

        //test peek with empty method
        System.out.println("-----peek() with empty stack test-----");
        try {
                array.peek();
        } catch (EmptyCollectionException e) {
                System.out.println("peek() throws empty collection exception correctly");
        }

        //test pop with empty stack
        System.out.println("-----pop() with empty stack test-----");
        try {
            array.pop();
        } catch (EmptyCollectionException e) {
            System.out.println("pop() throws empty collection exception correctly");
        }
        System.out.println("Is the stack empty: " + array.isEmpty());
        System.out.println("stack size: " + array.size());
        //System.out.println(array.pop());
        /* System.out.println(array.toString());
        System.out.println(array.peek());
        System.out.println(array.toString());
        System.out.println("Size: " + array.size());
        
        while (!array.isEmpty()) {
            array.pop();
        }
        System.out.println(array.toString());
        System.out.println(array.isEmpty());*/
	}
}

