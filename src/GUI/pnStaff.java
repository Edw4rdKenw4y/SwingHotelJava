package GUI;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;

public class pnStaff extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable table;
	private DefaultTableModel modelStaff= new DefaultTableModel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Create the panel.
	 */
	public pnStaff() {
		setBackground(new Color(255, 240, 245));
		setBounds(222, 44, 1089, 590);
		setLayout(null);
		
		table = new JTable();
		
		table.setModel(modelStaff);
		modelStaff.addColumn("ID");
		modelStaff.addColumn("Họ tên");
		modelStaff.addColumn("Số điện thoại");
		modelStaff.addColumn("Email");
		modelStaff.addColumn("Giới tính");
		modelStaff.addColumn("Chức vụ");
//		modelStaff.addColumn("Password");
			
		JScrollPane scrollPane = new JScrollPane(table);
	    scrollPane.setBounds(20, 63, 1037, 233);
	    add(scrollPane);
	    
	 // Sau khi đã thiết lập model cho bảng và thêm vào JScrollPane
	 // Thiết lập kích thước cột
//	 table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // Tắt chế độ tự điều chỉnh kích thước
//	 for (int column = 0; column < table.getColumnCount(); column++) {
//	     TableColumn tableColumn = table.getColumnModel().getColumn(column);
//	     switch (column) {
//	         case 0: // Cột "ID"
//	             tableColumn.setPreferredWidth(50);
//	             break;
//	         case 1: // Cột "Họ tên"
//	             tableColumn.setPreferredWidth(200);
//	             break;
//	         case 2: // Cột "Số điện thoại"
//	             tableColumn.setPreferredWidth(200);
//	             break;
//	         case 3: // Cột "Email"
//	             tableColumn.setPreferredWidth(250);
//	             break;
//	         case 4: // Cột "Giới tính"
//	             tableColumn.setPreferredWidth(80);
//	             break;
//	         case 5: // Cột "Chức vụ"
//	             tableColumn.setPreferredWidth(100);
//	             break;
//	         case 6: // Cột "Password"
//	             tableColumn.setPreferredWidth(154);
//	             break;
//	         // Thêm các cài đặt cho các cột khác nếu cần
//	     }
//	 }
		
		JLabel lblNewLabel = new JLabel("Quản lý nhân viên");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 25));
		lblNewLabel.setBounds(425, 10, 253, 33);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Họ tên");
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_1.setBounds(20, 386, 79, 33);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Điện thoại");
		lblNewLabel_1_1.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(20, 441, 79, 33);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Email");
		lblNewLabel_1_2.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(20, 503, 79, 33);
		add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Giới tính");
		lblNewLabel_1_3.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_1_3.setBounds(425, 386, 79, 33);
		add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Chức vụ");
		lblNewLabel_1_4.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_1_4.setBounds(425, 441, 79, 33);
		add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Password");
		lblNewLabel_1_5.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_1_5.setBounds(425, 503, 79, 33);
		add(lblNewLabel_1_5);
		
		textField = new JTextField();
		textField.setBounds(109, 386, 227, 33);
		textField.setBorder(new LineBorder(Color.lightGray,1));//Chỉnh màu lineBorder
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(109, 441, 227, 33);
		textField_1.setBorder(new LineBorder(Color.lightGray,1));//Chỉnh màu lineBorder
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(109, 503, 227, 33);
		textField_2.setBorder(new LineBorder(Color.lightGray,1));//Chỉnh màu lineBorder
		add(textField_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(503, 503, 227, 33);
		textField_5.setBorder(new LineBorder(Color.lightGray,1));//Chỉnh màu lineBorder
		add(textField_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Tìm kiếm");
		lblNewLabel_1_6.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_1_6.setBounds(257, 308, 79, 33);
		add(lblNewLabel_1_6);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(345, 310, 349, 33);
		textField_6.setBorder(new LineBorder(Color.lightGray,1));//Chỉnh màu lineBorder
		add(textField_6);
		
		JButton btnNewButton = new JButton("Thêm");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnNewButton.setBounds(955, 386, 102, 33);
		btnNewButton.setBackground(new Color(0, 206, 209));
		btnNewButton.setBorderPainted(false);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Xóa");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnNewButton_1.setBounds(955, 441, 102, 33);
		btnNewButton_1.setBackground(new Color(0, 206, 209));
		btnNewButton_1.setBorderPainted(false);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Sửa");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnNewButton_2.setBounds(955, 503, 102, 33);
		btnNewButton_2.setBackground(new Color(0, 206, 209));
		btnNewButton_2.setBorderPainted(false);
		add(btnNewButton_2);
		
		JRadioButton rdbtnNam = new JRadioButton("Nam");
		rdbtnNam.setFont(new Font("SansSerif", Font.PLAIN, 15));
		rdbtnNam.setBackground(new Color(255, 240, 245));
		rdbtnNam.setBounds(510, 394, 103, 21);
		add(rdbtnNam);
		
		JRadioButton rdbtnNu = new JRadioButton("Nữ");
		rdbtnNu.setFont(new Font("SansSerif", Font.PLAIN, 15));
		rdbtnNu.setBackground(new Color(255, 240, 245));
		rdbtnNu.setBounds(627, 394, 103, 21);
		add(rdbtnNu);
		
//		ButtonGroup cho Gender
		ButtonGroup btngrGender= new ButtonGroup();
		btngrGender.add(rdbtnNam);
		btngrGender.add(rdbtnNu);
		
		JRadioButton rdbtnStaff = new JRadioButton("Nhân viên");
		rdbtnStaff.setFont(new Font("SansSerif", Font.PLAIN, 15));
		rdbtnStaff.setBackground(new Color(255, 240, 245));
		rdbtnStaff.setBounds(510, 449, 103, 21);
		add(rdbtnStaff);
		
		JRadioButton rdbtnAdmin = new JRadioButton("Quản lý");
		rdbtnAdmin.setFont(new Font("SansSerif", Font.PLAIN, 15));
		rdbtnAdmin.setBackground(new Color(255, 240, 245));
		rdbtnAdmin.setBounds(627, 449, 103, 21);
		add(rdbtnAdmin);
//		ButtonGroup cho Chức vụ
		ButtonGroup btngrPosition= new ButtonGroup();
		btngrPosition.add(rdbtnStaff);
		btngrPosition.add(rdbtnAdmin);
	}
}
