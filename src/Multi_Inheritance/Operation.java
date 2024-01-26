package Multi_Inheritance;

public class Operation implements Sum,Sub{
     @Override    
     public void sum(int a,int b)
     {
    	 System.out.println("Sum = "+(a+b));
     }  
      
     @Override
     public void sub (int a,int b)
     {
     	System.out.println(a+"-"+b+"="+(a-b));
     }
   
}
   