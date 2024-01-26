package Anonymous;

public class MainCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		/*var b= new B();
         b.info();*/
          
         //Anonymous class
         var x = new A() {
        	        @Override
        	        public void info()
        	        {
        	        	System.out.println("Morroco from anonymous class");
        	        }
        		 }; 
        x.info();  	 
         
        var p = new Poly();
        p.poly(x);
        		 
	}

}

class Poly{
	public void poly(A a)
	{
		a.info();
	} 
}