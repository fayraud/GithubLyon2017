package pjsf.jsf.exos;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "mbeanresult", eager = true)
@SessionScoped
public class MBeanResult {

	public MBeanResult() {
		System.out.println("MBeanResult Constructeur");
	}
	String dataResult = "";
	public String getDataResult() {
		return dataResult;
	}
	public void setDataResult(String dataResult) {
		System.out.println("setting dataResul : "+dataResult);
		this.dataResult = dataResult;
	}
	
	
	

}
