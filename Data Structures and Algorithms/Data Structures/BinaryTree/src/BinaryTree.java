// BinaryTree Object

public class BinaryTree {

    public void insert(Node node, int value){
        if(value < node.value){
            if(node.left != null){
                insert(node.left, value);
            }
            else {
                node.left = new Node(value);
            }
        }
        if(value > node.value){
            if(node.right != null){
                insert(node.right, value);
            }
            else{
                node.right = new Node(value);
            }
        }
    }

    public void traverseInOrder(Node node){
        if(node != null){
            traverseInOrder(node.left);
            System.out.print(node.value + " ");
            traverseInOrder(node.right);
        }
    }

    public void traverseReverseOrder(Node node){
        if(node != null){
            traverseReverseOrder(node.right);
            System.out.print(node.value + " ");
            traverseReverseOrder(node.left);
        }
    }

    public void search(Node node, int value){
        if(node != null) {
            if (node.value == value) {
                System.out.println("Found it! The value is " + node.value);
            }
            else if (value < node.value && node.left != null) {
                search(node.left, value);
            }
            else if (value > node.value && node.right != null) {
                search(node.right, value);
            }
            else {
                System.out.println("Value not found... It does not exist within this tree");
            }
        }
    }

}
