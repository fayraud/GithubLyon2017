package pjsf.jsf.exos;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "mbean1", eager = true)
@SessionScoped
// @ApplicationScoped
// @ViewScoped
public class MBean1 {

	private String message = "Hello";
	private int compteur = 0;
	// final static int Constante = 10;

	public MBean1() {
		System.out.println("MBean1 constructeur");
	}

	public String getMessage() {
		compteur++;
		return message + compteur + "data = " + data + "       data2 =" + data2;
	}

	public int getCompteur() {
		return compteur;
	}

	private String data = "";
	private String data2 = "";

	public String getData() {
		return data;
	}

	public void setData(String data) {
		System.out.println("setting data : " + data);
		this.data = data;
	}

	public String getData2() {
		return data2;
	}

	public void setData2(String data2) {
		System.out.println("setting data2 : " + data2);
		this.data2 = data2;
	}

	public String getLesDeux() {
		return data + data2;
	}
	public String goConditionnel(){
		if(data.length()>10) return "jsp3Result2";
		else return "jsp3Result";
		
	}
	public String testErreur(){
		System.out.println("testErreur");
		return "erreur";
		
	}

}
