public class thirdmarch {
    public static void main(String[] args) {


        G13 g = new G13();
        g.setid(1);
        g.setname("Java");
        g.setphnno(126789176l);
        System.out.println(g.getid());
        System.out.println(g.getname());
        System.out.println(g.getphn());  

    }
}
class G13{
    private int id;
    private String Name;
    public int getid(){
        return id;
    }
    public void setid(int id){
        this.id = id;
    }
    public void setname(String name){
        this.Name = name;
    }
    public void setphnno(Long phnno){
        this.phnno=phnno;
    }
    public String getname(){
        return Name;
    }
    public Long getphn(){
        return phnno;
    }
    private Long phnno;
}
