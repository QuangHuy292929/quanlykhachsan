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
    public Color colordat = new Color(205, 180, 219);
    public Color colorchoxacnhan = new Color(255, 200, 221);

    // cái ni để xử lý sau
    @Override
    public void run() {
        while (!isInterrupted()) {
            // Mô phỏng trạng thái phòng thay đổi
            switch (phong.getTrangThai()) {
                case TRONG:
                	panelPhong.setBackground(Color.getHSBColor(0, 0, (float) 0.94));
                	break;
                case DANG_HOAT_DONG:
                	panelPhong.setBackground(colorchoxacnhan);
                	break;
                case CHO_XAC_NHAN:
                	panelPhong.setBackground(colordat);
                	break;
            }

            try {
                Thread.sleep(1000); // Mô phỏng thời gian xử lý
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
    }

    private void traPhong() {
        phong.setTrangThai(TrangThaiPhong.TRONG);
        panelPhong.setBackground(Color.GREEN);
    }

    private void xacNhanPhong() {
        phong.setTrangThai(TrangThaiPhong.DANG_HOAT_DONG);
        panelPhong.setBackground(Color.YELLOW);
    }
    //////////////////////////////////////////////////////////////////
}