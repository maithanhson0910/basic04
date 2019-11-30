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
public class lesson2btvn1 {

    public static void main(String[] args) {
/*        Scanner input = new Scanner(System.in);
        System.out.println("nhap so thu 1: ");
        int s1 = input.nextInt();

        System.out.println("nhap so thu 2: ");
        int s2 = input.nextInt();

        System.out.println("nhap so thu 3: ");
        int s3 = input.nextInt();

        System.out.println("nhap so thu 4: ");
        int s4 = input.nextInt();

        System.out.println("nhap so thu 5: ");
        int s5 = input.nextInt();

        System.out.println("nhap so thu 6: ");
        int s6 = input.nextInt();

        System.out.println("nhap so thu 7: ");
        int s7 = input.nextInt();

        System.out.println("nhap so thu 8: ");
        int s8 = input.nextInt();

        System.out.println("nhap so thu 9: ");
        int s9 = input.nextInt();

        System.out.println("nhap so thu 10: ");
        int s10 = input.nextInt();

        int temp;
        temp = 0;

        if (s1 < s2) {
            temp = s1;
            s1 = s2;
            s2 = temp;
        }
        if (s3 < s4) {
            temp = s3;
            s3 = s4;
            s4 = temp;
        }
        if (s5 < s6) {
            temp = s5;
            s5 = s6;
            s6 = temp;
        }
        if (s7 < s8) {
            temp = s7;
            s7 = s8;
            s8 = temp;
        }
        if (s9 < s10) {
            temp = s9;
            s9 = s10;
            s10 = temp;
        }
        if (s1 < s3) {
            temp = s1;
            s1 = s3;
            s3 = temp;
        }
        if (s2 < s4) {
            temp = s2;
            s2 = s4;
            s4 = temp;
        }
        if (s5 < s7) {
            temp = s5;
            s5 = s6;
            s6 = temp;
        }
        if (s6 < s8) {
            temp = s6;
            s6 = s8;
            s8 = temp;
        }
        if (s1 < s5) {
            temp = s1;
            s1 = s5;
            s5 = temp;
        }
        if (s5 < s6) {
            temp = s5;
            s5 = s6;
            s6 = temp;
        }
        if (s4 < s8) {
            temp = s4;
            s4 = s8;
            s8 = temp;
        }
        if (s1 < s9) {
            temp = s1;
            s1 = s9;
            s9 = temp;
            System.out.println("so lon nhat: " + s1);
        }
        if (s8 < s10) {
            temp = s8;
            s8 = s10;
            s10 = temp;
            System.out.println("so be nhat: " + s10);
        }
        */
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i =0; i<=10; i++){
            System.out.println("input; ");
            int temp
            temp = sc.nextInt();
            if(temp>max){
                max=temp;
            }
            if(temp<min){
                min=temp;
            }
        }
    }
}
