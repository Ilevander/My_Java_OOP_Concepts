package SuperConstructor;

public class B extends A{
	B(){
		super(); 
    	System.out.println("* B *");
    }    
	    
	B(int n){ 
	 super(n);  
    	System.out.println("* B *"+n);
    } 
}   
  