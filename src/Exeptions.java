 
public class Exeptions {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     info(5);
	}
	 
	public static void info(int x)
		{
			var ex = new Exception(); 
		 	
			try { 
				if (x==5) {throw ex;}
				System.out.println("Number = "+x);
			}
			
			 catch (Exception e){
				 System.out.println("THis is not accepted !!");

				 System.out.println(e);
			 } 
			
		} 
 
}
 