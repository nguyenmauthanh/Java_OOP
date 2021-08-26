package nmt.ptit;



import java.util.Scanner;

public class bai56 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int t = Integer.parseInt(sc.nextLine());
		for(int i = 1; i <= t; i++) {
			String name = sc.nextLine();
			String code = sc.nextLine();
			String date = sc.nextLine();
			float GPA = Float.parseFloat(sc.nextLine());
			String GPA1 = String.format("%.2f", GPA);
		
			SinhVien sv = new SinhVien(name,code, modify1(date).toString(),GPA1);
			if(i < 10) {
				String ok = "0" + String.valueOf(i);
				sv.Id = ok;
			}
			else {
				String ok = String.valueOf(i);
				sv.Id = ok;
				
			}
			
			System.out.println(sv);
		}
	}
	
	public static StringBuffer modify1(String a) {
		StringBuffer b1 = new StringBuffer(a);
		if(a.charAt(1) == '/') {
			b1.insert(0, "0");
		}
		if(b1.charAt(4) == '/') {
			b1.insert(3, "0");
		}
		return b1;
	}

}
class SinhVien{
	String Id;
	private String name;
	private String code;
	public String date;
	private String GPA;
	public SinhVien(String name, String code, String date, String gPA) {
		
		this.name = name;
		this.code = code;
		this.date = date;
		this.GPA = gPA;
	}
	@Override
	public String toString() {
		return "B20DCCN0" + Id + " " + name + " " + code + " " + date + " " + GPA ;
	}
	
}