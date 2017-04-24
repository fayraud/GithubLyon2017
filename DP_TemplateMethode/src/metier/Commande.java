package metier;
public abstract class Commande
{
  protected double montantHt;
  protected double montantTva;
  protected double montantTtc;

  protected abstract void calculeTva();

  public void calculeMontantTtc()
  {
    this.calculeTva();
    montantTtc = montantHt + montantTva;
  }

  public void setMontantHt(double montantHt)
  {
    this.montantHt = montantHt;
  }

  public void affiche()
  {
    System.out.println("Commande");
    System.out.println("Montant HT " + montantHt);
    System.out.println("Montant TTC " + montantTtc);
  }
}
