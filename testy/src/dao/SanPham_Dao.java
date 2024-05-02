package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;


import entity.SanPham_entity;

public class SanPham_Dao {
	public SanPham_Dao() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<SanPham_entity> getalltbKhachHang(){
		ArrayList<SanPham_entity> dsSP = new ArrayList<SanPham_entity>();
		try {
			ConnectDB.ConnectDB.getInstance();
			Connection con = ConnectDB.ConnectDB.getConnection();
			String sql = "Select * from SanPham";
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()) {
			    String maSP = rs.getString(1);
			    String tenSP = rs.getString(2);
			    String chungLoai = rs.getString(3);
			    String nhaSanXuat = rs.getString(4);
			    LocalDate ngaySX = rs.getDate(5).toLocalDate();
			    LocalDate hanSD = rs.getDate(6).toLocalDate();
			    String DonViTinh = rs.getString(7);
			    int giaNhap = rs.getInt(8);
			    int soLuong = rs.getInt(10);
			    float giaBan = rs.getFloat(9);
                SanPham_entity sp = new SanPham_entity(maSP, tenSP,chungLoai,nhaSanXuat, ngaySX, hanSD, DonViTinh, giaNhap,giaBan, soLuong);
				dsSP.add(sp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dsSP;
	}
}
