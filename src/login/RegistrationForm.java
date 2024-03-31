//package login;
//import Object.User;
//
//import java.awt.EventQueue;
//
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.JButton;
//import javax.swing.JTextField;
//import javax.swing.JPasswordField;
//import java.awt.Font;
//import javax.swing.JRadioButton;
//import java.awt.Color;
//
//import javax.swing.ButtonGroup;
//import javax.swing.ImageIcon;
//import java.awt.event.ActionListener;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.Statement;
//import java.awt.event.ActionEvent;
//
//public class RegistrationForm {
//
//	private JFrame frame;
//	private JTextField tfName;
//	private JTextField tfAge;
//	private JTextField tfAddress;
//	private JTextField tfPhone;
//	private JTextField tfEmail;
//	private JPasswordField pfPassword;
//	private JPasswordField pfConfirmPassword;
//	private JRadioButton rdbtnNam;
//	private JRadioButton rdbtnNu;
//
//	
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		RegistrationForm regisForm= new RegistrationForm();
//		// Chờ đợi đến khi cửa sổ đóng lại
//	    regisForm.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	    regisForm.frame.addWindowListener(new WindowAdapter() {
//	        public void windowClosed(WindowEvent e) {
//	            User user = regisForm.user;
//	            if (user != null) {
//	                System.out.println("Đăng ký thành công người dùng: " + user.name);
//	            } else {
//	                System.out.println("Đăng ký người dùng thất bại");
//	            }
//	        }
//	    });
//	}
//
//	/**
//	 * Create the application.
//	 */
//	public RegistrationForm() {
////		Create view
//		initialize();
//		
//	}
//
//	/**
//	 * Initialize the contents of the frame.
//	 */
//	private void initialize() {
//		frame = new JFrame("Create a new account");
//		frame.getContentPane().setBackground(new Color(255, 127, 80));
//		frame.getContentPane().setFont(new Font("Serif", Font.PLAIN, 13));
//		frame.setBounds(100, 100, 361, 503);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.getContentPane().setLayout(null);
//		
//		JLabel lblNewLabel = new JLabel("");
//		lblNewLabel.setIcon(new ImageIcon(RegistrationForm.class.getResource("/Picture/best-customer-experience.png")));
//		lblNewLabel.setFont(new Font("Serif", Font.PLAIN, 13));
//		lblNewLabel.setBounds(57, 0, 70, 69);
//		frame.getContentPane().add(lblNewLabel);
//		
//		JLabel lblNewLabel_1 = new JLabel("ĐĂNG KÝ ");
//		lblNewLabel_1.setFont(new Font("Serif", Font.BOLD, 20));
//		lblNewLabel_1.setBounds(152, 20, 173, 31);
//		frame.getContentPane().add(lblNewLabel_1);
//		
//		JLabel lblNewLabel_2 = new JLabel("Họ tên");
//		lblNewLabel_2.setFont(new Font("Serif", Font.PLAIN, 13));
//		lblNewLabel_2.setBounds(10, 79, 45, 13);
//		frame.getContentPane().add(lblNewLabel_2);
//		
//		JLabel lblNewLabel_3 = new JLabel("Tuổi");
//		lblNewLabel_3.setFont(new Font("Serif", Font.PLAIN, 13));
//		lblNewLabel_3.setBounds(10, 126, 45, 13);
//		frame.getContentPane().add(lblNewLabel_3);
//		
//		JLabel lblNewLabel_4 = new JLabel("Giới tính");
//		lblNewLabel_4.setFont(new Font("Serif", Font.PLAIN, 13));
//		lblNewLabel_4.setBounds(10, 169, 45, 13);
//		frame.getContentPane().add(lblNewLabel_4);
//		
//		JLabel lblNewLabel_5 = new JLabel("Địa chỉ");
//		lblNewLabel_5.setFont(new Font("Serif", Font.PLAIN, 13));
//		lblNewLabel_5.setBounds(10, 209, 45, 13);
//		frame.getContentPane().add(lblNewLabel_5);
//		
//		JLabel lblNewLabel_6 = new JLabel("Số điên thoại");
//		lblNewLabel_6.setFont(new Font("Serif", Font.PLAIN, 13));
//		lblNewLabel_6.setBounds(10, 249, 70, 13);
//		frame.getContentPane().add(lblNewLabel_6);
//		
//		JLabel lblNewLabel_7 = new JLabel("Email");
//		lblNewLabel_7.setFont(new Font("Serif", Font.PLAIN, 13));
//		lblNewLabel_7.setBounds(10, 287, 45, 13);
//		frame.getContentPane().add(lblNewLabel_7);
//		
//		JLabel lblNewLabel_8 = new JLabel("Password");
//		lblNewLabel_8.setFont(new Font("Serif", Font.PLAIN, 13));
//		lblNewLabel_8.setBounds(10, 331, 85, 13);
//		frame.getContentPane().add(lblNewLabel_8);
//		
//		JButton btnRegistion = new JButton("Đăng ký");
////		Tạo sự kiện cho nút "Đăng ký"
//		btnRegistion.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
////				Gọi thực thi hàm
//				registerUser();
//			}
//
//			
//		});
//		btnRegistion.setBackground(new Color(255, 255, 255));
//		btnRegistion.setFont(new Font("Serif", Font.PLAIN, 13));
//		btnRegistion.setBounds(91, 423, 97, 33);
//		frame.getContentPane().add(btnRegistion);
//		
//		JButton btnCancel = new JButton("Thoát");
////		Tạo sự kiện cho nút thoát
//		btnCancel.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				frame.dispose();
//			}
//		});
//		btnCancel.setBackground(new Color(255, 255, 255));
//		btnCancel.setFont(new Font("Serif", Font.PLAIN, 13));
//		btnCancel.setBounds(211, 423, 85, 33);
//		frame.getContentPane().add(btnCancel);
//		
//		JLabel lblNewLabel_9 = new JLabel("Confirm Password");
//		lblNewLabel_9.setFont(new Font("Serif", Font.PLAIN, 13));
//		lblNewLabel_9.setBounds(10, 375, 104, 16);
//		frame.getContentPane().add(lblNewLabel_9);
//		
//		tfName = new JTextField();
//		tfName.setBounds(123, 76, 173, 19);
//		frame.getContentPane().add(tfName);
//		tfName.setColumns(10);
//		
//		tfAge = new JTextField();
//		tfAge.setBounds(123, 123, 173, 19);
//		frame.getContentPane().add(tfAge);
//		tfAge.setColumns(10);
//		
//		tfAddress = new JTextField();
//		tfAddress.setBounds(123, 206, 173, 19);
//		frame.getContentPane().add(tfAddress);
//		tfAddress.setColumns(10);
//		
//		tfPhone = new JTextField();
//		tfPhone.setBounds(123, 246, 173, 19);
//		frame.getContentPane().add(tfPhone);
//		tfPhone.setColumns(10);
//		
//		tfEmail = new JTextField();
//		tfEmail.setBounds(123, 284, 173, 19);
//		frame.getContentPane().add(tfEmail);
//		tfEmail.setColumns(10);
//		
//		pfPassword = new JPasswordField();
//		pfPassword.setBounds(124, 328, 172, 19);
//		frame.getContentPane().add(pfPassword);
//		
//		pfConfirmPassword = new JPasswordField();
//		pfConfirmPassword.setBounds(124, 372, 173, 19);
//		frame.getContentPane().add(pfConfirmPassword);
//		
//		rdbtnNam = new JRadioButton("Nam");
//		rdbtnNam.setFont(new Font("Serif", Font.PLAIN, 13));
//		rdbtnNam.setBackground(new Color(255, 127, 80));
//		rdbtnNam.setBounds(120, 166, 103, 21);
//		frame.getContentPane().add(rdbtnNam);
//		
//		rdbtnNu = new JRadioButton("Nữ");
//		rdbtnNu.setFont(new Font("Serif", Font.PLAIN, 13));
//		rdbtnNu.setBackground(new Color(255, 127, 80));
//		rdbtnNu.setBounds(225, 166, 103, 21);
//		frame.getContentPane().add(rdbtnNu);
//		
//		ButtonGroup gr= new ButtonGroup();
//		gr.add(rdbtnNam);
//		gr.add(rdbtnNu);
//		
//		frame.setLocationRelativeTo(null);
//		frame.setVisible(true);
//	}
////	Hàm đăng ký thông tin người dùng
//	private void registerUser() {
//		// TODO Auto-generated method stub
//		String name = tfName.getText();
//		String email=tfEmail.getText();
//		String phoneText = tfPhone.getText();
//		int phone = 0; // Giá trị mặc định hoặc giá trị khác tùy vào yêu cầu của bạn
//		if (!phoneText.isEmpty()) {
//		    try {
//		        phone = Integer.parseInt(phoneText);
//		    } catch (NumberFormatException ex) {
//		        // Xử lý nếu chuỗi không thể chuyển đổi thành số nguyên
//		        ex.printStackTrace(); // In lỗi ra console để theo dõi
//		    }
//		}
//		String address=tfAddress.getText();
//		String gender="";
//		if(rdbtnNam.isSelected()) {
//			gender="Nam";
//		}
//		else if(rdbtnNu.isSelected()) {
//			gender="Nữ";
//		}
//		String ageText = tfAge.getText();
//		int age = 0; // Giá trị mặc định hoặc giá trị khác tùy vào yêu cầu của bạn
//		if (!ageText.isEmpty()) {
//		    try {
//		        age = Integer.parseInt(ageText);
//		    } catch (NumberFormatException ex) {
//		        // Xử lý nếu chuỗi không thể chuyển đổi thành số nguyên
//		        ex.printStackTrace(); // In lỗi ra console để theo dõi
//		    }
//		}
//		String password=String.valueOf(pfPassword.getPassword());
//		String confirmpassword=String.valueOf(pfConfirmPassword.getPassword());
//		
////		Kiểm tra các trường không được để trống
//		if(name.isEmpty() || email.isEmpty() ||phone==0||address.isEmpty()||gender.isEmpty()||age==0||password.isEmpty()) {
//			JOptionPane.showMessageDialog(frame,
//					"Vui lòng điền đầy đủ thông tin",
//					"Thử lại",
//					JOptionPane.ERROR_MESSAGE);
//			return;
//		}
////		Kiểm tra xác nhận tài khoản
//		if(!password.equals(confirmpassword)) {
//			JOptionPane.showMessageDialog(frame,
//					"Mật khẩu không khớp",
//					"Vui lòng thử lại",
//					JOptionPane.ERROR_MESSAGE);
//			return;
//		}
//		user = addUserToDatabase(name,email,phone,address,gender,age,password);
//		if(user!=null) {
//			frame.dispose();
//		}
//		else {
//			JOptionPane.showMessageDialog(frame,
//					"Đăng ký người dùng thất bại",
//					"Thử lại",
//					JOptionPane.ERROR_MESSAGE);
//		}
//	}
//	public User user;
////	Hàm add người dùng vào Database
//	private User addUserToDatabase(String name, String email, int phone, String address,String gender,int age, String password) {
//		User user=null;
//		final String DB_URL = "jdbc:mysql://localhost:3306/MyStore?serverTimezone=UTC";
//		final String USERNAME="root";
//		final String PASSWORD="";
//		 try {
//			 Connection connect = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
////			 Quá trinh connnect tới Database
//			 
//			 Statement stmt= connect.createStatement();
//			 String sql= "INSERT INTO users(name,email,phone,address,gender,age,password)"+
//			 "VALUES(?,?,?,?,?,?,?)";
//			 
//			 PreparedStatement preparedStatement =connect.prepareStatement(sql);
//			 preparedStatement.setString(1,name);
//			 preparedStatement.setString(2,email);
//			 preparedStatement.setInt(3,phone);
//			 preparedStatement.setString(4,address);
//			 preparedStatement.setString(5,gender);
//			 preparedStatement.setInt(6,age);
//			 preparedStatement.setString(7,password);
//			 
////			 insert user vào bảng
//			 int addedRows=preparedStatement.executeUpdate();
//			 if(addedRows>0) {
//				 user= new User();
//				 user.name=name;
//				 user.email=email;
//				 user.phone=phone;
//				 user.address=address;
//				 user.gender=gender;
//				 user.age=age;
//				 user.password=password;
//			 }
//			 stmt.close();
//			 connect.close();
//		 }catch(Exception e) {
//			 e.printStackTrace();
//		 }
//		
//		return user;
//		
//	}
//}
