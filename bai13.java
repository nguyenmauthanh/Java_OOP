package nmt.ptit;

import java.util.Scanner;

public class bai13 {

	static int ok(int a,String b)
    {
        int res=0;
        for(int i=0;i<b.length();i++)
        {
            res=(res*10+b.charAt((int) i)-'0')%a;
        }
        return res;
    }
    static int gcd(int a,int b)
    {
        if(b==0) return a;
        return gcd(b, a%b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t>0)
        {
            int a=sc.nextInt();
            String b=sc.next();
            int numb=ok(a, b);
            System.out.println(gcd(a, numb));
            t--;
        }
    }
}
