package Ass3_2230;

import Ass2_2230.ArrayStack;
import Ass2_2230.DropOutArrayStack;
import Ass2_2230.exceptions.EmptyCollectionException;

public class LDOATest {
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


    }
}
