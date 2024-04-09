package Model;

import java.util.ArrayList;

public class QuanLyKhachHang {
	public ArrayList<ModelKhachHang> ListKHang;

	public QuanLyKhachHang(ArrayList<ModelKhachHang> ListKHang) {
		this.ListKHang = ListKHang;
	}

	public QuanLyKhachHang() {
		this.ListKHang = new ArrayList<ModelKhachHang>();

	}

	public ArrayList<ModelKhachHang> getListKHang() {
		return ListKHang;
	}

	public void setListKHang(ArrayList<ModelKhachHang> listKHang) {
		ListKHang = listKHang;
	}
	
	//phương thức add một nd dùng vào list
	public void addKH(ModelKhachHang ngdung) {
		this.ListKHang.add(ngdung);
	}
	
	
	
}
