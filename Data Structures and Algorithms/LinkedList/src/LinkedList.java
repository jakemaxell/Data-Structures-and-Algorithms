// LinkedList Object

public class LinkedList {

    class Node {
        int val;
        Node next;

        public Node(int val){
            this.val = val;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public LinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

    public int get(int index){
        if(index >= size){
            return -1;
        }

        Node node = head;
        for(int x = 0; x < index; x++){
            node = node.next;
        }
        return node.val;
    }

    public void addAtHead(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        size++;

        if(head.next == null){
            tail = head;
        }
    }

    public void addAtTail(int val){
        Node node = new Node(val);
        if(tail != null){
            tail.next = node;
        }

        if(tail == null || size == 0){
            head = node;
        }

        tail = node;
        size++;
    }

    public void addAtIndex(int index, int val){
        if(index < 0 || index > size){
            return;
        }
        else if(index == 0){
            addAtHead(val);
        }
        else if(index == size){
            addAtTail(val);
        }
        else{
            Node position = head;
            for(int x = 0; x < index - 1; x++){
                position = position.next;
            }
            Node node = new Node(val);
            Node save = position;
            position = position.next;
            save.next = node;
            node.next = position;
            size++;
        }
    }

    public void deleteAtIndex(int index){
        if(size == 0 || index < 0 || index >= size){
            return;
        }

        if(index == 0){
            head = head.next;
            size--;
            if(size == 0){
                tail = null;
            }
        }
        else{
            Node node = head;
            for(int x = 0; x < index - 1; x++){
                node = node.next;
            }
            node.next = node.next.next;
            size--;
            if(node.next == null){
                tail = node;
            }
        }
    }

    public void traverseList(){
        Node node = head;
        for(int x = 0; x < size; x++){
            System.out.println(get(x));
        }
    }
}
