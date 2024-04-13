package controller;

import java.util.ArrayList;

import Model.Phong;
import Model.Phong.TrangThaiPhong;


public class PhongController extends Thread{
	private ArrayList<Phong> danhSachPhong;
	private ArrayList<PhongManager> danhSachPhongManager;
	private ArrayList<XuLyTrangThaiPhong> listener;
	
	public PhongController(){
		danhSachPhong = taolist();
		
		//
		for (Phong phong : danhSachPhong) {
			//khi sự kiện thay đôit trạng thái phongf hiện tại thì sẽ gọi phương thức đó
			PhongManager manager = new PhongManager(phong ,this::XulyTrangthaiPhong );
			manager.start();
			danhSachPhongManager.add(manager);
		}
	}
	
	private ArrayList<Phong> taolist(){
		ArrayList<Phong> phongs = new ArrayList<>();
		for (int i = 1; i <= 12; i++) {
			phongs.add(new Phong(i, "Phòng "+i, TrangThaiPhong.TRONG));
		}
		return phongs;
	}
	public void datphong(Phong phong) {
		//xử lý panel để đặt phòng
	}
	public void datphongonl(Phong phong) {
		//xư lý panel để cho vào trạng thái chờ xác nhận
	}
	public void duaVeTrong(Phong phong) {
		//xử lý panel để hiển thị tình trạng trống
	}
	
	private void XulyTrangthaiPhong(Phong Phong) {
		int vitri = danhSachPhong.indexOf(Phong);
		if(vitri>=0) {
			danhSachPhong.set(vitri, Phong);
			ThongbaoTrangThai(Phong);
		}
	}
	private void ThongbaoTrangThai(Phong phong) {
		for (XuLyTrangThaiPhong listeners : listener) {
			listeners.Thaydoitrangthaiphong(phong);
		}
	}
	
	
	
}
