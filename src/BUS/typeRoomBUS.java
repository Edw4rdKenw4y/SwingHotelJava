package BUS;
import DTO.typeRoomDTO;
import DAO.typeRoomDAO;

import java.util.ArrayList;

public class typeRoomBUS {
	typeRoomDAO trDAO=  new typeRoomDAO();
//	Lấy loại phòng trả về mảng
	public ArrayList<typeRoomDTO> getAllTypeRooms(){
		return trDAO.getAllTypeRooms();
	}
//	Kiểm tra thêm Loại phòng
	public String addTypeRoom(typeRoomDTO tr) {
		if(trDAO.hasIDTypeRoom(tr.getTypeRoom_id())) {
			return "Mã loại phòng đã tồn tại";
		}
		if(trDAO.addTypeRoom(tr)) {
			return "Thêm loại phòng thành công";
		}
		return "Thêm loại phòng thất bại";
	}

}
