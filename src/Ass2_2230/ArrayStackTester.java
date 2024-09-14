

public class ArrayStackTester {
	
	public static void main (String[] args) throws Exception {
		
        ArrayStack<Integer> array = new ArrayStack(5);
        System.out.println(array.toString());
        
        for (int i = 2; i < 20; i += 2) {
            array.push(i);
        }
        
        System.out.println(array.toString());
        System.out.println(array.pop());
        System.out.println(array.toString());
        System.out.println(array.peek());
        System.out.println(array.toString());
        System.out.println("Size: " + array.size());
        
        while (!array.isEmpty()) {
            array.pop();
        }
        System.out.println(array.toString());
	}
}

