package pages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import backgrounds.ALevelTutor;
import backgrounds.BLevelTutor;
import backgrounds.Course;
import backgrounds.Main;

import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class OpeningSlotPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					OpeningSlotPage frame = new OpeningSlotPage();
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
	public OpeningSlotPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Desktop.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sections");
		lblNewLabel.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 13));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(UIManager.getColor("Button.highlight"));
		lblNewLabel.setBounds(151, 131, 140, 30);
		contentPane.add(lblNewLabel);
		
		
		
		
		JComboBox sections = new JComboBox();
		sections.setBounds(151, 155, 130, 27);
		contentPane.add(sections);
		sections.addItem("");
		sections.addItem("08.00-09.00");
		sections.addItem("09.00-10.00");
		sections.addItem("10.00-11.00");
		sections.addItem("11.00-12.00");
		sections.addItem("13.00-14.00");
		sections.addItem("14.00-15.00");
		sections.addItem("15.00-16.00");
		sections.addItem("16.00-17.00");
		sections.addItem("17.00-18.00");
		sections.addItem("18.00-19.00");
		sections.addItem("19.00-20.00");
		sections.addItem("20.00-21.00");
		
		
	
		
		JComboBox courses = new JComboBox();
		courses.setBounds(151, 91, 130, 27);
		contentPane.add(courses);
		courses.addItem("");
		if(Main.currentTutor instanceof ALevelTutor) {
			for (Course c: Main.courselist) {
				
				courses.addItem(c.getName());
				
				
			}
			
		}
		else if(Main.currentTutor instanceof BLevelTutor){
			for (Course a: Main.beginnerlist) {
				
				courses.addItem(a.getName());
				
				}
			
			
		}
		
		JButton btnNewButton_12 = new JButton("Done");
		btnNewButton_12.setBounds(151, 225, 117, 29);
		contentPane.add(btnNewButton_12);
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name= (String) courses.getSelectedItem();
				String section= (String) sections.getSelectedItem();
				if (name.equals("")&&section.equals("")) {
					JOptionPane.showMessageDialog( null,"Please choose time and course","Error", JOptionPane.OK_OPTION);
				}
				else if(Main.currentTutor.getSchedule().containsKey(name)&&Main.currentTutor.getSchedule().containsValue(section)) {
					JOptionPane.showMessageDialog( null,"This section already exists ","Error", JOptionPane.OK_OPTION);
				}
				else {
					Main.currentTutor.getSchedule().put(name, section);
				}
				
				setVisible(false);
			    TutorPage b= new TutorPage();
				b.setVisible(true);
			}
		});
		
		
		JLabel lblNewLabel_1 = new JLabel("Courses");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(UIManager.getColor("Button.highlight"));
		lblNewLabel_1.setBounds(160, 74, 106, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Dear Tutor, you can start to open courses!!!");
		lblNewLabel_2.setForeground(UIManager.getColor("Button.highlight"));
		lblNewLabel_2.setBounds(84, 26, 282, 16);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			    TutorPage b= new TutorPage();
				b.setVisible(true);
			}
		});
		btnNewButton.setBounds(6, 237, 75, 29);
		contentPane.add(btnNewButton);
	}
}
