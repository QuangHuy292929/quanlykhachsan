package View;

import java.awt.Dimension; 

import javax.swing.JPanel;
import javax.swing.JLabel;

import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;

import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.SpinnerNumberModel;

public class pn_Datphong extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField tfhovaten;
	private JTextField tftinh;
	private JTextField tfcccd;
	private JTextField tfsdt;
	private JCheckBox cbtuantrangmat;
	private JCheckBox cbgiacquanao;
	private JCheckBox cbdungdiemtam;
	private JCheckBox cbtrongtre;
	private JButton btquaylai;
	private JButton btxacnhan;
	private JButton btchoxacnhan;
	private SpinnerDateModel model;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JSpinner spinnerngaysinh;
	private JSpinner spinnerngaynhanphong;
	private JSpinner spinnerngaytraphong;
	
	
	

	/**
	 * Create the panel.
	 */
	public pn_Datphong() {
		
		
		
		setPreferredSize(new Dimension(947, 742));
		setLayout(null);

		JPanel pnthongtin = new JPanel();
		pnthongtin.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnthongtin.setBounds(20, 22, 910, 452);
		add(pnthongtin);
		pnthongtin.setLayout(null);

		JPanel pn_button = new JPanel();
		pn_button.setForeground(Color.WHITE);
		pn_button.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pn_button.setBounds(20, 496, 910, 66);
		add(pn_button);

		JLabel lblNewLabel = new JLabel("CHÀO MỪNG QUÝ KHÁCH ĐÃ ĐẾN VỚI CHÚNG TÔI");
		lblNewLabel.setBounds(200, 40, 600, 30);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		pnthongtin.add(lblNewLabel);
		pn_button.setLayout(null);

		btquaylai = new JButton("Quay Lại");
		btquaylai.setBounds(10, 10, 123, 37);
		btquaylai.setFont(new Font("Tahoma", Font.PLAIN, 14));
		pn_button.add(btquaylai);

		btxacnhan = new JButton("Đặt Phòng");
		btxacnhan.setBounds(783, 10, 117, 37);
		btxacnhan.setFont(new Font("Tahoma", Font.PLAIN, 14));
		pn_button.add(btxacnhan);

		btchoxacnhan = new JButton("Chuyển Vào Chế Độ Chờ");
		btchoxacnhan.setBounds(576, 10, 197, 37);
		btchoxacnhan.setFont(new Font("Tahoma", Font.PLAIN, 14));
		pn_button.add(btchoxacnhan);

		// Tạo một SpinnerDateModel để quản lý giá trị ngày
		model = new SpinnerDateModel(new Date(1713029691874L), null, null,
				Calendar.DAY_OF_WEEK_IN_MONTH);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.RAISED, new Color(0, 255, 255), new Color(192, 192, 192)),
				"   NHẬP THÔNG TIN   ", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 80, 510, 362);
		pnthongtin.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Họ và Tên:  ");
		lblNewLabel_1.setBounds(32, 56, 120, 17);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 18));

		tfhovaten = new JTextField();
		tfhovaten.setBounds(224, 53, 246, 23);
		panel.add(tfhovaten);
		tfhovaten.setFont(new Font("Arial", Font.PLAIN, 18));
		tfhovaten.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Ngày sinh:");
		lblNewLabel_3.setBounds(32, 88, 120, 17);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 18));

		// Tạo một JSpinner
		spinnerngaysinh = new JSpinner();
		spinnerngaysinh.setFont(new Font("Arial", Font.PLAIN, 18));
		spinnerngaysinh.setBounds(224, 86, 120, 20);
		panel.add(spinnerngaysinh);

		// Thiết lập SpinnerDateModel cho JSpinner
		spinnerngaysinh
				.setModel(new SpinnerDateModel(new Date(1704044091874L), null, null, Calendar.DAY_OF_WEEK_IN_MONTH));

		// Thiết lập định dạng hiển thị chỉ hiển thị ngày
		JSpinner.DateEditor de_spinnerngaysinh = new JSpinner.DateEditor(spinnerngaysinh, "dd/MM/yyyy");
		spinnerngaysinh.setEditor(de_spinnerngaysinh);

		JLabel lblNewLabel_2 = new JLabel("Tỉnh (Thành phố):");
		lblNewLabel_2.setBounds(32, 120, 171, 17);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 18));

		tftinh = new JTextField();
		tftinh.setBounds(224, 116, 246, 23);
		panel.add(tftinh);
		tftinh.setFont(new Font("Arial", Font.PLAIN, 18));
		tftinh.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("CCCD:");
		lblNewLabel_4.setBounds(32, 153, 120, 17);
		panel.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 18));

		tfcccd = new JTextField();
		tfcccd.setBounds(224, 149, 246, 23);
		panel.add(tfcccd);
		tfcccd.setFont(new Font("Arial", Font.PLAIN, 18));
		tfcccd.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("Số điện thoại :");
		lblNewLabel_5.setBounds(32, 186, 120, 20);
		panel.add(lblNewLabel_5);
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 18));

		tfsdt = new JTextField();
		tfsdt.setBounds(224, 182, 246, 23);
		panel.add(tfsdt);
		tfsdt.setFont(new Font("Arial", Font.PLAIN, 18));
		tfsdt.setColumns(10);
		
		lblNewLabel_6 = new JLabel("Ngày giờ nhận phòng :");
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(32, 217, 200, 20);
		panel.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Ngày giờ trả phòng :");
		lblNewLabel_7.setFont(new Font("Arial", Font.PLAIN, 18));
		lblNewLabel_7.setBounds(32, 248, 200, 20);
		panel.add(lblNewLabel_7);
		
		spinnerngaynhanphong = new JSpinner();
		spinnerngaynhanphong.setModel(new SpinnerDateModel(new Date(1704042000000L), null, null, Calendar.DAY_OF_WEEK_IN_MONTH));
		spinnerngaynhanphong.setFont(new Font("Arial", Font.PLAIN, 18));
		spinnerngaynhanphong.setBounds(224, 219, 180, 20);
		panel.add(spinnerngaynhanphong);
		
		spinnerngaytraphong = new JSpinner();
		spinnerngaytraphong.setModel(new SpinnerDateModel(new Date(1704042000000L), null, null, Calendar.DAY_OF_WEEK_IN_MONTH));
		spinnerngaytraphong.setFont(new Font("Arial", Font.PLAIN, 18));
		spinnerngaytraphong.setBounds(224, 250, 180, 20);
		panel.add(spinnerngaytraphong);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.RAISED, new Color(0, 255, 255), new Color(192, 192, 192)),
				"CH\u1ECCN D\u1ECACH V\u1EE4", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(536, 80, 350, 362);
		pnthongtin.add(panel_1);
		panel_1.setLayout(null);

		cbdungdiemtam = new JCheckBox("Ăn tại phòng");
		cbdungdiemtam.setBounds(52, 103, 194, 23);
		panel_1.add(cbdungdiemtam);
		cbdungdiemtam.setFont(new Font("Arial", Font.PLAIN, 18));

		cbgiacquanao = new JCheckBox("Đưa đón sân bay");
		cbgiacquanao.setBounds(52, 128, 194, 23);
		panel_1.add(cbgiacquanao);
		cbgiacquanao.setFont(new Font("Arial", Font.PLAIN, 18));

		cbtuantrangmat = new JCheckBox("Tuần trăng mật");
		cbtuantrangmat.setBounds(52, 178, 194, 23);
		panel_1.add(cbtuantrangmat);
		cbtuantrangmat.setFont(new Font("Arial", Font.PLAIN, 18));

		cbtrongtre = new JCheckBox("Trông trẻ");
		cbtrongtre.setBounds(52, 153, 194, 23);
		panel_1.add(cbtrongtre);
		cbtrongtre.setFont(new Font("Arial", Font.PLAIN, 18));
		
		JCheckBox chckbxChoThuXe = new JCheckBox("Cho thuê xe tự lái ");
		chckbxChoThuXe.setFont(new Font("Arial", Font.PLAIN, 18));
		chckbxChoThuXe.setBounds(52, 77, 194, 23);
		panel_1.add(chckbxChoThuXe);

	}

	public JSpinner getSpinnerngaynhanphong() {
		return spinnerngaynhanphong;
	}

	public void setSpinnerngaynhanphong(JSpinner spinnerngaynhanphong) {
		this.spinnerngaynhanphong = spinnerngaynhanphong;
	}

	public JSpinner getSpinnerngaytraphong() {
		return spinnerngaytraphong;
	}

	public void setSpinnerngaytraphong(JSpinner spinnerngaytraphong) {
		this.spinnerngaytraphong = spinnerngaytraphong;
	}

	public JSpinner getSpinnerngaysinh() {
		return spinnerngaysinh;
	}

	public void setSpinnerngaysinh(JSpinner spinnerngaysinh) {
		this.spinnerngaysinh = spinnerngaysinh;
	}

	public JTextField getTfhovaten() {
		return tfhovaten;
	}

	public void setTfhovaten(JTextField tfhovaten) {
		this.tfhovaten = tfhovaten;
	}

	public JTextField getTftinh() {
		return tftinh;
	}

	public void setTftinh(JTextField tftinh) {
		this.tftinh = tftinh;
	}

	public JTextField getTfcccd() {
		return tfcccd;
	}

	public void setTfcccd(JTextField tfcccd) {
		this.tfcccd = tfcccd;
	}

	public JTextField getTfsdt() {
		return tfsdt;
	}

	public void setTfsdt(JTextField tfsdt) {
		this.tfsdt = tfsdt;
	}

	public JCheckBox getCbtuantrangmat() {
		return cbtuantrangmat;
	}

	public void setCbtuantrangmat(JCheckBox cbtuantrangmat) {
		this.cbtuantrangmat = cbtuantrangmat;
	}

	public JCheckBox getCbgiacquanao() {
		return cbgiacquanao;
	}

	public void setCbgiacquanao(JCheckBox cbgiacquanao) {
		this.cbgiacquanao = cbgiacquanao;
	}

	public JCheckBox getCbdungdiemtam() {
		return cbdungdiemtam;
	}

	public void setCbdungdiemtam(JCheckBox cbdungdiemtam) {
		this.cbdungdiemtam = cbdungdiemtam;
	}

	public JCheckBox getCbtrongtre() {
		return cbtrongtre;
	}

	public void setCbtrongtre(JCheckBox cbtrongtre) {
		this.cbtrongtre = cbtrongtre;
	}

	public JButton getBtquaylai() {
		return btquaylai;
	}

	public void setBtquaylai(JButton btquaylai) {
		this.btquaylai = btquaylai;
	}

	public JButton getBtxacnhan() {
		return btxacnhan;
	}

	public void setBtxacnhan(JButton btxacnhan) {
		this.btxacnhan = btxacnhan;
	}

	public JButton getBtchoxacnhan() {
		return btchoxacnhan;
	}

	public void setBtchoxacnhan(JButton btchoxacnhan) {
		this.btchoxacnhan = btchoxacnhan;
	}

	public JLabel getLblNewLabel_6() {
		return lblNewLabel_6;
	}

	public void setLblNewLabel_6(JLabel lblNewLabel_6) {
		this.lblNewLabel_6 = lblNewLabel_6;
	}

	public JLabel getLblNewLabel_7() {
		return lblNewLabel_7;
	}

	public void setLblNewLabel_7(JLabel lblNewLabel_7) {
		this.lblNewLabel_7 = lblNewLabel_7;
	}
}