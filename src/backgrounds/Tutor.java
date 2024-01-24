package backgrounds;

import java.util.HashMap;
import java.util.HashSet;

public class Tutor extends User {
	
	protected String tutorage;
	protected String tutorid;
	protected String tutorname;
	protected String password;
	
	
	HashMap<String, String> schedule = new HashMap<String, String>();





	public Tutor(String tutorage, String tutorid, String tutorname, String password) {
		super();
		this.tutorage = tutorage;
		this.tutorid = tutorid;
		this.tutorname = tutorname;
		this.password = password;
	}



	public Tutor(String tutorname, String password) {
		super();
		this.tutorname = tutorname;
		this.password = password;
	}



	public HashMap<String, String> getSchedule() {
		return schedule;
	}



	public void setSchedule(HashMap<String, String> schedule) {
		this.schedule = schedule;
	}



	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTutorname() {
		return tutorname;
	}
	public void setTutorname(String tutorname) {
		this.tutorname = tutorname;
	}
	
	public String getTutorage() {
		return tutorage;
	}
	public void setTutorage(String tutorage) {
		this.tutorage = tutorage;
	}
	public String getTutorid() {
		return tutorid;
	}
	public void setTutorid(String tutorid) {
		this.tutorid = tutorid;
	}
	

}
