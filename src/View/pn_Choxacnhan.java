package View;

import java.awt.Dimension; 

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.Component;

public class pn_Choxacnhan extends JPanel {

	private static final long serialVersionUID = 1L;
	private JButton btchoxacnhan;
	private Component btquaylai;
	private JButton btxacnhan;
	private JComponent lbdichvu;
	private JLabel lbsdt;
	private JLabel lbcccd;
	private Component lbtinhthanhpho;
	private JLabel lbngaysinh;
	private JComponent lbhovaten;

	/**
	 * Create the panel.
	 */
	public pn_Choxacnhan() {

		setPreferredSize(new Dimension(947, 742));
		setLayout(null);

		JPanel pnthongtinchoxacnhan = new JPanel();
		pnthongtinchoxacnhan
				.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 255, 255), null),
						"   THÔNG TIN KHÁCH HÀNG   ", TitledBorder.LEFT, TitledBorder.TOP, null,
						new Color(0, 0, 0)));
		pnthongtinchoxacnhan.setBounds(20, 22, 910, 452);
		add(pnthongtinchoxacnhan);
		pnthongtinchoxacnhan.setLayout(null);

		JPanel pn_buttonchoxacnhan = new JPanel();
		pn_buttonchoxacnhan.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pn_buttonchoxacnhan.setBounds(20, 495, 910, 70);
		add(pn_buttonchoxacnhan);

		JLabel lblNewLabel = new JLabel("ĐANG CHỜ XÁC NHẬN");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(370, 23, 231, 30);
		pnthongtinchoxacnhan.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Họ và Tên:  ");
		lblNewLabel_1.setBounds(199, 120, 189, 30);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 18));
		pnthongtinchoxacnhan.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Tỉnh (Thành phố):");
		lblNewLabel_2.setBounds(199, 200, 189, 30);
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 18));
		pnthongtinchoxacnhan.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Ngày sinh:");
		lblNewLabel_3.setBounds(199, 160, 189, 30);
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 18));
		pnthongtinchoxacnhan.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("CCCD:");
		lblNewLabel_4.setBounds(199, 240, 189, 30);
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 18));
		pnthongtinchoxacnhan.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Số điện thoại :");
		lblNewLabel_5.setBounds(199, 280, 189, 30);
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 18));
		pnthongtinchoxacnhan.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Các dịch vụ đã chọn:");
		lblNewLabel_6.setBounds(199, 320, 189, 29);
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 18));
		pnthongtinchoxacnhan.add(lblNewLabel_6);

		lbhovaten = new JLabel("New label");
		lbhovaten.setFont(new Font("Arial", Font.PLAIN, 18));
		lbhovaten.setBounds(425, 120, 245, 29);
		pnthongtinchoxacnhan.add(lbhovaten);

		lbngaysinh = new JLabel("New label");
		lbngaysinh.setFont(new Font("Arial", Font.PLAIN, 18));
		lbngaysinh.setBounds(425, 161, 245, 29);
		pnthongtinchoxacnhan.add(lbngaysinh);

		lbtinhthanhpho = new JLabel("New label");
		lbtinhthanhpho.setFont(new Font("Arial", Font.PLAIN, 18));
		lbtinhthanhpho.setBounds(425, 201, 245, 29);
		pnthongtinchoxacnhan.add(lbtinhthanhpho);

		lbcccd = new JLabel("New label");
		lbcccd.setFont(new Font("Arial", Font.PLAIN, 18));
		lbcccd.setBounds(425, 241, 245, 29);
		pnthongtinchoxacnhan.add(lbcccd);

		lbsdt = new JLabel("New label");
		lbsdt.setFont(new Font("Arial", Font.PLAIN, 18));
		lbsdt.setBounds(425, 284, 245, 22);
		pnthongtinchoxacnhan.add(lbsdt);

		lbdichvu = new JLabel("New label");
		lbdichvu.setFont(new Font("Arial", Font.PLAIN, 18));
		lbdichvu.setBounds(425, 320, 245, 28);
		pnthongtinchoxacnhan.add(lbdichvu);
		pn_buttonchoxacnhan.setLayout(null);

		btquaylai = new JButton("Quay lại ");
		btquaylai.setBounds(10, 10, 148, 50);
		btquaylai.setFont(new Font("Tahoma", Font.PLAIN, 14));
		pn_buttonchoxacnhan.add(btquaylai);

		btxacnhan = new JButton("Hủy phòng");
		btxacnhan.setBounds(601, 9, 141, 53);
		btxacnhan.setFont(new Font("Tahoma", Font.PLAIN, 14));
		pn_buttonchoxacnhan.add(btxacnhan);

		btchoxacnhan = new JButton("Xác nhận đặt ");
		btchoxacnhan.setBounds(752, 10, 148, 50);
		btchoxacnhan.setFont(new Font("Tahoma", Font.PLAIN, 14));
		pn_buttonchoxacnhan.add(btchoxacnhan);
	}
}