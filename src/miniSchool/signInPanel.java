package miniSchool;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class signInPanel extends JPanel {
	private JTextField txtMism;
	private JPasswordField passwordField;

	/**
	 * Create the panel.
	 */
	public signInPanel() {
		setLayout(null);
		
		txtMism = new JTextField();
		txtMism.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtMism.setBounds(114, 29, 218, 30);
		add(txtMism);
		txtMism.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(114, 84, 218, 30);
		add(passwordField);
		
		JButton btnSignIn = new JButton("Sign In");
		btnSignIn.setBounds(143, 126, 163, 42);
		add(btnSignIn);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(167, 187, 117, 25);
		add(btnRegister);

	}
}
