package pages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import backgrounds.Main;

import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdministratorPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					AdministratorPage frame = new AdministratorPage();
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
	public AdministratorPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("CheckBox.disabledText"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Admin");
		lblNewLabel.setBounds(818, 533, 61, 16);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Change Information");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				ChangePageAdmin c = new ChangePageAdmin();
				c.setVisible(true);
			}
		});
		btnNewButton.setBounds(19, 27, 163, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Hello Admin");
		lblNewLabel_1.setFont(new Font("Rockwell", Font.PLAIN, 40));
		lblNewLabel_1.setBounds(204, 6, 274, 85);
		contentPane.add(lblNewLabel_1);
		
		JLabel displayname = new JLabel("");
		displayname.setFont(new Font("Rockwell", Font.PLAIN, 40));
		displayname.setBounds(481, 18, 274, 60);
		contentPane.add(displayname);
		displayname.setText(Main.currentAdmin.getAdminname());
		
		JButton btnNewButton_1 = new JButton("Sign Out ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Starting s= new Starting();
				s.setVisible(true);
			
			}
		});
		btnNewButton_1.setBounds(19, 528, 117, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Add course");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				AddingCoursePage s= new AddingCoursePage();
				s.setVisible(true);
				
			}
		});
		btnNewButton_2.setBounds(19, 83, 163, 29);
		contentPane.add(btnNewButton_2);
		
	}

}
