package metier;
public class DocumentHtml implements Document
{
  protected String contenu;

  public void setContenu(String contenu)
  {
    this.contenu = contenu;
  }

  public void dessine()
  {
    System.out.println("Dessine document HTML : " +
      contenu);
  }

  public void imprime()
  {
    System.out.println("Imprime document HTML : " +
      contenu);
  }

}
