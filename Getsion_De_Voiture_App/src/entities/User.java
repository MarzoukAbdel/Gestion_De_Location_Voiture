package entities;

import java.util.Scanner;

public abstract class User {
	
	
	private int id;
	private String nom;
	private String prenom;
	private String cin;
	private String tel;
	private String login;
	private String password;
	
	//CONSTRUCTEUR
	public User(String nom, String prenom, String cin, String tel, String login,String password) 
	{
		
		this.nom = nom;
		this.prenom = prenom;
		this.cin = cin;
		this.tel = tel;
		this.login = login;
		this.password = password;
	}
	
	
	
	
	
////////////////////////////////////////////////////////////////DEBUT GETTERS SETTERS////////////////////////////////////////////////////////////////
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
    
	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public String getCin() {
		return cin;
	}



	public void setCin(String cin) {
		this.cin = cin;
	}



	public String getTel() {
		return tel;
	}



	public void setTel(String tel) {
		this.tel = tel;
	}



	public String getLogin() {
		return login;
	}



	public void setLogin(String login) {
		this.login = login;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}
////////////////////////////////////////////////////////////////FIN GETTERS SETTERS////////////////////////////////////////////////////////////////
	
	
	


////////////////////////////////////////////////////////////LES METHODE  DE SUPER CLASS///////////////////////////////////////////////////////////
	
	//METHODE DE LOGIN 
	public static  User login(User []T)
	
	{
		Scanner sc =new Scanner(System.in);
		int finish = 1;
		do
		{
		 System.out.println("LOGIN  : ");
		 String login_ = sc.next();
		 System.out.println("PASSWORD :");
		 String pass_ = sc.next();
		 
		 for (int i= 0 ; i <Client.idClient; i++)
		 {
		  if(T[i].login.equals(login_))
		  {
			  if(T[i].password.equals(pass_))
			  {
				  
				 return T[i]; //RETOURN LE USER 
				  
			  }
			  else
			  {
				  
				  break;
			  }
		  }
		  else
		  {
			  
			 continue;
		  }
		  
	 
		 }
		 
		 System.out.println("LOGIN OU MOTE DE PASS INCORECTE !!");
		 finish++;
		 
		} while(finish<=3);
		
		
		System.out.println("VEILLIER ESSEYER PLUS TARD ");
		return null;
	}
	
	
	
	 //METHODE ABSTRACT MODIFIER COMPTE 
	public abstract void ModifierCompte();
	
	
	//MTHODE CONSULTER VOITURE 
	public void ConsulterVoiture() {
		
		
	}
	
	
	//METHODE TO STRING 
	public String toString()
	{
		String className = this.getClass().getSimpleName();
		
		return "LE "+className+"\nNom : "+nom+"\nPrenom : "+prenom+"\nCIN : "+cin+"\nlogin : "+login+"\nTELEPHONE :"+tel;
		
		
	}
	
/////////////////////////////////////////////////////////FIN LES METHODE  DE SUPER CLASS///////////////////////////////////////////////////////////	  
	  
	  
	  
	  
}