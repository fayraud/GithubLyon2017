package service;

import java.util.Collection;

import javax.inject.Inject;

import dao.IDao;
import metier.Client;

public class ServiceImpl implements IService {

	@Inject
	private IDao dao;

	@Override
	public long addClient(Client c) {
		return dao.addClient(c);
	}

	@Override
	public Collection<Client> getClients() {
		return dao.listClient();
	}

	@Override
	public void suppClient(Client client) {
		dao.suppClient(client);
		
	}

	@Override
	public void modifClient(Client client) {
		dao.modifClient(client);
		
	}

}
