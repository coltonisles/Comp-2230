package Ass2_2230;

public class DOASTest {
    public static void main(String[] args){
        DropOutArrayStack<Integer> doa = new DropOutArrayStack<>(3);
        System.out.println(doa.toString());
        doa.push(1);
        doa.push(2);
        doa.push(3);
        doa.push(4);
        doa.push(5);
        doa.push(6);
        doa.push(7);
        doa.push(8);
        doa.push(9);
        doa.push(10);


        /*for (int i = 0; i < 3; i++) {
            doa.push(i);
        }*/
        System.out.println(doa.toString());
        System.out.println("Size: " + doa.size());

    }
}
