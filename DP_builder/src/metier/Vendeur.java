package metier;
public class Vendeur
{
  protected ConstructeurLiasseVehicule constructeur;

  public Vendeur(ConstructeurLiasseVehicule constructeur)
  {
    this.constructeur = constructeur;
  }

  public Liasse construit(String nomClient)
  {
    constructeur.construitBonDeCommande(nomClient);
    constructeur.construitDemandeImmatriculation
      (nomClient);
    Liasse liasse = constructeur.resultat();
    return liasse;
  }
}
