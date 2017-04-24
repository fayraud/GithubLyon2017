package metier;

public class Film implements Animation
{
  public void clic(){}

  public void dessine()
  {
    System.out.println("Affichage du film");
  }

  public void charge()
  {
    System.out.println("Chargement du film");
  }

  public void joue()
  {
    System.out.println("Lecture du film");
  }
}
