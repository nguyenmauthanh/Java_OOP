package nmt.ptit;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class bai27 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test = Integer.parseInt(sc.nextLine());
		while(test > 0) {
			String a = sc.nextLine();
			String a2 = sc.nextLine();
			String[] a1 = a.split(" ");	
			Set<String> a3 = new TreeSet<>();
			for(int i = 0; i < a1.length;i++) {
				if(a2.contains(a1[i]) == false) {
				 a3.add(a1[i]);
				}
			}
			for(String a123 : a3) {
				System.out.printf(a123 + " ");
			}
			test--;
			System.out.println();
		}
	}

}
