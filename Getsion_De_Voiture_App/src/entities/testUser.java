package entities;

public class testUser {

	public static void main(String[] args) {
	   
		Client As[] = new Client [5];
		
		
		Client.Sinscrire(As);
		User A = Client.login(As);
		
		
		
		
		for (int i=0 ; i<Client.idClient ; i++)
		{
			
			System.out.println(As[i].toString()+"\n\n");
		
		}

	}

}
