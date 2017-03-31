package presentation;

import java.util.ArrayList;
import java.util.Collection;

import metier.Client;
import service.ClientService;
import service.IClientService;
import service.IClientServiceVip;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// déclaration de l'interface
		IClientService s = new ClientService();
		IClientServiceVip sv = new ClientService();
		Collection<Client> col = new ArrayList<Client>();
		Client c = new Client();
		//declaration de la classe;
		ClientService cs = new ClientService();
		System.out.println("--------------CLIENT NORMAL-------------------------------");		
		// utilisation de l'interface
		s.direAurevoir();
		s.direBonjour();
		//s.jesuisVip();
		System.out.println("--------------CLIENT VIP---------------------------------");
		sv.direBonjour();
		sv.direAurevoir();
		sv.jesuisVip();
		
		//utilisation de la classe
		/*cs.direAurevoir();
		cs.direBonjour();
		cs.jesuisVip();*/
		
		
		
		/*
		System.out.println("---------------AJOUTER UN CLIENT----------------");
		c.setNom("toto");c.setPrenom("titi");c.setCouleurYeux("rouge");
		s.ajouterClient(c);
	

		System.out.println("---------------AJOUTER UN CLIENT----------------");
		c.setNom("Bel");c.setPrenom("Nicole");
		s.ajouterClient(c);
		System.out.println("---------------AJOUTER UN CLIENT----------------");
		c.setNom("Finet");c.setPrenom("Myriam");
		s.ajouterClient(c);
		System.out.println("---------------AJOUTER UN CLIENT----------------");
		c.setNom("Ousset");c.setPrenom("Melanie");
		s.ajouterClient(c);
		System.out.println("---------------AJOUTER UN CLIENT----------------");
		c.setNom("Pernet");c.setPrenom("Sebastien");
		s.ajouterClient(c);
	
		
		

 System.out.println("-------------------SUPPRIMER CLIENT---------------");
		
		

		s.supprimerClient(9256);
	
	
		System.out.println("-------------------UPDATE CLIENT---------------");
		
		s.modifierClient(10014,"Pernet", "Sebastien");
		
		System.out.println("---------------LISTER TOUS LES CLIENTS----------------");
		col = s.listerClients();
		for(Client cli : col)
		{
			System.out.println(cli);
		}
		
		
System.out.println("-------------------TROUVER CLIENT---------------");
		
		
		System.out.println(s.trouverClientId(10014));
			*/
		System.out.println("---------------LISTER TOUS LES CLIENTS----------------");
		col = s.listerClients();
		for(Client cli : col)
		{
			System.out.println(cli);
		}
		System.out.println();

		System.out.println("---------------RECHERCHE CLIENTS PAR MOTS CLEFS----------------");
		col = s.chercherParMC("t");
		for(Client cli : col)
		{
			System.out.println(cli);
		}
		Fenetre f = new Fenetre("Ma Fenetre");
		f.setVisible(true);
	}
	

}
