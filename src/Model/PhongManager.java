package Model;

import java.util.function.Consumer;

import Model.ModelPhong.TrangThaiPhong;

public class PhongManager extends Thread {
	private ModelPhong phong;
	private boolean isRunning;
	private Consumer<ModelPhong> onPhongStatusChanged;

	public PhongManager(ModelPhong phong, Consumer<ModelPhong> onPhongStatusChanged) {
		this.phong = phong;
		this.isRunning = true;
		this.onPhongStatusChanged = onPhongStatusChanged;
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
			onPhongStatusChanged.accept(phong);
		} else if (phong.getTrangThai() == TrangThaiPhong.DANG_HOAT_DONG) {
			// Phòng đã được đặt, cập nhật trạng thái
			phong.setTrangThai(TrangThaiPhong.DANG_HOAT_DONG);
			onPhongStatusChanged.accept(phong);
		}
	}

	public void stopManager() {
		this.isRunning = false;
	}
}
