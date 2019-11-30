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
public class bai1 {

    public static void main(String[] args) {
//Viết 1 hàm đầu vào là 1 mảng int, đầu ra là true nếu mảng đó là đối xứng, false nếu ngược lại        
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu cua mang: ");
        x=sc.nextInt();
        int[] input = new int[x];
        System.out.println("nhap mang: ");
        for (int i = 0; i < x; i++) {
            input[i] = sc.nextInt();
        }

        ktMangdoixung(input);
        System.out.println("mang doi xung: " + ktMangdoixung(input));

    }

    public static boolean ktMangdoixung(int[] a) {
        boolean returnStatement = true;
        for (int i = 0; i < a.length / 2; i++) {
            if (a[i] != a[a.length - 1 - i]) {
                returnStatement = false;
                break;
            }
        }
        return returnStatement;
    }

}
