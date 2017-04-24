package presentation;

import metier.Boisson;
import metier.Caramel;
import metier.Chocolat;
import metier.Colombia;
import metier.Expresso;

public class ApplicationDecorateur {

	public static void main(String[] args) {
		
		
		Boisson b1 = new Expresso();
		System.out.println(b1.getDescription()+" coute : "+ b1.cout()+"€");
		
		
		Boisson b2 = new Colombia();
		b2 = new Caramel(b2);
		b2 = new Chocolat(b2);
		int i=0;
		while (i<50){
			b2 = new Chocolat(b2);
			i=i+1;
		}
		
		
	
		System.out.println(b2.getDescription()+" coute : "+ b2.cout()+"€");

	}

}

