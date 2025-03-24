public class problem705 {
    public boolean[] hashset;
    public MyHashSet() {
        hashset = new boolean[1000001];
    }
    
    public void add(int key) {
       hashset[key]=true;
    }
    
    public void remove(int key) {
        hashset[key]=false;
    }
    
    public boolean contains(int key) {
        return hashset[key]; 
    }
}
