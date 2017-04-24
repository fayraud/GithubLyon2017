package metier;

public class Leurre extends Canard {

	public Leurre(){
		super();
		comportementCancan= new CancanMuet();
		comportementVol= new NePasVoler();
	}
	

	public void afficher(){
		System.out.println("je suis un Leurre");
		
	}
	

}
