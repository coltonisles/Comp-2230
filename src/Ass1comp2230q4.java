public class Ass1comp2230q4 {
    public static void main(String[]args) {
        int[] array = new int[1000];
        double startTime = System.nanoTime();
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                someMethod(array[j]);
                count++;
            }
        }
        double endTime = System.nanoTime();
        double duration = endTime - startTime;

        System.out.println("number of prints: " + count);
        System.out.println("execution time: " + duration/1000000 + " milliseconds");
        System.out.println("array size: " + array.length);
    }

    private static void someMethod(int i) {
        //System.out.println("print");
    }
}
