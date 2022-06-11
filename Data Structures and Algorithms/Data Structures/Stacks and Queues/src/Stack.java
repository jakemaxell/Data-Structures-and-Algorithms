// Stack Object

public class Stack {

    private class Node {
        private int value;
        private Node next;

        private Node(int value){
            this.value = value;
        }
    }

    private Node top;

    public boolean isEmpty(){
        return top == null;
    }

    public int peak(){
        return top.value;
    }

    public void push(int value){
        Node node = new Node(value);
        node.next = top;
        top = node;
    }

    public void pop(){
        if(top == null){
            top = null;
        }
        else{
            top = top.next;
        }
    }

    public void traverse(){
        Node node = top;
        while(node != null){
            System.out.println(node.value);
            node = node.next;
        }
    }

}
