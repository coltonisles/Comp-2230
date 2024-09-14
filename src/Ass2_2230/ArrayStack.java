import java.util.Arrays;
import java.lang.Exception;

 public class ArrayStack<T> {
     
     private final static int DEFAULT_CAPACITY = 50;
     private int top;
     private T[] stack;
     
     public ArrayStack() {
         this(DEFAULT_CAPACITY);
     }
     
     public ArrayStack(int initialCapacity) {
         top = 0;
         stack = (T[])(new Object[initialCapacity]);
     }
     
     public void push(T element) {
         if (size() == stack.length) {
             expandCapacity();
         }
         stack[top] = element;
         top++;
     }
     
     private void expandCapacity() {
         stack = Arrays.copyOf(stack, stack.length * 2);
     }
     
     public T pop() throws Exception {
         if (isEmpty()) {
             throw new Exception("stack");
         }
         top--;
         T result = stack[top];
         stack[top] = null;
         return result;
     }
     
     public T peek() throws Exception {
         if (isEmpty()) {
             throw new Exception("stack");
         }
         return (stack[top - 1]);
     }
     
     public boolean isEmpty() {
         return (size() == 0);
     }
     
     public int size() {
         return top;
     }
     
     public String toString() {
         return Arrays.toString(stack);
     }
 }
