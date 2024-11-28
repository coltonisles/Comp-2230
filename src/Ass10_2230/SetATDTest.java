package Ass10_2230;

public class SetATDTest {
    public static void main(String[] args) {
        SetADT nums = new SetADT();
        System.out.println(nums);
        nums.add(8);
        nums.add(5);
        nums.add(7);
        nums.add(12);
        System.out.println(nums);
        nums.add(5);
        System.out.println(nums);
        nums.remove(5);
        System.out.println(nums);
        nums.add(-26);
        System.out.println(nums);
    }
}
