package Model;

import java.util.ArrayList;

public class ModelPhong {
	private int MaPhong;
	private String LoaiPhong;
	private Double GiaPhong;
	private String MoTaPhong;
	private TrangThaiPhong TrangThai;
	
	public ModelPhong() {
	}
	public ModelPhong(int maPhong, String loaiPhong, Double giaPhong, String moTaPhong, TrangThaiPhong trangThai) {
		MaPhong = maPhong;
		LoaiPhong = loaiPhong;
		GiaPhong = giaPhong;
		MoTaPhong = moTaPhong;
		TrangThai = trangThai;
	}
	public int getMaPhong() {
		return MaPhong;
	}
	public void setMaPhong(int maPhong) {
		MaPhong = maPhong;
	}
	public String getLoaiPhong() {
		return LoaiPhong;
	}
	public void setLoaiPhong(String loaiPhong) {
		LoaiPhong = loaiPhong;
	}
	public Double getGiaPhong() {
		return GiaPhong;
	}
	public void setGiaPhong(Double giaPhong) {
		GiaPhong = giaPhong;
	}
	public String getMoTaPhong() {
		return MoTaPhong;
	}
	public void setMoTaPhong(String moTaPhong) {
		MoTaPhong = moTaPhong;
	}
	public TrangThaiPhong getTrangThai() {
		return TrangThai;
	}
	public void setTrangThai(TrangThaiPhong trangThai) {
		TrangThai = trangThai;
	}
	
	static ArrayList<ModelPhong> ListPhong;

	public ModelPhong(ArrayList<ModelPhong> listPhong) {
		ListPhong = listPhong;
	}
	public ArrayList<ModelPhong> getListPhong() {
		return ListPhong;
	}
	public void setListPhong(ArrayList<ModelPhong> listPhong) {
		ListPhong = listPhong;
	}
	
	public enum TrangThaiPhong{
		TRONG, DANG_HOAT_DONG, CHO_XAC_NHAN
	}
	
}
