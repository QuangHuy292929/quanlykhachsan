package View;

import java.awt.EventQueue;  

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.UIManager;

import javax.swing.JLabel;
import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.awt.CardLayout;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

import Model.Phong;
import Model.Phong.TrangThaiPhong;
import controller.PhongManager;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.RoundRectangle2D;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class Giaodien extends JFrame {

	private static final long serialVersionUID = 1L;
	private Phong[] phong;
	
	JPanel pn_trangchu;
	JPanel pn_sodophong;
	JPanel pn_hoatdong;
    Color colordat = new Color(205, 180, 219);
    Color colorchoxacnhan = new Color(255, 200, 221);
	private CardLayout cardhd;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					new Giaodien();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Giaodien() {
		setTitle("Hệ thống quản lý Khách Sạn");
		getContentPane().setBackground(new Color(204, 255, 255));
		Border border = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        border = BorderFactory.createCompoundBorder(new RoundedBorder(20, 20, Color.GRAY), border);
        Font font = new Font("Roboto", Font.BOLD, 22);
        Font font2 = new Font("Roboto",Font.CENTER_BASELINE, 18);
  
		ArrayList<PhongManager> quanLyPhong = new ArrayList<PhongManager>();
		this.setVisible(true);
		this.setSize(1200, 800);
		this.setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JPanel pn_menu = new JPanel();
		pn_menu.setBackground(new Color(255, 255, 255));
		pn_menu.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 255, 255), null, null, null));
		pn_menu.setBounds(10, 10, 211, 742);
		getContentPane().add(pn_menu);
		
		pn_hoatdong = new JPanel();
		pn_hoatdong.setBounds(231, 10, 947, 742);
		getContentPane().add(pn_hoatdong);
		cardhd = new CardLayout();
		pn_hoatdong.setLayout(cardhd);

		JButton bt_trangchu = new JButton("Trang chủ");
		bt_trangchu.setIcon(new ImageIcon(Giaodien.class.getResource("/fileanh/trangchu.png")));
		bt_trangchu.setBackground(new Color(153, 153, 153));
		bt_trangchu.setBounds(2, 2, 207, 67);
		bt_trangchu.setFont(font2);
		bt_trangchu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cardhd.show(pn_hoatdong, "anhTrangchu");
			}
		});
		pn_menu.setLayout(null);
		pn_menu.add(bt_trangchu);
		
		JButton bt_sodophong = new JButton("Sơ đồ phòng");
		bt_sodophong.setIcon(new ImageIcon(Giaodien.class.getResource("/fileanh/diagram.png")));
		bt_sodophong.setBackground(new Color(153, 153, 153));
		bt_sodophong.setBounds(2, 74, 207, 67);
		bt_sodophong.setFont(font2);
		pn_menu.add(bt_sodophong);

		JButton bt_Thongke = new JButton("Thống kê");
		bt_Thongke.setIcon(new ImageIcon(Giaodien.class.getResource("/fileanh/pie-chart.png")));
		bt_Thongke.setBackground(new Color(102, 102, 102));
		bt_Thongke.setBounds(2, 146, 207, 67);
		bt_Thongke.setFont(font2);
		pn_menu.add(bt_Thongke);

		JButton bt_baocao = new JButton("Báo Cáo");
		bt_baocao.setIcon(new ImageIcon(Giaodien.class.getResource("/fileanh/report.png")));
		bt_baocao.setBackground(new Color(102, 102, 102));
		bt_baocao.setBounds(2, 218, 207, 67);
		bt_baocao.setFont(font2);
		pn_menu.add(bt_baocao);

		JButton bt_dangxuat = new JButton("Đăng xuất");
		bt_dangxuat.setIcon(new ImageIcon(Giaodien.class.getResource("/fileanh/logout (1).png")));
		bt_dangxuat.setBackground(new Color(102, 102, 102));
		bt_dangxuat.setBounds(2, 290, 207, 67);
		bt_dangxuat.setFont(font2);
		pn_menu.add(bt_dangxuat);
		 

		JPanel pn_trangchu = new JPanel();
		pn_hoatdong.add(pn_trangchu, "anhTrangchu");
		pn_trangchu.setLayout(new BorderLayout(0, 0));

		JPanel pn_sodophong = new JPanel();
		pn_sodophong.setBackground(new Color(255, 255, 255));
		pn_hoatdong.add(pn_sodophong, "sơ đồ phòng");
		pn_sodophong.setLayout(null);
		bt_sodophong.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardhd.show(pn_hoatdong, "sơ đồ phòng");
			}
		});
		
		

		JPanel pn_bar = new JPanel();
		pn_bar.setBounds(10, 10, 927, 40);
		pn_sodophong.add(pn_bar);
		pn_bar.setLayout(new GridLayout(1, 0, 10, 10));

		JPanel pn_luachon = new JPanel();
		pn_luachon.setBackground(new Color(255, 255, 255));
		pn_bar.add(pn_luachon);
		pn_luachon.setLayout(new GridLayout(1, 5, 10, 10));

		JPanel panel_7 = new JPanel();
	    panel_7.setBackground(Color.getHSBColor(0, 0, (float) 0.94));
		pn_luachon.add(panel_7);
		JLabel lblNewLabel = new JLabel("Trống");
		lblNewLabel.setFont(font);
		panel_7.add(lblNewLabel);

		JPanel panel = new JPanel();
		panel.setBackground(colordat);
		pn_luachon.add(panel);
		JLabel lblNewLabel_1 = new JLabel("Đã Đặt");
		lblNewLabel_1.setFont(font);
		panel.add(lblNewLabel_1);

		JPanel panel_8 = new JPanel();
		panel_8.setBackground(colorchoxacnhan);
		pn_luachon.add(panel_8);
		JLabel lblNewLabel_2 = new JLabel("Chờ Xác Nhận ");
		lblNewLabel_2.setFont(font);
		panel_8.add(lblNewLabel_2);
		
		phong = new Phong[]{
				new Phong(101, "Phòng 101", TrangThaiPhong.DANG_HOAT_DONG),
				new Phong(102, "Phòng 102", TrangThaiPhong.CHO_XAC_NHAN),
				new Phong(103, "Phòng 103", TrangThaiPhong.TRONG),
				new Phong(104, "Phòng 104", TrangThaiPhong.TRONG),
				new Phong(201, "Phòng 201", TrangThaiPhong.TRONG),
				new Phong(202, "Phòng 202", TrangThaiPhong.TRONG),
				new Phong(203, "Phòng 203", TrangThaiPhong.TRONG),
				new Phong(204, "Phòng 204", TrangThaiPhong.TRONG),
				new Phong(301, "Phòng 301", TrangThaiPhong.TRONG),
				new Phong(302, "Phòng 302", TrangThaiPhong.TRONG),
				new Phong(303, "Phòng 303", TrangThaiPhong.TRONG),
				new Phong(304, "Phòng 304", TrangThaiPhong.TRONG),
		};

		// Tạo các panel để cho thấy thông tin phòng
		JPanel pn_p101 = new JPanel();
		JPanel pn_p102 = new JPanel();
		JPanel pn_p103 = new JPanel();
		JPanel pn_p104 = new JPanel();
		JPanel pn_p201 = new JPanel();
		JPanel pn_p202 = new JPanel();
		JPanel pn_p203 = new JPanel();
		JPanel pn_p204 = new JPanel();
		JPanel pn_p301 = new JPanel();
		JPanel pn_p302 = new JPanel();
		JPanel pn_p303 = new JPanel();
		JPanel pn_p304 = new JPanel();

		JPanel panel_phong1 = new JPanel();
		PhongManager manager1 = new PhongManager(phong[0], panel_phong1);
		manager1.start();
		quanLyPhong.add(manager1);
		panel_phong1.setBorder(border);
		panel_phong1.setBounds(10, 79, 200, 200);
		pn_sodophong.add(panel_phong1);
		panel_phong1.setLayout(null);
		JLabel lblNewLabel_3 = new JLabel("P_101");
		lblNewLabel_3.setBounds(10, 10, 70, 30);
		lblNewLabel_3.setBackground(new Color(240, 240, 240));
		lblNewLabel_3.setFont(font);
		panel_phong1.add(lblNewLabel_3);
		JLabel photo1 = new JLabel("");
		photo1.setIcon(new ImageIcon(Giaodien.class.getResource("/fileanh/website.png")));
		photo1.setBounds(36, 50, 128, 128);
		panel_phong1.add(photo1);
		panel_phong1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardhd.show(pn_hoatdong, "phong 101");
			}
		});
		pn_Datphong datphong101 = new pn_Datphong();
		pn_Choxacnhan xacnhan101 = new pn_Choxacnhan();
		pn_Danghoatdong hoatdong101 = new pn_Danghoatdong();
		CardLayout cardP1 = new CardLayout();
		pn_p101.setLayout(cardP1);
		pn_p101.add(datphong101,"dat phong 101");
		pn_p101.add(xacnhan101, "xac nhan 101");
		pn_p101.add(hoatdong101, "hoat dong 101");

		JPanel panel_phong2 = new JPanel();
		PhongManager manager2 = new PhongManager(phong[1], panel_phong2);
		manager2.start();
		quanLyPhong.add(manager2);
		panel_phong2.setBorder(border);
		panel_phong2.setBounds(252, 79, 200, 200);
		pn_sodophong.add(panel_phong2);
		panel_phong2.setLayout(null);
		JLabel lblNewLabel_4 = new JLabel("P_102");
		lblNewLabel_4.setBounds(10, 10, 70, 30);
		lblNewLabel_4.setFont(font);
		panel_phong2.add(lblNewLabel_4);
		JLabel photo2 = new JLabel("");
		photo2.setIcon(new ImageIcon(Giaodien.class.getResource("/fileanh/website.png")));
		photo2.setBounds(36, 50, 128, 128);
		panel_phong2.add(photo2);
		panel_phong2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardhd.show(pn_hoatdong, "phong 102");
			}
		});
		pn_Datphong datphong102 = new pn_Datphong();
		pn_Choxacnhan xacnhan102 = new pn_Choxacnhan();
		pn_Danghoatdong hoatdong102 = new pn_Danghoatdong();
		CardLayout cardP2 = new CardLayout();
		pn_p102.setLayout(cardP2);
		pn_p102.add(datphong102,"dat phong 102");
		pn_p102.add(xacnhan102, "xac nhan 102");
		pn_p102.add(hoatdong102, "hoat dong 102");

		JPanel panel_phong3 = new JPanel();
		PhongManager manager3 = new PhongManager(phong[2], panel_phong3);
		manager3.start();
		quanLyPhong.add(manager3);
		panel_phong3.setBorder(border);
		panel_phong3.setBounds(498, 79, 200, 200);
		pn_sodophong.add(panel_phong3);
		panel_phong3.setLayout(null);
		JLabel lblNewLabel_5 = new JLabel("P_103");
		lblNewLabel_5.setBounds(10, 10, 70, 30);
		lblNewLabel_5.setFont(font);
		panel_phong3.add(lblNewLabel_5);
		JLabel photo3 = new JLabel("");
		photo3.setIcon(new ImageIcon(Giaodien.class.getResource("/fileanh/website.png")));
		photo3.setBounds(36, 50, 128, 128);
		panel_phong3.add(photo3);
		panel_phong3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardhd.show(pn_hoatdong, "phong 103");
			}
		});
		pn_Datphong datphong103 = new pn_Datphong();
		pn_Choxacnhan xacnhan103 = new pn_Choxacnhan();
		pn_Danghoatdong hoatdong103 = new pn_Danghoatdong();
		CardLayout cardP3 = new CardLayout();
		pn_p103.setLayout(cardP3);
		pn_p103.add(datphong103,"dat phong 103");
		pn_p103.add(xacnhan103, "xac nhan 103");
		pn_p103.add(hoatdong103, "hoat dong 103");

		JPanel panel_phong4 = new JPanel();
		PhongManager manager4 = new PhongManager(phong[3], panel_phong4);
		manager4.start();
		quanLyPhong.add(manager4);
		panel_phong4.setBorder(border);
		panel_phong4.setBounds(737, 79, 200, 200);
		pn_sodophong.add(panel_phong4);
		panel_phong4.setLayout(null);
		JLabel lblNewLabel_6 = new JLabel("P_102");
		lblNewLabel_6.setBounds(10, 10, 70, 30);
		lblNewLabel_6.setFont(font);
		panel_phong4.add(lblNewLabel_6);
		JLabel photo4 = new JLabel("");
		photo4.setIcon(new ImageIcon(Giaodien.class.getResource("/fileanh/website.png")));
		photo4.setBounds(36, 50, 128, 128);
		panel_phong4.add(photo4);
		panel_phong4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardhd.show(pn_hoatdong, "phong 104");
			}
		});
		pn_Datphong datphong104 = new pn_Datphong();
		pn_Choxacnhan xacnhan104 = new pn_Choxacnhan();
		pn_Danghoatdong hoatdong104 = new pn_Danghoatdong();
		CardLayout cardP4 = new CardLayout();
		pn_p104.setLayout(cardP4);
		pn_p104.add(datphong104,"dat phong 104");
		pn_p104.add(xacnhan104, "xac nhan 104");
		pn_p104.add(hoatdong104, "hoat dong 104");

		JPanel panel_phong5 = new JPanel();
		PhongManager manager5 = new PhongManager(phong[4], panel_phong5);
		manager5.start();
		quanLyPhong.add(manager5);
		panel_phong5.setBorder(border);
		panel_phong5.setBounds(10, 306, 200, 200);
		pn_sodophong.add(panel_phong5);
		panel_phong5.setLayout(null);
		JLabel lblNewLabel_7 = new JLabel("P_201");
		lblNewLabel_7.setBounds(10, 10, 70, 30);
		lblNewLabel_7.setFont(font);
		panel_phong5.add(lblNewLabel_7);
		JLabel photo5 = new JLabel("");
		photo5.setIcon(new ImageIcon(Giaodien.class.getResource("/fileanh/website.png")));
		photo5.setBounds(36, 50, 128, 128);
		panel_phong5.add(photo5);
		panel_phong5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardhd.show(pn_hoatdong, "phong 201");
			}
		});
		pn_Datphong datphong201 = new pn_Datphong();
		pn_Choxacnhan xacnhan201 = new pn_Choxacnhan();
		pn_Danghoatdong hoatdong201 = new pn_Danghoatdong();
		CardLayout cardP5 = new CardLayout();
		pn_p201.setLayout(cardP5);
		pn_p201.add(datphong201,"dat phong 201");
		pn_p201.add(xacnhan201, "xac nhan 201");
		pn_p201.add(hoatdong201, "hoat dong 201");
		
		JPanel panel_phong6 = new JPanel();
		PhongManager manager6 = new PhongManager(phong[5], panel_phong6);
		manager6.start();
		quanLyPhong.add(manager6);
		panel_phong6.setBorder(border);
		panel_phong6.setBounds(10, 532, 200, 200);
		pn_sodophong.add(panel_phong6);
		panel_phong6.setLayout(null);
		JLabel lblNewLabel_11 = new JLabel("P_301");
		lblNewLabel_11.setBounds(10, 10, 70, 30);
		lblNewLabel_11.setFont(font);
		panel_phong6.add(lblNewLabel_11);
		JLabel photo6 = new JLabel("");
		photo6.setIcon(new ImageIcon(Giaodien.class.getResource("/fileanh/website.png")));
		photo6.setBounds(36, 50, 128, 128);
		panel_phong6.add(photo6);
		panel_phong6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardhd.show(pn_hoatdong, "phong 202");
			}
		});
		pn_Datphong datphong202 = new pn_Datphong();
		pn_Choxacnhan xacnhan202 = new pn_Choxacnhan();
		pn_Danghoatdong hoatdong202 = new pn_Danghoatdong();
		CardLayout cardP6 = new CardLayout();
		pn_p202.setLayout(cardP6);
		pn_p202.add(datphong202,"dat phong 202");
		pn_p202.add(xacnhan202, "xac nhan 202");
		pn_p202.add(hoatdong202, "hoat dong 202");

		JPanel panel_phong7 = new JPanel();
		PhongManager manager7 = new PhongManager(phong[6], panel_phong7);
		manager7.start();
		quanLyPhong.add(manager7);
		panel_phong7.setBorder(border);
		panel_phong7.setBounds(252, 532, 200, 200);
		pn_sodophong.add(panel_phong7);
		panel_phong7.setLayout(null);
		JLabel lblNewLabel_12 = new JLabel("P_302");
		lblNewLabel_12.setBounds(10, 10, 70, 30);
		lblNewLabel_12.setFont(font);
		panel_phong7.add(lblNewLabel_12);
		JLabel photo7 = new JLabel("");
		photo7.setIcon(new ImageIcon(Giaodien.class.getResource("/fileanh/website.png")));
		photo7.setBounds(36, 50, 128, 128);
		panel_phong7.add(photo7);
		panel_phong7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardhd.show(pn_hoatdong, "phong 203");
			}
		});
		pn_Datphong datphong203 = new pn_Datphong();
		pn_Choxacnhan xacnhan203 = new pn_Choxacnhan();
		pn_Danghoatdong hoatdong203 = new pn_Danghoatdong();
		CardLayout cardP7 = new CardLayout();
		pn_p203.setLayout(cardP7);
		pn_p203.add(datphong203,"dat phong 203");
		pn_p203.add(xacnhan203, "xac nhan 203");
		pn_p203.add(hoatdong203, "hoat dong 203");

		JPanel panel_phong8 = new JPanel();
		PhongManager manager8 = new PhongManager(phong[7], panel_phong8);
		manager8.start();
		quanLyPhong.add(manager8);
		panel_phong8.setBorder(border);
		panel_phong8.setBounds(498, 532, 200, 200);
		pn_sodophong.add(panel_phong8);
		panel_phong8.setLayout(null);
		JLabel lblNewLabel_13 = new JLabel("P_303");
		lblNewLabel_13.setBounds(10, 10, 70, 30);
		lblNewLabel_13.setFont(font);
		panel_phong8.add(lblNewLabel_13);
		JLabel photo8 = new JLabel("");
		photo8.setIcon(new ImageIcon(Giaodien.class.getResource("/fileanh/website.png")));
		photo8.setBounds(36, 50, 128, 128);
		panel_phong8.add(photo8);
		panel_phong8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardhd.show(pn_hoatdong, "phong 204");
			}
		});
		pn_Datphong datphong204 = new pn_Datphong();
		pn_Choxacnhan xacnhan204 = new pn_Choxacnhan();
		pn_Danghoatdong hoatdong204 = new pn_Danghoatdong();
		CardLayout cardP8 = new CardLayout();
		pn_p204.setLayout(cardP8);
		pn_p204.add(datphong204,"dat phong 204");
		pn_p204.add(xacnhan204, "xac nhan 204");
		pn_p204.add(hoatdong204, "hoat dong 204");

		JPanel panel_phong9 = new JPanel();
		PhongManager manager9 = new PhongManager(phong[8], panel_phong9);
		manager9.start();
		quanLyPhong.add(manager9);
		panel_phong9.setBorder(border);
		panel_phong9.setBounds(737, 532, 200, 200);
		pn_sodophong.add(panel_phong9);
		panel_phong9.setLayout(null);
		JLabel lblNewLabel_14 = new JLabel("P_304");
		lblNewLabel_14.setBounds(10, 10, 70, 30);
		lblNewLabel_14.setFont(font);
		panel_phong9.add(lblNewLabel_14);
		JLabel photo9 = new JLabel("");
		photo9.setIcon(new ImageIcon(Giaodien.class.getResource("/fileanh/website.png")));
		photo9.setBounds(36, 50, 128, 128);
		panel_phong9.add(photo9);
		panel_phong9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardhd.show(pn_hoatdong, "phong 301");
			}
		});
		pn_Datphong datphong301 = new pn_Datphong();
		pn_Choxacnhan xacnhan301 = new pn_Choxacnhan();
		pn_Danghoatdong hoatdong301 = new pn_Danghoatdong();
		CardLayout cardP9 = new CardLayout();
		pn_p301.setLayout(cardP9);
		pn_p301.add(datphong301,"dat phong 301");
		pn_p301.add(xacnhan301, "xac nhan 301");
		pn_p301.add(hoatdong301, "hoat dong 301");

		JPanel panel_phong10 = new JPanel();
		PhongManager manager10 = new PhongManager(phong[9], panel_phong10);
		manager10.start();
		quanLyPhong.add(manager10);
		panel_phong10.setBorder(border);
		panel_phong10.setBounds(737, 306, 200, 200);
		pn_sodophong.add(panel_phong10);
		panel_phong10.setLayout(null);
		JLabel lblNewLabel_10 = new JLabel("P_204");
		lblNewLabel_10.setBounds(10, 10, 70, 30);
		lblNewLabel_10.setFont(font);
		panel_phong10.add(lblNewLabel_10);
		JLabel photo10 = new JLabel("");
		photo10.setIcon(new ImageIcon(Giaodien.class.getResource("/fileanh/website.png")));
		photo10.setBounds(36, 50, 128, 128);
		panel_phong10.add(photo10);
		panel_phong10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardhd.show(pn_hoatdong, "phong 302");
			}
		});
		pn_Datphong datphong302 = new pn_Datphong();
		pn_Choxacnhan xacnhan302 = new pn_Choxacnhan();
		pn_Danghoatdong hoatdong302 = new pn_Danghoatdong();
		CardLayout cardP10 =new  CardLayout();
		pn_p302.setLayout(cardP10);
		pn_p302.add(datphong302,"dat phong 302");
		pn_p302.add(xacnhan302, "xac nhan 302");
		pn_p302.add(hoatdong302, "hoat dong 302");

		JPanel panel_phong11 = new JPanel();
		PhongManager manager11 = new PhongManager(phong[10], panel_phong11);
		manager11.start();
		quanLyPhong.add(manager11);
		panel_phong11.setBorder(border);
		panel_phong11.setBounds(252, 306, 200, 200);
		pn_sodophong.add(panel_phong11);
		panel_phong11.setLayout(null);
		JLabel lblNewLabel_8 = new JLabel("P_202");
		lblNewLabel_8.setBounds(10, 10, 70, 30);
		lblNewLabel_8.setFont(font);
		panel_phong11.add(lblNewLabel_8);
		JLabel photo11 = new JLabel("");
		photo11.setIcon(new ImageIcon(Giaodien.class.getResource("/fileanh/website.png")));
		photo11.setBounds(36, 50, 128, 128);
		panel_phong11.add(photo11);
		panel_phong11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardhd.show(pn_hoatdong, "phong 303");
			}
		});
		pn_Datphong datphong303 = new pn_Datphong();
		pn_Choxacnhan xacnhan303 = new pn_Choxacnhan();
		pn_Danghoatdong hoatdong303 = new pn_Danghoatdong();
		CardLayout cardP11 = new CardLayout();
		pn_p303.setLayout(cardP11);
		pn_p303.add(datphong303,"dat phong 303");
		pn_p303.add(xacnhan303, "xac nhan 303");
		pn_p303.add(hoatdong303, "hoat dong 303");

		JPanel panel_phong12 = new JPanel();
		PhongManager manager12 = new PhongManager(phong[11], panel_phong12);
		manager12.start();
		quanLyPhong.add(manager12);
		panel_phong12.setBorder(border);
		panel_phong12.setBounds(498, 306, 200, 200);
		pn_sodophong.add(panel_phong12);
		panel_phong12.setLayout(null);
		JLabel lblNewLabel_9 = new JLabel("P_203");
		lblNewLabel_9.setBounds(10, 10, 70, 30);
		lblNewLabel_9.setFont(font);
		panel_phong12.add(lblNewLabel_9);
		JLabel photo12 = new JLabel("");
		photo12.setIcon(new ImageIcon(Giaodien.class.getResource("/fileanh/website.png")));
		photo12.setBounds(36, 50, 128, 128);
		panel_phong12.add(photo12);
		panel_phong12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cardhd.show(pn_hoatdong, "phong 304");
			}
		});
		pn_Datphong datphong304 = new pn_Datphong();
		pn_Choxacnhan xacnhan304 = new pn_Choxacnhan();
		pn_Danghoatdong hoatdong304 = new pn_Danghoatdong();
		CardLayout cardP12 = new CardLayout();
		pn_p304.setLayout(cardP12);
		pn_p304.add(datphong304,"dat phong 304");
		pn_p304.add(xacnhan304, "xac nhan 304");
		pn_p304.add(hoatdong304, "hoat dong 304");

		JLabel lbanhtrangchu = new JLabel("");
		lbanhtrangchu.setIcon(new ImageIcon(Giaodien.class.getResource("/fileanh/anhksan.png")));
		JPanel pn_thongke = new JPanel();
		pn_hoatdong.add(pn_thongke, "thống kê");
		pn_thongke.setLayout(null);
		bt_Thongke.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardhd.show(pn_hoatdong, "thống kê");
			}
		});

		JPanel pn_tkdoanhthu = new JPanel();
		pn_tkdoanhthu.setBounds(80, 400, 380, 280);
		pn_thongke.add(pn_tkdoanhthu);
		JPanel pn_tkusedevice = new JPanel();
		pn_tkusedevice.setBounds(500, 400, 380, 280);
		pn_thongke.add(pn_tkusedevice);

		JPanel pn_tktyle = new JPanel();
		pn_tktyle.setBounds(500, 80, 380, 280);
		pn_thongke.add(pn_tktyle);

		JPanel pn_tsoluong = new JPanel();
		pn_tsoluong.setBounds(80, 80, 380, 280);
		pn_thongke.add(pn_tsoluong);
		pn_trangchu.add(lbanhtrangchu);

		JPanel pn_tbaydt = new JPanel();
		pn_hoatdong.add(pn_tbaydt, "name_637252375900");

		JPanel pn_tbaylosuong = new JPanel();
		pn_hoatdong.add(pn_tbaylosuong, "name_705300740500");

		JPanel pn_tbaydichvu = new JPanel();
		pn_hoatdong.add(pn_tbaydichvu, "name_707917130400");

		JPanel pn_tbaytyle = new JPanel();
		pn_hoatdong.add(pn_tbaytyle, "name_710042359100");

		JPanel pn_baocao = new JPanel();
		pn_hoatdong.add(pn_baocao, "báo cáo");
		bt_baocao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardhd.show(pn_hoatdong, "báo cáo");
			}
		});
		pn_baocao.setLayout(null);

		JPanel pn_xuatbaocao = new JPanel();
		pn_xuatbaocao.setBounds(29, 23, 231, 209);
		pn_baocao.add(pn_xuatbaocao);

		JPanel pn_ghichu = new JPanel();
		pn_ghichu.setBounds(308, 23, 231, 209);
		pn_baocao.add(pn_ghichu);

		
		
		//add vào panel hoạt động và đặt tên
		pn_hoatdong.add(pn_p101, "phong 101");
		pn_hoatdong.add(pn_p102, "phong 102");
		pn_hoatdong.add(pn_p103, "phong 103");
		pn_hoatdong.add(pn_p104, "phong 104");
		pn_hoatdong.add(pn_p201, "phong 201");
		pn_hoatdong.add(pn_p202, "phong 202");
		pn_hoatdong.add(pn_p203, "phong 203");
		pn_hoatdong.add(pn_p204, "phong 204");
		pn_hoatdong.add(pn_p301, "phong 301");
		pn_hoatdong.add(pn_p302, "phong 302");
		pn_hoatdong.add(pn_p303, "phong 303");
		pn_hoatdong.add(pn_p304, "phong 304");

	}
	
	private void xuLyDatVe(Phong phong, JPanel pntrangthai, JPanel pnhienthi, pn_Datphong datphong, pn_Choxacnhan xacnhan, pn_Danghoatdong hoatdong, CardLayout card, String tendp, String tenxn, String tenhd) {
		if(phong.getTrangThai() == TrangThaiPhong.TRONG) {
			pntrangthai.setBackground(colorchoxacnhan);
			card.show(pnhienthi, tendp);
			datphong.getBtquaylai().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					cardhd.show(pn_hoatdong, "sơ đồ phòng");
					pntrangthai.setBackground(Color.getHSBColor(0, 0, (float) 0.94));
				}
			});
			
			datphong.getBtchoxacnhan().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					card.show(pnhienthi, tenxn);
					xacnhan.getLbhovaten().setText(datphong.getTfhovaten().getText());
					Date selectedDate = (Date) datphong.getSpinnerngaysinh().getValue();
					// Định dạng ngày thành chuỗi
					SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
					String ngaysinh = dateFormat.format(selectedDate);
					xacnhan.getLbngaysinh().setText(ngaysinh);
					xacnhan.getLbtinhthanhpho().setText(datphong.getTftinh().getText());
					xacnhan.getLbtinhthanhpho().setText(datphong.getTftinh().getText());
					xacnhan.getLbcccd().setText(datphong.getTfcccd().getText());
					xacnhan.getLbsdt().setText(datphong.getTfsdt().getText());
					xacnhan.getLbcccd().setText(datphong.getTfcccd().getText());
					xacnhan.getLbdichvu().setText("in ra chuỗi dv đã chọn");
				}
			});
			
			datphong.getBtxacnhan().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					card.show(pnhienthi, tenhd);
					hoatdong.getLbhovaten().setText(datphong.getTfhovaten().getText());
					Date selectedDate = (Date) datphong.getSpinnerngaysinh().getValue();
					// Định dạng ngày thành chuỗi
					SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
					String ngaysinh = dateFormat.format(selectedDate);
					hoatdong.getLbngaysinh().setText(ngaysinh);
					hoatdong.getLbtinhthanhpho().setText(datphong.getTftinh().getText());
					hoatdong.getLbtinhthanhpho().setText(datphong.getTftinh().getText());
					hoatdong.getLbcccd().setText(datphong.getTfcccd().getText());
					hoatdong.getLbsdt().setText(datphong.getTfsdt().getText());
					hoatdong.getLbcccd().setText(datphong.getTfcccd().getText());
					Date selectedDat = (Date) datphong.getSpinnerngaynhanphong().getValue();
					// Định dạng ngày thành chuỗi
					SimpleDateFormat dateForma = new SimpleDateFormat("dd/MM/yyyy");
					String ngaynhanP = dateForma.format(selectedDat);
					hoatdong.getLbngaygionhanphong().setText(ngaynhanP);
					hoatdong.getLbtiendichvu().setText("tính tiền rồi bỏ vô đây");
				}
			});
		} else if(phong.getTrangThai() == TrangThaiPhong.CHO_XAC_NHAN) {
			xacnhan.getBtquaylai().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					cardhd.show(pn_hoatdong, "sơ đồ phòng");					
				}
			});
			xacnhan.getBtxacnhandat().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					card.show(pnhienthi, tenhd);
					hoatdong.getLbhovaten().setText(datphong.getTfhovaten().getText());
					Date selectedDate = (Date) datphong.getSpinnerngaysinh().getValue();
					// Định dạng ngày thành chuỗi
					SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
					String ngaysinh = dateFormat.format(selectedDate);
					hoatdong.getLbngaysinh().setText(ngaysinh);
					hoatdong.getLbtinhthanhpho().setText(datphong.getTftinh().getText());
					hoatdong.getLbtinhthanhpho().setText(datphong.getTftinh().getText());
					hoatdong.getLbcccd().setText(datphong.getTfcccd().getText());
					hoatdong.getLbsdt().setText(datphong.getTfsdt().getText());
					hoatdong.getLbcccd().setText(datphong.getTfcccd().getText());
					Date selectedDat = (Date) datphong.getSpinnerngaynhanphong().getValue();
					// Định dạng ngày thành chuỗi
					SimpleDateFormat dateForma = new SimpleDateFormat("dd/MM/yyyy");
					String ngaynhanP = dateForma.format(selectedDat);
					hoatdong.getLbngaygionhanphong().setText(ngaynhanP);
					hoatdong.getLbtiendichvu().setText("tính tiền rồi bỏ vô đây");
				}
			});
			xacnhan.getBtHuy().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					//phương thức cleả form
					cardhd.show(pn_hoatdong, "sơ đồ phòng");
				}
			});
		} else if(phong.getTrangThai() == TrangThaiPhong.DANG_HOAT_DONG) {
			hoatdong.getBtquaylai().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					cardhd.show(pn_hoatdong, "sơ đồ phòng");
				}
			});
			hoatdong.getBtnTrPhng().addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					//show thông tin, in BILL, lưu thông tin khách hàng, thông tin hóa đơn
				}
			});
		}
		
	}
	
    private static class RoundedBorder implements Border {
        private final int arcWidth;
        private final int arcHeight;
        private final Color color;

        public RoundedBorder(int arcWidth, int arcHeight, Color color) {
            this.arcWidth = arcWidth;
            this.arcHeight = arcHeight;
            this.color = color;
        }

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(color);
            g2.draw(new RoundRectangle2D.Double(x, y, width - 1, height - 1, arcWidth, arcHeight));
            g2.dispose();
        }

        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets(arcHeight / 2, arcWidth / 2, arcHeight / 2, arcWidth / 2);
        }

        @Override
        public boolean isBorderOpaque() {
            return true;
        }
    }
    public void trovesodophong() {
    	cardhd.show(pn_hoatdong, "sơ đồ phòng");
    }
    
   
}