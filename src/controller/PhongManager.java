package controller;
import java.awt.Color;

import javax.swing.JPanel;

import Model.Phong;
import Model.Phong.TrangThaiPhong;

public class PhongManager extends Thread {
    private Phong phong;
    private JPanel panelPhong;

    public PhongManager(Phong phong, JPanel panelPhong) {
        this.phong = phong;
        this.panelPhong = panelPhong;
    }
    
    
    // cái ni để xử lý sau
    @Override
    public void run() {
        while (!isInterrupted()) {
            // Mô phỏng trạng thái phòng thay đổi
            switch (phong.getTrangThai()) {
                case TRONG:
                    datPhong();
                    break;
                case DANG_HOAT_DONG:
                    traPhong();
                    break;
                case CHO_XAC_NHAN:
                    xacNhanPhong();
                    break;
            }

            try {
                Thread.sleep(2000); // Mô phỏng thời gian xử lý
            } catch (InterruptedException e) {
                break;
            }
        }
    }

    //qua lớp view để thao tác như chuyển layout các thứ
    
    // mấy phương thức ni sẽ chuyển sang bên lớp view để thao tác dễ hơn
    private void datPhong() {
        phong.setTrangThai(TrangThaiPhong.CHO_XAC_NHAN);
        panelPhong.setBackground(Color.RED);
        System.out.println("Đã đặt phòng " + phong.getTenPhong());
    }

    private void traPhong() {
        phong.setTrangThai(TrangThaiPhong.TRONG);
        panelPhong.setBackground(Color.GREEN);
        System.out.println("Đã trả phòng " + phong.getTenPhong());
    }

    private void xacNhanPhong() {
        phong.setTrangThai(TrangThaiPhong.DANG_HOAT_DONG);
        panelPhong.setBackground(Color.YELLOW);
        System.out.println("Đã xác nhận phòng " + phong.getTenPhong());
    }
    //////////////////////////////////////////////////////////////////
}