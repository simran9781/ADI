import java.util.Arrays;

public class problem706 {
     public int[] keys ;
    public MyHashMap() {
        keys = new int[1000001];
        Arrays.fill(keys,-1);
    }
    
    public void put(int key, int value) {
       keys[key] = value;
    }
    
    public int get(int key) {
       return keys[key];    }
    
    public void remove(int key) {
        keys[key]=-1;
    }
}
