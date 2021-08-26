package nmt.ptit;

import java.util.Scanner;

public class bai10 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int check;
		for(int i = 0; i < n-1;i++){
			check = 0;
			for(int j = 0;j < n-1;j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    check = 1;
				}
			}
			if(check == 1) {
				System.out.print("Buoc " + (i+1) + ": ");
				for(int k = 0; k < n; k++) {
					System.out.print(a[k] + " ");
				}
			}
			System.out.println();
		}
	}
}
