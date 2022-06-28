// Heap Sort

public class HeapSort {

    private int arr[];
    private int size;

    public HeapSort(int arr[]){
        this.arr = arr;
        size = arr.length;

        buildHeap();
    }

    public void buildHeap(){
        for(int i = (size / 2 - 1); i >= 0; i--){
            heapify(i);
        }
    }

    public void heapify(int root_index){
        int maxIndex = root_index;
        int child = root_index * 2 + 1;
        if(child < size){
            if(arr[child] > arr[root_index]){
                maxIndex = child;
            }
        }

        if(child + 1 < size){
            if(arr[child + 1] > arr[maxIndex]){
                maxIndex = child + 1;
            }
        }

        swap(arr, root_index, maxIndex);
        if(root_index != maxIndex){
            heapify(maxIndex);
        }
    }

    public void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public int extractRoot(){
        int max = arr[0];
        arr[0] = arr[--size];
        heapify(0);;

        return max;
    }

    public void sort(){
        while(size > 0){
            System.out.print(extractRoot() + ", ");
        }
    }

}
