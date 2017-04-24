package metier;
public abstract class ObjetBase
{
  protected ObjetBase suivant;

  private String descriptionParDefaut()
  {
    return "description par défaut";
  }

  protected abstract String description();

  public String getDescription()
  {
    String resultat;
    resultat = this.description();
    if (resultat != null)
      return resultat;
    if (suivant != null)
      return suivant.getDescription();
    else
      return this.descriptionParDefaut();
  }

  public void setSuivant(ObjetBase suivant)
  {
    this.suivant = suivant;
  }
}
