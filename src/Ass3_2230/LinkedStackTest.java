package Ass3_2230;

public class LinkedStackTest {
    public static void main(String[] args){
        LinkedStack<Integer> linkStack = new LinkedStack<>();
        
        linkStack.push(1);
        linkStack.push(2);
        linkStack.push(3);
        linkStack.push(4);
        linkStack.push(5);
        System.out.println(linkStack.size());
        System.out.println(linkStack.toString());
    }
}
