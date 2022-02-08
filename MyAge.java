public class MyAge
{
    String name;
    int currentYear;
    int DOB;
    public static int CalculateAge(int DOB,int currentYear) 
    {
        return  currentYear-DOB;
    }
    public static void main(String[] args)
    {
        MyAge lakeshia=new MyAge();
        lakeshia.currentYear=2022;
        lakeshia.name="lakeshia"; 
        lakeshia.DOB=2000;
        int age = CalculateAge(lakeshia.DOB,lakeshia.currentYear);
        System.out.println("Age = "+age);
    }
    

}