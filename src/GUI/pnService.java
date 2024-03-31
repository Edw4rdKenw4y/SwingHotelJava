package GUI;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.JTextPane;

public class pnService extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private DefaultTableModel modelService= new DefaultTableModel();

	/**
	 * Create the panel.
	 */
	public pnService() {
		setBackground(new Color(255, 240, 245));
		setBounds(222, 44, 1089, 590);
		setLayout(null);
		
		JTable table= new JTable();
		
		table.setModel(modelService);
		modelService.addColumn("ID");
		modelService.addColumn("Tên dịch vụ");
		modelService.addColumn("Đơn giá");
		modelService.addColumn("Mô tả");
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(24, 63, 1037, 233);
		add(scrollPane);
		
		JLabel lblNewLabel_1_6 = new JLabel("Tìm kiếm");
		lblNewLabel_1_6.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_1_6.setBounds(294, 322, 79, 33);
		add(lblNewLabel_1_6);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBorder(new LineBorder(Color.lightGray,1));
		textField_1.setBounds(382, 324, 349, 33);
		add(textField_1);
		
		JLabel lblNewLabel_1 = new JLabel("Tên dịch vụ");
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_1.setBounds(24, 400, 112, 33);
		add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBorder(new LineBorder(Color.lightGray,1));
		textField_2.setBounds(146, 400, 227, 33);
		add(textField_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Đơn giá");
		lblNewLabel_1_1.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(24, 455, 112, 33);
		add(lblNewLabel_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBorder(new LineBorder(Color.lightGray,1));
		textField_3.setBounds(146, 455, 227, 33);
		add(textField_3);
		
		JLabel lblNewLabel_1_2 = new JLabel("Mô tả");
		lblNewLabel_1_2.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(488, 400, 41, 33);
		add(lblNewLabel_1_2);
		
		JButton btnNewButton = new JButton("Thêm");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(0, 206, 209));
		btnNewButton.setBounds(937, 400, 102, 33);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Xóa");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(new Color(0, 206, 209));
		btnNewButton_1.setBounds(937, 455, 102, 33);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Sửa");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBackground(new Color(0, 206, 209));
		btnNewButton_2.setBounds(937, 517, 102, 33);
		add(btnNewButton_2);
		
		JLabel lblQunLDch = new JLabel("Quản lý dịch vụ");
		lblQunLDch.setFont(new Font("SansSerif", Font.BOLD, 25));
		lblQunLDch.setBounds(429, 10, 253, 33);
		add(lblQunLDch);
		
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(539, 400, 285, 88);
		add(textPane);

	}
}
