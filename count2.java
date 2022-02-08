import java.util.Scanner;
 class count2 {
 public static void main(String[] args) {
    float sum,difference,product,quotient,remainder;
      Scanner myObj = new Scanner(System.in);

       System.out.println("enter a and b:");
       int a = myObj.nextInt();
       float b = myObj.nextFloat();
       sum=a+b;
       System.out.println("sum= "+sum);

       System.out.println("enter c and d:");
       int c = myObj.nextInt();
       float d = myObj.nextFloat();
       if(c<d)
       {
           System.out.println("value 1 is less than value 2");
       }
       else
       {
       difference= c-d;
       System.out.println("difference = "+difference);
       }

       System.out.println("enter e and f:");
       int e = myObj.nextInt();
       float f = myObj.nextFloat();
       product= e*f;
       System.out.println("product = "+product);

       System.out.println("enter g and h:");
       int g = myObj.nextInt();
       float h = myObj.nextFloat();
       if(h==0)
       {
           System.out.println("we cannot divide by zero");
       }
       else{
       quotient= g/h;
       System.out.println("quotient = "+quotient);
       }

       System.out.println("enter i and j:");
       int i = myObj.nextInt();
       float j = myObj.nextFloat();
       remainder= i%j;
       System.out.println("remainder = "+remainder);
    }
   
}
