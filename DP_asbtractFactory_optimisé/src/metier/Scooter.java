package metier;

public abstract class Scooter extends Vehicule {
	
	
	public Scooter(String modele, String couleur, int puissance) {
		super(modele,couleur,puissance);
		
		
	}
	
	public abstract void afficheCaracteristiques();

}
