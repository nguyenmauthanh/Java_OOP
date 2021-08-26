package nmt.ptit;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class bai9 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] a = new int[n];
		 Vector<Integer> vec = new Vector<>(n); 
		 for(int i = 0; i < n; i++) {
			 a[i] =sc.nextInt();
		 }
		 for(int i = 0; i < n; i++) {
			 System.out.print("Buoc "+ i + ": ");
			 vec.add(a[i]);
			 Collections.sort(vec);
			 for(int j = 0; j < vec.size();j++) {
				 System.out.print(vec.get(j) + " ");
			 }
			 System.out.println();
		 }
	}

}
