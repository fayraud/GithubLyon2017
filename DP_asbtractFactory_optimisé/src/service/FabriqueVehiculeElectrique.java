package service;

import metier.Automobile;
import metier.AutomobileElectricte;
import metier.AutomobileEssence;
import metier.Scooter;
import metier.ScooterElectricte;

public class FabriqueVehiculeElectrique implements FabriqueVehicule {

	@Override
	public Automobile creeAutomobile(String modele, String couleur, int puissance, double espace) {
		// TODO Auto-generated method stub
		return new AutomobileElectricte(modele, couleur, puissance, espace);
	}

	@Override
	public Scooter creeScooter(String modele, String couleur, int puissance) {
		// TODO Auto-generated method stub
		return new ScooterElectricte(modele, couleur, puissance) ;
	}
	
	

}
