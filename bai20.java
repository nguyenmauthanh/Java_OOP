package nmt.ptit;

import java.util.Scanner;

public class bai20 {

public static Scanner sc = new Scanner(System.in);
	
	public static boolean kiemTra1(String so, int n) {
		for(int i = 0; i < n;i++) {
			if(so.charAt(i) != so.charAt(n-i-1)) {
				return false;
			}
		}
		
		return true;
	}
	public static boolean kiemTra2(String so, int n) {
		int tong = 0;
		for(int i = 0; i < n;i++) {
			int ok = Character.getNumericValue(so.charAt(i));
			tong = tong + ok;
		}
		if(tong % 10 == 0)
		return true;
		else return false;
	}
	public static boolean kiemTra3(String so, int n) {
		
		if(so.charAt(0) == '8' && so.charAt(n-1) == '8')
		return true;
		else return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dem = sc.nextInt();
		while(dem > 0) {
			String so = sc.next();
			int n = so.length();
			if(kiemTra1(so, n) == true && kiemTra2(so, n) == true && kiemTra3(so,n) == true) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			dem--;
		}
	}

}
