package nmt.ptit;

import java.math.BigInteger;
import java.util.Scanner;

public class bai52 {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            String a=sc.next();
            String b=sc.next();
            BigInteger a1=new BigInteger(a);
            BigInteger b1=new BigInteger(b);
            System.out.println(a1.add(b1));
            t--;
        }
    }

}
