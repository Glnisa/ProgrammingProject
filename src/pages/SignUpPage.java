package pages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileSystemView;

import backgrounds.ALevelTutor;
import backgrounds.Administrator;
import backgrounds.BLevelTutor;
import backgrounds.Main;
import backgrounds.Student;
import backgrounds.Tutor;

import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import java.awt.event.ActionEvent;
import java.awt.Button;

public class SignUpPage extends JFrame {

	private JPanel contentPane;
	public JTextField nameinfo;
	private JTextField passwordinfo;
	private JPasswordField idinfo;
	private JTextField ageinfo;
	protected JLabel name;
	protected JLabel username;
	protected JLabel id;
	protected JLabel age;
	
	

	private JComboBox typeoftutor;
	private JLabel lblNewLabel_5;
	private Image image;
	protected String type;
	private JLabel lblNewLabel_1;
	
	
	

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					SignUpPage frame = new SignUpPage();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public SignUpPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 600);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("CheckBox.select"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Would you like to join the learning feast? ");
		lblNewLabel.setBounds(41, 16, 387, 57);
		lblNewLabel.setFont(new Font("Snell Roundhand", Font.PLAIN, 21));
		contentPane.add(lblNewLabel);
		
		nameinfo = new JTextField();
		nameinfo.setBounds(51, 175, 130, 26);
		contentPane.add(nameinfo);
		nameinfo.setColumns(10);
		
		passwordinfo = new JTextField();
		passwordinfo.setBounds(51, 213, 130, 26);
		contentPane.add(passwordinfo);
		passwordinfo.setColumns(10);
		
		idinfo = new JPasswordField();
		idinfo.setBounds(51, 251, 130, 26);
		contentPane.add(idinfo);
		
		ageinfo = new JTextField();
		ageinfo.setBounds(51, 289, 130, 26);
		contentPane.add(ageinfo);
		ageinfo.setColumns(10);
		
		JButton btnNewButton = new JButton("Upload photo..");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton) {
					JFileChooser file_upload= new JFileChooser();
					//file_upload.showOpenDialog(null);
					int res = file_upload.showSaveDialog(null);
					
					if (res== JFileChooser.APPROVE_OPTION) {
						File file_path= new File(file_upload.getSelectedFile().getAbsolutePath());
					    System.out.println(file_path);
					}
				}
			}
		});
		btnNewButton.setBounds(64, 327, 117, 29);
		contentPane.add(btnNewButton);
		
		
		
		JComboBox comboBox = new JComboBox();	
		comboBox.setBounds(51, 128, 124, 27);
		contentPane.add(comboBox);
		comboBox.addItem(" ");
		comboBox.addItem("Student");
		comboBox.addItem("Tutor");
		comboBox.addItem("Administrator");
		
		name = new JLabel(" Name");
		name.setBounds(51, 163, 61, 16);
		contentPane.add(name);
		
		
		
		username = new JLabel("Password");
		username.setBounds(51, 200, 77, 16);
		contentPane.add(username);
		
		id = new JLabel(" Identification number");
		id.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		id.setBounds(51, 238, 130, 16);
		contentPane.add(id);
		
		age = new JLabel(" Age");
		age.setBounds(51, 277, 61, 16);
		contentPane.add(age);
		
		typeoftutor = new JComboBox();
		typeoftutor.setBounds(57, 397, 124, 27);
		contentPane.add(typeoftutor);
		typeoftutor.addItem("");
		typeoftutor.addItem("A Level");
		typeoftutor.addItem("B Level");
		
		lblNewLabel_5 = new JLabel("If you are tutor choose..");
		lblNewLabel_5.setBounds(64, 369, 169, 16);
		contentPane.add(lblNewLabel_5);
		
		
		
		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = nameinfo.getText();
				String age = ageinfo.getText();
				String id = idinfo.getText();
				String password = passwordinfo.getText();
				
				
				if (comboBox.getSelectedItem().toString()=="Student") {
					if((!name.equals(""))&& (!age.equals(""))&&(!id.equals(""))&&(!password.equals(""))) {
						
						Student s = new Student(name, age,id,password);
						Main.students.add(s);
						Main.currentStudent=s;
						setVisible(false);
						StudentPage studentPage = new StudentPage();
						studentPage.setVisible(true);
						return;
						
					}
					
					else {
						JOptionPane.showMessageDialog( null,"Please fill all the blanks ","Error", JOptionPane.OK_OPTION);
						return;

					}
					
				}
				if (comboBox.getSelectedItem().toString()=="Tutor") {
					if((!name.equals(""))&& (!age.equals(""))&&(!id.equals(""))&&(!password.equals(""))) {
						
						
						if (typeoftutor.getSelectedItem()=="A Level") {
							ALevelTutor t = new ALevelTutor(name, age,id,password);
							Main.tutors.add(t);
							Main.currentTutor= t;
							Main.atutors.add(t);
							return;
						
							
						}
						else if(typeoftutor.getSelectedItem()=="B Level") {
							BLevelTutor t = new BLevelTutor(name, age,id,password);
							Main.tutors.add(t);
							Main.currentTutor= t;
							Main.btutors.add(t);
							return;
						}
						else {
							JOptionPane.showMessageDialog( null,"Please choose type of tutor","Error", JOptionPane.OK_OPTION);
							return;
						}
	
						
					}
					else {
						JOptionPane.showMessageDialog( null,"Please fill all the blanks ","Error", JOptionPane.OK_OPTION);
						return;

					}
					
					
				}
				if (comboBox.getSelectedItem().toString()=="Administrator") {
					if((!name.equals(""))&& (!age.equals(""))&&(!id.equals(""))&&(!password.equals(""))) {
						Administrator a = new Administrator(name, age,id,password);
						Main.admins.add(a);
						Main.currentAdmin= a;
						
						setVisible(false);
						AdministratorPage adminPage = new AdministratorPage();
						adminPage.setVisible(true);
						return;
						
						
					}
					else {
						JOptionPane.showMessageDialog( null,"Please fill all the blanks ","Error", JOptionPane.OK_OPTION);
						return;

					}
					
					
				}
				else {
					JOptionPane.showMessageDialog( null,"Please choose 'SignUp as..' ","Error", JOptionPane.OK_OPTION);
					return;

				}
				
				
			}
		});
		btnNewButton_1.setBounds(176, 464, 117, 29);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel_1 = new JLabel("  SignUp as...");
		lblNewLabel_1.setBounds(51, 107, 97, 16);
		contentPane.add(lblNewLabel_1);
		
		
		
	}

	public JTextField getNameinfo() {
		return nameinfo;
	}

	public void setNameinfo(JTextField nameinfo) {
		this.nameinfo = nameinfo;
	}
	

	
}
