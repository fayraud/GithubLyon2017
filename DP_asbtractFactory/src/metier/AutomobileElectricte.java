package metier;

public class AutomobileElectricte extends Automobile {
	
	

	public AutomobileElectricte(String modele, String couleur, int puissance, double espace) {
		super(modele, couleur, puissance, espace);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void afficheCaracteristiques() {
		System.out.println("Automobile electrique de mod�le " + modele+" de couleur "+couleur+" de puissance "+puissance+" d'espace "+espace);

	}

}
