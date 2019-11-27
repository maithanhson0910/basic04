/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson4.btvn;

import java.util.Scanner;

/**
 *
 * @author son maithanh
 */
public class bai4 {

    public static void main(String[] args) {

        int[] a = new int[10];

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap mang: ");
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }

        if (mangGiam(a) == 1) {
            System.out.println("-1");
        } else {
            if (mangTang(a) == 1) {
                System.out.println("1");
            } else {
                if (mangKTKG(a) == 1) {
                    System.out.println("0");
                }
            }
        }

    }

    public static int mangTang(int[] a) {
        int count = 0;
        for (int i = 0; i < 9; i++) {

            if (a[i] > a[i + 1]) {
                count++;
            }

        }
        if (count == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int mangGiam(int[] a) {
        int count = 0;
        for (int i = 0; i < 9; i++) {

            if (a[i] < a[i + 1]) {
                count++;
            }

        }
        if (count == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int mangKTKG(int[] a) {
        if (mangTang(a) == 0) {
            if (mangGiam(a) == 0) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
}
