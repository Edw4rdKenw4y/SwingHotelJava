package DAO;
import DTO.typeRoomDTO;
import java.sql.*;
import java.util.ArrayList;

public class typeRoomDAO {
	private static final String PreparedStatement = null;
	private Connection con;
//	Thiết lập kiểm tra kết nối
	public boolean openConectionToTypeRoom() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/hotelmanager?serverTimezone=UTC";
			String username="root";
			String password="";
			
			con=DriverManager.getConnection(url,username,password);
		
			return true;
		}catch(Exception e) {
			System.out.println(e);
			return false;
		}
		
	}
//	Đóng kết nối
	public void closeConnectionToTypeRoom() {
		try {
			if(con!=null) {
				con.close();
			}
			
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
//	Lấy danh sách loại phòng trả về mảng
	public ArrayList<typeRoomDTO> getAllTypeRooms(){
		ArrayList<typeRoomDTO> arrTypeRooms= new ArrayList<typeRoomDTO>();
		if(openConectionToTypeRoom()) {
			try {
				String sql="Select * from loaiphong";
				
				Statement stmt=con.createStatement();
				
				ResultSet rs=stmt.executeQuery(sql);
				
				while(rs.next()) {
					typeRoomDTO tr= new typeRoomDTO();
					tr.setTypeRoom_id(rs.getInt("ID_LOAIPHG"));
					tr.setTypeRoom_name(rs.getString("TEN_LOAIPHG"));
					tr.setTypeRoom_fee(rs.getDouble("DONGIA_PHG"));
					tr.setTypeRoom_info(rs.getString("MOTA_PHG"));
					tr.setTypeRoom_status(rs.getString("TRANGTHAI_LOAIPHG"));
					
					arrTypeRooms.add(tr);
				}
				
			}catch(SQLException e) {
				System.out.println(e);
			}finally {
				closeConnectionToTypeRoom();
			}
			
		}
		return arrTypeRooms;
	}
//	Kiểm tra trùng ID
	public boolean hasIDTypeRoom(int id) {
		boolean result= false;
		if(openConectionToTypeRoom()) {
			try {
				String sql="Select * from loaiphong where ID_LOAIPHG= ?";
						
				PreparedStatement stmt=con.prepareStatement(sql);
				
				stmt.setInt(1,id );
				
				ResultSet rs=stmt.executeQuery();
				
				result=rs.next();
				
			}catch(SQLException e) {
				System.out.println(e);
			}finally {
				closeConnectionToTypeRoom();
			}
		}
		return result;
	}
//	Kiểm tra thêm loại phòng
	public boolean addTypeRoom(typeRoomDTO tr) {
		boolean result=false;
		if(openConectionToTypeRoom()) {
			try {
				String sql="Insert into loaiphong values(?,?,?,?,?)";
				
				PreparedStatement stmt= con.prepareStatement(sql);
				
				stmt.setInt(1, tr.getTypeRoom_id());
				stmt.setString(2,tr.getTypeRoom_name());
				stmt.setDouble(3,tr.getTypeRoom_fee());
				stmt.setString(4,tr.getTypeRoom_info());
				stmt.setString(5,tr.getTypeRoom_status());
				
				if(stmt.executeUpdate()>=1) {
					return true;
				}
				
			}catch(SQLException e) {
				System.out.println(e);
			}finally {
				closeConnectionToTypeRoom();
			}
		}
		return result;
	}

	

}
