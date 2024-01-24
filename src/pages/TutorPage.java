package pages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import backgrounds.Main;

import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JEditorPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.TableModel;

public class TutorPage extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					TutorPage frame = new TutorPage();
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
	public TutorPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setForeground(UIManager.getColor("Button.highlight"));
		contentPane.setBackground(UIManager.getColor("Button.select"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Change Information");
		btnNewButton.setBounds(20, 20, 155, 29);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				ChangePageTutor changePage = new ChangePageTutor();
				changePage.setVisible(true);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Tutor");
		lblNewLabel.setBounds(833, 534, 61, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Hello Tutor");
		lblNewLabel_1.setBounds(207, 20, 247, 57);
		lblNewLabel_1.setFont(new Font("Rockwell", Font.PLAIN, 40));
		contentPane.add(lblNewLabel_1);
		
		JLabel displayname = new JLabel("");
		displayname.setBounds(469, 20, 257, 57);
		displayname.setFont(new Font("Rockwell", Font.PLAIN, 40));
		contentPane.add(displayname);
		displayname.setText(Main.currentTutor.getTutorname());
		
		JButton btnNewButton_1 = new JButton("Sign Out");
		btnNewButton_1.setBounds(26, 529, 117, 29);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Starting s= new Starting();
				s.setVisible(true);
			}
		});
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Open a new slot");
		btnNewButton_2.setBounds(20, 102, 155, 29);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				OpeningSlotPage s= new OpeningSlotPage();
				s.setVisible(true);
				
			}
		});
		contentPane.add(btnNewButton_2);
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new CompoundBorder());
		scrollPane.setBounds(207, 124, 466, 384);
		contentPane.add(scrollPane);
		
		String[] head = {"Course Name", "Time interval","Level", "Tutor Name"};
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
				
				Object[] row = {coursename,time,null,name};
				d.addRow(row);
				
			}
			
			
		}
		
		
		
		
	}
}
