package GUI;

import java.awt.Color;
import DTO.typeRoomDTO;
import BUS.typeRoomBUS;

import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Component;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;

public class pnTyperoom extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField tfFind;
	private JTextField tfNameTypeRoom;
	private JTextField tfFeeTypeRoom;
	private DefaultTableModel modelTypeRoom= new DefaultTableModel();
	
	private ArrayList<typeRoomDTO> arrTypeRoom;
	
	private typeRoomBUS trBUS= new typeRoomBUS();
	
	
	
	JTable table;
	private JTextField tfIDTypeRoom;
	private JTextPane tpInfoTypeRoom ;
	private JComboBox<String> cbStatus;


	/**
	 * Create the panel.
	 */
	public pnTyperoom() {
		initComponents();
		loadTypeRoomList();
		
	}
//	Hiểm thị các thành phần giao diện
	private void initComponents() {
		setBackground(new Color(248, 248, 255));
		setBounds(222, 44, 1089, 590);
		setLayout(null);
		
		JLabel lblQunLLoi = new JLabel("  Quản lý loại phòng");
		lblQunLLoi.setIcon(new ImageIcon(pnTyperoom.class.getResource("/Picture/bedroom (1).png")));
		lblQunLLoi.setForeground(new Color(0, 0, 128));
		lblQunLLoi.setFont(new Font("SansSerif", Font.BOLD, 25));
		lblQunLLoi.setBounds(368, 10, 321, 50);
		add(lblQunLLoi);
		
		JLabel lblNewLabel_1_6 = new JLabel("Tìm kiếm");
		lblNewLabel_1_6.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_1_6.setBounds(292, 339, 79, 33);
		add(lblNewLabel_1_6);
		
		tfFind = new JTextField();
		tfFind.setColumns(10);
		tfFind.setBorder(new LineBorder(Color.lightGray,1));
		tfFind.setBounds(380, 341, 349, 33);
		add(tfFind);
		
		JLabel lblNewLabel_1 = new JLabel("Tên loại phòng");
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_1.setBounds(22, 472, 112, 33);
		add(lblNewLabel_1);
		
		tfNameTypeRoom = new JTextField();
		tfNameTypeRoom.setColumns(10);
		tfNameTypeRoom.setBorder(new LineBorder(Color.lightGray,1));
		tfNameTypeRoom.setBounds(144, 474, 227, 33);
		add(tfNameTypeRoom);
		
		JLabel lblNewLabel_1_1 = new JLabel("Đơn giá");
		lblNewLabel_1_1.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(22, 531, 112, 33);
		add(lblNewLabel_1_1);
		
		tfFeeTypeRoom = new JTextField();
		tfFeeTypeRoom.setColumns(10);
		tfFeeTypeRoom.setBorder(new LineBorder(Color.lightGray,1));
		tfFeeTypeRoom.setBounds(144, 533, 227, 33);
		add(tfFeeTypeRoom);
		
		JLabel lblNewLabel_1_2 = new JLabel("Mô tả");
		lblNewLabel_1_2.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(497, 472, 41, 33);
		add(lblNewLabel_1_2);
		
		tpInfoTypeRoom = new JTextPane();
		tpInfoTypeRoom.setBounds(548, 478, 285, 88);
		add(tpInfoTypeRoom);
		
		JLabel lblNewLabel_1_11 = new JLabel("Trạng thái");
		lblNewLabel_1_11.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_1_11.setBounds(467, 417, 79, 33);
		add(lblNewLabel_1_11);
		
		tfIDTypeRoom = new JTextField();
		tfIDTypeRoom.setColumns(10);
		tfIDTypeRoom.setBorder(new LineBorder(Color.lightGray,1));
		tfIDTypeRoom.setBounds(144, 417, 227, 33);
		add(tfIDTypeRoom);
		
		
		JLabel lblNewLabel_1_1_1 = new JLabel("ID");
		lblNewLabel_1_1_1.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_1_1_1.setBounds(22, 417, 112, 33);
		add(lblNewLabel_1_1_1);
		

		cbStatus = new JComboBox<>();
		cbStatus.setBackground(new Color(255, 255, 255));
		cbStatus.setBounds(548, 425, 145, 21);
		cbStatus.addItem("Hoạt động");
		cbStatus.addItem("Không hoạt động");
		add(cbStatus);
		
		JButton btnAdd = new JButton("Thêm");
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnAdd.setBorderPainted(false);
		btnAdd.setBackground(new Color(0, 206, 209));
		btnAdd.setBounds(957, 417, 102, 33);
		add(btnAdd);
		btnAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				btnAddAtionPerformed(e);
			}
		});
		
		JButton btnDelete = new JButton("Xóa");
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnDelete.setBorderPainted(false);
		btnDelete.setBackground(new Color(0, 206, 209));
		btnDelete.setBounds(957, 472, 102, 33);
		add(btnDelete);
		
		JButton btnEdit = new JButton("Sửa");
		btnEdit.setForeground(Color.WHITE);
		btnEdit.setFont(new Font("SansSerif", Font.BOLD, 15));
		btnEdit.setBorderPainted(false);
		btnEdit.setBackground(new Color(0, 206, 209));
		btnEdit.setBounds(957, 533, 102, 33);
		add(btnEdit);
	}
//	UpdateList
	private void showListTypeRoom() {
		modelTypeRoom.setRowCount(0);
		for(typeRoomDTO tr: arrTypeRoom) {
			modelTypeRoom.addRow(new Object[] {
					tr.getTypeRoom_id(),
					tr.getTypeRoom_name(),
					tr.getTypeRoom_fee(),
					tr.getTypeRoom_info(),
					tr.getTypeRoom_status()
			});
		}
	}
//	Hiểm thị list loại phòng lên table
	private void loadTypeRoomList() {
		
		table= new JTable();
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				tableTypeRoomMouseClicked(e);
			}
		});
		
		table.setModel(modelTypeRoom);
		modelTypeRoom.addColumn("ID");
		modelTypeRoom.addColumn("Tên loại phòng");
		modelTypeRoom.addColumn("Đơn giá");
		modelTypeRoom.addColumn("Mô tả");
		modelTypeRoom.addColumn("Trạng thái");
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(22, 80, 1037, 233);
		scrollPane.getViewport().setBackground(Color.white);
		add(scrollPane);
		
		
		arrTypeRoom=trBUS.getAllTypeRooms();
		showListTypeRoom();	
	}
//	Xử lý sự kiện click chuột trong table
	private void tableTypeRoomMouseClicked(MouseEvent e) {
		int i=table.getSelectedRow();
		if(i>=0) {
			tfIDTypeRoom.setText(modelTypeRoom.getValueAt(i,0).toString());
			tfNameTypeRoom.setText(modelTypeRoom.getValueAt(i,1).toString());
			tfFeeTypeRoom.setText(modelTypeRoom.getValueAt(i,2).toString());
			tpInfoTypeRoom.setText(modelTypeRoom.getValueAt(i, 3).toString());
			cbStatus.setSelectedItem(modelTypeRoom.getValueAt(i, 4).toString());
			
		}
	}
//	Xử lý sự kiện cho nút thêm
	private void btnAddAtionPerformed(ActionEvent e) {
		
	}
}
