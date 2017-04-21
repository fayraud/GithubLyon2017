package pjsf.jsf.exos;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;




public class ClientService {
	
	ArrayList<Client> clients = new ArrayList<Client>();

	
	public ClientService(){
	
		clients.add(new Client("Dupont","Jean"));
		clients.add(new Client("Durand","Paul"));
	}

	public ArrayList<Client> getClients() {
		return clients;
	}
/*
	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}
	*/
	public int getNombre(){
		return clients.size();
	}
	
	private Client clientCourant;
	
	//public Client getClientCourant(){
	//	return clientCourant;
	//}
	
	//public String select(Client client){
	//	this.clientCourant= client;
	//	System.out.println("selected : "+client.getNom());
		//return "client";
	//}
	
	public void delete(Client client){
		clients.remove(client);
		
	}
	
	
	/*private void delete(Client clientToDelete){
		ArrayList<Client> newClients = new ArrayList<Client>();
		for (Client client : clients){
			if(!client.getNom().equals(clientToDelete.getNom())){
				newClients.add(client);
			}
		}
		clients = newClients;
	}
	*/
	
	public void add(Client client){
		
		clients.add(client);
		
	}

	//public Client getClient() {
	//	return client;
	//}

	//public void setClient(Client client) {
	//	this.client = client;
	//}


}
