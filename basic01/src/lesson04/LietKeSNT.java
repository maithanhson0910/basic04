/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson4;

import java.util.Scanner;

/**
 *
 * @author son maithanh
 */
public class LietKeSNT {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        boolean check[] = new boolean[n];
        check[0] = true;
        check[1] = false;
        for (int i = 2; i < n; i++) {
            if (check[i] == false) {
                System.out.println("so nguyen to " + i);
                for (int j = i * 2; j < n; j = j + i) {
                    check[j] = true;
                }
            }
        }

    }

}
