// LinkedList
// 6/8/2022

public class Main {

    public static void main(String[] args){

        LinkedList linkedList = new LinkedList();

        linkedList.addAtHead(0);
        linkedList.addAtTail(10);
        linkedList.addAtIndex(2, 4);
        System.out.println(linkedList.get(2));
        linkedList.deleteAtIndex(2);
        System.out.println(linkedList.get(2));

        for(int x = 0; x < 101; x++){
            if(x % 2 == 0){
                linkedList.addAtTail(x);
            }
        }

        linkedList.deleteAtIndex(45);

        System.out.println("\nTraversing the entire list");
        linkedList.traverseList();

    }

}
