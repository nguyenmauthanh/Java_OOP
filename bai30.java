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
public class bai30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t > 0){
            String a = sc.nextLine();
            String b = sc.nextLine();
            if(a.equalsIgnoreCase(b) == true){
                System.out.println(-1);
            }
            else {
                System.out.println(Math.max(a.length(), b.length()));
            }
            t--;
        }
        sc.close();
    }
    
}
