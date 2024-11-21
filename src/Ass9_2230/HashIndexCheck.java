package Ass9_2230;

public class HashIndexCheck {
    public static void main(String[] args) {
        System.out.println("Size 16 hash table");
        printHashDistribution(16);
        System.out.println("Size 17 hash table");
        printHashDistribution(17);
    }

    static void printHashDistribution(int hashsize) {
        int [] keyCount = new int[hashsize];
        for(int i = 1; i <= 1000; i++){
            int key = i % hashsize;
            keyCount[key]++;
        }
        for(int i = 0; i < hashsize; i++) {
            System.out.println(i + ": " + keyCount[i] + " ");
        }
    }
}