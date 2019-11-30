/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic01;

import java.util.Scanner;

/**
 *
 * @author son maithanh
 */
public class lesson4_method {
//    viet 1 ham chuyen vao 1 so dau ra la true neu so day la so nguyen to, k p so nguyen to tra ve la false

    /* public static boolean songuyento(int a) {
     int count = 0;
     for (int i = 1; i <= a; i++) {
     if (a % i == 0) {
     count++;
     }

     }
     if (count == 2) {
     return true;
     } else {
     return false;
     }
     }

     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("nhap so can tim: ");
     int a = sc.nextInt();
     songuyento(a);
     System.out.println(songuyento(a));
     }*/
//nhap vao 1 so in ra tat ca so nguyen to nho hon co do
    public static int timUoc(int a) {
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                count++;
            }

        }
        return count;

    }

    public static boolean checkSNT(int a) {
        
        boolean returnStament = false;
        for (int i = 2; i <= a; i++) {
            timUoc(i);
            if (timUoc(i) == 2) {
                returnStament = true;
            } else {
                returnStament = false;
            }
        }

        return returnStament;
    }

    public static void inRaSNT(int a) {
        for (int i = 2; i < a; i++) {
            checkSNT(i);
            if (checkSNT(i) == true) {
                System.out.println(i);

            }
        }

    }
    public static void main(String[] args) {
        System.out.println("nhap so: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        inRaSNT(a);
    }
}
