// Binary Tree Object

public class BinaryTree {

    public void insert(Node node, Student student){
        int compare = student.getID().compareTo(node.student.getID());

        if(compare < 0){
            if(node.left != null){
                insert(node.left, student);
            }
            else {
                node.left = new Node(student);
            }
        }
        if(compare > 0){
            if(node.right != null){
                insert(node.right, student);
            }
            else{
                node.right = new Node(student);
            }
        }
    }

    public void search(Node node, String searchID){
        int compare = searchID.compareTo(node.student.getID());

        if(node != null) {
            if (node.student.getID().equals(searchID)) {
                node.student.getStats();
            }
            else if (compare < 0 && node.left != null) {
                search(node.left, searchID);
            }
            else if (compare > 0 && node.right != null) {
                search(node.right, searchID);
            }
        }
    }

}
