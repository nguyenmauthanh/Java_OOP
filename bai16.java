package nmt.ptit;

import java.util.Scanner;

public class bai16 {
	public static Scanner sc= new Scanner(System.in);
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dem = sc.nextInt();
		while(dem > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			long tong1 = 0 ;
			long tong2 = 0;
			for(int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			
			for(int i = 1; i < n; i++) {
				tong1 = tong1 + a[i];
			}
			
			boolean ok = false;
			for(int i = 0,j=1; j < n; j++,i++) {
				tong2 = tong2 + a[i];
				tong1 = tong1 - a[j];
//				System.out.println(tong1 + " " + tong2);
				 
				if(tong1 == tong2) {
					System.out.println(j+1);
					ok = true;
					break;
				}
			}
			if(ok == false) {
				System.out.println(-1);
			}
			dem--;
		}
	}

}
