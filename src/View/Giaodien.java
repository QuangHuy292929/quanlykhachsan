package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.UIManager;

import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.CardLayout;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.Font;

public class Giaodien extends JFrame {

	private static final long serialVersionUID = 1L;
	
	JPanel pn_trangchu;
	JPanel pn_sodophong;
	JPanel pn_hoatdong;


	/**
	 * Launch the application.
	 */
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
		this.setVisible(true);
		this.setSize(1200, 800);
		this.setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JPanel pn_menu = new JPanel();
		pn_menu.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 255, 255), null, null, null));
		pn_menu.setBounds(10, 10, 211, 742);
		getContentPane().add(pn_menu);
		pn_menu.setLayout(new GridLayout(0, 1, 0, 0));
		
		pn_hoatdong = new JPanel();
		pn_hoatdong.setBounds(231, 10, 947, 742);
		getContentPane().add(pn_hoatdong);
		CardLayout cardhd = new CardLayout();
		pn_hoatdong.setLayout(cardhd);

		JButton bt_trangchu = new JButton("Trang chủ");
		bt_trangchu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cardhd.show(pn_hoatdong, "anhTrangchu");

			}
		});
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
		 
		

		

		JPanel pn_trangchu = new JPanel();
		pn_hoatdong.add(pn_trangchu, "anhTrangchu");
		pn_trangchu.setLayout(new BorderLayout(0, 0));

		JPanel pn_sodophong = new JPanel();
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
		pn_bar.add(pn_luachon);
		pn_luachon.setLayout(new GridLayout(1, 5, 10, 10));

		JPanel panel_7 = new JPanel();
	    panel_7.setBackground(Color.WHITE);
		pn_luachon.add(panel_7);

		JLabel lblNewLabel = new JLabel("Trống");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_7.add(lblNewLabel);

		JPanel panel = new JPanel();
		panel.setBackground(Color.red);
		pn_luachon.add(panel);

		JLabel lblNewLabel_1 = new JLabel("Đã Đặt");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(lblNewLabel_1);

		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.cyan);
		pn_luachon.add(panel_8);

		JLabel lblNewLabel_2 = new JLabel("Chờ Xác Nhận ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_8.add(lblNewLabel_2);

		JPanel panel_phong1 = new JPanel();
		panel_phong1.setBounds(10, 79, 200, 200);
		pn_sodophong.add(panel_phong1);
		panel_phong1.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("P_101");
		lblNewLabel_3.setBounds(66, 82, 200, 22);
		lblNewLabel_3.setBackground(new Color(240, 240, 240));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_phong1.add(lblNewLabel_3);

		JPanel panel_phong2 = new JPanel();
		panel_phong2.setBounds(252, 79, 200, 200);
		pn_sodophong.add(panel_phong2);
		panel_phong2.setLayout(null);

		JLabel lblNewLabel_4 = new JLabel("P_102");
		lblNewLabel_4.setBounds(84, 84, 52, 22);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_phong2.add(lblNewLabel_4);

		JPanel panel_phong3 = new JPanel();
		panel_phong3.setBounds(498, 79, 200, 200);
		pn_sodophong.add(panel_phong3);
		panel_phong3.setLayout(null);

		JLabel lblNewLabel_5 = new JLabel("P_103");
		lblNewLabel_5.setBounds(81, 81, 52, 22);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_phong3.add(lblNewLabel_5);

		JPanel panel_phong4 = new JPanel();
		panel_phong4.setBounds(737, 79, 200, 200);
		pn_sodophong.add(panel_phong4);
		panel_phong4.setLayout(null);

		JLabel lblNewLabel_6 = new JLabel("P_104");
		lblNewLabel_6.setBounds(79, 79, 52, 22);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_phong4.add(lblNewLabel_6);

		JPanel panel_phong5 = new JPanel();
		panel_phong5.setBounds(10, 306, 200, 200);
		pn_sodophong.add(panel_phong5);
		panel_phong5.setLayout(null);

		JLabel lblNewLabel_7 = new JLabel("P_201");
		lblNewLabel_7.setBounds(69, 89, 52, 22);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_phong5.add(lblNewLabel_7);
		JPanel panel_phong6 = new JPanel();
		panel_phong6.setBounds(10, 532, 200, 200);
		pn_sodophong.add(panel_phong6);
		panel_phong6.setLayout(null);

		JLabel lblNewLabel_11 = new JLabel("P_301");
		lblNewLabel_11.setBounds(70, 91, 52, 22);
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_phong6.add(lblNewLabel_11);

		JPanel panel_phong7 = new JPanel();
		panel_phong7.setBounds(252, 532, 200, 200);
		pn_sodophong.add(panel_phong7);
		panel_phong7.setLayout(null);

		JLabel lblNewLabel_12 = new JLabel("P_302");
		lblNewLabel_12.setBounds(74, 89, 52, 22);
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_phong7.add(lblNewLabel_12);

		JPanel panel_phong8 = new JPanel();
		panel_phong8.setBounds(498, 532, 200, 200);
		pn_sodophong.add(panel_phong8);
		panel_phong8.setLayout(null);

		JLabel lblNewLabel_13 = new JLabel("P_303");
		lblNewLabel_13.setBounds(73, 84, 52, 22);
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_phong8.add(lblNewLabel_13);

		JPanel panel_phong9 = new JPanel();
		panel_phong9.setBounds(737, 532, 200, 200);
		pn_sodophong.add(panel_phong9);
		panel_phong9.setLayout(null);

		JLabel lblNewLabel_14 = new JLabel("P_304");
		lblNewLabel_14.setBounds(77, 85, 52, 22);
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_phong9.add(lblNewLabel_14);

		JPanel panel_phong10 = new JPanel();
		panel_phong10.setBounds(737, 306, 200, 200);
		pn_sodophong.add(panel_phong10);
		panel_phong10.setLayout(null);

		JLabel lblNewLabel_10 = new JLabel("P_204");
		lblNewLabel_10.setBounds(76, 84, 52, 22);
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_phong10.add(lblNewLabel_10);

		JPanel panel_phong11 = new JPanel();
		panel_phong11.setBounds(252, 306, 200, 200);
		pn_sodophong.add(panel_phong11);
		panel_phong11.setLayout(null);

		JLabel lblNewLabel_8 = new JLabel("P_202");
		lblNewLabel_8.setBounds(74, 85, 52, 22);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_phong11.add(lblNewLabel_8);

		JPanel panel_phong12 = new JPanel();
		panel_phong12.setBounds(498, 306, 200, 200);
		pn_sodophong.add(panel_phong12);
		panel_phong12.setLayout(null);

		JLabel lblNewLabel_9 = new JLabel("P_203");
		lblNewLabel_9.setBounds(82, 84, 52, 22);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_phong12.add(lblNewLabel_9);

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

		JPanel pn_p101 = new JPanel();
		pn_hoatdong.add(pn_p101, "name_12329757094900");

		JPanel pn_p102 = new JPanel();
		pn_hoatdong.add(pn_p102, "name_12349158775400");

		JPanel pn_p103 = new JPanel();
		pn_hoatdong.add(pn_p103, "name_12353409635300");

		JPanel pn_p104 = new JPanel();
		pn_hoatdong.add(pn_p104, "name_12355914808400");

		JPanel pn_p201 = new JPanel();
		pn_hoatdong.add(pn_p201, "name_12358376875000");

		JPanel pn_p202 = new JPanel();
		pn_hoatdong.add(pn_p202, "name_12360528303900");

		JPanel pn_p203 = new JPanel();
		pn_hoatdong.add(pn_p203, "name_12362818254600");

		JPanel pn_p204 = new JPanel();
		pn_hoatdong.add(pn_p204, "name_12364778861900");

		JPanel pn_p301 = new JPanel();
		pn_hoatdong.add(pn_p301, "name_12367032568300");

		JPanel pn_p302 = new JPanel();
		pn_hoatdong.add(pn_p302, "name_12369476021800");

		JPanel pn_p303 = new JPanel();
		pn_hoatdong.add(pn_p303, "name_12371839192600");

		JPanel pn_p304 = new JPanel();
		pn_hoatdong.add(pn_p304, "name_12374367111300");

	}
}