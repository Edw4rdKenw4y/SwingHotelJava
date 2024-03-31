package GUI;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class pnProfile extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Create the panel.
	 */
	public pnProfile() {
		setBackground(new Color(255, 240, 245));
		setBounds(222, 44, 1089, 590);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Thông tin cá nhân");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 25));
		lblNewLabel.setBounds(393, 10, 261, 46);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mã nhân viên");
		lblNewLabel_1.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(31, 94, 122, 31);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Địa chỉ");
		lblNewLabel_2.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(503, 94, 95, 31);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Họ tên");
		lblNewLabel_3.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(31, 170, 95, 31);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("CCCD");
		lblNewLabel_4.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(503, 170,95, 31);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Số điện thoại");
		lblNewLabel_5.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(31, 252, 122, 31);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Giới tính");
		lblNewLabel_6.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(503, 252,95, 31);
		add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Email");
		lblNewLabel_7.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(31, 326, 95, 31);
		add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Chức vụ");
		lblNewLabel_8.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblNewLabel_8.setBounds(503, 326, 95, 31);
		add(lblNewLabel_8);
		
		JButton btnUpdate = new JButton("Cập nhật");
		btnUpdate.setForeground(new Color(255, 255, 255));
		btnUpdate.setBackground(new Color(0, 206, 209));
		btnUpdate.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnUpdate.setBounds(872, 503, 130, 46);
		btnUpdate.setBorderPainted(false);
		add(btnUpdate);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 255));
		textField.setBounds(31, 129, 95, 31);
		textField.setBorder(new LineBorder(Color.lightGray,1));//Chỉnh màu lineBorder
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(31, 198, 271, 31);
		textField_1.setBorder(new LineBorder(Color.lightGray,1));//Chỉnh màu lineBorder
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(31, 282, 271, 31);
		textField_2.setBorder(new LineBorder(Color.lightGray,1));//Chỉnh màu lineBorder
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(31, 355, 271, 31);
		textField_3.setBorder(new LineBorder(Color.lightGray,1));//Chỉnh màu lineBorder
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(503, 129, 271, 31);
		textField_4.setBorder(new LineBorder(Color.lightGray,1));//Chỉnh màu lineBorder
		add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(503, 198, 271, 31);
		textField_5.setBorder(new LineBorder(Color.lightGray,1));//Chỉnh màu lineBorder
		add(textField_5);
		
		JRadioButton rdbtnNam = new JRadioButton("Nam");
		rdbtnNam.setBackground(new Color(255, 240, 245));
		rdbtnNam.setFont(new Font("SansSerif", Font.PLAIN, 15));
		rdbtnNam.setBounds(495, 287, 103, 21);
		add(rdbtnNam);
		
		JRadioButton rdbtnNu = new JRadioButton("Nữ");
		rdbtnNu.setBackground(new Color(255, 240, 245));
		rdbtnNu.setFont(new Font("SansSerif", Font.PLAIN, 15));
		rdbtnNu.setBounds(623, 287, 103, 21);
		add(rdbtnNu);
		
//		BUTTON GROUP CHO GIỚI TÍNH
		ButtonGroup btngrGender = new ButtonGroup();
		btngrGender.add(rdbtnNam);
		btngrGender.add(rdbtnNu);
		
		JRadioButton rdbtnStaff = new JRadioButton("Nhân viên");
		rdbtnStaff.setBackground(new Color(255, 240, 245));
		rdbtnStaff.setFont(new Font("SansSerif", Font.PLAIN, 15));
		rdbtnStaff.setBounds(495, 365, 103, 21);
		add(rdbtnStaff);
		
		JRadioButton rdbtnAdmin = new JRadioButton("Quản lý");
		rdbtnAdmin.setBackground(new Color(255, 240, 245));
		rdbtnAdmin.setFont(new Font("SansSerif", Font.PLAIN, 15));
		rdbtnAdmin.setBounds(623, 365, 103, 21);
		add(rdbtnAdmin);

//		BUTTON GROUP CHO CHỨC VỤ
		ButtonGroup btngrPosition = new ButtonGroup();//Position(n): chức vụ
		btngrPosition.add(rdbtnStaff);
		btngrPosition.add(rdbtnAdmin);

	}
}
