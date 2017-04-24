package metier;

public class ScooterElectricte extends Scooter {
	
	

	public ScooterElectricte(String modele, String couleur, int puissance) {
		super(modele, couleur, puissance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void afficheCaracteristiques() {
		System.out.println("Scooter electrique de modèle " + modele+" de couleur "+couleur+" de puissance "+puissance);

	}

}
