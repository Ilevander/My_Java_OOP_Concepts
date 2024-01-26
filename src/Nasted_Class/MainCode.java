package Nasted_Class;

public class MainCode {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       var a = new A();
      // a.info();
          
       //var b =new B(); 
       var b =new A.B();
       //static to access directly to somthing
       b.info2(); 
       myTest();  
	} 
	 
	public static void myTest()
	{//This class is not visible because of the method
		class B{
			public void info2()
			{
				System.out.println("B from the class inside myTest function");
			}
		}
		var b = new B();
		b.info2();
	}

}  
    