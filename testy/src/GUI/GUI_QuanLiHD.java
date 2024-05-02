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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComponent;

import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

import com.toedter.calendar.JDateChooser;

public class GUI_QuanLiHD extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel Frame;
	private JPanel panel_Center_Top;
	private JLabel lblMahoaDon;
	private JLabel lblMaNhanVien;
	private JComponent lblNgayLap;
	private JTextField txtMaHD;
	private JTextField txtMaNV;
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
                    GUI_QuanLiHD gui = new GUI_QuanLiHD();
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
	public GUI_QuanLiHD() {
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
		btnQLHD.setForeground(Color.GRAY);
		btnQLHD.setBackground(new Color(164, 194, 163));
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
		panel_Center_Top.setBounds(1, 128, 1920, 139);
		Frame.add(panel_Center_Top);
		panel_Center_Top.setLayout(null);
		
		lblMahoaDon = new JLabel("Mã hóa đơn:");
		lblMahoaDon.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMahoaDon.setBounds(96, 25, 126, 35);
		panel_Center_Top.add(lblMahoaDon);
		
		lblMaNhanVien = new JLabel("Mã nhân viên:");
		lblMaNhanVien.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMaNhanVien.setBounds(741, 25, 126, 35);
		panel_Center_Top.add(lblMaNhanVien);
		
		lblNgayLap = new JLabel("Ngày lập hóa đơn:");
		lblNgayLap.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNgayLap.setBounds(1335, 25, 175, 35);
		panel_Center_Top.add(lblNgayLap);
		
		JDateChooser txtDate = new JDateChooser();
		txtDate.setForeground(new Color(255, 255, 255));
		txtDate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtDate.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txtDate.setBounds(1535, 10, 305, 50);
		panel_Center_Top.add(txtDate);
		
		txtMaHD = new JTextField();
		txtMaHD.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtMaHD.setColumns(10);
		txtMaHD.setBackground(Color.WHITE);
		txtMaHD.setBounds(296, 10, 305, 50);
		panel_Center_Top.add(txtMaHD);
		
		txtMaNV = new JTextField();
		txtMaNV.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtMaNV.setColumns(10);
		txtMaNV.setBackground(Color.WHITE);
		txtMaNV.setBounds(914, 10, 305, 50);
		panel_Center_Top.add(txtMaNV);
		
		JButton btnTim = new JButton("Tìm");
		btnTim.setForeground(Color.WHITE);
		btnTim.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnTim.setBounds(1443, 71, 190, 50);
		btnTim.setBackground(new Color(55, 149, 128));
		panel_Center_Top.add(btnTim);
		
		JButton btnXoaTrang = new JButton("Xóa trắng");
		btnXoaTrang.setForeground(Color.WHITE);
		btnXoaTrang.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnXoaTrang.setBounds(1694, 71, 190, 50);
		btnXoaTrang.setBackground(new Color(55, 149, 128));
		panel_Center_Top.add(btnXoaTrang);
		
		JPanel panel = new JPanel();
		panel.setBounds(1, 268, 1936, 783);
		Frame.add(panel);

		String[] cols = new String[] {"Mã Hóa đơn", "Mã nhân viên", "Ngày lập" , "Loại khách hàng","Tổng tiền", "Trạng thái"};


        
        DefaultTableModel model = new DefaultTableModel(cols, 0);
        
        panel.setLayout(null);
	
	
		JTable tableHD = new JTable(model);
		JScrollPane paneNV = new JScrollPane(tableHD);
		paneNV.setBounds(10, 11, 1890, 681);
		panel.add(paneNV);
        firstColumn = tableHD.getColumnModel().getColumn(0);
        firstColumn.setMaxWidth(90);
		JTableHeader headers = tableHD.getTableHeader();
		Font headerFont = new Font("Tahoma", Font.PLAIN, 20);
		headers.setFont(headerFont);
		headers.setBackground(new Color(55, 149, 128));
		headers.setForeground(Color.WHITE);
		
		tableHD.setFont(new Font("Tahoma", Font.PLAIN, 15));
	
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment(JLabel.CENTER);
		tableHD.setDefaultRenderer(Object.class, centerRenderer);
        int rowHeight = 30; // Chiều cao mong muốn cho mỗi hàng
        tableHD.setRowHeight(rowHeight);
 
		btnQuanLiNhanVien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}
}
