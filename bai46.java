package nmt.ptit;

import java.util.Scanner;

public class bai46 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String ten = sc.nextLine();
		String gioiTinh = sc.nextLine();
		String namSinh = sc.nextLine();
		String diaChi = sc.nextLine();
		String dienThoai = sc.nextLine();
		String hopDong = sc.nextLine();
		NhanVien nv = new NhanVien(ten,gioiTinh,namSinh,diaChi,dienThoai, hopDong);
		System.out.println(nv);

	}

}
class NhanVien {
	private String ten;
	private String gioiTinh;
	private String namSinh;
	private String diaChi;
	private String dienThoai;
	private String hopDong;
	public NhanVien(String ten, String gioiTinh, String namSinh, String diaChi, String dienThoai, String hopDong) {
		this.ten = ten;
		this.gioiTinh = gioiTinh;
		this.namSinh = namSinh;
		this.diaChi = diaChi;
		this.dienThoai = dienThoai;
		this.hopDong = hopDong;
	}
	@Override
	public String toString() {
		return "00001 " + ten + " " + gioiTinh + " " + namSinh + " " + diaChi + " " + dienThoai + " " + hopDong ;
	}
	
}