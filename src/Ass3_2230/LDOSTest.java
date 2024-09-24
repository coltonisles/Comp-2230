package Ass3_2230;

public class LDOSTest {
    public static void main(String[] args){
        LinkedDropOutStack<Integer> ldos = new LinkedDropOutStack<Integer>(5);
        
        ldos.push(1);
        ldos.push(2);
        ldos.push(3);
        ldos.push(4);
        ldos.push(5);
        System.out.println(ldos.size());
        System.out.println(ldos.toString());
        ldos.push(6);
        System.out.println(ldos.toString());
    }
}
