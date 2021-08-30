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
public class bai63 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int test = sc.nextInt();
        while(test -- > 0){
            String s = sc.next();
            int n =s.length();
            int x = s.length();
            
            while(x>0){
                s = s.replaceAll("100", "");
                x = x - 3;
            }
            System.out.println(n-s.length());
        }
        
    }
}
