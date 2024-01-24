package backgrounds;

public class Administrator extends User {
	protected String adminname;
	protected String adminage;
	protected String adminid;
	protected String password;
	
	



	public Administrator(String adminname, String adminage, String adminid, String password) {
		super();
		this.adminname = adminname;
		this.adminage = adminage;
		this.adminid = adminid;
		this.password = password;
	}


	public Administrator(String adminname, String password) {
		super();
		this.adminname = adminname;
		this.password = password;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getAdminname() {
		return adminname;
	}
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}

	public String getAdminage() {
		return adminage;
	}
	public void setAdminage(String adminage) {
		this.adminage = adminage;
	}
	public String getAdminid() {
		return adminid;
	}
	public void setAdminid(String adminid) {
		this.adminid = adminid;
	}

	
}
