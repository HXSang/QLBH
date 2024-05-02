package GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

public class GUI_NhapHang extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel Frame;
	private JTextField txtMaSP;
	private JTextField txtTenSP;
	private JTextField txtChungLoai;
	private DefaultTableModel model;
	private JTextField txtNgayHH;
	private JTextField txtNgayCC;
	private JTextField textField_2;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private TableColumn firstColumn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	    EventQueue.invokeLater(new Runnable() {
	        public void run() {
	            try {
	                // Tạo một đối tượng GUI_BanHang và hiển thị nó
	                GUI_NhapHang gui = new GUI_NhapHang();
	                gui.setVisible(true);
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	    });
	}

	/**
	 * Create the frame.
	 */
	public GUI_NhapHang() {
		setTitle("Quản lí bán hàng");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,1920,1000);
		setLocationRelativeTo(null);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
        Frame = new JPanel();
        Frame.setBackground(new Color(255, 255, 255));
		setContentPane(Frame);
		Frame.setLayout(null);
        Border border1 = BorderFactory.createLineBorder(Color.BLACK, 1);
        Border border2 = BorderFactory.createLineBorder(Color.BLACK, 2);
		JPanel pTop = new JPanel();
		pTop.setBackground(Color.WHITE);
		pTop.setBounds(1, 1, 1920, 131);
		Frame.add(pTop);
		pTop.setBorder(border2);
		pTop.setLayout(null);
		
		JButton btnQuanLiNhanVien = new JButton("Quản lí nhân viên");
		btnQuanLiNhanVien.setForeground(Color.WHITE);
		btnQuanLiNhanVien.setBackground(new Color(55, 149, 128));
		btnQuanLiNhanVien.setBounds(1099, 22, 310, 85);
		pTop.add(btnQuanLiNhanVien);
		btnQuanLiNhanVien.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnQuanLiNhanVien.addActionListener(new ActionListener() {
			private JFrame frame;

			public void actionPerformed(ActionEvent e) {
                GUI_QuanLiNV gui = new GUI_QuanLiNV();
                gui.setVisible(true);

                // Thêm GUI_BanHang vào frame
                frame.getContentPane().add(gui);

                // Hiển thị frame
                frame.setVisible(true);
			}
		});
		
		JButton btnBanHang = new JButton("Bán hàng");
		btnBanHang.setForeground(Color.WHITE);
		btnBanHang.setBackground(new Color(55, 149, 128));
		btnBanHang.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnBanHang.setBounds(40, 22, 310, 85);
		btnBanHang.addActionListener(new ActionListener() {
			private JFrame frame;

			public void actionPerformed(ActionEvent e) {
                GUI_Banhang_update1 gui = new GUI_Banhang_update1();
                gui.setVisible(true);

                // Thêm GUI_BanHang vào frame
                frame.getContentPane().add(gui);

                // Hiển thị frame
                frame.setVisible(true);
			}
		});
		pTop.add(btnBanHang);
		
		JButton btnKho = new JButton("Kho");
		btnKho.setForeground(Color.WHITE);
		btnKho.setBackground(new Color(55, 149, 128));
		btnKho.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnKho.setBounds(395, 22, 310, 85);
		pTop.add(btnKho);
		btnKho.addActionListener(new ActionListener() {
			private JFrame frame;

			public void actionPerformed(ActionEvent e) {
                GUI_KhoHang gui = new GUI_KhoHang();
                gui.setVisible(true);

                // Thêm GUI_BanHang vào frame
                frame.getContentPane().add(gui);

                // Hiển thị frame
                frame.setVisible(true);
			}
		});
		
		JButton btnNhapHang = new JButton("Nhập hàng");
		btnNhapHang.setForeground(Color.GRAY);
		btnNhapHang.setBackground(new Color(164, 194, 163));
		btnNhapHang.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNhapHang.setBounds(746, 22, 310, 85);
		pTop.add(btnNhapHang);
		btnNhapHang.addActionListener(new ActionListener() {
			private JFrame frame;

			public void actionPerformed(ActionEvent e) {
                GUI_NhapHang gui = new GUI_NhapHang();
                gui.setVisible(true);

                // Thêm GUI_BanHang vào frame
                frame.getContentPane().add(gui);

                // Hiển thị frame
                frame.setVisible(true);
			}
		});
		
		JButton btnQLHD = new JButton("Quản lí hóa đơn");
		btnQLHD.setForeground(Color.WHITE);
		btnQLHD.setBackground(new Color(55, 149, 128));
		btnQLHD.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnQLHD.setBounds(1455, 22, 310, 85);
		pTop.add(btnQLHD);
		btnQLHD.addActionListener(new ActionListener() {
			private JFrame frame;

			public void actionPerformed(ActionEvent e) {
                GUI_QuanLiHD gui = new GUI_QuanLiHD();
                gui.setVisible(true);

                // Thêm GUI_BanHang vào frame
                frame.getContentPane().add(gui);

                // Hiển thị frame
                frame.setVisible(true);
			}
		});
		
		JPanel panelCenter = new JPanel();
		panelCenter.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelCenter.setBounds(1, 129, 1921, 269);
		Frame.add(panelCenter);
		panelCenter.setLayout(null);
		
		JLabel lblMaSP = new JLabel("Mã sản phẩm:");
		lblMaSP.setBounds(96, 90, 142, 25);
		lblMaSP.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panelCenter.add(lblMaSP);
		
		txtMaSP = new JTextField();
		txtMaSP.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtMaSP.setColumns(10);
		txtMaSP.setBounds(296, 78, 305, 50);
		panelCenter.add(txtMaSP);
		
		JLabel lblTenSP = new JLabel("Tên sản phẩm:");
		lblTenSP.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTenSP.setBounds(714, 90, 142, 25);
		panelCenter.add(lblTenSP);
		
		txtTenSP = new JTextField();
		txtTenSP.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTenSP.setColumns(10);
		txtTenSP.setBounds(914, 78, 305, 50);
		panelCenter.add(txtTenSP);
		
		JLabel lblMaSP_1_1 = new JLabel("Chủng loại:");
		lblMaSP_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMaSP_1_1.setBounds(1335, 90, 142, 25);
		panelCenter.add(lblMaSP_1_1);
		
		txtChungLoai = new JTextField();
		txtChungLoai.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtChungLoai.setColumns(10);
		txtChungLoai.setBounds(1535, 78, 305, 50);
		panelCenter.add(txtChungLoai);
		
		txtNgayHH = new JTextField();
		txtNgayHH.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtNgayHH.setColumns(10);
		txtNgayHH.setBounds(1535, 11, 305, 50);
		panelCenter.add(txtNgayHH);
		
		JLabel lblNgHH = new JLabel("Ngày hết hạng");
		lblNgHH.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNgHH.setBounds(1335, 23, 142, 25);
		panelCenter.add(lblNgHH);
		
		txtNgayCC = new JTextField();
		txtNgayCC.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtNgayCC.setColumns(10);
		txtNgayCC.setBounds(914, 11, 305, 50);
		panelCenter.add(txtNgayCC);
		
		JLabel lblNgaySX = new JLabel("Ngày sản xuất");
		lblNgaySX.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNgaySX.setBounds(714, 23, 179, 25);
		panelCenter.add(lblNgaySX);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(296, 11, 305, 50);
		panelCenter.add(textField_2);
		
		JLabel lblNhacc = new JLabel("Tên nhà cung cấp:");
		lblNhacc.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNhacc.setBounds(96, 23, 190, 25);
		panelCenter.add(lblNhacc);
		
		JLabel lblGaNhp = new JLabel("Gía nhập");
		lblGaNhp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGaNhp.setBounds(96, 155, 142, 25);
		panelCenter.add(lblGaNhp);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setColumns(10);
		textField.setBounds(296, 143, 305, 50);
		panelCenter.add(textField);
		
		JLabel lblGaBn = new JLabel("Gía bán");
		lblGaBn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGaBn.setBounds(714, 155, 142, 25);
		panelCenter.add(lblGaBn);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(914, 143, 305, 50);
		panelCenter.add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(1535, 143, 305, 50);
		panelCenter.add(textField_3);
		
		JLabel lblMaSP_1_1_1 = new JLabel("Số lượng");
		lblMaSP_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMaSP_1_1_1.setBounds(1335, 155, 142, 25);
		panelCenter.add(lblMaSP_1_1_1);
		
		JButton btnXoaTrang = new JButton("Xóa trắng");
		btnXoaTrang.setForeground(Color.WHITE);
		btnXoaTrang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnXoaTrang.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnXoaTrang.setBounds(1650, 204, 190, 50);
		btnXoaTrang.setBackground(new Color(55, 149, 128));
		panelCenter.add(btnXoaTrang);
		
		JButton btnNhanHang = new JButton("Thêm hàng");
		btnNhanHang.setForeground(Color.WHITE);
		btnNhanHang.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNhanHang.setBounds(1399, 204, 190, 50);
		btnNhanHang.setBackground(new Color(55, 149, 128));
		panelCenter.add(btnNhanHang);
		
		JPanel panelBot = new JPanel();
		panelBot.setBounds(1, 392, 1920, 684);
		Frame.add(panelBot);
		panelBot.setLayout(null);
		
		String[] cols = new String[] {"STT", "Mã sản phẩm", "Tên sản phẩm", "Chủng loại ", "Nhà cung cấp","Ngày sản xuất", "Hạn sữ dụng", "Giá nhập ", "Gía bán", "Số lượng"};
       
        
        model = new DefaultTableModel(cols, 0);

	

		JTable tableHD = new JTable(model);
		JScrollPane paneNV = new JScrollPane(tableHD);
		paneNV.setBounds(10, 11, 1900, 792);
		panelBot.add(paneNV);
        firstColumn = tableHD.getColumnModel().getColumn(0);
        firstColumn.setMaxWidth(90);
		JTableHeader headers = tableHD.getTableHeader();
		Font headerFont = new Font("Tahoma", Font.PLAIN, 25);
		headers.setFont(headerFont);
		headers.setBackground(new Color(55, 149, 128));
		headers.setForeground(Color.WHITE);
	
		tableHD.setFont(new Font("Tahoma", Font.PLAIN, 20));
		TableColumn firstColumn = tableHD.getColumnModel().getColumn(0);
	    firstColumn.setMaxWidth(90);
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment(JLabel.CENTER);
		tableHD.setDefaultRenderer(Object.class, centerRenderer);
        int rowHeight = 30; // Chiều cao mong muốn cho mỗi hàng
        tableHD.setRowHeight(rowHeight);
	}
}
