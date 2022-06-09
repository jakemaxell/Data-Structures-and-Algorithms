// Queue Object

public class Queue {

    public class Node {
        private int value;
        private Node next;

        private Node(int data){
            this.value = data;
        }
    }

    private Node head;
    private Node tail;

    public boolean isEmpty(){
        return head == null;
    }

    public int peak(){
        return head.value;
    }

    public void add(int val){
        Node node = new Node(val);
        if(tail != null){
            tail.next = node;
        }
        tail = node;
        if(head == null){
            head = node;
        }
    }

    public void remove(){
        int data = head.value;
        head = head.next;
        if(head == null){
            tail =  null;
        }
    }

    public void traverse(){
        Node node = head;
        while(node != null){
            System.out.println(node.value);
            node = node.next;
        }
    }

}
