package pages;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import java.awt.print.Book;

public class Starting extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Starting frame = new Starting();
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
	public Starting() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Desktop.background"));
		contentPane.setForeground(new Color(252, 108, 61));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("New button");
		button.setBounds(1691, 10, 117, 29);
		contentPane.add(button);
		
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.setForeground(UIManager.getColor("EditorPane.selectionBackground"));
		btnNewButton.setFont(new Font("Kannada MN", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
		
			//Opening the sign up page 
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				SignUpPage signUpPage = new SignUpPage();
				signUpPage.setVisible(true);
				
			}
		});
		
		btnNewButton.setBounds(271, 394, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sign In");
		btnNewButton_1.setForeground(UIManager.getColor("EditorPane.selectionBackground"));
		btnNewButton_1.setFont(new Font("Kannada MN", Font.PLAIN, 13));
		btnNewButton_1.addActionListener(new ActionListener() {
			
			// Opening the sign in page
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				SignInPage signInPage = new SignInPage();
				signInPage.setVisible(true);
				
				
			}
		});
		btnNewButton_1.setBounds(425, 394, 117, 29);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("MERGEN");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("SignPainter", Font.PLAIN, 90));
		lblNewLabel.setForeground(UIManager.getColor("EditorPane.background"));
		lblNewLabel.setBounds(271, 116, 282, 179);
		contentPane.add(lblNewLabel);
	}
}
