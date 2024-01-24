package pages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import backgrounds.Student;
import backgrounds.Tutor;
import backgrounds.Administrator;
import backgrounds.Main;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignInPage extends JFrame {

	private JPanel contentPane;
	private JTextField Name;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					SignInPage frame = new SignInPage();
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
	public SignInPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 212, 120));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hello! Join the Course Fest");
		lblNewLabel.setBounds(80, 22, 269, 59);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(255, 212, 120));
		lblNewLabel.setFont(new Font("Savoye LET", Font.PLAIN, 22));
		lblNewLabel.setForeground(new Color(148, 55, 255));
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(149, 93, 122, 27);
		comboBox.setForeground(new Color(167, 167, 167));
		comboBox.setBackground(new Color(255, 146, 0));
		contentPane.add(comboBox);
		comboBox.addItem(" ");
		comboBox.addItem("Student");
		comboBox.addItem("Tutor");
		comboBox.addItem("Administrator");
		
		JLabel lblNewLabel_1 = new JLabel("Choose...");
		lblNewLabel_1.setBounds(175, 72, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		Name = new JTextField();
		Name.setBounds(141, 166, 130, 26);
		contentPane.add(Name);
		Name.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(141, 204, 130, 26);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("UserName");
		lblNewLabel_2.setBounds(143, 150, 93, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel(" Password");
		lblNewLabel_3.setBounds(141, 191, 95, 16);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox.getSelectedItem().toString().equals("Student")) {
					for( Student i: Main.students) {
						if (Name.getText().equals(i.getName())&&passwordField.getText().equals( i.getPassword())) {
								Main.currentStudent=i;
								setVisible(false);
								StudentPage studentPage = new StudentPage();
								studentPage.setVisible(true);
								return;
						}
						
					}
					JOptionPane.showMessageDialog( null,"The name or password is wrong","Error", JOptionPane.OK_OPTION);
					return;
					
					
				}
				else if (comboBox.getSelectedItem().toString()=="Tutor") {
					for( Tutor a: Main.tutors) {
						if (Name.getText().equals(a.getTutorname())&&passwordField.getText().equals( a.getPassword())) {
							Main.currentTutor=a;
							setVisible(false);
							TutorPage tutorPage = new TutorPage();
							tutorPage.setVisible(true);
								return;
						}	
						
					}
					JOptionPane.showMessageDialog( null,"The name or password is wrong","Error", JOptionPane.OK_OPTION);
					return;
				}
				else if (comboBox.getSelectedItem().toString()=="Administrator") {
					for( Administrator a: Main.admins) {
						if (Name.getText().equals(a.getAdminname())&&passwordField.getText().equals( a.getPassword())) {
							Main.currentAdmin=a;
							setVisible(false);
							AdministratorPage administratorPage = new AdministratorPage();
							administratorPage.setVisible(true);
							return;
							
						}
					
						
					}
					JOptionPane.showMessageDialog( null,"The name or password is wrong","Error", JOptionPane.OK_OPTION);
					return;
				}
				
				else {
					JOptionPane.showMessageDialog( null,"You need to choose sign in type","Error", JOptionPane.OK_OPTION);
				
				}
				
				
				
			}
		});
		btnNewButton.setBounds(308, 237, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Starting s= new Starting();
				s.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(6, 237, 117, 29);
		contentPane.add(btnNewButton_1);
		
	}
}
