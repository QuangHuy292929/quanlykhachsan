package Model;

public class ModelPhong {
	private int MaPhong;
	private String LoaiPhong;
	private Double GiaPhong;
	private String MoTaPhong;
	private String TrangThai;
	
	public ModelPhong() {
	}
	public ModelPhong(int maPhong, String loaiPhong, Double giaPhong, String moTaPhong, String trangThai) {
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
	public String getTrangThai() {
		return TrangThai;
	}
	public void setTrangThai(String trangThai) {
		TrangThai = trangThai;
	}
	
}
