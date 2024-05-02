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
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

public class GUI_QuanLiNV extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel Frame;

	private JPanel panel_Center_Top;
	private JLabel lblMaNhanVien;
	private JLabel lblCCCD;
	private JTextField txtMaNhanVien;
	private JLabel lblTenNV;
	private JLabel lblSDT;
	private JLabel lblDC;

	private JTextField txtTenNV;
	private JTextField txtCCCD;
	private JTextField txtTuoi;
	private JTextField txtSDT;
	private JTextField txtDC;
	private JButton btnXoaTrang;
	private JButton btnTim;
	private JButton btnThem;

	private JComboBox<Object> comboBox;

	private TableColumn firstColumn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    // Tạo một đối tượng JFrame
                    JFrame frame = new JFrame();

                    // Đặt thuộc tính toàn màn hình cho frame
                    frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

                    // Đặt cửa sổ không có viền và không thể điều chỉnh kích thước
                    frame.setUndecorated(true);

                    // Tạo một đối tượng GUI_BanHang và hiển thị nó
                    GUI_QuanLiNV gui = new GUI_QuanLiNV();
                    gui.setVisible(true);

                    // Thêm GUI_BanHang vào frame
                    frame.getContentPane().add(gui);

                    // Hiển thị frame
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
	public GUI_QuanLiNV() {
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
		btnQuanLiNhanVien.setForeground(Color.GRAY);
		btnQuanLiNhanVien.setBackground(new Color(164, 194, 163));
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
		btnNhapHang.setForeground(Color.WHITE);
		btnNhapHang.setBackground(new Color(55, 149, 128));
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
		
		panel_Center_Top = new JPanel();
		panel_Center_Top.setBackground(new Color(255, 255, 255));
		panel_Center_Top.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_Center_Top.setBounds(1, 132, 1920, 217);
		Frame.add(panel_Center_Top);
		panel_Center_Top.setLayout(null);
		
		lblMaNhanVien = new JLabel("Mã nhân viên");
		lblMaNhanVien.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMaNhanVien.setBounds(96, 25, 126, 35);
		panel_Center_Top.add(lblMaNhanVien);
		
		lblCCCD = new JLabel("Căn cước công dân");
		lblCCCD.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCCCD.setBounds(1335, 25, 186, 35);
		panel_Center_Top.add(lblCCCD);
		
		txtMaNhanVien = new JTextField();
		txtMaNhanVien.setBackground(new Color(55, 149, 128));
		txtMaNhanVien.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtMaNhanVien.setColumns(10);
		txtMaNhanVien.setBounds(296, 11, 305, 50);
		panel_Center_Top.add(txtMaNhanVien);
		
		lblTenNV = new JLabel("Tên nhân viên");
		lblTenNV.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTenNV.setBounds(741, 25, 210, 35);
		panel_Center_Top.add(lblTenNV);
		
		lblSDT = new JLabel("Số điện thoại");
		lblSDT.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSDT.setBounds(741, 92, 175, 35);
		panel_Center_Top.add(lblSDT);
		
		lblDC = new JLabel("Địa chỉ");
		lblDC.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDC.setBounds(1335, 92, 198, 35);
		panel_Center_Top.add(lblDC);
		
		JLabel lblTuoi = new JLabel("Tuổi");
		lblTuoi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTuoi.setBounds(96, 92, 70, 35);
		panel_Center_Top.add(lblTuoi);
		
		JLabel lblGioiTinh = new JLabel("Giới tính");
		lblGioiTinh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGioiTinh.setBounds(336, 92, 89, 35);
		panel_Center_Top.add(lblGioiTinh);
		
		comboBox = new JComboBox<Object>();
		comboBox.setBounds(475, 78, 126, 50);
		panel_Center_Top.add(comboBox);
		
		txtTenNV = new JTextField();
		txtTenNV.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTenNV.setColumns(10);
		txtTenNV.setBackground(new Color(55, 149, 128));
		txtTenNV.setBounds(914, 11, 305, 50);
		panel_Center_Top.add(txtTenNV);
		
		txtCCCD = new JTextField();
		txtCCCD.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtCCCD.setColumns(10);
		txtCCCD.setBackground(new Color(55, 149, 128));
		txtCCCD.setBounds(1535, 10, 305, 50);
		panel_Center_Top.add(txtCCCD);
		
		txtTuoi = new JTextField();
		txtTuoi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTuoi.setColumns(10);
		txtTuoi.setBackground(new Color(55, 149, 128));
		txtTuoi.setBounds(173, 78, 126, 50);
		panel_Center_Top.add(txtTuoi);
		
		txtSDT = new JTextField();
		txtSDT.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtSDT.setColumns(10);
		txtSDT.setBackground(new Color(55, 149, 128));
		txtSDT.setBounds(914, 78, 305, 50);
		panel_Center_Top.add(txtSDT);
		
		txtDC = new JTextField();
		txtDC.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtDC.setColumns(10);
		txtDC.setBackground(new Color(55, 149, 128));
		txtDC.setBounds(1535, 77, 305, 50);
		panel_Center_Top.add(txtDC);
		
		btnXoaTrang = new JButton("Xóa trắng");
		btnXoaTrang.setForeground(Color.WHITE);
		btnXoaTrang.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnXoaTrang.setBounds(1720, 150, 190, 50);
		btnXoaTrang.setBackground(new Color(55, 149, 128));
		panel_Center_Top.add(btnXoaTrang);
		
		btnTim = new JButton("Tìm");
		btnTim.setForeground(Color.WHITE);
		btnTim.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnTim.setBounds(1469, 150, 190, 50);
		btnTim.setBackground(new Color(55, 149, 128));
		panel_Center_Top.add(btnTim);
		
		btnThem = new JButton("Thêm");
		btnThem.setForeground(Color.WHITE);
		btnThem.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnThem.setBounds(1222, 150, 190, 50);
		btnThem.setBackground(new Color(55, 149, 128));
		panel_Center_Top.add(btnThem);
		
		JPanel panel_Center_Bot = new JPanel();
		panel_Center_Bot.setBackground(new Color(255, 255, 255));
		panel_Center_Bot.setBounds(1, 348, 1920, 708);

		
		String[] cols = new String[] {"Mã nhân viên", "Họ tên", "Giới tính" , "CCCD", "Vị trí", "Số điện thoại", "Ngày sinh", "Trạng thái","Tổng lương"};


        
        DefaultTableModel model = new DefaultTableModel(cols, 0);
        
		panel_Center_Bot.setLayout(null);
	
	
		JTable tableHD = new JTable(model);
		JScrollPane paneNV = new JScrollPane(tableHD);
		paneNV.setBounds(10, 11, 1882, 669);
		panel_Center_Bot.add(paneNV);
	
		JTableHeader headers = tableHD.getTableHeader();
		Font headerFont = new Font("Tahoma", Font.PLAIN, 20);
		headers.setFont(headerFont);
		headers.setBackground(new Color(55, 149, 128));
		headers.setForeground(Color.WHITE);
		
		tableHD.setFont(new Font("Tahoma", Font.PLAIN, 15));
        firstColumn = tableHD.getColumnModel().getColumn(0);
        firstColumn.setMaxWidth(90);
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment(JLabel.CENTER);
		tableHD.setDefaultRenderer(Object.class, centerRenderer);
        int rowHeight = 30; // Chiều cao mong muốn cho mỗi hàng
        tableHD.setRowHeight(rowHeight);
		Frame.add(panel_Center_Bot);
		
 
		btnQuanLiNhanVien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}
}
