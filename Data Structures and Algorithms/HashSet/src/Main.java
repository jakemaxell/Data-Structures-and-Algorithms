// HashSet
// 6/8/2022

public class Main {

    public static void main(String[] args){

        MyHashSet hashSet = new MyHashSet();

        int[] values = {1, 2, 3, 4, 6};
        for(int x : values){
            hashSet.add(x);
        }

        hashSet.remove(1);

        for(int x = 0; x < 10; x++){
            System.out.println(x + ": " + hashSet.contains(x));
        }

    }

}
