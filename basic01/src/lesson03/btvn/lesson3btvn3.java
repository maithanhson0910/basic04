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
public class lesson3btvn3 {

    public static void main(String[] args) {
        //Nhập vào 1 mảng 10 phần tử, những phần tử đều tự nhập từ bàn phím
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("nhap mang, so" + i + ": ");
            a[i] = sc.nextInt();

        }
        //in ra những phần tử ở vị trí chẵn trong mảng đó
        for (int i = 0; i < 10; i++) {
            System.out.println("nhung phan tu o vi tri chan: ");
            if (i % 2 == 0) {
                System.out.print(a[i] + " ");
            }
            System.out.println("");
        }
        //in ra những phần tử lở vị trí lẻ trong mảng
        for (int i = 0; i < 10; i++) {
            System.out.println("nhung phan tu o vi tri le: ");
            if (i % 2 != 0) {
                System.out.print(a[i] + " ");
            }
            System.out.println("");
        }
        //in ra những phần tử chia hết cho 2
        for (int i = 0; i < 10; i++) {
            System.out.println("nhung phan tu chia het cho 2: ");
            if(a[i]%2==0){
                System.out.print(a[i]+" ");
            }
            System.out.println("");
        }
        //in ra những phần tử chia cho 5 dư 1
        for (int i = 0; i < 10; i++) {
            System.out.println("nhung phan tu chia 5 du 1: ");
            if(a[i]%5==1){
                System.out.print(a[i]+" ");
            }
        }
        //in ra tổng những phần tử chẵn của mảng
        for (int i = 0; i < 10; i++) {
            int sum = 0;
            System.out.println("tong nhung phan tu chan cua mang: ");
            if(a[i]%2==0){
                sum=sum+a[i];
            }
        }
    }

}
