package entities;

import java.util.Scanner;

public class Client extends User {
    


public static int idClient;

	Scanner sc = new Scanner (System.in);
	private String numPermis;//
	
	public Client(String nom, String prenom, String cin,String tel, String login, String password, String numPermis ) {
		super(nom, prenom, cin, tel, login, password);
		this.numPermis = numPermis;
		setId(idClient++);
	}

	
	
	
	
//////////////////////////////////////////////////////////////REDIFINITION DES METHODES//////////////////////////////////////////////////////////////
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
		System.out.println(" 7 : MODIFIER NUMERO DE PERMIS");
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
		 case 7 : 
			 System.out.println("ENTRER LE NEAUVOUT NUMERO DE PERMIS : ");
			 this.numPermis = sc.next();
			 break;
		 default : 
			 finish = 0;
			 break;
		}
	}
	System.out.println("OPPERATION TERMINER ");	
	}
	
	
	//ToSTRING
	public String toString()

	{
		
		return super.toString()+"\nNUMERO DE PERMIS : "+numPermis;
		
	}
	
	//S'INSCRIRE 
	
	public static void Sinscrire(Client T[])
	{
		
		Scanner sc = new Scanner (System.in);
		String information[] = new String[7];
		
		System.out.println("##################### < < INSCRIPTION > > #####################");
		System.out.print("ENTRER VOTRE NOM : ");
		information[0] = sc.next();
		System.out.print("ENTRER VOTRE PRENOM : ");
		information[1] = sc.next();
		System.out.print("ENTRER VOTRE CIN : ");
		information[2] = sc.next();
		System.out.print("ENTRER VOTRE NUMERO DE TELEPHONE  : ");
		information[3] = sc.next();
		System.out.print("ENTRER VOTRE LOGIN : ");
		information[4] = sc.next();
		System.out.print("ENTRER VOTRE PASSWORD : ");
		information[5] = sc.next();
		System.out.print("ENTRER VOTRE NUMERO DE PERMIS : ");
		information[6] = sc.next();
		Client C = new Client(information[0],information[1],information[2],information[3],information[4],information[5],information[6]); 
		T[C.getId()] = C;
		
		System.out.println("################ < < INSCRIPTION TERMINEE > > #################");	}
	
//////////////////////////////////////////////////////////////FIN DE REDIFINITION/////////////////////////////////////////////////////////////

}
