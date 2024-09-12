package Ass1_2230;

public class Ass1comp2230q5 {
    public static void main(String[]args){
        int[] array = new int[100];
        double startTime = System.nanoTime();
        int count = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
            count++;
        }
        double endTime = System.nanoTime();
        double duration = endTime - startTime;

        System.out.println("number of prints: " + count);
        System.out.println("execution time: " + duration + " nanoseconds");
    }
}
