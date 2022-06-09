// Heaps
// 6/9/2022

public class Main {

    public static void main(String[] args){

        MinIntHeap heap = new MinIntHeap();

        int[] values = {10, 1, 9, 2, 8, 3, 7, 4, 6, 5, 99};
        for(int value : values){
            heap.add(value);
        }

        System.out.println(heap.peek());
        System.out.println(heap.poll());
        System.out.println(heap.peek());

        heap.traverse();

    }

}