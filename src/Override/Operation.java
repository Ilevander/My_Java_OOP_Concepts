package Override;

public class Operation extends Sum {
	//Overloading
	public void sum(int x,double y)
    {
    	System.out.println(x+"+"+y+"="+(x+y));
    }
	//Override : Changing the body of function:
	
		//UPDATE of existing method : 
		
	    @Override
		 public void sum(int x,int y)
	    {
	        System.out.println("Hello Im an Overriding of sum method");
	    }
}
