abstract class Shape
{
    abstract int area();
    abstract int perimeter();
}
class Rectangle extends Shape
{
    private int length,width;
    public Rectangle(int l,int w)
    {
        length=l;
        width=w;
    }
    public int area()
    {
        return length*width;
    }
    public int perimeter()
    {
        return 2*(length+width);
    }

}
public class Program
{
    public static void main(String argv[])
    {
        Rectangle rect=new Rectangle (6,5);
        System.out.println("The area is:"+rect.area());
    }
}

