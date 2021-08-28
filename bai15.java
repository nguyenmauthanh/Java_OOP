package nmt.ptit;

import java.util.ArrayList;
import java.util.Scanner;

public class bai15 {
    public static void main(String args[]) {
        int mx = 10000001;
        ArrayList<Integer> prime = new ArrayList<Integer>();
        boolean[] isPrime = new boolean[mx];
        for (int i = 2; i < mx; ++i)
            isPrime[i] = true;
        for (int i = 2; i * i < mx; ++i) {
            if (isPrime[i]) {
                prime.add(i);
                for (int j = i * i; j < mx; j += i)
                    isPrime[j] = false;
            }
        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        while (n-- > 0) {
            int x = sc.nextInt();
            int i = 0;
            while (x > 1) {
                if (isPrime[x]) {
                    ans += x;
                    break;
                }
                while (x % prime.get(i) == 0) {
                    ans += prime.get(i);
                    x /= prime.get(i);
                }
                i++;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
