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
//Viết 1 hàm đầu vào là 1 mảng dữ liệu dạng Char, đầu ra là mảng đó với những kí tự đã được sắp xếp theo thứ tự tăng dần
public class bai3 {

    /*    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String input;
     System.out.println("nhap char: ");
     input = sc.next();
     sapXep(input);
     System.out.println(sapXep(input));
     }

     public static String sapXep(String input) {
     for (int i = 0; i < input.length(); i++) {
     for (int j = 1; j < input.length(); j++) {
     if (input.charAt(i) > input.charAt(j)) {
     char temp = input.charAt(i);
     input.charAt(i) = input.charAt(j);
     input.charAt(j) = temp;
     }
     }
     }
     return input;
     }
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so ky tu: ");
        int n = sc.nextInt();
        int[] carr = new int[n];
        for (int i = 0; i < carr.length; i++) {
            carr[i] = sc.nextInt();
        }
        for (int i = 0; i < carr.length; i++) {
            for (int j = 0; j < carr.length; j++) {
                if (carr[i] > carr[j]) {
                    int temp = carr[i];
                    carr[i] = carr[j];
                    carr[j] = temp;
                }
            }
        }
        for (int i = 0; i < carr.length; i++) {
            System.out.println((char) carr[i]);
        }
    }
}
