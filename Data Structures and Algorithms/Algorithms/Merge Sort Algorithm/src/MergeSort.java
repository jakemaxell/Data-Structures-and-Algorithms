// Merge Sort Algorithm

public class MergeSort {

    public void merge(int[] arr, int beginning, int middle, int end){

        int n1 = middle - beginning + 1;
        int n2 = end - middle;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for(int i = 0; i < n1; i++){
            leftArray[i] = arr[beginning + i];
        }

        for(int j = 0; j < n2; j++){
            rightArray[j] = arr[middle + 1 + j];
        }

        int indexArrOne = 0; // i
        int indexArrTwo = 0; // j
        int indexMerged = beginning; // k

        while(indexArrOne < n1 && indexArrTwo < n2){
            if(leftArray[indexArrOne] <= rightArray[indexArrTwo]){
                arr[indexMerged] = leftArray[indexArrOne];
                indexArrOne++;
            }
            else{
                arr[indexMerged] = rightArray[indexArrTwo];
                indexArrTwo++;
            }

            indexMerged++;
        }

        while(indexArrOne < n1){
            arr[indexMerged] = leftArray[indexArrOne];
            indexArrOne++;
            indexMerged++;
        }

        while(indexArrTwo < n2){
            arr[indexMerged] = rightArray[indexArrTwo];
            indexArrTwo++;
            indexMerged++;
        }

    }

    public void sort(int[] arr, int beginning, int end){

        if(beginning < end){
            int middle = (beginning + end) / 2;

            sort(arr, beginning, middle);
            sort(arr, middle + 1, end);

            merge(arr, beginning, middle, end);
        }
    }

    public void printArray(int arr[]){
        for(int x : arr){
            System.out.print(x + " ");
        }
    }

}
