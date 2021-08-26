package nmt.ptit;

import java.util.Scanner;

public class bai19 {
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
		for(int i = 0; i < n;i++) {
			int ok = Character.getNumericValue(so.charAt(i));
			if(ok % 2 == 1) {
				return false;
			}
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
