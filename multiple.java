import java.util.Scanner;
public class multiple
 {
    public static void main(String[] args)
     {
        Scanner myNum=new Scanner(System.in);

        System.out.println("Enter num1 and num 2");

        int num1=myNum.nextInt();

        int num2=myNum.nextInt();

        if(num1%num2==0)
        {
            System.out.println("num1 is a multiple of num2");
        }
        else
        {
            System.out.println(num1%num2);
        }
    }
}
