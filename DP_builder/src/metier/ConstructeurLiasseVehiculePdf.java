package metier;
public class ConstructeurLiasseVehiculePdf extends
  ConstructeurLiasseVehicule
{
  public ConstructeurLiasseVehiculePdf()
  {
    liasse = new LiassePdf();
  }

  public void construitBonDeCommande(String nomClient)
  {
    String document;
    document = "<PDF>Bon de commande Client : " +
      nomClient + "</PDF>";
    liasse.ajouteDocument(document);
  }

  public void construitDemandeImmatriculation(String
    nomDemandeur)
  {
    String document;
    document = 
      "<PDF>Demande d'immatriculation Demandeur : " +
      nomDemandeur + "</PDF>";
    liasse.ajouteDocument(document);
  }
}
