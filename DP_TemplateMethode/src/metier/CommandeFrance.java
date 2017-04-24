package metier;
public class CommandeFrance extends Commande
{
  protected void calculeTva()
  {
    montantTva = montantHt * 0.196;
  }
}
