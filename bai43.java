package nmt.ptit;



//--------- Import --------- \\
import java.util.Scanner;

public class bai43 {

    static long [] p = new long[100];

    public static char Try(int n, long k){
        if(n == 1) return '0';
        if(n == 2) return '1';
        if(k <= p[n - 2]){
            return Try(n - 2, k);
        }
        return Try(n - 1, k - p[n - 2]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t != 0){
            int n = sc.nextInt();
            long m = sc.nextLong();
            p[1] = 1;
            p[2] = 1;
            for(int i = 3;i <= 92;i++){
                p[i] = p[i - 1] + p[i - 2];
            }
            System.out.println(Try(n, m));
            t--;
        }
        sc.close();
    }
}