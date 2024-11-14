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
        bst.insert(19);
        System.out.println(bst);
        bst.insert(10);
        System.out.println(bst);
        bst.insert(7);
        System.out.println(bst);
        bst.insert(9);
        System.out.println(bst);
        bst.insert(2);
        System.out.println(bst);
        bst.insert(16);
        System.out.println(bst);
        System.out.println("Tree in Preorder: " + bst.toStringPreOrder());
    }
}
