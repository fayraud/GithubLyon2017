package presentation;

import metier.Canard;
import metier.CanardPlastique;
import metier.Colvert;
import metier.Leurre;

public class Lanceur {

	public static void main(String[] args) {
		Canard c1 =new Colvert();
		Canard c2 =new Leurre();
		Canard c3 =new CanardPlastique();
		
		c1.nager();
		c1.cancaner();
		c1.afficher();
		c2.nager();
		c2.cancaner();
		c2.afficher();
		c3.nager();
		c3.cancaner();
		c3.afficher();

	}

}
