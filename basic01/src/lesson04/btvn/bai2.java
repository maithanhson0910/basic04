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
//Viết 1 hàm đầu vào là 2 số nguyên, nếu tích của 2 số đó là 1 số chia hết cho 3 và 5 thì trả về true. nếu không thì trả về false
public class bai2 {

    public static void main(String[] args) {
        
        int[] input1 = new int[2];
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap mang: ");
        for (int i = 0; i < 2; i++) {
            input1[i] = sc.nextInt();
        }
        chiaHet(input1);
        System.out.println("tich 2 so chia het cho 3 va 5: "+chiaHet(input1));
    }

    private static boolean chiaHet(int[] input1) {
        int sum = 0;
        boolean returnStatement;
        sum = input1[0] * input1[1];

        if (sum % 3 == 0) {
            if (sum % 5 == 0) {
                returnStatement = true;
            } else {
                returnStatement = false;
            }
        } else {
            returnStatement = false;
        }
        return returnStatement;
    }
}
