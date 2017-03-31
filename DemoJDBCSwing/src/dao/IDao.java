package dao;

import java.util.Collection;

import metier.Client;

public interface IDao {
	
	public void ajouterClient (Client c);
	public void modifierClient(int id, String nom,String prenom);
	public void supprimerClient(int id);
	public Collection<Client> listerClients();
	public Collection<Client> chercherParMC(String mc); // recherche par mots clef de nom
	public Client trouverClientId(int id);
	

}
