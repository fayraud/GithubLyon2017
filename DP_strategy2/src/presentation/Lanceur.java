package presentation;

import metier.Canard;
import metier.Coincoin;
import metier.Colvert;
import metier.Leurre;
import metier.VolerAvecDesAiles;

public class Lanceur {

	public static void main(String[] args) {
		
			
					Canard colvert = new Colvert();
					colvert.afficher();
					colvert.effectuerNage();
					colvert.effectuerCancan();
					colvert.effectuerVol();
					System.out.println("  -----------------------------------");
					
					Canard leurre = new Leurre();
					leurre.afficher();
					leurre.effectuerNage();
					leurre.effectuerCancan();
					leurre.effectuerVol();
					System.out.println("  -----------------------------------");
					
					Canard plastoc = new Leurre();
					plastoc.afficher();
					plastoc.effectuerNage();
					plastoc.effectuerCancan();
					plastoc.effectuerVol();
					System.out.println("  -----------------------------------");
					
					leurre.setComportementCancan(new Coincoin());
					leurre.setComportementVol(new VolerAvecDesAiles());
					
				
					leurre.afficher();
					leurre.effectuerNage();
					leurre.effectuerCancan();
					leurre.effectuerVol();
					System.out.println("  -----------------------------------");
					
				
				
	}

}
