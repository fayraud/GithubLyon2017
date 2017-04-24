package metier;
public class ConstructeurLiasseVehiculeHtml extends
  ConstructeurLiasseVehicule
{
  public ConstructeurLiasseVehiculeHtml()
  {
    liasse = new LiasseHtml();
  }

  public void construitBonDeCommande(String nomClient)
  {
    String document;
    document = "<HTML>Bon de commande Client : " +
      nomClient + "</HTML>";
    liasse.ajouteDocument(document);
  }

  public void construitDemandeImmatriculation(String
    nomDemandeur)
  {
    String document;
    document = 
      "<HTML>Demande d'immatriculation Demandeur : " +
      nomDemandeur + "</HTML>";
    liasse.ajouteDocument(document);
  }
}
