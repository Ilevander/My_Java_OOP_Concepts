package Access_Modifier;

public class MainCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Access Modifier : How to access to attrs and modify them
		var a = new A();
		a.x1= 1;
		//a.x2=2;
		var b = new B();
		b.toto();
		//accessible only from its subclass 
	}

}
 