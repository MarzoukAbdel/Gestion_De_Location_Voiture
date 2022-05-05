package entities;

import java.util.Scanner;

public abstract class Agent extends User {
	
	Scanner sc = new Scanner (System.in);

	public Agent(String nom, String prenom, String cin, String tel, String login, String password) {
		super(nom, prenom, cin, tel, login, password);
	}

	
	
/////////////////////////////////////////////////////////////REDIFINITION DES METHODES//////////////////////////////////////////////////////////////
	@Override
public void ModifierCompte() {
		
		
		int finish =1;
		
		
		while (finish !=0)
	{
		
		System.out.println(" 0 : ANNULER L'OPERATION");
		System.out.println(" 1 : MODIFIER NOM");
		System.out.println(" 2 : MODIFIER PRENOM");
		System.out.println(" 3 : MODIFIER CIN");
		System.out.println(" 4 : MODIFIER NUMERO DE TELEPHONE");
		System.out.println(" 5 : MODIFIER LOGIN");
		System.out.println(" 6 : MODIFIER PASSWORD");
		int choix = sc.nextInt();
		
		switch (choix) {
		
		 case 0 :
			 finish = 0;
			 break;
		 case 1 : 
			 System.out.println("ENTRER LE NEAUVOUT NOM : ");
			 this.setNom(sc.next());
			 break;
		 case 2 : 
			 System.out.println("ENTRER LE NEAUVOUT PRENOM : ");
			 this.setPrenom(sc.next());
			 break;
		 case 3 : 
			 System.out.println("ENTRER LE NEAUVOUT CIN : ");
			 this.setCin(sc.next());
			 break;
		 case 4 : 
			 System.out.println("ENTRER LE NEAUVOUT NUMERO DE TELEPHONE : ");
			 this.setTel(sc.next());
			 break;
		 case 5 : 
			 System.out.println("ENTRER LE NEAUVOUT LOGIN : ");
			 this.setLogin(sc.next());
			 break;
		 case 6 : 
			 System.out.println("ENTRER LE NEAUVOUT PASSWORD : ");
			 this.setPassword(sc.next());
			 break;
		 default : 
			 finish = 0;
			 break;
		}
	}
	System.out.println("OPPERATION TERMINER ");	
	}
	
	
	public String toString()

{
		
  return super.toString()	;	
}
//////////////////////////////////////////////////////////////FIN DE REDIFINITION/////////////////////////////////////////////////////////////
}
