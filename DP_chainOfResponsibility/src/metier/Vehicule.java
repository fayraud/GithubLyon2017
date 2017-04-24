package metier;
public class Vehicule extends ObjetBase
{
  protected String description;

  public Vehicule(String description)
  {
    this.description = description;
  }

  protected String description()
  {
    return description;
  }
}
