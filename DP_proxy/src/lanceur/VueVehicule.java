package lanceur;

import metier.Animation;
import metier.AnimationProxy;

public class VueVehicule
{

  public static void main(String[] args)
  {
    Animation animation = new AnimationProxy();
    animation.dessine();
    animation.clic();
    animation.dessine();
  }
}
