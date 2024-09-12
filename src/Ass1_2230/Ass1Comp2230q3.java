package Ass1_2230;

public class Ass1Comp2230q3 {
    public static void main(String[]args){
        int count = 0;
        int[] array = new int[1000];
        double startTime = System.nanoTime();

        for(int i = 0; i < array.length; i++)  {
            for(int j = 0; j < array.length; j++)  {
                for(int k = 0; k < array.length; k++)  {
                    //System.out.println("Hello World!");
                    count++;
                }
            }
        }

        double endTime = System.nanoTime();
        double duration = endTime - startTime;

        System.out.println("number of prints: " + count);
        System.out.println("execution time: " + duration/1000000 + " milliseconds");
        System.out.println("array size: " + array.length);

    }
}
