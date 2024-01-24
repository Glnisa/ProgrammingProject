package pages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import backgrounds.AdvancedCourse;
import backgrounds.BeginnerCourse;
import backgrounds.Course;
import backgrounds.Main;

import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddingCoursePage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					AddingCoursePage frame = new AddingCoursePage();
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
	public AddingCoursePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.disabledText"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(59, 87, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel coursename = new JLabel("Course Name");
		coursename.setForeground(UIManager.getColor("Button.highlight"));
		coursename.setBounds(59, 59, 112, 16);
		contentPane.add(coursename);
		
		textField_2 = new JTextField();
		textField_2.setBounds(59, 156, 130, 26);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel pre = new JLabel(" Prerequisities");
		pre.setForeground(UIManager.getColor("Button.highlight"));
		pre.setBounds(59, 128, 116, 16);
		contentPane.add(pre);
		
		JButton btnNewButton = new JButton("Done");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name= coursename.getText();
				
				
				if ((!name.equals(""))) {
					if (pre.getText().equals("")) {
						Course c = new BeginnerCourse(name);Main.beginnerlist.add(c);Main.courselist.add(c);
						JOptionPane.showMessageDialog( null,"New Course Added ","Success", JOptionPane.OK_OPTION);
						return;
					}
					else {
						Course c = new AdvancedCourse(name);Main.advancedlist.add(c);Main.courselist.add(c);
						JOptionPane.showMessageDialog( null,"New Course Added ","Success", JOptionPane.OK_OPTION);
						return;
					}
					
					
				}
				else {
					JOptionPane.showMessageDialog( null,"Please fill all the blanks ","Error", JOptionPane.OK_OPTION);
					return;

				}
				
			}
		});
		btnNewButton.setForeground(UIManager.getColor("Button.foreground"));
		btnNewButton.setBounds(313, 221, 117, 29);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			    AdministratorPage s= new AdministratorPage();
				s.setVisible(true);
			}
		});
		btnNewButton_1.setForeground(UIManager.getColor("Button.foreground"));
		btnNewButton_1.setBounds(6, 222, 117, 29);
		contentPane.add(btnNewButton_1);
	}

}
