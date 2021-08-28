/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptit;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Non Sleeping
 */
public class bai17 {
    public static Scanner sc = new Scanner(System.in);
    public static int test(int a[] , int n , int sum){
        HashMap<Integer , Integer> hm = new HashMap<>();
        int count = 0;
        for(int i = 0; i < n;i++){
            
            if(hm.containsKey(a[i]) == false){
                hm.put(a[i], 0);
            }
            hm.put((a[i]), hm.get(a[i])+1);
        }
        for(int i = 0; i < n;i++){
            if(hm.get(sum - a[i]) != null){
                count += hm.get(sum - a[i]);
            }
        }
        
        return count / 2;
    }
    public static void main(String[] args){
        int test = sc.nextInt();
        while(test-- > 0){
            int n = sc.nextInt();
            int sum = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n;i++){
                a[i] = sc.nextInt();
            }
            System.out.println(test(a,n,sum)); 
        }
    }
}
