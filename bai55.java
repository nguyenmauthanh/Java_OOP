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
public class bai55 {
     public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int n=input.nextInt();

        int a[]= new int[n];

        for(int i=0;i<n;i++) a[i]=input.nextInt();

        int b[][] = new int[n][n];

        int a0=a[0];

        for(int h=1;h<n;h++){

            int key=a[h];

            int cs=h;

            while(cs>0 && a[cs-1]>key){

                a[cs]=a[cs-1];

                cs--;

            }

            a[cs]=key;

            for(int l=0;l<n;l++) b[h][l]=a[l];

        }

        for(int i=n-1;i>0;i--){

            System.out.print("Buoc "+i+": ");

            for(int j=0;j<=i;j++){

                System.out.print(b[i][j]+" ");

            }

            System.out.println();

        }

        System.out.println("Buoc 0: "+a0);

    }  
}
