package nmt.ptit;

import java.util.Scanner;

public class bai21 {
	public static Scanner sc = new Scanner(System.in);
	public static boolean ktra(int n) {
		if(n<2) {
			return false;
		}
		int a = (int) Math.sqrt(n);
		for(int i = 2; i <= a ; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static boolean kiemTra1(String so, int n) {
		for(int i = 0; i < n;i++) {
			if(so.charAt(i) != so.charAt(n-i-1)) {
				return false;
			}
		}
		
		return true;
	}
	public static boolean kiemTra2(String so, int n) {
		for(int i = 0; i < n;i++) {
			int ok = Character.getNumericValue(so.charAt(i));
			if(ktra(ok) == false) return false;
		}
		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dem = sc.nextInt();
		while(dem > 0) {
			String so = sc.next();
			int n = so.length();
			if(kiemTra1(so, n) == true && kiemTra2(so, n) == true) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			dem--;
		}
	}
}


