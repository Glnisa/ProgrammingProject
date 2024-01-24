package backgrounds;

import java.util.ArrayList;


public class Student extends User{
	protected String name;
	protected String age;
	protected String id;
	protected String password;
	

		



	public Student(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}


	public Student(String name, String age, String id, String password) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
		this.password = password;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	

}
