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
public class bai25 {
    public static Scanner sc =  new Scanner(System.in);
    public static void main(String[] args){
        int t = sc.nextInt();
        while(t > 0){
            long n = sc.nextLong();
            long max = -1;
            for(int i = 2; i<= Math.sqrt(n);i++){
                while(n % i == 0){
                    if(i > max) max = i;
                    n /= i;
                }
     
            }
            if(n != 1) max = Math.max(max, n );
            System.out.println(max);
            t-=1;
            
        }
    }
}
