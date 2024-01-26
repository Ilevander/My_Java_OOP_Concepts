package Constructors;
  
public class Code {
	  int lines;
	  int l1; 
	  int l2;
        Code(){ 
        	 this.lines=23;
        	 System.out.println("Lines : "+this.lines);
         } 
        Code(int a, int b){
        	System.out.println("Sum ="+(a+b));
        } 
        Code(int a,int b,int c){
       	 this.lines=10;
       	System.out.println("Sum ="+(a+b+c));
        }     
        public void sum(int a,int b)
        {   
        	System.out.println("Sum ="+(a+b));
        } 
        /*public static void toto(int c,int d)
        {
     	   System.out.println("Sum ="+(c+d));
        } */
        //Overloading   
        /*public void sum(int  a,double b)
        {
        	System.out.println("Sum ="+(a+b));
        } */ 
        
}
   