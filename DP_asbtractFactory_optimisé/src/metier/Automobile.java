package metier;

public abstract class Automobile extends Vehicule{
	
	protected double  espace;
	
	public Automobile(String modele, String couleur, int puissance, double espace) {
		super(modele,couleur,puissance);
		this.espace = espace;
	}
	
	public abstract void afficheCaracteristiques();

}
