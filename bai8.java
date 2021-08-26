package nmt.ptit;

import java.util.Scanner;

public class bai8 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n;i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < n-1;i++) {
			int min_i = i;
			for(int j = i+1; j < n;j++) {
				if(a[j] < a[min_i]) {
					min_i  = j;
				}
			}
			int temp = a[min_i];
            a[min_i] = a[i];
            a[i] = temp;
            System.out.print("Buoc " +  (i+1) + ": ");
            for(int k = 0; k < n; k++) {
            	System.out.print(a[k] + " ");
            }
            System.out.println();
		}
	}

}
