package nmt.ptit;

import java.util.Scanner;

public class bai32 {
	public static void main(String []args){
       
		Scanner sc = new Scanner(System.in);
		int dai,rong;
		dai = sc.nextInt();
		rong = sc.nextInt();
		if(dai <= 0 || rong <= 0) {
			System.out.println("0");
		}
		else {
			System.out.println((dai+rong)*2 + " " + dai*rong);
		}

    }
}
