import java.awt.event.WindowAdapter;


import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class LoginFrame extends JFrame {

	JFrame frame;
	JPanel panel;
	JLabel label;
	JLabel label2;
	JLabel label3;
	JTextField textField;
	JPasswordField passwordField;
	
	
	

 LoginFrame() {
	
	super("Panel");
	setSize(300,300);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLocationRelativeTo(null);
	
	setLayout(null);
	label = new JLabel("Sign In:");
	label.setBounds(120, -30, 100, 100);
	textField = new JTextField();
	textField.setBounds(50, 100, 200, 30);
	
	passwordField = new JPasswordField();
	passwordField.setBounds(50, 170, 200, 30);
	
	
	
	label2 = new JLabel("Login:");
	label2.setBounds(55, 70, 200, 30);
	
	
	label3 = new JLabel("Password:");
	label3.setBounds(55, 140, 200, 30);
	
	add(label);
	add(label2);
	add(label3);
	add(textField);
	add(passwordField);
	addWindowListener(new WindowAdapter() {
		
		public void windowClosing(WindowEvent e) {
			
			int result = JOptionPane.showConfirmDialog(frame, "Do you want exit ?", 
					"Exit Confirmation : ", JOptionPane.YES_NO_OPTION);
			
			if (result == JOptionPane.YES_OPTION) {
				
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
				
				else if (result == JOptionPane.NO_OPTION) {
					
				setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
					
				}
				
			}
		
		
	});
			
		}
		 	
	
	public static void main(String[] args) {
		
			LoginFrame loginFrame = new LoginFrame();
			loginFrame.setVisible(true);
			

	}

}
