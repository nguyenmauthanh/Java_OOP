package nmt.ptit;

import java.util.Scanner;

public class bai2 {
	
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
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dem;
		dem = sc.nextInt();
		
		while(dem > 0){
		int ok;
		ok = sc.nextInt();
		if(ktra(ok) == true) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
			}
		dem--;
		}
		
	}
}
