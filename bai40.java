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
public class bai40 {
     public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int k=input.nextInt();
        int a[]= new int[k];
        for (int i=0; i<k; i++){
            a[i]=i+1;
        }
        int dem=0;
        while(dung!=1){
            for(int j=0;j<k;j++) System.out.print(a[j]);
            System.out.print(" ");
            in(a,n,k);
            dem++;
        }
        System.out.println();
        System.out.println("Tong cong co "+dem+" to hop");
    } 
    static int dung=0;
    public static void in(int a[], int n, int k){
        int i=k-1;
        while (i>=0 && a[i]==n-k+i+1) i--;
        if (i>=0) {
            a[i]++;
            for (int j=i+1; j<k; j++) {
                a[j]=a[i]+j-i;
            }
        } else dung=1;
    }   
}
