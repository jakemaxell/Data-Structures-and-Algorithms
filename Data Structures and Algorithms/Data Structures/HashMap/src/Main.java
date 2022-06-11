// HashMap
// 6/8/2022
// -1 Represents an empty position in the list whereas a 1 represents a filled position

public class Main {

    public static void main(String[] args){

        HashMap hashMap = new HashMap();

        int[] data = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        for(int i : data){
            hashMap.put(i, 1);
        }

        hashMap.remove(6);

        for(int x = 0; x < 21; x++){
            System.out.println(x + ": " + hashMap.get(x));
        }

    }

}
