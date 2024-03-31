package GUI;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pnCheckOut extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable table;
	private DefaultTableModel modelCheckout = new DefaultTableModel();

	/**
	 * Create the panel.
	 */
	public pnCheckOut() {
		setBackground(new Color(255, 240, 245));
		setBounds(222, 44, 1089, 590);
		setLayout(null);
		
		JLabel lblDanhSchTr = new JLabel("Danh sách trả phòng");
		lblDanhSchTr.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblDanhSchTr.setBounds(183, 10, 206, 25);
		add(lblDanhSchTr);
		
		JLabel lblThngTinChi = new JLabel("Thông tin chi tiết");
		lblThngTinChi.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblThngTinChi.setBounds(767, 10, 174, 25);
		add(lblThngTinChi);
		
		table = new JTable();
		
		table.setModel(modelCheckout);
		modelCheckout.addColumn("ID_CTPHIEUDAT ");
		modelCheckout.addColumn("ID_PHIEUDAT ");
		modelCheckout.addColumn("ID_PHG ");
		modelCheckout.addColumn("TONG TIEN ");
		modelCheckout.addColumn("TRANG THAI ");
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(20, 59, 590, 477);
		add(scrollPane);
		
		JButton btnNewButton_1 = new JButton("Thanh toán và trả phòng");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBackground(new Color(0, 206, 209));
		btnNewButton_1.setBounds(832, 495, 235, 33);
		add(btnNewButton_1);
		
		JLabel lblTngTin = new JLabel("Tổng tiền");
		lblTngTin.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblTngTin.setBounds(620, 499, 111, 25);
		add(lblTngTin);
		
		JLabel lblChnDchV = new JLabel("Chọn dịch vụ");
		lblChnDchV.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblChnDchV.setBounds(620, 422, 111, 25);
		add(lblChnDchV);

	}
}
