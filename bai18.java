package nmt.ptit;

import java.util.Scanner;

public class bai18 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int dem = sc.nextInt();
		int dem1 = 1;
		while(dem>0) {
		    
			int n = sc.nextInt();
			int m = sc.nextInt();
			long a[][] = new long[n][m];
			for(int i = 0; i < n;i++) {
				for(int j = 0; j < m; j++) {
					a[i][j] = sc.nextLong();
				}
			}
			long b[][] = new long[m][n];
			for(int i = 0; i < m; i++) {
				for(int j = 0; j < n;j++) {
					b[i][j] = a[j][i];
				}
			}
			long c[][] = new long[n][n];
			for(int i = 0; i < n ; i++) {
				for(int j = 0; j < n;j++) {
					c[i][j] = 0;
					for(int k = 0; k < m;k++) {
						c[i][j] += a[i][k]*b[k][j];
					}
				}
			}
			System.out.println("Test " + dem1 + ": ");
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					System.out.print(c[i][j] + " ");
				}
				System.out.println();
			}
			dem1++;
			dem--;
		}
	}

}
