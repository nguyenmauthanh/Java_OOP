package nmt.ptit;

import java.util.Scanner;

public class bai4 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int k = 1; k <= t; k++) {
            int n = input.nextInt();
            System.out.printf("Test " + k + ": ");
            for (int i = 2; i <= Math.sqrt(n); i++) {
                int dem = 0;
                while (n % i == 0) {
                    dem++;
                    n /= i;
                }
                if(dem != 0)
                    System.out.printf(i + "(" + dem + ") ");
            }
            if(n != 1)
                System.out.printf(n + "(" + 1 + ")");
            System.out.println();
        }
    }

}
