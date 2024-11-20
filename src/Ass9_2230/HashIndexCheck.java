package Ass9_2230;

public class HashIndexCheck {
    public static void main(String[] args) {
        int [] keyCount16 = new int[16];
        int [] keyCount17 = new int[17];

        for(int i = 1; i <= 1000; i++){
            int key = i % 16;
            keyCount16[key]++;
        }
        for(int i = 1; i <= 1000; i++){
            int key = i % 17;
            keyCount17[key]++;
        }
        int key=1;
        System.out.println("Size 16 hash table");
        for(int count : keyCount16){

            System.out.println(key + ": " + count + " ");
            key++;
        }
        key = 1;
        System.out.println("Size 17 hash table");
        for(int count : keyCount17){
            System.out.println(key + ": " + count + " ");
            key++;
        }
    }
}
