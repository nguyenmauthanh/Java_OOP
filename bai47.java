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
public class bai47 {
       public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        while(test-- > 0){
        int n=input.nextInt();

        int a[]= new int[n];

        for(int i=0;i<n;i++) a[i]=input.nextInt();

        int b[][] = new int[n-1][n];

        int dem1=0;

        for(int h=0;h<n;h++){

            int dem=0;

            for(int j=0;j<n-1;j++){

                int l=j+1;

                if(a[j]>a[l]){

                    dem++;

                    int t=a[j];a[j]=a[l];a[l]=t;

                }

            }

            if(dem==0) break;

            else{

                dem1++;

                for(int l=0;l<n;l++) b[h][l]=a[l];

            }

        }

        for(int i=dem1-1;i>=0;i--){

            System.out.print("Buoc "+(i+1)+": ");

            for(int j=0;j<n;j++) System.out.print(b[i][j]+" ");

            System.out.println();

        }

    }
       }
}

