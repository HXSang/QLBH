package entity;

import java.time.LocalDate;
import java.util.Objects;

public class SanPham_entity {
	String maSP;
	String tenSP;
	LocalDate ngaySX;
	LocalDate hanSD;
	String DonViTinh;
	float giaNhap;
	int soLuong;
	String chungLoai;
	String nhaSanXuat;
	float giaBan;
	public SanPham_entity() {
		super();
	}

	public SanPham_entity(String maSP, String tenSP,String chungLoai,String nhaSanXuat, LocalDate ngaySX, LocalDate hanSD, String donViTinh, float giaNhap,float giaBan,
			int soLuong) {
		super();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.ngaySX = ngaySX;
		this.hanSD = hanSD;
		DonViTinh = donViTinh;
		this.giaNhap = giaNhap;
		this.soLuong = soLuong;
		this.chungLoai = chungLoai;
		this.giaBan = giaBan;
		this.nhaSanXuat = nhaSanXuat;
	}

	public String getMaSP() {
		return maSP;
	}

	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}

	public String getTenSP() {
		return tenSP;
	}

	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}

	public LocalDate getNgaySX() {
		return ngaySX;
	}

	public void setNgaySX(LocalDate ngaySX) {
		this.ngaySX = ngaySX;
	}

	public LocalDate getHanSD() {
		return hanSD;
	}

	public void setHanSD(LocalDate hanSD) {
		this.hanSD = hanSD;
	}

	public String getDonViTinh() {
		return DonViTinh;
	}

	public void setDonViTinh(String donViTinh) {
		DonViTinh = donViTinh;
	}

	public float getGiaNhap() {
		return giaNhap;
	}

	public void setGiaNhap(float giaNhap) {
		this.giaNhap = giaNhap;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public String getChungLoai() {
		return chungLoai;
	}

	public void setChungLoai(String chungLoai) {
		this.chungLoai = chungLoai;
	}

	public String getNhaSanXuat() {
		return nhaSanXuat;
	}

	public void setNhaSanXuat(String nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}

	public float getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(float giaBan) {
		this.giaBan = giaBan;
	}

	@Override
	public int hashCode() {
		return Objects.hash(DonViTinh, chungLoai, giaBan, giaNhap, hanSD, maSP, ngaySX, nhaSanXuat, soLuong, tenSP);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SanPham_entity other = (SanPham_entity) obj;
		return Objects.equals(DonViTinh, other.DonViTinh) && Objects.equals(chungLoai, other.chungLoai)
				&& Float.floatToIntBits(giaBan) == Float.floatToIntBits(other.giaBan)
				&& Float.floatToIntBits(giaNhap) == Float.floatToIntBits(other.giaNhap)
				&& Objects.equals(hanSD, other.hanSD) && Objects.equals(maSP, other.maSP)
				&& Objects.equals(ngaySX, other.ngaySX) && Objects.equals(nhaSanXuat, other.nhaSanXuat)
				&& soLuong == other.soLuong && Objects.equals(tenSP, other.tenSP);
	}


	
}
