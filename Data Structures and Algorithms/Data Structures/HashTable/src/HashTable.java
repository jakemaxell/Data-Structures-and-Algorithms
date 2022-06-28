// Hash Table Object
// 6/16/2022

import java.util.ArrayList;
import java.util.Hashtable;

public class HashTable<K, V> {

    class HashNode<KEY, VALUE>{
        KEY key;
        VALUE value;
        int hashCode;
        HashNode<KEY, VALUE> next;

        public HashNode(KEY key, VALUE value, int hashCode){
            this.key = key;
            this.value = value;
            this.hashCode = hashCode;
        }

    }

    private ArrayList<HashNode<K, V>> bucketarray;
    private int numBuckets;
    private int size;

    public Hashtable(){
        
    }

}
