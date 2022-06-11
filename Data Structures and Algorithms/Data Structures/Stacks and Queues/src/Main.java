// Stacks and Queues
// 6/9/2022

public class Main {

    public static void main(String[] args){

        // Queue
        Queue queue = new Queue();

        int[] values = {9, 8, 7, 6, 5, 4, 3, 2, 1, 10, 11, 12, 13, 14, 15};
        for(int value : values){
            queue.add(value);
        }

        System.out.println("                Queue");
        System.out.println("---------------------------------------");
        System.out.println("Is the queue empty?: " + queue.isEmpty());
        System.out.println("The first value in the queue is: " + queue.peak());

        queue.remove();

        System.out.println("The new first value in the queue is: " + queue.peak());
        System.out.println("Traversing the queue...");
        queue.traverse();

        // Stack
        Stack stack = new Stack();

        int[] newValues = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        for(int value : newValues){
            stack.push(value);
        }

        System.out.println("                Stack");
        System.out.println("---------------------------------------");
        System.out.println("Is the stack empty?: " + stack.isEmpty());
        System.out.println("The first value in the queue is: " + stack.peak());

        stack.pop();

        System.out.println("The new top value in the stack is: " + stack.peak());
        System.out.println("Traversing the queue...");
        stack.traverse();

    }

}
