package Lambda;
import java.util.ArrayList;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo d = new Demo() {
			@Override   
			public void sum(int a, int b) {
				System.out.println("Sum = "+(a+b));
			}
		};
		//Application from anonymous class 
		d.sum(1,2); 
		
		//Lambda Expression: ():Signature / {}:Body of function
		Demo dm =(int a, int b)->{System.out.println("Sum = "+(a+b));} ;
		dm.sum(2,3);
		
		//We can also write it like this: no data types needed and no{} because one instrunction.
		Demo dm2 =(a,b)->System.out.println("Sum = "+(a+b));
		dm.sum(1,1);
  
		//Other way to run sum method using the info() link 
 		Demo dm3 = Test::info;
		dm3.sum(4, 5);
		
		//Re-overiiding the Demo class anonymous:
		//To call a function from another function : Called higher order function
		Demo d2 = Test::info;
		d2.sum(3, 3);
		
		//Could be used as lambda:
		//(a,b) its for sum() method ,info() to use info() method as a higher 
		//Passer the a,b parametters into a,b of sum() into info() method
 		Demo d3 = (a,b)->info(a,b);
 		
 		System.out.println();
 		/*Other use in Lambda using ArrayList*/
 		var x = new ArrayList<Integer>();
		x.add(4);
		x.add(5);
		x.add(6);
		for (var i:x)
		{
			System.out.print("Item :");
			System.out.println(i);
		}
		  
		
		
		   
		   
	}   
	
	private	static void info(int a , int b)  
	{
		System.out.println("Sum = "+(a+b));
	}

} 
