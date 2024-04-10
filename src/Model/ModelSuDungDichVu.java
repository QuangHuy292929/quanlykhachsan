package Model;

import java.util.ArrayList;

public class ModelSuDungDichVu {

	private int masudungdichvu;
	private int madatphong;
	private int madichvu;
	private int SoLuongDichVu;
	private int chiphi;
	
	public ModelSuDungDichVu(int masudungdichvu, int madatphong, int madichvu, int soLuongDichVu, int chiphi) {
		this.masudungdichvu = masudungdichvu;
		this.madatphong = madatphong;
		this.madichvu = madichvu;
		this.SoLuongDichVu = soLuongDichVu;
		this.chiphi = chiphi;
	}
	
	public int getSoLuongDichVu() {
		return SoLuongDichVu;
	}

	public void setSoLuongDichVu(int soLuongDichVu) {
		SoLuongDichVu = soLuongDichVu;
	}

	public int getMasudungdichvu() {
		return masudungdichvu;
	}
	public void setMasudungdichvu(int masudungdichvu) {
		this.masudungdichvu = masudungdichvu;
	}
	public int getMadatphong() {
		return madatphong;
	}
	public void setMadatphong(int madatphong) {
		this.madatphong = madatphong;
	}
	public int getMadichvu() {
		return madichvu;
	}
	public void setMadichvu(int madichvu) {
		this.madichvu = madichvu;
	}
	public int getChiphi() {
		return chiphi;
	}
	public void setChiphi(int chiphi) {
		this.chiphi = chiphi;
	}


	static ArrayList<ModelSuDungDichVu> listSuDungDichVu;

}
