package nmt.ptit;

import java.util.Scanner;

public class bai23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        while (t > 0) {
            String s = input.nextLine();
            s = s.trim();
            s = s.replaceAll("\\s+", " ");
            String[] list = s.split(" ");
            String tmp = "";
            for(int i = 1; i < list.length;i++) {
            	tmp += String.valueOf(list[i].charAt(0)).toUpperCase();
            	for(int j = 1; j < list[i].length();j++) {
            		tmp += String.valueOf(list[i].charAt(j)).toLowerCase();
            	}
            	if(i+1 == list.length) {
            		tmp += "";
            	}
            	else {
            		tmp += " ";
            	}
            }
            tmp += ", ";
            tmp += list[0].toUpperCase();
            System.out.println(tmp);
            
            t--;
        }

	}

}
