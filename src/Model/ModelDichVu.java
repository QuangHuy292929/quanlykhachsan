package Model;

import java.util.ArrayList;

public class ModelDichVu {
	
	public ArrayList<ModelDatPhong> MdDatPhong;
	
	private int maDichvu;
	private String tenDichvu;
	private String mota;
	private int giaca;
	ModelDichVu(int maDichvu, String tenDichvu, String mota, int giaca) {
		
		this.maDichvu = maDichvu;
		this.tenDichvu = tenDichvu;
		this.mota = mota;
		this.giaca = giaca;
	}
	public int getMaDichvu() {
		return maDichvu;
	}
	public void setMaDichvu(int maDichvu) {
		this.maDichvu = maDichvu;
	}
	public String getTenDichvu() {
		return tenDichvu;
	}
	public void setTenDichvu(String tenDichvu) {
		this.tenDichvu = tenDichvu;
	}
	public String getMota() {
		return mota;
	}
	public void setMota(String mota) {
		this.mota = mota;
	}
	public int getGiaca() {
		return giaca;
	}
	public void setGiaca(int giaca) {
		this.giaca = giaca;
	}
	
	
	
	
}
