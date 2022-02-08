public class loopss{
    public static void main(String argv[])
    {
        int max=1;
        double sum=0,average;
        while(max<=10)
        {
           // System.out.println(max);
            max=max+1;
        
        if(max%2==0)
        {
            System.out.println("Even number:"+max);
        }
        else
        {
            System.out.println("odd number :"+max);  
        }    
    }
    for(int i=1; i<=max; i++){
        sum=sum+i;
    }
        System.out.println("sum= "+sum);
    average=sum/11;
    System.out.println("average= "+average);
}
}
