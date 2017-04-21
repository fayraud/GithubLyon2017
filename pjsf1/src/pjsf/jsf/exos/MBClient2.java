package pjsf.jsf.exos;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



@ManagedBean(name="mbclients",eager=true)
@SessionScoped
public class MBClient2 {
	ArrayList<Client> clients = new ArrayList<Client>();
	private Client client=new Client();
	
	public MBClient2(){
		//System.out.println("Constructeur MBClients");
		clients.add(new Client("Dupont","Jean"));
		clients.add(new Client("Durand","Paul"));
	}

	public ArrayList<Client> getClients() {
		//System.out.println("get MBClients");
		return clients;
	}

	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}
	
	public int getNombre(){
		return clients.size();
	}
	
	private Client clientCourant;
	
	public Client getClientCourant(){
		return clientCourant;
	}
	
	public String select(Client client){
		this.clientCourant= client;
		System.out.println("selected : "+client.getNom());
		return "client";
	}
	
	public String delete(){
		System.out.println("deleting : "+clientCourant.getNom());
		clients.remove(clientCourant);
		return "clients";
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
	
	public String add(Client client){
		Client newClient= new Client(client.getNom(), client.getPrenom());
		client.setNom("");
		client.setPrenom("");
		System.out.println("adding : "+newClient.getNom());
		clients.add(newClient);
		return "clients";
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}


}
