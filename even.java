public class even {
    public static void main(String[] args) {
        int num,count=0,even=0;
        System.out.println("even numbers are");
        for(num=0; num<=12; num++)
        {
            if(num%2==0)
            {
                even=num;
                count++;
                System.out.print(" "+even);
            }
        }
        System.out.print("\n"+count);
    }
    
}
