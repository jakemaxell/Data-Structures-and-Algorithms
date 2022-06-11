// Priority Queue
// 6/9/2022

public class Main {

    public static void main(String[] args){

        PriorityQueue priorityQueue = new PriorityQueue();

        int[] items = {10, 2, 8, 6, 9, 1, 7, 3, 5, 4};
        for(int item : items){
            priorityQueue.insert(item);
        }

        System.out.println("Is Empty: " + priorityQueue.isEmpty());
        System.out.println("Is Full: " + priorityQueue.isFull());
        System.out.println("Peek: " + priorityQueue.peek());
        System.out.println("Removed: " + priorityQueue.remove());
        System.out.println("Peek: " + priorityQueue.peek());

        priorityQueue.traverse();

    }

}
