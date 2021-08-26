package nmt.ptit;

import java.util.Arrays;
import java.util.Scanner;

public class bai6 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int dem1 = 1;
		int dem = sc.nextInt();
		while(dem > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			int a1[] = new int[100000];
			Arrays.fill(a1, 0);
			for(int i = 0; i < n ;i++) {
				a[i] = sc.nextInt();
				a1[a[i]]++;
			}
			int a2[] = new int[100000];
			Arrays.fill(a2, 0);
			
			System.out.println("Test " +dem1 + ":\n" );
			dem1++;
			for(int i = 0; i < n;i++) {
				a2[a[i]]++;
				if(a2[a[i]] > 1) {
					continue;
				}
				else if(a2[a[i]] == 1) {
					System.out.println(a[i] + " xuat hien " + a1[a[i]] + " lan\n");
				}
			}
			dem--;
		}

	}

}
