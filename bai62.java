package nmt.ptit;

import java.util.Scanner;

public class bai62 {
	public static Scanner sc = new Scanner(System.in);
	public static boolean check(String str)
    {
        int n = str.length();
      
        int o = 0, e = 0;
        for (int i=0; i<n; i++)
        {
            
            if (i%2 == 0)
                o += (str.charAt(i)-'0');
            else
                e += (str.charAt(i)-'0');
        }
      
        
        return ((o - e) % 11 == 0);
    }
	
	public static void main(String[] args) {
		int dem = sc.nextInt();
		while(dem > 0) {
			String str;
			str = sc.next();
			if(check(str)) {
            System.out.println(1);}
			else {
            System.out.println(0);}
			dem--;
		}
	}
}
