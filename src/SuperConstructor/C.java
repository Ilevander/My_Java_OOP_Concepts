package SuperConstructor;

public class C extends B{
    C(){
    	super();  
    	System.out.println("* C *");
    } 
    C(int inA){ 
    	super(inA);  
    	System.out.println("* C *");
    }
} 
    