public class Ass1Comp2230q3 {
    public static void main(String[]args){
        int count = 0;
        int[] array = {1,2,3,4,5,6,7,8,9,10,1,6,2,3,3,4,23,34,3,423,52,34,234,23,4,234,23,423,4,234,23,4,234,2,34,23,42,34,23,42,34,23,4,23,4,234,23,4,23,43,4,23,4,23,42,34,23,4,234,3,3,3,4,3,43,4,34,23,4,23,42,3,42,34,2,34,23};
        double startTime = System.nanoTime();

        for(int i = 0; i < array.length; i++)  {
            for(int j = 0; j < array.length; j++)  {
                for(int k = 0; k < array.length; k++)  {
                    System.out.println("Hello World!");
                    count++;
                }
            }
        }

        double endTime = System.nanoTime();
        double duration = endTime - startTime;

        System.out.println("number of prints: " + count);
        System.out.println("execution time: " + duration + " nanoseconds");
        System.out.println("array size: " + array.length);

    }
}
