/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson05.btvn;

import java.util.Scanner;

/**
 *
 * @author son maithanh
 */
public class NewClass {

    static Scanner sc = new Scanner(System.in);
    static char[][] MAP = new char[3][3];
    static nhap X, O;

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                MAP[i][j] = '-';
            }
        }

        while (true) {
            hienThiMap();
            nhapX();

            if (kiemTraThang()) {
                break;
            }

            hienThiMap();
            nhapO();

            if (kiemTraThang()) {
                break;
            }
        }
    }

    public static void hienThiMap() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((char) MAP[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void nhapX() {

        System.out.println("nhap toa do X");
        while (true) {
            System.out.println("nhap hang ");
            X.hang = sc.nextInt() - 1;
            System.out.println("nhap  cot ");
            X.cot = sc.nextInt() - 1;
            if (kiemTra(X)) {
                MAP[X.hang][X.cot] = 'X';
                break;
            }
        }
    }

    public static void nhapO() {

        System.out.println("nhap toa do O");
        while (true) {
            System.out.println("nhap hang ");
            O.hang = sc.nextInt() - 1;
            System.out.println("nhap  cot ");
            O.cot = sc.nextInt() - 1;
            if (kiemTra(O)) {
                MAP[O.hang][O.cot] = 'O';
                break;
            }
        }
    }

    private static boolean kiemTra(nhap i) {
        if (i.hang > 2) {
            System.out.println("ngoai khu vuc choi, nhap lai: ");
            hienThiMap();
            return false;
        } else if (i.hang > 2) {
            System.out.println("ngoai khu vuc choi, nhap lai: ");
            hienThiMap();
            return false;
        } else if (MAP[i.hang][i.cot] == 'O') {
            System.out.println("trung O, nhap lai: ");
            hienThiMap();
            return false;
        } else if (MAP[i.hang][i.cot] == 'X') {
            System.out.println("trung X, nhap lai: ");
            hienThiMap();
            return false;
        } else {
            return true;
        }

    }

    public static boolean kiemTraThang() {
        boolean check = false;
        if (MAP[0][0] == MAP[0][1] && MAP[0][0] == MAP[0][2] && MAP[0][0] == 'X') {
            System.out.println(MAP[0][0] + " thang");
            check = true;
        }
        if (MAP[1][0] == MAP[1][1] && MAP[1][0] == MAP[1][2] && MAP[1][0] == 'X') {
            System.out.println(MAP[1][0] + " thang");
            check = true;
        }
        if (MAP[2][0] == MAP[2][1] && MAP[2][0] == MAP[2][2] && MAP[2][0] == 'X') {
            System.out.println(MAP[2][0] + " thang");
            check = true;
        }
        if (MAP[0][0] == MAP[1][0] && MAP[0][0] == MAP[2][0] && MAP[0][0] == 'X') {
            System.out.println(MAP[0][0] + " thang");
            check = true;
        }
        if (MAP[0][1] == MAP[1][1] && MAP[0][0] == MAP[2][1] && MAP[0][1] == 'X') {
            System.out.println(MAP[0][1] + " thang");
            check = true;
        }
        if (MAP[0][2] == MAP[1][2] && MAP[0][0] == MAP[2][2] && MAP[0][2] == 'X') {
            System.out.println(MAP[0][2] + " thang");
            check = true;
        }
        if (MAP[0][0] == MAP[1][1] && MAP[0][0] == MAP[2][2] && MAP[0][0] == 'X') {
            System.out.println(MAP[0][0] + " thang");
            check = true;
        }
        if (MAP[0][2] == MAP[1][1] && MAP[0][2] == MAP[2][0] && MAP[0][2] == 'X') {
            System.out.println(MAP[0][3] + " thang");
            check = true;
        }
        if (MAP[0][0] == MAP[0][1] && MAP[0][0] == MAP[0][2] && MAP[0][0] == 'O') {
            System.out.println(MAP[0][0] + " thang");
            check = true;
        }
        if (MAP[1][0] == MAP[1][1] && MAP[1][0] == MAP[1][2] && MAP[1][0] == 'O') {
            System.out.println(MAP[1][0] + " thang");
            check = true;
        }
        if (MAP[2][0] == MAP[2][1] && MAP[2][0] == MAP[2][2] && MAP[2][0] == 'O') {
            System.out.println(MAP[2][0] + " thang");
            check = true;
        }
        if (MAP[0][0] == MAP[1][0] && MAP[0][0] == MAP[2][0] && MAP[0][0] == 'O') {
            System.out.println(MAP[0][0] + " thang");
            check = true;
        }
        if (MAP[0][1] == MAP[1][1] && MAP[0][0] == MAP[2][1] && MAP[0][1] == 'O') {
            System.out.println(MAP[0][1] + " thang");
            check = true;
        }
        if (MAP[0][2] == MAP[1][2] && MAP[0][0] == MAP[2][2] && MAP[0][2] == 'O') {
            System.out.println(MAP[0][2] + " thang");
            check = true;
        }
        if (MAP[0][0] == MAP[1][1] && MAP[0][0] == MAP[2][2] && MAP[0][0] == 'O') {
            System.out.println(MAP[0][0] + " thang");
            check = true;
        }
        if (MAP[0][2] == MAP[1][1] && MAP[0][2] == MAP[2][0] && MAP[0][2] == 'O') {
            System.out.println(MAP[0][3] + " thang");
            check = true;
        }
        return check;
    }
}

class nhap {

    int hang;
    int cot;
}
