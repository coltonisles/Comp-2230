package Ass2_2230;

public class DOASTest {
    public static void main(String[] args){
        DropOutArrayStack<Integer> doa = new DropOutArrayStack<>(5);
        System.out.println(doa.toString());
        System.out.println("Size:" + doa.size());
        // Stack: 
        // Size: 0
        doa.push(1);
        doa.push(2);
        doa.push(3);
        doa.push(4);
        doa.push(5);
        System.out.println(doa.toString());
        System.out.println("Size:" + doa.size());
        System.out.println("Empty?:" + doa.isEmpty());
        // Stack: 1, 2, 3, 4, 5
        // Size: 5
        // Empty?: false
        doa.push(6);
        doa.push(7);
        System.out.println(doa.toString());
        System.out.println("Size:" + doa.size());
        // Stack: 3, 4, 5, 6, 7
        // Size: 5
        System.out.println(doa.pop());
        // 7
        System.out.println(doa.toString());
        System.out.println("Size:" + doa.size());
        // Stack: 3, 4, 5, 6
        // Size: 4
        System.out.println(doa.pop());
        // 6
        System.out.println(doa.toString());
        System.out.println("Size:" + doa.size());
        // Stack: 3, 4, 5
        // Size: 3
        System.out.println(doa.peek());
        // 5
        System.out.println(doa.toString());
        System.out.println("Size:" + doa.size());
        // Stack: 3, 4, 5
        // Size: 3
        System.out.println(doa.pop());
        // 5
        doa.pop();
        doa.pop();
        System.out.println(doa.toString());
        System.out.println("Size:" + doa.size());
        System.out.println("Empty?:" + doa.isEmpty());
        // Stack: 
        // Size: 0
        // Empty?: true
        doa.peek();
        // throws EmptyCollectionException
    }
}
