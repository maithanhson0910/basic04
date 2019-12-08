/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson07.btvn;

import java.util.Scanner;

/**
 *
 * @author son maithanh
 */
//Nhập một mảng số nguyên . In ra màn hình các phần tử xuất hiện trong mảng đúng 2 lần
public class songuyen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n: ");
        int n = sc.nextInt();
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("phan tu " + i + ": ");
            input[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                } else if (input[i] == input[j]) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(input[i]);
            }
        }
    }
}
