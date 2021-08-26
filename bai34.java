package nmt.ptit;

import java.util.Scanner;

public class bai34 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int dem = sc.nextInt();
		while(dem > 0) {
			long n = sc.nextLong();
			long tong = n*(n+1)/2 ;
			System.out.println(tong);
			dem--;
		}
	}
}
