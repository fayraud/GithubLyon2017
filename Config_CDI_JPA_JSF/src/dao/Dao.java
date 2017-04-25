package dao;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import metier.Client;

public class Dao implements IDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpacdi-pu");

	@Override
	public long addClient(Client c) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(c);
		tx.commit();
		em.close();
		return c.getId();
	}

	@Override
	public Collection<Client> listClient() {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Collection<Client> client = em.createQuery("SELECT f From Client f").getResultList();
		em.close();
		return client;
	}

	@Override
	public void suppClient(Client client) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Client supp = new Client();
		supp = em.find(Client.class, client.getId());
		em.remove(supp);
		tx.commit();
		em.close();
		
	}

	@Override
	public void modifClient(Client client) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Client ad = new Client();
		ad = em.find(Client.class, client.getId());
		ad.setNom(client.getNom());
		ad.setPrenom(client.getPrenom());
		em.merge(ad);
		tx.commit();
		em.close();
		
		
	}

}
