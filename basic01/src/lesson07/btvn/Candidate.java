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
public class Candidate {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("nhap so sinh vien: ");
        int n = sc.nextInt();
        thisinh[] TS = new thisinh[n];

        for (int i = 0; i < n; i++) {
            TS[i] = new thisinh();
            TS[i].nhapTS();
        }
        for (int i = 0; i < n; i++) {
            TS[i].tsTren15d();
        }

    }
}
