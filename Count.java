public class Count{
    public static void main(String argv[])
    {
    float value1=3,value2=6;
    float sum,product,quotient,difference;
    sum=value1+value2;
    System.out.println("The sum of the two numers is:"+sum);
    product=value1*value2;
    System.out.println("The product of the two numbers is:"+product);
    if (value2==0)
    {
    System.out.println("We cannot divide by 0");
    }
    else
    {
    quotient=value1/value2;
        System.out.println("upon division we get"+quotient);
    }
    if(value2>value1)
    {
    System.out.println("value1 is less than value2");
    }
    else
    {
    difference=value1-value2;
     System.out.println("The difference is"+difference);
    }
    
}
}