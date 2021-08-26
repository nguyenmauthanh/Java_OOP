package nmt.ptit;

import java.util.Scanner;

public class bai22 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        while (t > 0) {
            String s = input.nextLine();
            s = s.trim();
            s = s.replaceAll("\\s+", " ");
            
            String[] fullName = s.split(" ");
            String temp = "";
            for (int i = 0; i < fullName.length; i++) {
                temp += String.valueOf(fullName[i].charAt(0)).toUpperCase();
                for (int j = 1; j < fullName[i].length(); j++) {
                    temp += String.valueOf(fullName[i].charAt(j)).toLowerCase();
                }
                temp += " ";
            }
            System.out.println(temp);
            t--;
        }
    }

}
