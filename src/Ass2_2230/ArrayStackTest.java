package Ass2_2230;

public class ArrayStackTest {
    public static void main(String[]args){
        ArrayStack<Integer> array = new ArrayStack<>(4);
        System.out.println(array.toString());

        for (int i = 2; i < 20; i += 2) {
            array.push(i);
        }

        System.out.println(array.toString());
        System.out.println(array.pop());
        System.out.println(array.toString());
        System.out.println(array.peek());
        System.out.println(array.toString());
        array.push(8);
        System.out.println(array.toString());
        System.out.println("Size: " + array.size());

    }
}
