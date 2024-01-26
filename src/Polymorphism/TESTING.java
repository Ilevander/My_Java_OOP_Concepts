package Polymorphism;

public class TESTING {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     /* var s = new Shape();
       s.info();   
         
      var c = new Circle();
       c.info(); 
       
       var r = new Rectangle(); 
       r.info();*/
        
       //int [] a = new int[3]; 
             
       /*var s1 = new Shape(); 
       var s2 = new Shape(); 
       var s3 = new Shape();  */
    		   
        Shape [] sh = new Shape[3];
    		/*sh[0]= s1;
    		sh[1] = s2; 
    		sh[2] = s3;*/
    		
    		//s1.info();
    		   
    		//or 
    		/*sh[0]= new Shape();
    		sh[1] = new Shape();
    		sh[2] = new Shape();
    		 */
    		/*sh[0].info();
    		sh[1].info();*/
    		//So in poly we can do this : 
    		sh[0]= new Shape();
    		sh[1] = new Circle();
    		sh[2] = new Rectangle();
    		//So we can do this : 
    		/*sh[0].info();
    		sh[1].info();
    		sh[2].info(); */
    		// Or is better to resume in loop : 
    		/*for (int i=0;i<sh.length;i++)
    		{
    			sh[i].info();
    		}*/
    		//Or  better to write this  :
    		for (Shape s : sh)
    		{ 
    			s.info(); 
    		}
    		 
    		
	}    
 
}
