package View;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.table.DefaultTableModel;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import javax.swing.border.SoftBevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pn_Danghoatdong extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton btnTrPhng;
	private JButton btquaylai;
	private JLabel lbtienphong;
	private JLabel lbngaygionhanphong;
	private JLabel lbhovaten;
	private JLabel lbngaysinh;
	private JLabel lbtinhthanhpho;
	private JLabel lbcccd;
	private JLabel lbsdt;
	private JLabel lbtiendichvu;
	private JLabel lbtongtien;

	/**
	 * Create the panel.
	 */
	public pn_Danghoatdong() {
		setPreferredSize(new Dimension(947, 742));
		setLayout(null);
		JPanel pnthongtinhoatdong = new JPanel();
		pnthongtinhoatdong.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnthongtinhoatdong.setBounds(20, 23, 910, 452);
		add(pnthongtinhoatdong);
		pnthongtinhoatdong.setLayout(null);

		JPanel pnhienthidichvudasudung = new JPanel();
		pnhienthidichvudasudung.setBounds(454, 10, 451, 432);
		pnhienthidichvudasudung.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnthongtinhoatdong.add(pnhienthidichvudasudung);
		pnhienthidichvudasudung.setLayout(null);

		JLabel lblThngTinKhch = new JLabel("DỊCH VỤ ĐÃ SỬ DỤNG");
		lblThngTinKhch.setBounds(127, 6, 300, 50);
		lblThngTinKhch.setFont(new Font("Tahoma", Font.BOLD, 18));
		pnhienthidichvudasudung.add(lblThngTinKhch);

		// Tạo bảng JTable
		JTable tabledichvu = new JTable();
		tabledichvu.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tabledichvu.setBounds(5, 70, 440, 300);

		// Thiết lập chế độ lựa chọn chỉ có thể chọn một hàng
		tabledichvu.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		// Cho phép lựa chọn theo ô
		tabledichvu.setCellSelectionEnabled(true);

		// Cho phép lựa chọn theo cột
		tabledichvu.setColumnSelectionAllowed(true);
		tabledichvu.setRowHeight(30);

		// Tạo một mẫu dữ liệu đơn giản để minh họa
		DefaultTableModel model = new DefaultTableModel(5, 5);
		tabledichvu.setModel(new DefaultTableModel(new Object[][] { { null }, { null }, { null }, { null }, { null },
				{ null }, { null }, { null }, { null }, { null }, }, new String[] { "A" }));

		// Thêm bảng vào panel
		pnhienthidichvudasudung.add(tabledichvu);

		JLabel lb1223 = new JLabel("Tiền dịch vụ:");
		lb1223.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lb1223.setBounds(5, 395, 150, 20);
		pnhienthidichvudasudung.add(lb1223);

		lbtiendichvu = new JLabel("New label");
		lbtiendichvu.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbtiendichvu.setBounds(103, 394, 200, 25);
		pnhienthidichvudasudung.add(lbtiendichvu);

		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 10, 435, 432);
		pnthongtinhoatdong.add(panel);
		panel.setLayout(null);

		JLabel lblThngTinKhch_1 = new JLabel("THÔNG TIN KHÁCH HÀNG");
		lblThngTinKhch_1.setBounds(93, 26, 241, 22);
		lblThngTinKhch_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(lblThngTinKhch_1);

		JLabel lblNewLabel = new JLabel("Họ và tên:");
		lblNewLabel.setBounds(33, 110, 187, 22);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 18));
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Ngày sinh:");
		lblNewLabel_1.setBounds(33, 135, 187, 22);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 18));
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Tỉnh (Thành phố):");
		lblNewLabel_2.setBounds(33, 216, 187, 22);
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 18));
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("CCCD:");
		lblNewLabel_3.setBounds(33, 162, 187, 22);
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 18));
		panel.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Số điện thoại:");
		lblNewLabel_4.setBounds(33, 189, 187, 22);
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 18));
		panel.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Ngày giờ nhận phòng:");
		lblNewLabel_5.setBounds(33, 243, 187, 22);
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 18));
		panel.add(lblNewLabel_5);

		lbsdt = new JLabel("New label");
		lbsdt.setBounds(230, 110, 195, 22);
		lbsdt.setFont(new Font("Arial", Font.PLAIN, 18));
		panel.add(lbsdt);

		lbcccd = new JLabel("New label");
		lbcccd.setBounds(230, 135, 195, 22);
		lbcccd.setFont(new Font("Arial", Font.PLAIN, 18));
		panel.add(lbcccd);

		lbtinhthanhpho = new JLabel("New label");
		lbtinhthanhpho.setBounds(230, 161, 195, 22);
		lbtinhthanhpho.setFont(new Font("Arial", Font.PLAIN, 18));
		panel.add(lbtinhthanhpho);

		lbngaysinh = new JLabel("New label");
		lbngaysinh.setBounds(230, 189, 195, 22);
		lbngaysinh.setFont(new Font("Arial", Font.PLAIN, 18));
		panel.add(lbngaysinh);

		lbhovaten = new JLabel("New label");
		lbhovaten.setBounds(230, 216, 195, 22);
		lbhovaten.setFont(new Font("Arial", Font.PLAIN, 18));
		panel.add(lbhovaten);

		JLabel lblNewLabel_5_1_1 = new JLabel("Tiền phòng:");
		lblNewLabel_5_1_1.setBounds(33, 270, 187, 22);
		lblNewLabel_5_1_1.setFont(new Font("Arial", Font.PLAIN, 18));
		panel.add(lblNewLabel_5_1_1);

		lbngaygionhanphong = new JLabel("New label");
		lbngaygionhanphong.setBounds(230, 270, 195, 22);
		lbngaygionhanphong.setFont(new Font("Arial", Font.PLAIN, 18));
		panel.add(lbngaygionhanphong);

		lbtienphong = new JLabel("New label");
		lbtienphong.setBounds(230, 243, 195, 22);
		lbtienphong.setFont(new Font("Arial", Font.PLAIN, 18));
		panel.add(lbtienphong);

		JPanel pnbuttonhoatdong = new JPanel();
		pnbuttonhoatdong.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnbuttonhoatdong.setBounds(20, 495, 910, 58);
		add(pnbuttonhoatdong);
		pnbuttonhoatdong.setLayout(null);

		JLabel lblNewLabel_5_1_1_1 = new JLabel("Tổng Tiền: ");
		lblNewLabel_5_1_1_1.setBounds(63, 5, 100, 17);
		lblNewLabel_5_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		pnbuttonhoatdong.add(lblNewLabel_5_1_1_1);

		lbtongtien = new JLabel("New label");
		lbtongtien.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbtongtien.setBounds(201, 6, 200, 17);
		pnbuttonhoatdong.add(lbtongtien);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(20, 563, 910, 68);
		add(panel_1);
		panel_1.setLayout(null);

		btquaylai = new JButton("Quay lại");
		btquaylai.setBounds(10, 10, 132, 49);
		panel_1.add(btquaylai);
		btquaylai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btquaylai.setFont(new Font("Tahoma", Font.PLAIN, 14));

		btnTrPhng = new JButton("Trả phòng");
		btnTrPhng.setBounds(751, 10, 149, 49);
		panel_1.add(btnTrPhng);
		btnTrPhng.setFont(new Font("Tahoma", Font.PLAIN, 14));
	}
}