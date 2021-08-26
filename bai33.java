package nmt.ptit;

import java.util.Scanner;

public class bai33 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		if(a == 0 && b == 0) {
			System.out.println("VSN");
		}
		else if(a==0 && b != 0) {
			System.out.println("VN");
		}
		else {
			float c = (float) b*(-1)/ (float) a;
			System.out.printf("%.2f", c);
		}
	}
}
