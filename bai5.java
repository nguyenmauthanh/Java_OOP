package nmt.ptit;

import java.util.Scanner;

public class bai5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dem;
		dem = sc.nextInt();
		while(dem > 0) {
			int n;
			n = sc.nextInt();
			int a[] = new int[n];
			for(int i = 0; i < n;i++) {
				a[i] = sc.nextInt();
			}
			int ok  = 1;
			for(int i = 0; i < n/2 ; i++) {
				if(a[i] != a[n-i-1]) {
					ok = 0;
					break;
				}
			}
			if(ok == 0) {
				System.out.println("NO");
			}
			else {
				System.out.println("YES");
			}
			dem--;
		}
	}
}
