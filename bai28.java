package nmt.ptit;

import java.util.Scanner;

public class bai28 {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dem =  Integer.parseInt(sc.nextLine());
		while(dem>0) {
			String s = sc.nextLine();
			s = s.trim();
            s = s.replaceAll("\\s+", " ");
            
            String[] fullName = s.split(" ");
            String tmp = "";
            for(int i = 0; i < fullName.length-1;i++) {
            	tmp += String.valueOf(fullName[i].charAt(0)).toLowerCase();
            }
            System.out.println(fullName[fullName.length - 1].toLowerCase() + tmp + "@ptit.edu.vn");
			dem--;
		}
	}

}
