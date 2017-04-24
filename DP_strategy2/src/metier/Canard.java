package metier;

public abstract class Canard {
	protected IComportementVol comportementVol;
	protected IComportementCancan comportementCancan;
	
	public void effectuerCancan(){
		comportementCancan.cancaner();
	}
	public void effectuerVol(){
		comportementVol.voler();
	}
	
	public void effectuerNage(){
		System.out.println("Je nage");
	}
	
	
	public IComportementVol getComportementVol() {
		return comportementVol;
	}
	public void setComportementVol(IComportementVol comportementVol) {
		this.comportementVol = comportementVol;
	}
	public IComportementCancan getComportementCancan() {
		return comportementCancan;
	}
	public void setComportementCancan(IComportementCancan comportementCancan) {
		this.comportementCancan = comportementCancan;
	}
	
	public abstract void afficher();
	
	
	


}
