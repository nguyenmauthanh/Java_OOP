package nmt.ptit;

import java.util.Scanner;

public class bai35 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int t =  sc.nextInt();
		while(t>0) {
			int n = sc.nextInt();
			int h = sc.nextInt();
			for(int i = 1; i < n;i++) {
				System.out.printf("%.6f ",
	                    Math.sqrt(i / (n * 1.0 )) * h);
			}
			t--;
			System.out.println();
		}

	}

}
