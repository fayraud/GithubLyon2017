package pjsf.jsf.exos;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "mbinject", eager = true)
@SessionScoped
public class MBInject {

	public MBInject() {

	}

	@ManagedProperty(value = "#{mbinjected}")
	private MBInjected mBInjected;

	

	public void setmBInjected(MBInjected mBInjected) {
		this.mBInjected = mBInjected;
	}


	private String data = "datafrom inject";

	public String getData() {
		mBInjected.show();
		return data;
	}

}
