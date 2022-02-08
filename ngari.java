public class ngari extends gari
 {
    public static void main(String[] args)
    {
   ngari display = new ngari();
   System.out.println(display.lights);
   display.roar();
}
    
}
class gari 
{
    
    String lights= "red";
    protected void roar()
    {
        System.out.println("grrr, grrr");
    }
}