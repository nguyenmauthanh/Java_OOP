/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptit;

import java.util.Scanner;

/**
 *
 * @author Non Sleeping
 */
public class bai29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t > 0) {
            String s = input.next();
            int dem = 0;
            for (int i = 0; i < s.length() / 2; i++) {
                if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                    dem++;
                }
            }
            if(s.length() % 2 == 1) {
                if(dem <= 1) {
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
            }
            else {
                if(dem == 1) {
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
            }
            t--;
        }
    }
}
