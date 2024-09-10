import static java.util.Arrays.binarySearch;

public class Ass1_2230 {
    public static void main(String[] args){
        int size = 1000;
        int[] num = new int[size];
        for (int i = 0; i < size; i++) {
                num[i] = i + 1;
            }

        System.out.println("Array size: " + num.length);

        linear(num);
        quadratic(num);
        cubic(num);
        log(num, 50);
    }
    public static void linear(int [] n){
        System.out.println("------Linear------");
        double startTime = System.nanoTime();
        int count = 0;

        for(int i = 0; i < n.length; i++) {
            //System.out.println(n[i]);
            count++;
        }
        double endTime = System.nanoTime();
        double duration = endTime - startTime;

        System.out.println("number of prints: " + count);
        System.out.println("execution time: " + duration + " nanoseconds");
    }
    public static void quadratic(int [] n){
        System.out.println("------Quadratic------");
        double startTime = System.nanoTime();
        int count = 0;

        for(int i = 0; i < n.length; i++){
            for(int j = 0; j < n.length; j++){
                //System.out.println(n[j]);
                count++;
            }
        }
        double endTime = System.nanoTime();
        double duration = endTime - startTime;

        System.out.println("number of prints: " + count);
        System.out.println("execution time: " + duration + " nanoseconds");
    }
    public static void cubic(int[] n){
        System.out.println("------Cubic------");
        double startTime = System.nanoTime();
        int count = 0;
        for(int i = 0; i < n.length; i++){
            for(int j = 0; j < n.length; j++){
                for(int k = 0; k < n.length; k++){
                    count++;
                }
            }
        }
        double endTime = System.nanoTime();
        double duration = endTime - startTime;

        System.out.println("number of prints: " + count);
        System.out.println("execution time: " + duration + " nanoseconds");
    }
    public static void log(int[] n, int m){
        System.out.println("------Logarithmic------");
        double startTime = System.nanoTime();

        binarySearch(n, m);

        double endTime = System.nanoTime();
        double duration = endTime - startTime;

        //System.out.println("number of prints: " + count);
        System.out.println("execution time: " + duration + " nanoseconds");
    }
    public static void exponential(int)
}
