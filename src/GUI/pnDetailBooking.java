package GUI;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class pnDetailBooking extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable table;
	private DefaultTableModel modelDetailBooking = new DefaultTableModel();

	/**
	 * Create the panel.
	 */
	public pnDetailBooking() {
		setBackground(new Color(255, 240, 245));
		setBounds(222, 44, 1089, 590);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Danh sách phiếu đặt phòng");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblNewLabel.setBounds(154, 21, 266, 25);
		add(lblNewLabel);
		
		JLabel lblThngTinChi = new JLabel("Thông tin chi tiết");
		lblThngTinChi.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblThngTinChi.setBounds(759, 21, 174, 25);
		add(lblThngTinChi);
		
		table = new JTable();
		
		table.setModel(modelDetailBooking);
		modelDetailBooking.addColumn("ID_CTPHIEUDAT ");
		modelDetailBooking.addColumn("ID_PHIEUDAT ");
		modelDetailBooking.addColumn("ID_PHG ");
		modelDetailBooking.addColumn("TONG TIEN ");
		modelDetailBooking.addColumn("TRANG THAI ");
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(20, 59, 590, 477);
		add(scrollPane);

	}

}
