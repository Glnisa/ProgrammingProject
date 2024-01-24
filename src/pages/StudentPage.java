package pages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import backgrounds.Main;

import java.awt.Dialog.ModalExclusionType;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class StudentPage extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					StudentPage frame = new StudentPage();
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
	public StudentPage() {
		setAlwaysOnTop(true);
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setBackground(UIManager.getColor("FormattedTextField.selectionBackground"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("EditorPane.selectionBackground"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student ");
		lblNewLabel.setForeground(UIManager.getColor("FormattedTextField.inactiveBackground"));
		lblNewLabel.setBounds(833, 538, 61, 16);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Change Information");
		btnNewButton.setBackground(new Color(7, 76, 241));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				ChangePage changePage = new ChangePage();
				changePage.setVisible(true);
				
			}
		});
		btnNewButton.setForeground(UIManager.getColor("Button.light"));
		btnNewButton.setBounds(6, 21, 169, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Hello Student ");
		lblNewLabel_1.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel_1.setFont(new Font("Rockwell", Font.PLAIN, 40));
		lblNewLabel_1.setBounds(214, 6, 289, 103);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Sign Out");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Starting s= new Starting();
				s.setVisible(true);
			}
		});
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setBounds(6, 533, 117, 29);
		contentPane.add(btnNewButton_1);
		
		JLabel displayname = new JLabel("");
		displayname.setForeground(UIManager.getColor("Button.light"));
		displayname.setFont(new Font("Rockwell", Font.PLAIN, 40));
		displayname.setBounds(496, 28, 272, 58);
		contentPane.add(displayname);
		displayname.setText(Main.currentStudent.getName());
		
		JLabel lblNewLabel_2 = new JLabel("My Courses");
		lblNewLabel_2.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblNewLabel_2.setBounds(22, 99, 141, 43);
		contentPane.add(lblNewLabel_2);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new CompoundBorder());
		scrollPane.setBounds(207, 124, 466, 384);
		contentPane.add(scrollPane);
		
		String[] head = {"Course Name", "Time interval","Level", "Tutor Name","Status"};
		DefaultTableModel d= new DefaultTableModel(head,0);
		table = new JTable(d);
		table.setBackground(UIManager.getColor("Button.highlight"));
		table.setForeground(UIManager.getColor("Button.darkShadow"));
		scrollPane.setViewportView(table);
		
		for(String i:Main.currentTutor.getSchedule().keySet()) {
			for(String a: Main.currentTutor.getSchedule().values()) {
				String coursename = i;
				String time = a;
				String name=Main.currentTutor.getTutorname();
				String status= "available";
				Object[] row = {coursename,time,null,name,status};
				d.addRow(row);
				
			}
			
			
		}
		
		
	}
}
