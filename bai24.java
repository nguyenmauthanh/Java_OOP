/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptit;

/**
 *
 * @author Non Sleeping
 */
import java.util.ArrayList;
import java.util.Scanner;

public class bai24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0) {
            String s1 = input.next();
            String s2 = input.next();
            while(s1.length() < s2.length()) s1 = '0' + s1;
            while(s1.length() > s2.length()) s2 = '0' + s2;
            if(s1.compareToIgnoreCase(s2) < 0) {
                String temp = s1;
                s1 = s2;
                s2 = temp;
            }
            int du = 0;
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = s1.length() - 1; i >= 0; i--) {
                int s =  (s1.charAt(i) - '0') - (s2.charAt(i) - '0') - du;
                if(s < 0) {
                    s = (s1.charAt(i) - '0') - (s2.charAt(i) - '0') - du + 10;
                    du = 1;
                }
                else {
                    s = (s1.charAt(i) - '0') - (s2.charAt(i) - '0') - du;
                    du = 0;
                }
                arr.add(s);
            }
            for (int i = arr.size() - 1; i >= 0; i--) {
                System.out.print(arr.get(i));
            }
            System.out.println();
        }
    }
}
