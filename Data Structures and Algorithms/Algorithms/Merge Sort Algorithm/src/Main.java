// Merge Sort
// 6/27/2022

public class Main {

    public static void main(String[] args){

        int[] arr = {100, 60, 20, 0, 40, 80, 90, 50, 10, 30, 70, 95, 85, 75, 65, 55, 45, 35, 25, 15, 5};

        MergeSort mergeSort = new MergeSort();

        System.out.println("Original Array");
        mergeSort.printArray(arr);

        mergeSort.sort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array");
        mergeSort.printArray(arr);

    }

}
