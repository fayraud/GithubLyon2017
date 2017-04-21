package pjsf.jsf.exos;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



@ManagedBean(name="mbclients",eager=true)
@SessionScoped
public class MBClient {
	
	private ArrayList<Client> clients = new ArrayList<Client>();
	private Client client=new Client();
	private ClientService clientService;
	private Client clientCourant;
	
	public MBClient(){
		clientService = new ClientService();
	}

	public ArrayList<Client> getClients() {
		return clientService.getClients();
	}
	
	public int getNombre(){
		return clientService.getClients().size();
	}
	

	
	public Client getClientCourant(){
		return clientCourant;
	}
	
	public String select(Client client){
		this.clientCourant= client;
		return "clientDisplay";
	}
	
	public String delete(){
		clientService.delete(clientCourant);
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
		clientService.add(client);
		return "clients";
	}


	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	
}
