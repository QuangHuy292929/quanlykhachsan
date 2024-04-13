package controller;

import java.util.function.Consumer;

import Model.Phong;
import Model.Phong.TrangThaiPhong;

public class PhongManager extends Thread {
	private Phong phong;
	private boolean isRunning;
	private Consumer<Phong> ThaydoiTrangthaiPhong;

	public PhongManager(Phong phong, Consumer<Phong> ThaydoiTrangthaiPhong) {
		this.phong = phong;
		this.isRunning = true;
		this.ThaydoiTrangthaiPhong = ThaydoiTrangthaiPhong;
	}

	@Override
	public void run() {
		while (isRunning) {
			// Xử lý trạng thái của phòng
			processPhongStatus();
			// Tạm dừng luồng một khoảng thời gian
			try {
				Thread.sleep(5000); // Tạm dừng 5 giây
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void processPhongStatus() {
		// Kiểm tra và cập nhật trạng thái phòng
		if (phong.getTrangThai() == TrangThaiPhong.TRONG) {
			phong.setTrangThai(TrangThaiPhong.TRONG);
			ThaydoiTrangthaiPhong.accept(phong);
		} else if (phong.getTrangThai() == TrangThaiPhong.DANG_HOAT_DONG) {
			// Phòng đã được đặt, cập nhật trạng thái
			phong.setTrangThai(TrangThaiPhong.DANG_HOAT_DONG);
			ThaydoiTrangthaiPhong.accept(phong);
		} else if (phong.getTrangThai() == TrangThaiPhong.CHO_XAC_NHAN) {
			phong.setTrangThai(TrangThaiPhong.CHO_XAC_NHAN);
			ThaydoiTrangthaiPhong.accept(phong);
		}
	}

	public void stopManager() {
		this.isRunning = false;
	}
}
