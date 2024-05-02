package GUI;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

import ConnectDB.ConnectDB;
import dao.SanPham_Dao;
import entity.SanPham_entity;

import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;




public class GUI_Banhang_update1 extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel Frame;
	private JTextField txtSDT;
	private JTextField textField_1;
	private JTextField txtTienKH;
	private JTable tableHD;
	private JComboBox<String> cbLoaiKH;
	private JTextField textField;
	private DefaultTableModel modelHD;
	private JButton btn1000;
	private JTextField textField_2;
	private TableColumn firstColumn;
	private int tienKhachDua;
	private JLabel lblKhuyenmai;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	    EventQueue.invokeLater(new Runnable() {
	        public void run() {
	            try {
	                // Tạo một đối tượng GUI_BanHang và hiển thị nó
	                GUI_Banhang_update1 gui = new GUI_Banhang_update1();
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
	public GUI_Banhang_update1() {
	
		setTitle("Quản lí bán hàng");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,1920,1000);
		setLocationRelativeTo(null);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
        Frame = new JPanel();
        Frame.setBorder(new EmptyBorder(5, 5, 5, 5));
        Frame.setBackground(new Color(255, 255, 255));
        Frame.setLayout(null);
		setContentPane(Frame);
		
		
		try {
			ConnectDB.getInstance().connect();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		SanPham_Dao sanPham_Dao = new SanPham_Dao();
		ArrayList<SanPham_entity> dsSP = sanPham_Dao.getalltbKhachHang();
		for (int i = 0; i < dsSP.size(); i++) {
			System.out.println(dsSP.get(i).getMaSP());
		}
		
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
		btnBanHang.setForeground(Color.GRAY);
		btnBanHang.setBackground(new Color(164, 194, 163));
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
		
		JPanel pCenterRight = new JPanel();
		pCenterRight.setBounds(1336, 141, 600, 1000);
		Frame.add(pCenterRight);
		pCenterRight.setLayout(null);
		
	    txtSDT = new JTextFieldWithPlaceholder("Số điện thoại khách hàng");
		txtSDT.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtSDT.setBounds(26, 15, 531, 50);
		pCenterRight.add(txtSDT);
		txtSDT.setColumns(10);
		
		JPanel panel = new JPanel();
		pCenterRight.setBorder(border2);
		pCenterRight.add(panel);
		panel.setBounds(10, 128, 547, 2);
		pCenterRight.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		panel.setBorder(border1);
		
		JLabel lblNewLabel = new JLabel("Tổng tiền hàng:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(40, 150, 245, 50);
		pCenterRight.add(lblNewLabel);
		
		JLabel lblTongTien = new JLabel("0");
		lblTongTien.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTongTien.setBounds(285, 150, 245, 50);
		pCenterRight.add(lblTongTien);
		
		JLabel lblGimGi = new JLabel("Giảm giá");
		lblGimGi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGimGi.setBounds(40, 211, 245, 50);
		pCenterRight.add(lblGimGi);
		
		lblKhuyenmai = new JLabel("00%");
		lblKhuyenmai.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblKhuyenmai.setBounds(285, 210, 245, 50);
		cbLoaiKH = new JComboBox<String>();
		cbLoaiKH.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cbLoaiKH.addItem("Khách hàng thường");
		cbLoaiKH.addItem("Khách hàng VIP1");
		cbLoaiKH.addItem("Khách hàng VIP2");
		cbLoaiKH.addItemListener(new ItemListener() {
		    public void itemStateChanged(ItemEvent e) {
		        if (e.getStateChange() == ItemEvent.SELECTED) {
		            String selectedItem = (String) cbLoaiKH.getSelectedItem();
		            if (selectedItem.equals("Khách hàng thường")) {
		                lblKhuyenmai.setText("0%");
		            }
		            if (selectedItem.equals("Khách hàng VIP1")) {
		                lblKhuyenmai.setText("5%");
		            }
		            if (selectedItem.equals("Khách hàng VIP2")) {
		                lblKhuyenmai.setText("10%");
		            }
		        }
		    }
		});

		
		cbLoaiKH.setBounds(26, 67, 531, 50);
		pCenterRight.add(cbLoaiKH);
		pCenterRight.add(lblKhuyenmai);
		
		JLabel lblTinKhcha = new JLabel("Tiền khách đưa");
		lblTinKhcha.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTinKhcha.setBounds(40, 270, 245, 50);
		pCenterRight.add(lblTinKhcha);
		
		txtTienKH = new JTextField();
		txtTienKH.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTienKH.setColumns(10);
		txtTienKH.setBounds(285, 275, 210, 50);
		pCenterRight.add(txtTienKH);
		
		JButton btnXoaTrang = new JButton("");
		btnXoaTrang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTienKH.setText("");
				tienKhachDua = 0;
			}
		});
		btnXoaTrang.setBounds(505, 275, 53, 50);
		pCenterRight.add(btnXoaTrang);
		
		btn1000 = new JButton("1.000.000");
		btn1000.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn1000.setBounds(451, 396, 123, 50);
		pCenterRight.add(btn1000);
		tienKhachDua = 0 ;
		txtTienKH.setText(tienKhachDua + "");
		btn1000.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        tienKhachDua += 1000000;
		        DecimalFormat decimalFormat = new DecimalFormat("#,##0");
		        String formattedTienKhachDua = decimalFormat.format(tienKhachDua);
		        txtTienKH.setText(formattedTienKhachDua);
		    }
		});

		
		JButton btb500 = new JButton("500.000");
		btb500.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btb500.setBounds(310, 396, 123, 50);
		pCenterRight.add(btb500);
		
		btb500.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        tienKhachDua += 500000;
		        DecimalFormat decimalFormat = new DecimalFormat("#,##0");
		        String formattedTienKhachDua = decimalFormat.format(tienKhachDua);
		        txtTienKH.setText(formattedTienKhachDua);
			}
		});
		
		JButton btn300 = new JButton("300.000");
		btn300.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn300.setBounds(168, 392, 123, 50);
		pCenterRight.add(btn300);
		
		btn300.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        tienKhachDua += 300000;
		        DecimalFormat decimalFormat = new DecimalFormat("#,##0");
		        String formattedTienKhachDua = decimalFormat.format(tienKhachDua);
		        txtTienKH.setText(formattedTienKhachDua);
			}
		});
		
		JButton btn200 = new JButton("200.000");
		btn200.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn200.setBounds(26, 391, 123, 50);
		pCenterRight.add(btn200);
		
		btn200.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        tienKhachDua += 200000;
		        DecimalFormat decimalFormat = new DecimalFormat("#,##0");
		        String formattedTienKhachDua = decimalFormat.format(tienKhachDua);
		        txtTienKH.setText(formattedTienKhachDua);
			}
		});
		
		JButton btn10 = new JButton("10.000");
		btn10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn10.setBounds(26, 331, 123, 50);
		pCenterRight.add(btn10);
		
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        tienKhachDua += 10000;
		        DecimalFormat decimalFormat = new DecimalFormat("#,##0");
		        String formattedTienKhachDua = decimalFormat.format(tienKhachDua);
		        txtTienKH.setText(formattedTienKhachDua);
			}
		});
		
		JButton btn20 = new JButton("20.000");
		btn20.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn20.setBounds(168, 332, 123, 50);
		pCenterRight.add(btn20);
		
		btn20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        tienKhachDua += 20000;
		        DecimalFormat decimalFormat = new DecimalFormat("#,##0");
		        String formattedTienKhachDua = decimalFormat.format(tienKhachDua);
		        txtTienKH.setText(formattedTienKhachDua);
			}
		});
		
		JButton btn50 = new JButton("50.000");
		btn50.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn50.setBounds(310, 336, 123, 50);
		pCenterRight.add(btn50);
		
		btn50.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        tienKhachDua += 50000;
		        DecimalFormat decimalFormat = new DecimalFormat("#,##0");
		        String formattedTienKhachDua = decimalFormat.format(tienKhachDua);
		        txtTienKH.setText(formattedTienKhachDua);
			}
		});
		
		JButton btn100 = new JButton("100.000");
		btn100.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn100.setBounds(451, 336, 123, 50);
		pCenterRight.add(btn100);
		
		btn100.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        tienKhachDua += 100000;
		        DecimalFormat decimalFormat = new DecimalFormat("#,##0");
		        String formattedTienKhachDua = decimalFormat.format(tienKhachDua);
		        txtTienKH.setText(formattedTienKhachDua);
			}
		});
		
		JLabel lblTinThi = new JLabel("Tiền thối");
		lblTinThi.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblTinThi.setBounds(40, 461, 245, 50);
		pCenterRight.add(lblTinThi);
		
		JLabel lblTienThoi = new JLabel("0");
		lblTienThoi.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblTienThoi.setBounds(285, 461, 245, 50);
		pCenterRight.add(lblTienThoi);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 521, 547, 2);
		pCenterRight.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JButton btnLuutam = new JButton("Lưu tạm");
		btnLuutam.setForeground(Color.WHITE);
		btnLuutam.setBackground(new Color(55, 149, 128));
		btnLuutam.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnLuutam.setBounds(14, 545, 175, 148);
		pCenterRight.add(btnLuutam);
		
		JButton btnThanToan = new JButton("Thanh Toán");
		btnThanToan.setForeground(Color.WHITE);
		btnThanToan.setBackground(new Color(55, 149, 128));
		btnThanToan.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnThanToan.setBounds(14, 790, 558, 75);
		pCenterRight.add(btnThanToan);
		
		JButton btnXLDT = new JButton("Xữ lí hóa đơn lưu tạm");
		btnXLDT.setForeground(Color.WHITE);
		btnXLDT.setBackground(new Color(55, 149, 128));
		btnXLDT.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnXLDT.setBounds(14, 704, 558, 75);
		pCenterRight.add(btnXLDT);
		
		btnXLDT.addActionListener(new ActionListener() {
			private JFrame frame;

			public void actionPerformed(ActionEvent e) {
                GUI_HDLuuTam gui = new GUI_HDLuuTam();
                gui.setVisible(true);

                // Thêm GUI_BanHang vào frame
                frame.getContentPane().add(gui);

                // Hiển thị frame
                frame.setVisible(true);
			}
		});

		panel_1.setBorder(border1);
		
		JButton btnHuyPhieu = new JButton("Hủy phiếu");
		btnHuyPhieu.setForeground(Color.WHITE);
		btnHuyPhieu.setBackground(new Color(55, 149, 128));
		btnHuyPhieu.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnHuyPhieu.setBounds(206, 545, 175, 148);
		pCenterRight.add(btnHuyPhieu);
		
		JButton btnKetToan = new JButton("Kết toán");
		btnKetToan.setForeground(Color.WHITE);
		btnKetToan.setBackground(new Color(55, 149, 128));
		btnKetToan.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnKetToan.setBounds(400, 545, 175, 148);
		pCenterRight.add(btnKetToan);
		
		JPanel pCenterLetf = new JPanel();
		pCenterLetf.setBounds(1, 140, 1330, 1080);
		Frame.add(pCenterLetf);
		pCenterLetf.setBorder(border2);
		pCenterLetf.setLayout(null);
		String[] cols = new String[] {"STT", "Mã sản phẩm", "Tên sản phẩm", "Gía ", "Số lượng", "Tổng tiền"};
       
        
        modelHD = new DefaultTableModel(cols, 0);
        modelHD.addRow(new Object[] {1, "SP001", "Sản phẩm 1", 100000, 100000});
	
		pCenterLetf.setLayout(null);
		JTable tableHD = new JTable(modelHD);
		JScrollPane paneNV = new JScrollPane(tableHD);
		paneNV.setBounds(10, 77, 1295, 792);
		pCenterLetf.add(paneNV);
	
		JTableHeader headers = tableHD.getTableHeader();
		Font headerFont = new Font("Tahoma", Font.PLAIN, 25);
		headers.setFont(headerFont);
	
		tableHD.setFont(new Font("Tahoma", Font.PLAIN, 20));
	
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment(JLabel.CENTER);
		tableHD.setDefaultRenderer(Object.class, centerRenderer);
        int rowHeight = 30; // Chiều cao mong muốn cho mỗi hàng
        tableHD.setRowHeight(rowHeight);
        
        textField = new JTextField();
        textField.setBounds(190, 15, 305, 50);
        pCenterLetf.add(textField);
        textField.setColumns(10);
        firstColumn = tableHD.getColumnModel().getColumn(0);
        firstColumn.setMaxWidth(90);
        JButton btnThem = new JButton("Thêm");
        btnThem.setBackground(new Color(55, 149, 128));
        btnThem.setForeground(Color.WHITE);
        btnThem.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnThem.setBounds(1051, 17, 220, 49);
        pCenterLetf.add(btnThem);
        
        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(690, 15, 305, 50);
        pCenterLetf.add(textField_2);
        
        JLabel lblMSnPhm = new JLabel("Mã sản phẩm");
        lblMSnPhm.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblMSnPhm.setBounds(10, 11, 245, 50);
        pCenterLetf.add(lblMSnPhm);
        
        JLabel lblSLng = new JLabel("Số lượng");
        lblSLng.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblSLng.setBounds(543, 11, 245, 50);
        pCenterLetf.add(lblSLng);
    	
}
	private class JTextFieldWithPlaceholder extends JTextField implements FocusListener {
        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private String placeholder;
        private boolean isPlaceholderVisible;

        public JTextFieldWithPlaceholder(String placeholder) {
            this.placeholder = placeholder;
            this.isPlaceholderVisible = true;
            addFocusListener(this);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            if (isPlaceholderVisible && getText().isEmpty() && !isFocusOwner()) {
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setColor(Color.GRAY);
                g2.setFont(getFont().deriveFont(Font.ITALIC));
                int x = getInsets().left;
                int y = g.getFontMetrics().getMaxAscent() + getInsets().top;
                g2.drawString(placeholder, x, y);
                g2.dispose();
            }
        }

        @Override
        public void focusGained(FocusEvent e) {
            if (isPlaceholderVisible) {
                isPlaceholderVisible = false;
                repaint();
            }
        }
        
        @Override
        public void focusLost(FocusEvent e) {
            if (getText().isEmpty()) {
                isPlaceholderVisible = true;
                repaint();
            }
        }
    }
	private class QuantityCellEditor extends DefaultCellEditor {
        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private JButton button;
        private int quantity;

        public QuantityCellEditor() {
            super(new JTextField());
            button = new JButton("+");
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Tăng số lượng khi nút '+' được nhấn
                    quantity++;
                    fireEditingStopped();
                }
            });
        }

        public Component getTableCellEditorComponent(JTable table, Object value,
                                                     boolean isSelected, int row, int column) {
            quantity = (Integer) value;
            return button;
        }

        public Object getCellEditorValue() {
            return quantity;
        }
    }

}
