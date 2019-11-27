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
public class lesson3btvn2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //nhập vào 1 mảng số nguyên dương 1 chiều độ dài tùy ý
        System.out.println("nhap do dai mang: ");
        int v = sc.nextInt();
        int[] a = new int[v];
        System.out.println("nhap so nguyen duong: ");
        for (int i = 0; i < v; i++) {

            while (true) {
                System.out.println("so thu " + (i + 1) + ": ");
                a[i] = sc.nextInt();
                if (a[i] <= 0) {
                    System.out.println("nhap sai, nhap lai");

                } else {
                    break;
                }

            }

        }

        //Chuyển mọi phần tử có giá trị lẻ trong mảng thành -1
        for (int i = 0; i < 10; i++) {
            if (a[i] % 2 != 0) {
                a[i] = -1;
            }
        }
        //In ra phần tử lớn nhất của mảng
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 10; i++) {

            if (max < a[i]) {
                max = a[i];
            }

        }
        System.out.println(max);
        //Chuyển phần tử nhỏ nhất trong mảng thành -1
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 10; i++) {

            if (min > a[i]) {
                min = a[i];
            }

        }
        for (int i = 0; i < 10; i++) {
            if (min == a[i]) {
                a[i] = -1;
            }
        }
        //Nhập vào 1 số tự nhiên x, In ra mọi phần tử nhỏ hơn x ở trong mảng
        System.out.println("nhap so tu nhien x: ");
        int x = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            if (a[i] < x) {
                System.out.println(a[i] + " ");
            }
        }
        //Nhập vào 1 số tự nhiên x , in ra phần tử có giá trị gần với giá trị của x nhất ở trong mảng
        /*System.out.println("nhap so tu nhien x1: ");
        int x1 = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            int min1 = Integer.MAX_VALUE;
            if ((a[i] - x) > 0) {
                if (min1 > (a[i] - x)) {
                    min1 = a[i];
                }
            } else {
                if ((a[i] - x) < 0) {

                    if (min1 > (x - a[i])) {
                        min1 = a[i];
                    }

                }
            }
        }*/
        System.out.println("nhap vao x: ");
        int input = sc.nextInt();
        int minSub = Math.abs(a[0]-input);
        for (int i =0; i<input;i++){
            int temp = Math.abs(a[i]-input);
            if(temp<minSub){
                minSub=temp;
            }
        }
        
        
        //Kiểm tra sự đối xứng của mảng , vd: 1 2 3 2 1 là 1 mảng đối xứng
        boolean check = true;
        for ( int i = 0; i< (a.length/2); i++){
            if(a[i]!=a[a.length -1-i]){
                check=false;
            }
        }
        if (check ){
            System.out.println("mang doi xung");
        }else System.out.println("mang khong doi xung");
        
        /*for (int i = 0; i < ; i++) {
            if (a[i - 1] == a[i + 1]) {
                if (a[i - 2] == a[i + 2]) {
                    System.out.println("mang doi xung");
                } else {
                    System.out.println("mang khong doi xung");
                }
            } else {
                System.out.println("mang khong doi xung");
            }
        }*/
    }
}
