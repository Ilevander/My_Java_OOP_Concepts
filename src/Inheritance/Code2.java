package Inheritance;

//SUBCLASS AND SUPERCLASS
public class Code2 extends Code{
     int length; 
      
     public void info(int inLength, int inA) 
     { 
    	 this.length = inLength;
    	 //Using attrs of super class Code:
    	 super.a=inA;
    	 System.out.println("Length : "+length+"a Number : "+a);
    	 
     } 
}   
   