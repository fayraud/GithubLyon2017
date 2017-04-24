package metier;
public abstract class ConstructeurLiasseVehicule
{
  protected Liasse liasse;

  public abstract void construitBonDeCommande(String
    nomClient);

  public abstract void construitDemandeImmatriculation
    (String nomDemandeur);

  public Liasse resultat()
  {
    return liasse;
  }
}
