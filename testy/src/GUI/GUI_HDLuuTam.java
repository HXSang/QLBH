package GUI;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class GUI_HDLuuTam extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel Frame;
	private JTextField textField;
	private DefaultTableModel model;
	private TableColumn firstColumn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	    EventQueue.invokeLater(new Runnable() {
	        public void run() {
	            try {
	                // Tạo một đối tượng GUI_BanHang và hiển thị nó
	            	GUI_HDLuuTam gui =new GUI_HDLuuTam();
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
	public GUI_HDLuuTam() {
		setTitle("Quản lí bán hàng");
		setBounds(0,0,848,500);
		setLocationRelativeTo(null);
        Frame = new JPanel();
		setContentPane(Frame);
		Frame.setLayout(null);
		
		JPanel panelTop = new JPanel();
		panelTop.setBounds(0, 0, 832, 56);
		Frame.add(panelTop);
		panelTop.setLayout(null);
		
		JLabel lblSinThoi = new JLabel("Số điện thoại:");
		lblSinThoi.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblSinThoi.setBounds(53, 11, 193, 34);
		panelTop.add(lblSinThoi);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField.setColumns(10);
		textField.setBounds(278, 9, 326, 39);
		panelTop.add(textField);
		
		JButton btnTim = new JButton("Tìm");
		btnTim.setForeground(Color.WHITE);
		btnTim.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnTim.setBackground(new Color(55, 149, 128));
		btnTim.setBounds(676, 11, 146, 39);
		panelTop.add(btnTim);
		
		JPanel panelBot = new JPanel();
		panelBot.setBounds(0, 56, 832, 405);
		Frame.add(panelBot);
		panelBot.setLayout(null);
		String[] cols = new String[] {"STT", "Mã hóa đơn", "SDT", "Tổng tiền", "Ngày lập",};
       
        
        model = new DefaultTableModel(cols, 0);

	

		JTable tableHD = new JTable(model);
		JScrollPane paneNV = new JScrollPane(tableHD);
		paneNV.setBounds(10, 11, 812, 383);
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
