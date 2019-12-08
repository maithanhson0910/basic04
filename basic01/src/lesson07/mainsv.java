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
public class mainsv {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sinhvien[] SV = new sinhvien[100];
        int count = 0;
        for (int i = 0; i < 100; i++) {
            SV[i]=new sinhvien();
            SV[i].nhapSV();

            count++;
        }
        while (true) {
            System.out.println("------------------------------");
            System.out.println("1.Hien thi danh sach sinh vien");
            System.out.println("2.Them sinh vien");
            System.out.println("3.Sua sinh vien");
            System.out.println("4.Xoa sinh vien");
            System.out.println("Chon 1 2 3 4");
            int i = sc.nextInt();
            switch (i) {
                case 1:
                    for (int j = 0; j < count; j++) {
                        SV[j].show();
                    }
                    break;
                case 2:
                    System.out.println("so sv them: ");
                    int b = count + sc.nextInt();
                    for (int j = count - 1; j < b; j++) {
                        SV[j]=new sinhvien();
                        SV[j].nhapSV();
                    }
                    break;
                case 3:
                    System.out.println("sinh vien so: ");
                    int c = sc.nextInt();
                    SV[c - 1].nhapSV();
                    break;
                case 4:
                    System.out.println("sinh vien so: ");
                    int d = sc.nextInt();
                    sinhvien e = new sinhvien();
                    SV[d - 1] = e;
                    break;
            }
        }
    }

}
