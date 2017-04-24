
package lanceur;

import metier.Marque;
import metier.Modele;
import metier.ObjetBase;
import metier.Vehicule;

public class Utilisateur {

	public static void main(String[] args) {
		ObjetBase vehicule1 = new Vehicule("Auto++ KT500 Véhicule d'occasion en bon état ");
		System.out.println(vehicule1.getDescription());
		ObjetBase modele1 = new Modele("KT400", "Le véhicule spacieux et confortable");
		ObjetBase vehicule2 = new Vehicule(null);
		vehicule2.setSuivant(modele1);
		System.out.println(vehicule2.getDescription());
		ObjetBase marque1 = new Marque("Auto++", "La marque des autos", "de grande qualité");
		ObjetBase modele2 = new Modele("KT700", null);
		modele2.setSuivant(marque1);
		ObjetBase vehicule3 = new Vehicule(null);
		vehicule3.setSuivant(modele2);
		System.out.println(vehicule3.getDescription());
		ObjetBase vehicule4 = new Vehicule(null);
		System.out.println(vehicule4.getDescription());
	}
}
