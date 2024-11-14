package Ass8_2230;

public class BinaryArrayTreeTest {
    public static void main(String[] args) {

        BinaryArrayTree<Integer> bst = new BinaryArrayTree<Integer>();

        System.out.println(bst);
        bst.insert(15);
        System.out.println(bst);
        bst.insert(17);
        System.out.println(bst);
        bst.insert(18);
        System.out.println(bst);
        bst.insert(10);
        System.out.println(bst);
        bst.printPreOrder(0);
    }
}
