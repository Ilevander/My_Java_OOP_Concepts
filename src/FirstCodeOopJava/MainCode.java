package FirstCodeOopJava;

import java.util.Iterator;

public class MainCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Compte C1 = new Compte();
		
		System.out.println("L'éxeution de constructeur par défaut dans la première ligne par compiler.");
		System.out.println(C1.toString());
		Compte C2 = new Compte(100,"ToTo");
		System.out.println("L'éxeution de constructeur d'initialisation par compiler.");
		System.out.println(C2.toString());
		
		C1.deposer(10);
		System.out.println("Ajouter 10 dh à C1.");
		System.out.println(C1.toString());  
		
		C2.deposer(100);
		System.out.println("Ajouter 100 dh à C2.");
		System.out.println(C2.toString());
		
		C2.retirer(50);
		System.out.println("Ajouter 100 dh à C2.");
		System.out.println(C2.toString());
		
		C2.verserVers(50, C1);
		
		System.out.println("C1 après verssement");
		System.out.println(C1.toString());  
		
		System.out.println("C2 après verssement");
		System.out.println(C2.toString());  
		
		Compte [] accounts = new Compte[10];
		 
		for(int i =0;i<accounts.length;i++) 
		{  
			accounts[i] = new Compte(50,"9addour"); 
			accounts[i].deposer(200);
			System.out.println("Accounts : "+ accounts[i]);
		}
		  
		  
	} 
}
   