package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;



import metier.Client;

public class Dao implements IDao {

	public Dao() {
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void ajouterClient(Client c) {
		// TODO Auto-generated method stub
		
		try {
			//1-charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			//2- créer la connexion
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bddcLients","root","");
			//3- créer la requete
			PreparedStatement ps = conn.prepareStatement("INSERT INTO CLIENT (nom,prenom,couleurdesyeux) VALUES (?,?,?)");
			ps.setString(1, c.getNom());
			ps.setString(2, c.getPrenom());
			ps.setString(3, c.getCouleurYeux());
			//4- executer la requete
			ps.executeUpdate();
			//5- présenter les resultats
			
			//6- fermer la connection
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			
		}
			// code qui est executé quelque soit les etapes précedentes
	}

	@Override
	public void modifierClient(int id, String nom, String prenom) {
		// TODO Auto-generated method stub
		try {
			//1-charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			//2- créer la connexion
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bddcLients","root","");
			//3- créer la requete
			PreparedStatement ps = conn.prepareStatement("UPDATE Client SET nom = ? , prenom = ? where id = ?");
			ps.setString(1,  nom);
			ps.setString(2, prenom);
			ps.setInt(3, id);
			//4- executer la requete
			ps.executeUpdate();
			//5- présenter les resultats
			
			//6- fermer la connection
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			
		}

	}

	@Override
	public void supprimerClient(int id) {

		// TODO Auto-generated method stub
		Collection<Client> cl = new ArrayList<Client>();
		
		
		try {
			//1-charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			//2- créer la connexion
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bddcLients","root","");
			//3- créer la requete
			PreparedStatement ps = conn.prepareStatement("delete from client where id=?");
			ps.setInt(1, id);
			//4- executer la requete
			ps.executeUpdate();
			//5- présenter les resultats
		
				
			
			//6- fermer la connection
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			
		}
		
	
	}

	@Override
	public Collection<Client> listerClients() {
		// TODO Auto-generated method stub
		Collection<Client> cl = new ArrayList<Client>();
		try {
			//1-charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			//2- créer la connexion
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bddcLients","root","");
			//3- créer la requete
			PreparedStatement ps = conn.prepareStatement("select * from client");
			//4- executer la requete
			ResultSet rs=ps.executeQuery();
			//5- présenter les resultats
			while(rs.next())
			{
				Client c = new Client();
				c.setId(rs.getInt("id"));
				c.setNom(rs.getString("nom"));
				c.setPrenom(rs.getString("prenom"));
				c.setCouleurYeux(rs.getString("couleurdesyeux"));
				cl.add(c);
			}
			//6- fermer la connection
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			
		}
		return cl;
	}

	@Override
	public Collection<Client> chercherParMC(String mc) {
		// TODO Auto-generated method stub
		Collection<Client> cl = new ArrayList<Client>();
		try {
			//1-charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			//2- créer la connexion
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bddcLients","root","");
			//3- créer la requete
			PreparedStatement ps = conn.prepareStatement("select * from client where nom like ?");
			ps.setString(1, "%"+mc+"%");
			//4- executer la requete
			ResultSet rs=ps.executeQuery();
			//5- présenter les resultats
			while(rs.next())
			{
				Client c = new Client();
				c.setId(rs.getInt("id"));
				c.setNom(rs.getString("nom"));
				c.setPrenom(rs.getString("prenom"));
				c.setCouleurYeux(rs.getString("couleurdesyeux"));
				cl.add(c);
			}
			//6- fermer la connection
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			
		}
		return cl;
	}

	@Override
	public Client trouverClientId(int id) {

		// TODO Auto-generated method stub
		Collection<Client> cl = new ArrayList<Client>();
		Client c = new Client();
		
		try {
			//1-charger le pilote
			Class.forName("com.mysql.jdbc.Driver");
			//2- créer la connexion
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bddcLients","root","");
			//3- créer la requete
			PreparedStatement ps = conn.prepareStatement("select * from client where id=?");
			ps.setInt(1, id);
			//4- executer la requete
			ResultSet rs=ps.executeQuery();
			//5- présenter les resultats
			rs.next();
			
			
				c.setId(rs.getInt("id"));
				c.setNom(rs.getString("nom"));
				c.setPrenom(rs.getString("prenom"));
				
			
			//6- fermer la connection
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			
		}
		return c;
	
	}

}
