package nmt.ptit;

import java.util.Scanner;

public class bai14 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long ans = 1;
            for (long i = 1; i <= n; ++i) {
                ans = lcm(ans, i);
            }
            System.out.println(ans);
        }
        sc.close();
    }

    private static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    private static long gcd(long a, long b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

}