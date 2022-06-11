// HashMap Object

public class HashMap {

    private int[] arr = new int[1000001];

    public HashMap(){
        for(int i = 0; i < 1000001; i++){
            arr[i] = -1;
        }
    }

    public void put(int key, int value){
        arr[key] = value;
    }

    public int get(int key){
        return arr[key];
    }

    public void remove(int key){
        arr[key] = -1;
    }

}
