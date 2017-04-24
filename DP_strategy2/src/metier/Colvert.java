package metier;

public class Colvert extends Canard {
	public Colvert(){
		super();
		comportementCancan= new Cancan();
		comportementVol= new VolerAvecDesAiles();
	}

	
	public void afficher(){
		System.out.println("je suis un Colvert");
		
	}
	

}
