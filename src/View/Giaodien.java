package View;

import java.awt.EventQueue;   

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JPopupMenu;
import javax.swing.UIManager;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.FlowLayout;

public class Giaodien extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Giaodien frame = new Giaodien();
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					frame.setVisible(true);
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
		this.setSize(1200, 800);
		this.setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		JPanel pn_menu = new JPanel();
		pn_menu.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 255, 255), null, null, null));
		pn_menu.setBounds(10, 10, 211, 742);
		getContentPane().add(pn_menu);
		pn_menu.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton bt_trangchu = new JButton("Trang chủ");
		pn_menu.add(bt_trangchu);
		
		JButton bt_sodophong = new JButton("Sơ đồ phòng");
		pn_menu.add(bt_sodophong);
		
		JButton bt_Thongke = new JButton("Thống kê");
		pn_menu.add(bt_Thongke);
		
		JButton bt_baocao = new JButton("Báo Cáo");
		pn_menu.add(bt_baocao);
		
		JButton bt_dangxuat = new JButton("Đăng xuất");
		pn_menu.add(bt_dangxuat);
		
		JPanel panel_3 = new JPanel();
		pn_menu.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		pn_menu.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		pn_menu.add(panel_5);
		
		JPanel panel_6 = new JPanel();
		pn_menu.add(panel_6);
		
		JPanel panel_2 = new JPanel();
		pn_menu.add(panel_2);
		
		JPanel panel_1 = new JPanel();
		pn_menu.add(panel_1);
		
		JPanel pn_hoatdong = new JPanel();
		pn_hoatdong.setBounds(231, 10, 947, 742);
		getContentPane().add(pn_hoatdong);
		pn_hoatdong.setLayout(new CardLayout(0, 0));
		
		JPanel pn_trangchu = new JPanel();
		pn_hoatdong.add(pn_trangchu, "name_25463555963200");
		pn_trangchu.setLayout(new BorderLayout(0, 0));
		
		JPanel pn_sodophong = new JPanel();
		pn_hoatdong.add(pn_sodophong, "panel_2");
		pn_sodophong.setLayout(null);
		
		JPanel pn_bar = new JPanel();
		pn_bar.setBounds(10, 10, 927, 40);
		pn_sodophong.add(pn_bar);
		pn_bar.setLayout(new GridLayout(1, 0, 10, 10));
		
		JPanel pn_luachon = new JPanel();
		pn_bar.add(pn_luachon);
		pn_luachon.setLayout(new GridLayout(1, 5, 10, 10));
		
		JPanel panel_7 = new JPanel();
		pn_luachon.add(panel_7);
		
		JPanel panel = new JPanel();
		pn_luachon.add(panel);
		
		JPanel panel_8 = new JPanel();
		pn_luachon.add(panel_8);
		
		JPanel panel_9 = new JPanel();
		pn_luachon.add(panel_9);
		
		JPanel panel_10 = new JPanel();
		pn_luachon.add(panel_10);
		
		JPanel panel_phong1 = new JPanel();
		panel_phong1.setBounds(10, 79, 200, 200);
		pn_sodophong.add(panel_phong1);
		
		JPanel panel_phong2 = new JPanel();
		panel_phong2.setBounds(252, 79, 200, 200);
		pn_sodophong.add(panel_phong2);
		
		JPanel panel_phong3 = new JPanel();
		panel_phong3.setBounds(498, 79, 200, 200);
		pn_sodophong.add(panel_phong3);
		
		JPanel panel_phong4 = new JPanel();
		panel_phong4.setBounds(737, 79, 200, 200);
		pn_sodophong.add(panel_phong4);
		
		JPanel panel_phong5 = new JPanel();
		panel_phong5.setBounds(10, 306, 200, 200);
		pn_sodophong.add(panel_phong5);
		
		JPanel panel_phong6 = new JPanel();
		panel_phong6.setBounds(10, 532, 200, 200);
		pn_sodophong.add(panel_phong6);
		
		JPanel panel_phong7 = new JPanel();
		panel_phong7.setBounds(252, 532, 200, 200);
		pn_sodophong.add(panel_phong7);
		
		JPanel panel_phong8 = new JPanel();
		panel_phong8.setBounds(498, 532, 200, 200);
		pn_sodophong.add(panel_phong8);
		
		JPanel panel_phong9 = new JPanel();
		panel_phong9.setBounds(737, 532, 200, 200);
		pn_sodophong.add(panel_phong9);
		
		JPanel panel_phong10 = new JPanel();
		panel_phong10.setBounds(737, 306, 200, 200);
		pn_sodophong.add(panel_phong10);
		
		JPanel panel_phong11 = new JPanel();
		panel_phong11.setBounds(252, 306, 200, 200);
		pn_sodophong.add(panel_phong11);
		
		JPanel panel_phong12 = new JPanel();
		panel_phong12.setBounds(498, 306, 200, 200);
		pn_sodophong.add(panel_phong12);
		
		JLabel lbanhtrangchu = new JLabel("");
		lbanhtrangchu.setIcon(new ImageIcon(Giaodien.class.getResource("/fileanh/anhksan.png")));
		 JPanel pn_thongke = new JPanel();
		 pn_hoatdong.add(pn_thongke);
		 pn_thongke.setLayout(null);
		 
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
		pn_hoatdong.add(pn_baocao, "name_713377422700");
		pn_baocao.setLayout(null);
		
		JPanel pn_xuatbaocao = new JPanel();
		pn_xuatbaocao.setBounds(29, 23, 231, 209);
		pn_baocao.add(pn_xuatbaocao);
		
		JPanel pn_ghichu = new JPanel();
		pn_ghichu.setBounds(308, 23, 231, 209);
		pn_baocao.add(pn_ghichu);
		
		
	}
}
