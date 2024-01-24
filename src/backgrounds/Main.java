package backgrounds;

import java.awt.EventQueue;
import java.util.ArrayList;

import pages.Starting;
/************** Pledge of Honor ******************************************
I hereby certify that I have completed this programming project on my own
without any help from anyone else. The effort in the project thus belongs
completely to me. I did not search for a solution, or I did not consult any
program written by others or did not copy any program from other sources. I
read and followed the guidelines provided in the project description.
READ AND SIGN BY WRITING YOUR NAME SURNAME AND STUDENT ID
SIGNATURE: <Gülnisa Yıldırım, 76401>
*************************************************************************/
public class Main {
	//creating necessary lists 
	public static ArrayList<Student> students= new ArrayList<Student>();
	public static ArrayList<Tutor> tutors= new ArrayList<Tutor>();
	public static ArrayList<Administrator> admins= new ArrayList<Administrator>();
	public static ArrayList<ALevelTutor> atutors= new ArrayList<ALevelTutor>();
	public static ArrayList<BLevelTutor> btutors= new ArrayList<BLevelTutor>();
	public static ArrayList<Course> beginnerlist = new ArrayList<>();
	public static ArrayList<Course> advancedlist = new ArrayList<>();
	public static ArrayList<Course> courselist = new ArrayList<>();
	public static ArrayList<Equipment> equipmentlist = new ArrayList<>();
	
	//creating active users
	public static Student currentStudent ;
	public static Tutor currentTutor ;
	public static Administrator currentAdmin ;
	
	public static void main(String[] args) {
		// creating already signed in objects
		Student s1 = new Student("Gülnisa","1234");
		Student s2 = new Student("Emre","12345");
		students.add(s1);
		students.add(s2);
		Tutor t1 = new ALevelTutor("Yıldırım","1234");
		Tutor t2 = new BLevelTutor("Dursun","12345");
		Tutor t3 = new ALevelTutor("Emre","1111");
		Tutor t4 = new BLevelTutor("Gülnisa","2222");
		Tutor t5 = new ALevelTutor("Melodi","4444");
		Tutor t6 = new BLevelTutor("Kaan","3333");
		tutors.add(t1);
		tutors.add(t2);
		tutors.add(t3);
		tutors.add(t4);
		tutors.add(t5);
		tutors.add(t6);
		Administrator admin = new Administrator("admin", "admin");
		admins.add(admin);
		
		// CREATING COURSES
		//beginner courses
		Course c1= new BeginnerCourse("Comp 100"); beginnerlist.add(c1);
		Course c2= new BeginnerCourse("Comp 106"); beginnerlist.add(c2);
		Course c3= new BeginnerCourse("Math 106"); beginnerlist.add(c3);
		Course c4= new BeginnerCourse("Phys 101"); beginnerlist.add(c4);
		Course c5= new BeginnerCourse("Acwr 101"); beginnerlist.add(c5);
		Course c6= new BeginnerCourse("Soci 100"); beginnerlist.add(c6);
		//advanced courses
		Course c7= new AdvancedCourse("Comp 132"); advancedlist.add(c7);
		Course c8= new AdvancedCourse("Comp 201"); advancedlist.add(c7);
		Course c9= new AdvancedCourse("Math 204"); advancedlist.add(c7);
		Course c10= new AdvancedCourse("Phys 102"); advancedlist.add(c7);
		Course c11= new AdvancedCourse("Acwr 106"); advancedlist.add(c7);
		Course c12= new AdvancedCourse("Econ 102"); advancedlist.add(c7);
		
		courselist.addAll(beginnerlist);
		courselist.addAll(advancedlist);
		
		//CREATING EQUIPMENTS
		Equipment e1= new Equipment("Macbook"); equipmentlist.add(e1);
		Equipment e2= new Equipment("Book"); equipmentlist.add(e2);
		Equipment e3= new Equipment("Ipad"); equipmentlist.add(e3);
		Equipment e4= new Equipment("Notebook"); equipmentlist.add(e4);
		Equipment e5= new Equipment("Lab Book"); equipmentlist.add(e5);
		
		
		
		
		
		
		
		
		
		
		
		// when we run main this code opens  starting page
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Starting frame = new Starting();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

}
