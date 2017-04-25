package MBeans;

import java.util.ArrayList;
import java.util.Collection;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import metier.Client;
import service.IService;

@ManagedBean
@ViewScoped
@Named
public class ClientBean {

	@Inject
	private IService service;

	private Client client = new Client();
	private Collection<Client> clients = new ArrayList<Client>();
	private boolean editMode = false; // false en ajout true en modi

	public boolean isEditMode() {
		return editMode;
	}

	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}

	public Collection<Client> getClients() {
		return service.getClients();
	}

	public void setClients(Collection<Client> clients) {
		this.clients = clients;
	}

	public IService getService() {
		return service;
	}

	public void setService(IService service) {
		this.service = service;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public String supprimer(Client client) {
		service.suppClient(client);
		return "index";
	}

	public void modifier() {
		editMode=true;
		
	}

	public String add() {
	
		if (!client.getNom().equalsIgnoreCase("") && !client.getPrenom().equalsIgnoreCase("")) {
			if (editMode == false) {
				service.addClient(client);
			} else {
				service.modifClient(client);
				editMode = false;
			}

		}
		else{
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage("client", new FacesMessage("veuiller saisir les valeurs non nulles"));
		}
		client = new Client();
		return "index";
	}

}
