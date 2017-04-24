package metier;
public class ComposantGestionDocument implements
  GestionDocument
{

  public String document(int index)
  {
    return "Document numéro " + index;
  }
}
