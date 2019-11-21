/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic01.btvn;

import java.util.Scanner;

/**
 *
 * @author son maithanh
 */
public class lesson3btvn1 {

    public static void main(String[] args) {

        int i;
        int j;
        int m;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so hang ma tran 1: ");
        i = sc.nextInt();
        System.out.println("nhap so cot ma tran 1: ");
        j = sc.nextInt();
        System.out.println("nhap so hang ma tran 2: ");
        m = sc.nextInt();
        System.out.println("nhap so cot ma tran 2: ");
        n = sc.nextInt();

        int[][] a = new int[i][j];
        int[][] b = new int[m][n];
        for (int k = 0; k < i; k++) {
            System.out.println("ma tran 1, hang " + k);
            for (int l = 0; l < j; l++) {
                System.out.println("cot " + l);
                a[k][l] = sc.nextInt();
            }
        }
        for (int k = 0; k < m; k++) {
            System.out.println("ma tran 2, hang " + k);
            for (int l = 0; l < n; l++) {
                System.out.println("cot " + l);
                b[k][l] = sc.nextInt();
            }

        }
        if (i == m) {
            if (j == n) {
                for (int k = 0; k < i; k++) {
                    for (int l = 0; l < j; l++) {
                        a[k][l] = a[k][l] + b[k][l];
                        System.out.print(a[k][l]+" ");
                    }
                    System.out.println("");
                }
            } else {
                System.out.println("KHONG CONG DUOC");
            }

        } else {
            System.out.println("KHONG CONG DUOC");
        }
    }
}
