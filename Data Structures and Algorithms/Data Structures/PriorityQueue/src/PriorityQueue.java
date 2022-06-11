// Priority Queue Object

public class PriorityQueue {

    private int max;
    private int[] arr;
    private int numberOfItems;

    public PriorityQueue(){
        max = 10;
        arr = new int[max];
        numberOfItems = 0;
    }

    public void insert(int value){
        int i;
        if(numberOfItems == 0){
            arr[0] = value;
            numberOfItems++;
            return;
        }
        for(i = numberOfItems - 1; i >= 0; i--){
            if(value > arr[i]){
                arr[i + 1] = arr[i];
            }
            else{
                break;
            }
        }

        arr[i + 1] = value;
        numberOfItems++;
    }

    public void traverse(){
        for(int x = 0; x < numberOfItems; x++){
            System.out.print(arr[x] + " ");
        }
    }

    public int remove(){
        return arr[--numberOfItems];
    }

    public boolean isFull(){
        return numberOfItems == max;
    }

    public boolean isEmpty(){
        return numberOfItems == 0;
    }

    public int peek(){
        return arr[numberOfItems - 1];
    }

}
