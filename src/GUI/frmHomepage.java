package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JToggleButton;

import javax.swing.SwingConstants;
import javax.swing.plaf.MenuItemUI;
import javax.swing.plaf.metal.MetalToggleButtonUI;

import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class frmHomepage {

	private JFrame frame;
	private JPanel pnInner;
	private JPanel pnNevigation = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmHomepage window = new frmHomepage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public frmHomepage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1311, 671);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		pnNevigation.setBounds(0, 0, 222, 634);
		pnNevigation.setBackground(new Color(175, 238, 238));
		frame.getContentPane().add(pnNevigation);
		pnNevigation.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBackground(new Color(175, 238, 238));
		lblNewLabel_3.setIcon(new ImageIcon(frmHomepage.class.getResource("/Picture/review (1).png")));
		lblNewLabel_3.setBounds(27, 10, 128, 126);
		pnNevigation.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("AbyssHotel");
		lblNewLabel_4.setForeground(new Color(0, 0, 128));
		lblNewLabel_4.setFont(new Font("Script MT Bold", Font.BOLD, 24));
		lblNewLabel_4.setBounds(27, 134, 140, 29);
		pnNevigation.add(lblNewLabel_4);
		
		JToggleButton tglbtnBooking = new JToggleButton("Quản lý đặt phòng");
		tglbtnBooking.setIcon(new ImageIcon(frmHomepage.class.getResource("/Picture/bed.png")));
		tglbtnBooking.setUI(new MetalToggleButtonUI() {
			@Override
		    protected Color getFocusColor() {
		        return tglbtnBooking.getBackground();
		    }
		    protected Color getSelectColor() {
		        return tglbtnBooking.getBackground();
		    }
		});
		tglbtnBooking.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				innerpnBooking(e);
			}
		});
		tglbtnBooking.setHorizontalAlignment(SwingConstants.LEFT);
		tglbtnBooking.setBackground(new Color(175, 238, 238));
		tglbtnBooking.setFont(new Font("SansSerif", Font.PLAIN, 15));
		tglbtnBooking.setBounds(10, 175, 212, 41);
		tglbtnBooking.setBorderPainted(false);//Bỏ viền btn
		pnNevigation.add(tglbtnBooking);
		
		
		JToggleButton tglbtnRoom = new JToggleButton("Quản lý phòng");
		tglbtnRoom.setIcon(new ImageIcon(frmHomepage.class.getResource("/Picture/beds.png")));
		tglbtnRoom.setUI(new MetalToggleButtonUI(){
			@Override 
			protected Color getFocusColor() {
				return tglbtnRoom.getBackground();
				
			}
			protected Color getSelectColor() {
				return tglbtnRoom.getBackground();
			}
		});
		tglbtnRoom.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				innerpnRoom(e);
				
			}
		});
		tglbtnRoom.setHorizontalAlignment(SwingConstants.LEFT);
		tglbtnRoom.setBackground(new Color(175, 238, 238));
		tglbtnRoom.setFont(new Font("SansSerif", Font.PLAIN, 15));
		tglbtnRoom.setBounds(10, 223, 212, 41);
		tglbtnRoom.setBorderPainted(false);//Bỏ viền btn
		pnNevigation.add(tglbtnRoom);
		
		JToggleButton tglbtnTypeRoom = new JToggleButton("Quản lý loại phòng");
		tglbtnTypeRoom.setIcon(new ImageIcon(frmHomepage.class.getResource("/Picture/living-room.png")));
		tglbtnTypeRoom.setUI(new MetalToggleButtonUI() {
			@Override
			protected Color getFocusColor() {
				return tglbtnTypeRoom.getBackground();
			}
			protected Color getSelectColor() {
				return tglbtnTypeRoom.getBackground();
			}
		});
		tglbtnTypeRoom.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				innerpnTypeRoom(e);
			}
		});
		tglbtnTypeRoom.setHorizontalAlignment(SwingConstants.LEFT);
		tglbtnTypeRoom.setBackground(new Color(175, 238, 238));
		tglbtnTypeRoom.setFont(new Font("SansSerif", Font.PLAIN, 15));
		tglbtnTypeRoom.setBounds(10, 274, 212, 41);
		tglbtnTypeRoom.setBorderPainted(false);//Bỏ viền btn
		pnNevigation.add(tglbtnTypeRoom);
		
		JToggleButton tglbtnInvoice = new JToggleButton("Quán lý hóa đơn");
		tglbtnInvoice.setIcon(new ImageIcon(frmHomepage.class.getResource("/Picture/book-club.png")));
		tglbtnInvoice.setUI(new MetalToggleButtonUI() {
			@Override
			protected Color getFocusColor() {
				return tglbtnInvoice.getBackground();
			}
			protected Color getSelectColor() {
				return tglbtnInvoice.getBackground();
			}
		});
		tglbtnInvoice.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				innerpnInvoice(e);
			}
		});
		tglbtnInvoice.setHorizontalAlignment(SwingConstants.LEFT);
		tglbtnInvoice.setBackground(new Color(175, 238, 238));
		tglbtnInvoice.setFont(new Font("SansSerif", Font.PLAIN, 15));
		tglbtnInvoice.setBounds(10, 327, 212, 41);
		tglbtnInvoice.setBorderPainted(false);//Bỏ viền btn
		pnNevigation.add(tglbtnInvoice);
		
		JToggleButton tglbtnCustomer = new JToggleButton("Quản lý khách hàng");
		tglbtnCustomer.setIcon(new ImageIcon(frmHomepage.class.getResource("/Picture/meeting.png")));
		tglbtnCustomer.setUI(new MetalToggleButtonUI() {
			@Override
			protected Color getFocusColor() {
				return tglbtnCustomer.getBackground();
			}
			protected Color getSelectColor() {
				return tglbtnCustomer.getBackground();
			}
		});
		tglbtnCustomer.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				innerpnCustomer(e);
			}
		});
		tglbtnCustomer.setHorizontalAlignment(SwingConstants.LEFT);
		tglbtnCustomer.setBackground(new Color(175, 238, 238));
		tglbtnCustomer.setFont(new Font("SansSerif", Font.PLAIN, 15));
		tglbtnCustomer.setBounds(10, 378, 212, 41);
		tglbtnCustomer.setBorderPainted(false);//Bỏ viền btn
		pnNevigation.add(tglbtnCustomer);
		
		JToggleButton tglbtnStaff = new JToggleButton("Quản lý nhân viên");
		tglbtnStaff.setIcon(new ImageIcon(frmHomepage.class.getResource("/Picture/teamwork (1).png")));
		tglbtnStaff.setUI(new MetalToggleButtonUI() {
			@Override
			protected Color getFocusColor() {
				return tglbtnStaff.getBackground();
			}
			protected Color getSelectColor() {
				return tglbtnStaff.getBackground();
			}
		});
		tglbtnStaff.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				innerpnStaff(e);
			}
		});
		tglbtnStaff.setHorizontalAlignment(SwingConstants.LEFT);
		tglbtnStaff.setBackground(new Color(175, 238, 238));
		tglbtnStaff.setFont(new Font("SansSerif", Font.PLAIN, 15));
		tglbtnStaff.setBounds(10, 429, 212, 41);
		tglbtnStaff.setBorderPainted(false);//Bỏ viền btn
		pnNevigation.add(tglbtnStaff);
		
		JToggleButton tglbtnRevenue = new JToggleButton("Doanh thu");
		tglbtnRevenue.setIcon(new ImageIcon(frmHomepage.class.getResource("/Picture/budget.png")));
		tglbtnRevenue.setUI(new MetalToggleButtonUI() {
			@Override
			protected Color getFocusColor() {
				return tglbtnRevenue.getBackground();
			}
			protected Color getSelectColor() {
				return tglbtnRevenue.getBackground();
			}
		});
		tglbtnRevenue.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				innerpnRevenue(e);
			}
		});
		tglbtnRevenue.setHorizontalAlignment(SwingConstants.LEFT);
		tglbtnRevenue.setBackground(new Color(175, 238, 238));
		tglbtnRevenue.setFont(new Font("SansSerif", Font.PLAIN, 15));
		tglbtnRevenue.setBounds(10, 480, 212, 41);
		tglbtnRevenue.setBorderPainted(false);//Bỏ viền btn
		pnNevigation.add(tglbtnRevenue);
		
		JToggleButton tglbtnProfile = new JToggleButton("Thông tin cá nhân");
		tglbtnProfile.setIcon(new ImageIcon(frmHomepage.class.getResource("/Picture/user (4).png")));
		tglbtnProfile.setUI(new MetalToggleButtonUI() {
		    @Override
		    protected Color getFocusColor() {
		        return tglbtnProfile.getBackground();
		    }

		    @Override
		    protected Color getSelectColor() {
		        return tglbtnProfile.getBackground(); 
		    }
		});
		tglbtnProfile.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				innerpnProfile(e);
			};
		});
		tglbtnProfile.setHorizontalAlignment(SwingConstants.LEFT);
		tglbtnProfile.setBackground(new Color(175, 238, 238));
		tglbtnProfile.setFont(new Font("SansSerif", Font.PLAIN, 15));
		tglbtnProfile.setBounds(10, 583, 212, 41);
		tglbtnProfile.setBorderPainted(false);//Bỏ viền btn
		pnNevigation.add(tglbtnProfile);
		
		JToggleButton tglbtnService = new JToggleButton("Quản lý dịch vụ");
		tglbtnService.setIcon(new ImageIcon(frmHomepage.class.getResource("/Picture/customer-service.png")));
		tglbtnService.setUI(new MetalToggleButtonUI() {
		    @Override
		    protected Color getFocusColor() {
		        return tglbtnService.getBackground();
		    }

		    @Override
		    protected Color getSelectColor() {
		        return tglbtnService.getBackground(); 
		    }
		});
		tglbtnService.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				innerpnService(e);
			};
		});
		tglbtnService.setHorizontalAlignment(SwingConstants.LEFT);
		tglbtnService.setFont(new Font("SansSerif", Font.PLAIN, 15));
		tglbtnService.setBorderPainted(false);
		tglbtnService.setBackground(new Color(175, 238, 238));
		tglbtnService.setBounds(10, 531, 212, 41);
		pnNevigation.add(tglbtnService);
		
//		BUTTON GROUP JTOGGLEBUTTON
		ButtonGroup btngr= new ButtonGroup();
		btngr.add(tglbtnBooking);
		btngr.add(tglbtnRoom);
		btngr.add(tglbtnTypeRoom);
		btngr.add(tglbtnInvoice);
		btngr.add(tglbtnCustomer);
		btngr.add(tglbtnStaff);
		btngr.add(tglbtnRevenue);
		btngr.add(tglbtnService);
		btngr.add(tglbtnProfile);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(222, 0, 1085, 44);
		panel_1.setBackground(new Color(175, 238, 238));
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(frmHomepage.class.getResource("/Picture/user (2).png")));
		lblNewLabel.setBounds(826, 4, 24, 37);
		panel_1.add(lblNewLabel);
		
		JLabel lbUserName = new JLabel("Name user");
		lbUserName.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lbUserName.setBounds(858, 4, 95, 37);
		panel_1.add(lbUserName);
		
		JButton btnNewButton_2 = new JButton("Logout");
		btnNewButton_2.setIcon(new ImageIcon(frmHomepage.class.getResource("/Picture/exit.png")));
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.setFont(new Font("SansSerif", Font.PLAIN, 15));
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBackground(new Color(175, 238, 238));
		btnNewButton_2.setBounds(956, 4, 117, 37);
		panel_1.add(btnNewButton_2);
		
		pnInner = new JPanel();
		pnInner.setBounds(222, 43, 1089, 590);
		
		frame.getContentPane().add(pnInner);
//		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); //Đặt kích thước frame full màn hình
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);//Khóa nút phóng to toàn màn hình của frame
		
		tglbtnBooking.doClick();//Mặc định cho quản lý đặt phòng hiển thị
		
	}
//	Hàm đổi JToggleButton, đổi Panel
	private void switchPanel(JPanel panel) {
        frame.getContentPane().remove(pnInner); // Xóa panel hiện tại
        pnInner = panel; // Gán panel mới cho biến panel_2
        pnInner.setBounds(222, 44, 1089, 590); // Đặt lại kích thước cho panel mới (nếu cần)

        frame.getContentPane().add(pnInner); // Thêm panel mới vào frame
        frame.getContentPane().validate(); // Xác nhận các thay đổi
        frame.getContentPane().repaint(); // Vẽ lại frame để hiển thị panel mới
    }
//	Panel của quản lý đặt phòng
	private void innerpnBooking(ItemEvent e) {
		if(e.getStateChange()== ItemEvent.SELECTED) {
			// Tạo panel mới chứa các tab
	        JPanel pnBooking = new JPanel();
	        pnBooking.setBounds(0, 0, 1089, 590);
	        pnBooking.setLayout(null);

	        // Tạo JTabbedPane để chứa các tab
	        JTabbedPane tabbedPaneBooking = new JTabbedPane(JTabbedPane.TOP);
	        tabbedPaneBooking.setBounds(0, 0, 1089, 590);
	        pnBooking.add(tabbedPaneBooking);

	        // thêm pnBooking vào tab
	        pnBooking pnBookingtab = new pnBooking();
	        // Thêm các thành phần vào pnBookingTab1
	        tabbedPaneBooking.addTab("Thêm phiếu đặt", null, pnBookingtab, null);

	        pnDetailBooking pnDetailBookingtab = new pnDetailBooking();
	        // Thêm các thành phần vào pnBookingTab2
	        tabbedPaneBooking.addTab("Danh sách phiếu đặt", null, pnDetailBookingtab, null);

	        pnCheckOut pnCheckouttab = new pnCheckOut();
	        // Thêm các thành phần vào pnBookingTab3
	        tabbedPaneBooking.addTab("Trả phòng", null, pnCheckouttab, null);

	        // Hiển thị panel quản lý đặt phòng
	        switchPanel(pnBooking);
		        
		        ((JToggleButton)e.getSource()).setBackground(Color.white);
		}else if(e.getStateChange()!= ItemEvent.SELECTED) {
			((JToggleButton)e.getSource()).setBackground(pnNevigation.getBackground());
		}
	}

//	Panel quản lý phòng
	private void innerpnRoom(ItemEvent e) {
		if(e.getStateChange()==ItemEvent.SELECTED) {
			JPanel pnroom= new pnRoom();
			
			switchPanel(pnroom);
			
			((JToggleButton)e.getSource()).setBackground(Color.white);
		}else if(e.getStateChange()!=ItemEvent.SELECTED) {
			((JToggleButton)e.getSource()).setBackground(pnNevigation.getBackground());
		}
	}
//	Panel quản lý loại phòng
	private void innerpnTypeRoom(ItemEvent e) {
		if(e.getStateChange()==ItemEvent.SELECTED) {
			JPanel pntyperoom= new pnTyperoom();
			
			switchPanel(pntyperoom);
			
			((JToggleButton)e.getSource()).setBackground(Color.white);
		}else if(e.getStateChange()!=ItemEvent.SELECTED) {
			((JToggleButton)e.getSource()).setBackground(pnNevigation.getBackground());
		}
	}
//	Panel Quản lý hóa đơn
	private void innerpnInvoice(ItemEvent e) {
		if(e.getStateChange()==ItemEvent.SELECTED) {
			JPanel pninvoice= new pnInvoice();
			
			switchPanel(pninvoice);
			
			((JToggleButton)e.getSource()).setBackground(Color.white);
		}else if(e.getStateChange()!=ItemEvent.SELECTED) {
			((JToggleButton)e.getSource()).setBackground(pnNevigation.getBackground());
		}
	}
//	Panel quản lý khách hàng
	private void innerpnCustomer(ItemEvent e) {
		if(e.getStateChange()==ItemEvent.SELECTED) {
			JPanel pncustomer= new pnCustomer();
			
			switchPanel(pncustomer);
			
			((JToggleButton)e.getSource()).setBackground(Color.white);
		}else if(e.getStateChange()!=ItemEvent.SELECTED) {
			((JToggleButton)e.getSource()).setBackground(pnNevigation.getBackground());
		}
	}
	
//	Panel quản lý nhân viên
	private void innerpnStaff(ItemEvent e) {
		if(e.getStateChange()== ItemEvent.SELECTED) {
			 JPanel pnstaff = new pnStaff(); // Tạo một instance mới của JPanel bạn muốn hiển thị

			 switchPanel(pnstaff);
		        
		        ((JToggleButton)e.getSource()).setBackground(Color.white);
		}else if(e.getStateChange()!= ItemEvent.SELECTED) {
			((JToggleButton)e.getSource()).setBackground(pnNevigation.getBackground());
		}
	}
	
//	Panel quản lý doanh thu
	private void innerpnRevenue(ItemEvent e) {
		if(e.getStateChange()== ItemEvent.SELECTED) {
			 JPanel pnrevenue = new pnRevenue(); // Tạo một instance mới của JPanel bạn muốn hiển thị

			 switchPanel(pnrevenue);
		        
		        ((JToggleButton)e.getSource()).setBackground(Color.white);
		}else if(e.getStateChange()!= ItemEvent.SELECTED) {
			((JToggleButton)e.getSource()).setBackground(pnNevigation.getBackground());
		}
	}
	  
//	Panel quản lý dịch vụ
	private void innerpnService(ItemEvent e) {
		if(e.getStateChange()== ItemEvent.SELECTED) {
			 JPanel pnservice = new pnService(); // Tạo một instance mới của JPanel bạn muốn hiển thị

			 switchPanel(pnservice);
		        
		        ((JToggleButton)e.getSource()).setBackground(Color.white);
		}else if(e.getStateChange()!= ItemEvent.SELECTED) {
			((JToggleButton)e.getSource()).setBackground(pnNevigation.getBackground());
		}
	}
	
//	Panel thông tin cá nhân
	private void innerpnProfile(ItemEvent e) {
		if(e.getStateChange()==ItemEvent.SELECTED) {
			JPanel pnprofile= new pnProfile();
			
			switchPanel(pnprofile);
			
			((JToggleButton)e.getSource()).setBackground(Color.white);
		}else if(e.getStateChange()!=ItemEvent.SELECTED) {
			((JToggleButton)e.getSource()).setBackground(pnNevigation.getBackground());
		}
	}
}
