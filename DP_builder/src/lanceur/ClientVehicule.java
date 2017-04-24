package lanceur;
import java.util.Scanner;

import metier.ConstructeurLiasseVehicule;
import metier.ConstructeurLiasseVehiculeHtml;
import metier.ConstructeurLiasseVehiculePdf;
import metier.Liasse;
import metier.Vendeur;
public class ClientVehicule
{
  public static void main(String[] args)
  {
    Scanner reader = new Scanner(System.in);
    ConstructeurLiasseVehicule constructeur;
    System.out.print("Voulez-vous construire des" +
      "liasses HTML (1) ou PDF (2) :");
    String choix = reader.next();
    if (choix.equals("1"))
    {
      constructeur = new ConstructeurLiasseVehiculeHtml();
    }
    else
    {
      constructeur = new ConstructeurLiasseVehiculePdf();
    }
    Vendeur vendeur = new Vendeur(constructeur);
    Liasse liasse = vendeur.construit("Martin");
    liasse.imprime();
  }
}
