public class overloading {
    public static void main(String[] args) {
        Car a = new Car();
        a.color("Black",2);
        a.color("White");
        a.toString();
    }
}
class  Car{
    public String color;
    public int number;
    public void color(String color,int number)
    {
        System.out.println(color);
        System.out.println(number);
    }
    public void color(String color)
    {
        System.out.println(color);
    }
    @Override
    public String toString()
    {
        return "Class Car";
    }
}
