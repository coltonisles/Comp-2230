package Ass1_2230;

public class Main {
    public static void main(String[] args) {
        System.out.println("------Order------");
        double startTime = System.nanoTime();
        int count = 0;
        // code to test
        double endTime = System.nanoTime();
        double duration = endTime - startTime;

        System.out.println("number of prints: " + count);
        System.out.println("execution time: " + duration + " nanoseconds");
    }
}