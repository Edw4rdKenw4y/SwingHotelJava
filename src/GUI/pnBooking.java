package GUI;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class pnBooking extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public pnBooking() {
		setBackground(new Color(255, 240, 245));
		setBounds(222, 44, 1089, 590);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Thêm phiếu đặt phòng");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblNewLabel.setBounds(140, 25, 266, 25);
		add(lblNewLabel);
		
		JLabel lblDnhSchPhng = new JLabel("Danh sách phòng");
		lblDnhSchPhng.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblDnhSchPhng.setBounds(739, 25, 206, 25);
		add(lblDnhSchPhng);
		
		table = new JTable();
		table.setBounds(585, 75, 455, 384);
		add(table);
		
		JLabel lblIdNhnVin = new JLabel("ID Nhân viên");
		lblIdNhnVin.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblIdNhnVin.setBounds(10, 84, 111, 25);
		add(lblIdNhnVin);
		
		JLabel lblChnKhchHng = new JLabel("Chọn khách hàng");
		lblChnKhchHng.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblChnKhchHng.setBounds(10, 146, 132, 25);
		add(lblChnKhchHng);
		
		JLabel lblNgyt = new JLabel("Ngày đặt");
		lblNgyt.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblNgyt.setBounds(10, 208, 83, 25);
		add(lblNgyt);
		
		JLabel lblNgyTr = new JLabel("Ngày trả");
		lblNgyTr.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblNgyTr.setBounds(10, 268, 83, 25);
		add(lblNgyTr);
		
		JLabel lblPhng = new JLabel("Phòng");
		lblPhng.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblPhng.setBounds(10, 322, 83, 25);
		add(lblPhng);
		
		JLabel lblTinTmTnh = new JLabel("Tiền tạm tính");
		lblTinTmTnh.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblTinTmTnh.setBounds(10, 374, 111, 25);
		add(lblTinTmTnh);
		
		JButton btnNewButton_1 = new JButton("Thêm");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(new Color(0, 206, 209));
		btnNewButton_1.setBounds(938, 499, 102, 33);
		add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(150, 83, 125, 25);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(150, 376, 125, 25);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(150, 327, 125, 25);
		add(textField_2);
	}
}
