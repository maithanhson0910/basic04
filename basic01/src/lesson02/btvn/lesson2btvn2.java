/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic01.btvn;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author son maithanh
 */
public class lesson2btvn2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rd;
        rd =(int) (Math.random() * 10);
        int so;
        so = rd;
        int doan = 0;
        System.out.println("doan so: ");

        while (true) {

            doan = input.nextInt();
            if (doan < so) {
                System.out.println("qua thap, thu lai: ");
                continue;
            } else {
                if (doan > so) {
                    System.out.println("qua cao, thu lai: ");
                    continue;
                } else {
                    System.out.println("doan dung");
                    break;
                }
            }

        }
    }
}
