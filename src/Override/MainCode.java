package Override;

public class MainCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //var op = new Operation();
        var s = new Sum();
        s.sum(2,3);
        var op = new Operation();
        op.sum(3,2.5);
        var op2 = new Operation();
        op2.sum(1, 2);
        		
	}

}
