package nmt.ptit;

import java.util.Arrays;
import java.util.Scanner;

public class bai51 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dem = sc.nextInt();
		while(dem-- > 0) {
			int n = sc.nextInt();
			long[] a = new long[n];
			for(int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
				a[i] = a[i]*a[i];
			}
			Arrays.sort(a);
			boolean check = false; 
			for(int i = n-1 ; i >= 2 ; i--) {
				int l = 0;
				int r = i-1;
				check  = false;
				while(l < r) {
					if(a[l] + a[r] == a[i]) {
						check = true;
						break;
					}
					else if(a[l] + a[r] < a[i]) {
						l++;
					}
					else if(a[l] + a[r] > a[i]) {
						r--;
					}
				}
				if(check == true) {
					System.out.println("YES");
					break;
				}
			}
			if(check == false) System.out.println("NO");
		}
	}

}
