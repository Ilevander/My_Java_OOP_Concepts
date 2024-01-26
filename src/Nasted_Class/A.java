package Nasted_Class;

//Outer class
public class A {
  static public void info()
  { 
	  System.out.println("A");
  }
  //inner class
   static class B 
  {
	  public void info2() {
		  System.out.println("B");
		  //could be used like that if it is static too
		  info();
	  } 
  }
}   
      