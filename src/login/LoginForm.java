//package login;
//
//import java.awt.EventQueue;
//
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.JLabel;
//import javax.swing.JTextField;
//import javax.swing.JPasswordField;
//import javax.swing.JButton;
//import java.awt.Color;
//import javax.swing.ImageIcon;
//import java.awt.Font;
//
//public class LoginForm {
//
//	private JFrame frame;
//	private JTextField tfEmail;
//	private JPasswordField pfPassword;
//
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		new LoginForm();
//	}
//
//	/**
//	 * Create the application.
//	 */
//	public LoginForm() {
//		initialize();
//	}
//
//	/**
//	 * Initialize the contents of the frame.
//	 */
//	private void initialize() {
//		frame = new JFrame();
//		frame.getContentPane().setFont(new Font("Serif", Font.PLAIN, 13));
//		frame.getContentPane().setBackground(new Color(255, 255, 255));
//		frame.setBounds(100, 100, 577, 338);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.getContentPane().setLayout(null);
//		
//		JLabel lblNewLabel = new JLabel("LOGIN");
//		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
//		lblNewLabel.setBounds(390, 35, 145, 37);
//		frame.getContentPane().add(lblNewLabel);
//		
//		JLabel lblNewLabel_1 = new JLabel("");
//		lblNewLabel_1.setIcon(new ImageIcon(LoginForm.class.getResource("/Picture/group.png")));
//		lblNewLabel_1.setBounds(293, 0, 74, 72);
//		frame.getContentPane().add(lblNewLabel_1);
//		
//		JLabel lblNewLabel_2 = new JLabel("Email");
//		lblNewLabel_2.setFont(new Font("Serif", Font.PLAIN, 13));
//		lblNewLabel_2.setBounds(252, 87, 62, 44);
//		frame.getContentPane().add(lblNewLabel_2);
//		
//		JLabel lblNewLabel_3 = new JLabel("Mật khẩu");
//		lblNewLabel_3.setFont(new Font("Serif", Font.PLAIN, 13));
//		lblNewLabel_3.setBounds(252, 170, 62, 44);
//		frame.getContentPane().add(lblNewLabel_3);
//		
//		tfEmail = new JTextField();
//		tfEmail.setBounds(324, 88, 224, 44);
//		frame.getContentPane().add(tfEmail);
//		tfEmail.setColumns(10);
//		
//		pfPassword = new JPasswordField();
//		pfPassword.setBounds(324, 170, 224, 45);
//		frame.getContentPane().add(pfPassword);
//		
//		JButton btnLogin = new JButton("Đăng nhập");
//		btnLogin.setForeground(new Color(0, 0, 0));
//		btnLogin.setBackground(new Color(255, 255, 255));
//		btnLogin.setFont(new Font("Serif", Font.PLAIN, 13));
//		btnLogin.setBounds(324, 243, 110, 37);
//		frame.getContentPane().add(btnLogin);
//		
//		JButton btnRegis = new JButton("Đăng ký");
//		btnRegis.setForeground(new Color(0, 0, 0));
//		btnRegis.setBackground(new Color(255, 255, 255));
//		btnRegis.setFont(new Font("Serif", Font.PLAIN, 13));
//		btnRegis.setBounds(463, 243, 85, 37);
//		frame.getContentPane().add(btnRegis);
//		
//		JPanel panel = new JPanel();
//		panel.setBackground(new Color(255, 127, 80));
//		panel.setBounds(0, 0, 234, 301);
//		frame.getContentPane().add(panel);
//		panel.setLayout(null);
//		
//		JLabel lblNewLabel_4 = new JLabel("WELCOME BACK ");
//		lblNewLabel_4.setForeground(new Color(255, 255, 255));
//		lblNewLabel_4.setFont(new Font("Serif", Font.PLAIN, 13));
//		lblNewLabel_4.setBounds(54, 86, 156, 46);
//		panel.add(lblNewLabel_4);
//		
//		JLabel lblNewLabel_5 = new JLabel("ASHotel glad to see you");
//		lblNewLabel_5.setForeground(new Color(255, 255, 255));
//		lblNewLabel_5.setFont(new Font("Serif", Font.PLAIN, 13));
//		lblNewLabel_5.setBounds(38, 132, 172, 32);
//		panel.add(lblNewLabel_5);
//		
//		frame.setLocationRelativeTo(null);
//		frame.setVisible(true);
//	}
//}
