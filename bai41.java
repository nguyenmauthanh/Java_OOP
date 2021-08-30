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
public class bai41 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int n=input.nextInt();

        int a[]= new int[n];

        for(int i=0;i<n;i++) a[i]=input.nextInt();

        int b[][] = new int[n-1][n];

        for(int h=0;h<n-1;h++){

            int csmin=h;

            for(int j=h+1;j<n;j++){

                if(a[csmin]>a[j]) csmin=j;

            }

            int t=a[h];

            a[h]=a[csmin];

            a[csmin]=t;

            for(int l=0;l<n;l++) b[h][l]=a[l];

        }

        for(int i=n-2;i>=0;i--){

            System.out.print("Buoc "+(i+1)+": ");

            for(int j=0;j<n;j++){

                System.out.print(b[i][j]+" ");

            }

            System.out.println();

        }

    }    
}
