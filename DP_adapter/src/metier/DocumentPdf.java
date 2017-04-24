package metier;
public class DocumentPdf implements Document
{
  protected ComposantPdf outilPdf = new ComposantPdf();

  public void setContenu(String contenu)
  {
    outilPdf.pdfFixeContenu(contenu);
  }

  public void dessine()
  {
    outilPdf.pdfPrepareAffichage();
    outilPdf.pdfRafraichit();
    outilPdf.pdfTermineAffichage();
  }

  public void imprime()
  {
    outilPdf.pdfEnvoieImprimante();
  }
}
