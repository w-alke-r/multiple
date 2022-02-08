public class Odd
{
    public static void main(String args[])
    {
        int odd=0,count=0;
        System.out.print("The numbers are: ");
    for(int num=1; num<=10;num++)
    {
        
        if(num%2!=0)
        {
            odd=num;
            count++;
            System.out.print(" "+odd);
        }
    }
    System.out.println(" ");
    System.out.println(" "+count+"numbers");
    }
}