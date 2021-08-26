package nmt.ptit;

import java.util.Scanner;

public class bai11 {
	private static Scanner sc = new Scanner(System.in);
	
	public static long USCLN(long a, long b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }
	public static long BSCNN(long a, long b) {
        return (long)(a * b) / USCLN(a, b);
    }
	public static void main(String[] args) {
		
		int dem = sc.nextInt();
		while(dem > 0) {
			long a = sc.nextInt();
			long b = sc.nextInt();
			
			System.out.println(BSCNN(a, b) + " " + USCLN(a, b));
			dem--;
		}

	}

}
