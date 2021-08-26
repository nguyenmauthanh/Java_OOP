package nmt.ptit;

import java.util.Scanner;

public class bai3 {
	public static long fibo(int n) {
		long f0 = 0;
		long f1 = 1;
		long fn = 1;
		
		for(int i =2; i< n; i++) {
			f0 = f1;
			f1 = fn;
			fn = f0 + f1;
		}
		return fn;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int dem;
		dem = sc.nextInt();
		while(dem > 0) {
			int n;
			n = sc.nextInt();
			if(n==1) {
				System.out.println("1");
			}
			else if(n == 2) {
				System.out.println("1");
			}else {
				System.out.println(fibo(n));
			}
			dem--;
		}
	}

}
