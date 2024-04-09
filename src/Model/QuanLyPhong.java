package Model;

import java.util.ArrayList;

public class QuanLyPhong {
	public ArrayList<ModelPhong> ListPhong;

	public QuanLyPhong(ArrayList<ModelPhong> ListPhong) {
		this.ListPhong = ListPhong;
	}

	public QuanLyPhong() {
		this.ListPhong = new ArrayList<ModelPhong>();
	}

	public ArrayList<ModelPhong> getListPhong() {
		return ListPhong;
	}

	public void setListPhong(ArrayList<ModelPhong> listPhong) {
		ListPhong = listPhong;
	}
	
}
