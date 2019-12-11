/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson07;

import java.util.Scanner;

/**
 *
 * @author son maithanh
 */
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] value = new String[2];
        value[0] = "";
        value[1] = "";
        PhanSo sum = new PhanSo(0, 1);
        while (true) {
            System.out.println("nhap phan so: ");
            String input = sc.nextLine();
            if (input == "-1") {
                break;
            } else {
                for (int i = 0; i < input.length(); i++) {
                    int temp = 0;
                    if (input.charAt(i) == '/') {
                        temp++;
                        continue;
                    }
                    value[temp] += input.charAt(i);

                }
                int tu = Integer.parseInt(value[0]);
                int mau = Integer.parseInt(value[1]);
                PhanSo p = new PhanSo(tu, mau);
                sum.cong(p);
            }
        }
        sum.hienthi();
        sum.rutgon();
    }

}
