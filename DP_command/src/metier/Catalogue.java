package metier;
import java.util.*;
public class Catalogue
{
  protected List<Vehicule> vehicules = 
    new ArrayList<Vehicule>();
  protected List<CommandeSolder> commandes =
    new ArrayList<CommandeSolder>();

  public void lanceCommandeSolder(CommandeSolder commande)
  {
    commandes.add(0, commande);
    commande.solde(vehicules);
  }

  public void annuleCommandeSolder(int ordre)
  {
    commandes.get(ordre).annule();
  }

  public void retablitCommandeSolder(int ordre)
  {
    commandes.get(ordre).retablit();
  }

  public void ajoute(Vehicule vehicule)
  {
    vehicules.add(vehicule);
  }

  public void affiche()
  {
    for (Vehicule vehicule: vehicules)
      vehicule.affiche();
  }
}
