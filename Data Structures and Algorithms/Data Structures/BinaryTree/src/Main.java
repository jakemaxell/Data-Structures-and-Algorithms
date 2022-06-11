// BinaryTree
// 6/9/2022

public class Main {

    public static void main(String[] args){

        Node node = new Node(10);
        BinaryTree binaryTree = new BinaryTree();

        int[] outOfOrder = {20, 1, 19, 2, 18, 3, 17, 4, 16, 5, 15, 6, 14, 7, 13, 8, 12, 9, 11};

        for(int x : outOfOrder){
            binaryTree.insert(node, x);
        }

        System.out.print("In Order Traversal: ");
        binaryTree.traverseInOrder(node);

        System.out.print("\nReverse Order Traversal: ");
        binaryTree.traverseReverseOrder(node);

        System.out.println();
        binaryTree.search(node, 7);

    }

}
