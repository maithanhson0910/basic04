/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson08.btvn;

import java.util.Scanner;

/**
 *
 * @author son maithanh
 */
public class NewClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value = new String();
        System.out.println("nhap mang: ");
        value = sc.nextLine();
        String[] s1 = new String[2];
        
        int n = 0;
        for (String s : value.split("x")) {
            s1[n] = s;
            n++;
        }
        int kq = Integer.parseInt(s1[0]) * Integer.parseInt(s1[1]);
        System.out.println(kq);
    }
}
