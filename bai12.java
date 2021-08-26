package nmt.ptit;

import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int k = 1; k <= t; k++) {
            int n = sc.nextInt();
            int res = 0;
            if (n % 2 == 0) {
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        if (i % 2 == 0) res++;
                        if ((n / i) % 2 == 0) res++;
                    }
                }
                double temp = Math.sqrt(n);
                if (temp - Math.floor(temp) == 0) {
                    res--;
                }
                res++;
            }
            System.out.println(res);
        }
    }
}
