package metier;

public class Client {
	private int id;
	private String nom;
	private String prenom;
	private String couleurYeux;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getCouleurYeux() {
		return couleurYeux;
	}
	public void setCouleurYeux(String couleur) {
		this.couleurYeux = couleur;
	}
	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", couleur des Yeux=" + couleurYeux + "]";
	}
	
	
	
}
