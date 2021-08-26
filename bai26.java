package nmt.ptit;

import java.util.ArrayList;
import java.util.Scanner;

public class bai26 {
    public static void main(String[] args) {
        // mang FIBO
        ArrayList<Long> a= new ArrayList<Long>();
        a.add((long) 0);
        a.add((long) 1);
        for(int k=2;k<=100;k++){
            Long b=a.get(k-2);
            Long c=a.get(k-1);
            a.add(b+c);
        }
        //
        Scanner input = new Scanner(System.in);
        int t=input.nextInt();
        for(int i=0;i<t;i++){
            long n=input.nextLong();
            int check=0;
            for(int j=0;a.get(j)<=n;j++){
                if(a.get(j)==n){
                    System.out.println("YES");
                    check=1;break;
                }
            }
            if(check==0) System.out.println("NO");
        }
    }
}