package pages;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Dialog.ModalExclusionType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import backgrounds.Main;

public class ChangePageTutor extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField age;
	private JTextField id;
	private JTextField password;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ChangePageTutor frame = new ChangePageTutor();
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
	public ChangePageTutor() {
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 600);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.light"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.currentTutor.setTutorname(name.getText());
				Main.currentTutor.setTutorage(age.getText());
				Main.currentTutor.setTutorid(id.getText());
				Main.currentTutor.setPassword(password.getText());
				JOptionPane.showMessageDialog( null,"Your information updated","Success", JOptionPane.OK_OPTION);
				
			}
		});
		btnNewButton.setForeground(Color.YELLOW);
		btnNewButton.setBounds(292, 520, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TutorPage s= new TutorPage();
				s.setVisible(true);
			}
		});
		btnNewButton_1.setForeground(Color.YELLOW);
		btnNewButton_1.setBounds(23, 520, 117, 29);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Your Name");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(38, 97, 102, 16);
		contentPane.add(lblNewLabel);
		
		name = new JTextField();
		name.setBounds(38, 115, 130, 26);
		contentPane.add(name);
		name.setColumns(10);
		name.setText(Main.currentTutor.getTutorname());
		
		
		age = new JTextField();
		age.setBounds(38, 172, 130, 26);
		contentPane.add(age);
		age.setColumns(10);
		age.setText(Main.currentTutor.getTutorage());
		
		JLabel lblNewLabel_2 = new JLabel("Age");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(38, 152, 61, 16);
		contentPane.add(lblNewLabel_2);
		
		id = new JTextField();
		id.setBounds(38, 226, 130, 26);
		contentPane.add(id);
		id.setColumns(10);
		id.setText(Main.currentTutor.getTutorid());
		
		JLabel lblNewLabel_3 = new JLabel("Id");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(38, 210, 61, 16);
		contentPane.add(lblNewLabel_3);
		
		password = new JTextField();
		password.setBounds(38, 292, 130, 26);
		contentPane.add(password);
		password.setColumns(10);
		password.setText(Main.currentTutor.getPassword());
		
		JLabel lblNewLabel_4 = new JLabel("Password");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(38, 264, 61, 16);
		contentPane.add(lblNewLabel_4);
	}

}
