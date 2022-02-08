public class assignment2 {
    public static int mult(int val1,int val2){
      return val1*val2;}
    public static int add(int val1,int val2){
      return val1+val2;}
    public static void subt(int val1,int val2){
        if (val1>val2) {
            int equals2=val1-val2;
            System.out.println("the difference  of "+ val1 + " and " + val2 +"  is "+ equals2);

        } else {
            System.out.println("the difference is a negative value");
    }
            
        }
   public static void div(int val1,int val2){
    if (val2!=0) {
        int equals4=val1/val2;
        System.out.println("the division of "+ val1+ " by "+val2 +"  is "+ equals4);
        } else {
        System.out.println("the second value cannot be a zero");
  }
    }
        public static void main(String[] args) {
            int val1=23;
            int val2=32;
            int equals=assignment2.mult(val1, val2);
            System.out.println("the multiplication of "+ val1+ " and "+val2 +"  is "+ equals);
            int val3=90;
            int val4=32;
            assignment2.subt(val3,val4);
            int val5=23;
            int val6=32;
            int equals3=assignment2.add(val5, val6);
            System.out.println("the addition of "+ val1+ " and "+val2 +"  is "+ equals3);
            int val7=290;
            int val8=0;
            assignment2.div(val7, val8);
        }    
        }