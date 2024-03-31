package GUI;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class pnRoom extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private DefaultTableModel modelRoom= new DefaultTableModel();


	/**
	 * Create the panel.
	 */
	public pnRoom() {
		setBackground(new Color(255, 240, 245));
		setBounds(222, 44, 1089, 590);
		setLayout(null);
		
		JLabel lblQunLPhng = new JLabel("Quản lý phòng");
		lblQunLPhng.setFont(new Font("SansSerif", Font.BOLD, 25));
		lblQunLPhng.setBounds(430, 10, 253, 33);
		add(lblQunLPhng);
		

		JTable table= new JTable();
		
		table.setModel(modelRoom);
		modelRoom.addColumn("ID");
		modelRoom.addColumn("Tên phòng");
		modelRoom.addColumn("ID loại PHG");
		modelRoom.addColumn("Trạng thái");
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(25, 63, 1037, 233);
		add(scrollPane);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBorder(new LineBorder(Color.lightGray,1));
		textField.setBounds(208, 388, 227, 33);
		add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBorder(new LineBorder(Color.lightGray,1));
		textField_1.setBounds(350, 310, 349, 33);
		add(textField_1);
		
		JLabel lblNewLabel_1_6 = new JLabel("Tìm kiếm");
		lblNewLabel_1_6.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_1_6.setBounds(262, 308, 79, 33);
		add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_1 = new JLabel("ID Loại PHG");
		lblNewLabel_1_1.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(95, 441, 103, 33);
		add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Tên phòng");
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_1.setBounds(95, 386, 103, 33);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Trạng thái");
		lblNewLabel_1_2.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(95, 503, 103, 33);
		add(lblNewLabel_1_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBorder(new LineBorder(Color.lightGray,1));
		textField_2.setBounds(208, 505, 227, 33);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBorder(new LineBorder(Color.lightGray,1));
		textField_3.setBounds(208, 443, 227, 33);
		add(textField_3);
		
		JButton btnNewButton = new JButton("Thêm");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(0, 206, 209));
		btnNewButton.setBounds(960, 386, 102, 33);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Xóa");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(new Color(0, 206, 209));
		btnNewButton_1.setBounds(960, 441, 102, 33);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Sửa");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBackground(new Color(0, 206, 209));
		btnNewButton_2.setBounds(960, 503, 102, 33);
		add(btnNewButton_2);


	}

}
