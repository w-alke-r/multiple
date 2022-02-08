import java.util.Scanner;
public class firstarray 
{
    public static void main(String[] args)
    {
        float sum=0,average;
        Scanner w= new Scanner(System.in);
        int walker[]=new int[5];
       // int y=w.nextInt();
    for (int f = 0; f < walker.length; f++) {
        walker[f]=w.nextInt();
    }

            for(int k=0; k<walker.length; k++)
            {
                System.out.println(walker[k]);
                sum=sum+walker[k];
            }
            average=sum/5;
            System.out.println(sum+" "+average);
    }
}
