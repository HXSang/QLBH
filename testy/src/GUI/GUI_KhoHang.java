package GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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

import ConnectDB.ConnectDB;
import dao.SanPham_Dao;
import entity.SanPham_entity;

public class GUI_KhoHang extends JFrame implements MouseListener,ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel Frame;
	private JTextField txtMaSP;
	private JTextField txtTenSP;
	private JTextField txtNhaCC;
	private static DefaultTableModel model;
	private TableColumn firstColumn;
	private JButton btnTm;
	private ArrayList<SanPham_entity> dsSP;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	    EventQueue.invokeLater(new Runnable() {
	        public void run() {
	            try {
	                // Tạo một đối tượng GUI_BanHang và hiển thị nó
	                GUI_KhoHang gui = new GUI_KhoHang();
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
	public GUI_KhoHang() {
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
		
		try {
			ConnectDB.getInstance().connect();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		SanPham_Dao sanPham_Dao = new SanPham_Dao();
		dsSP = sanPham_Dao.getalltbKhachHang();
		for (int i = 0; i < dsSP.size(); i++) {
			System.out.println(dsSP.get(i).getMaSP());
		}
				
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
		btnKho.setForeground(Color.GRAY);
		btnKho.setBackground(new Color(164, 194, 163));
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
		
		JPanel panelCenter = new JPanel();
		panelCenter.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelCenter.setBounds(1, 129, 1921, 83);
		Frame.add(panelCenter);
		panelCenter.setLayout(null);
		
		JLabel lblMaSP = new JLabel("Mã sản phẩm:");
		lblMaSP.setBounds(56, 31, 142, 25);
		lblMaSP.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panelCenter.add(lblMaSP);
		
		txtMaSP = new JTextField();
		txtMaSP.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtMaSP.setColumns(10);
		txtMaSP.setBounds(256, 19, 305, 50);
		panelCenter.add(txtMaSP);
		
		JLabel lblTenSP = new JLabel("Tên sản phẩm:");
		lblTenSP.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTenSP.setBounds(606, 31, 142, 25);
		panelCenter.add(lblTenSP);
		
		txtTenSP = new JTextField();
		txtTenSP.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTenSP.setColumns(10);
		txtTenSP.setBounds(806, 19, 305, 50);
		panelCenter.add(txtTenSP);
		
		JLabel lblMaSP_1_1 = new JLabel("Nhà cung cấp");
		lblMaSP_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMaSP_1_1.setBounds(1156, 31, 142, 25);
		panelCenter.add(lblMaSP_1_1);
		
		txtNhaCC = new JTextField();
		txtNhaCC.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtNhaCC.setColumns(10);
		txtNhaCC.setBounds(1356, 19, 305, 50);
		panelCenter.add(txtNhaCC);
		
		btnTm = new JButton("Tìm");
		btnTm.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnTm.setBounds(1738, 19, 123, 50);
		btnTm.setBackground(new Color(55, 149, 128));
		panelCenter.add(btnTm);
		
		JPanel panelBot = new JPanel();
		panelBot.setBounds(1, 210, 1920, 866);
		Frame.add(panelBot);
		panelBot.setLayout(null);
		
		String[] cols = new String[] {"STT", "Mã sản phẩm", "Tên sản phẩm", "Chủng loại ", "Nhà cung cấp","Ngày sản xuất", "Hạn sữ dụng", "Giá nhập ", "Gía bán", "Số lượng"};
       
        
        model = new DefaultTableModel(cols, 0);

	

		JTable tableHD = new JTable(model);
		JScrollPane paneNV = new JScrollPane(tableHD);
		paneNV.setBounds(0, 11, 1920, 792);
		panelBot.add(paneNV);
		
		JTableHeader headers = tableHD.getTableHeader();
		Font headerFont = new Font("Tahoma", Font.PLAIN, 25);
		headers.setFont(headerFont);
		headers.setBackground(new Color(55, 149, 128));
		tableHD.setFont(new Font("Tahoma", Font.PLAIN, 20));
		headers.setForeground(Color.WHITE);
        firstColumn = tableHD.getColumnModel().getColumn(0);
        firstColumn.setMaxWidth(90);
		
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment(JLabel.CENTER);
		tableHD.setDefaultRenderer(Object.class, centerRenderer);
        int rowHeight = 30; // Chiều cao mong muốn cho mỗi hàng
        tableHD.setRowHeight(rowHeight);
     // Lấy cột đầu tiên
		
		btnTm.addActionListener(this);
		
		updateModel(dsSP);
	}
	public static void updateModel(ArrayList<SanPham_entity> dssp) {
 		model.setRowCount(0);
 		DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
 		for (int i=0; i < dssp.size();i++) {
 			SanPham_entity sp = dssp.get(i);
 		    // Tạo một mảng chứa dữ liệu của từng đối tượng NhanVien
 		    Object[] rowData = new Object[] { 
 		    i,
 		    sp.getMaSP(),
 		    sp.getTenSP(),
 		    sp.getChungLoai(),
 		    sp.getNhaSanXuat(),
 		    sp.getNgaySX().toString(),
 		    sp.getHanSD(),
 		    sp.getGiaNhap(),
 		    sp.getGiaBan(),
 		    sp.getSoLuong()
 		    };
 		    model.addRow(rowData);
 		}	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		if(obj.equals(btnTm)) {
			SanPham_entity sp = new SanPham_entity();
    		sp.setMaSP(txtMaSP.getText().toString());
    	    sp.setTenSP(txtTenSP.getText().toString());
    	    sp.setNhaSanXuat(txtNhaCC.getText().toString());
    	    ArrayList<SanPham_entity> dsTrung = new ArrayList<SanPham_entity>();
    	    dsTrung=timKiemNhanVien(sp);
    	    if(dsTrung.isEmpty()) {
    	    	JOptionPane.showMessageDialog(null, "Không tìm thấy sản phẩm");
    	    }else {
    	    	updateModel(dsTrung);
    	    }
    	    
			
			// Xử lý khi nhấn vào nút btnTim
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public ArrayList<SanPham_entity> timKiemNhanVien(SanPham_entity sp) {
	    ArrayList<SanPham_entity> dsTrung = new ArrayList<SanPham_entity>();
	    int cl = 0;
	    for (SanPham_entity sanp:dsSP) {
			if(sp.getMaSP()!=null&&sp.getMaSP().contains(sanp.getMaSP())) {
				dsTrung.add(dsSP.get(dsSP.indexOf(sanp)));
				continue;
			}
			if(sp.getTenSP()!=null&&sp.getTenSP().contains(sanp.getTenSP())) {
				dsTrung.add(dsSP.get(dsSP.indexOf(sanp)));
				continue;
			}
			if(sp.getNgaySX()!=null&&!sp.getNhaSanXuat().contains(sanp.getNhaSanXuat())) {
				dsTrung.add(dsSP.get(dsSP.indexOf(sanp)));
				continue;
			}
			
			// Add the current NhanVien object to the list
			
	    }
	    return dsTrung;
	}
	

		    // Thêm hàng mới vào mô hình với dữ liệu từ đối tượng NhanVien
	

	
	
}
