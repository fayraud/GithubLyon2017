package metier;
public class Marque extends ObjetBase
{
  protected String description1, description2;
  protected String nom;

  public Marque(String nom, String description1, String
    description2)
  {
    this.description1 = description1;
    this.description2 = description2;
    this.nom = nom;
  }

  protected String description()
  {
    if ((description1 != null) && (description2 != null))
      return "Marque " + nom + " : " + description1 + " "
        + description2;
    else if (description1 != null)
      return "Marque " + nom + " : " + description1;
    else
      return null;
  }
}
