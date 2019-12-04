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
public class gameXO3x3 {

    static int hangX, cotX, hangO, cotO;
    static Scanner sc = new Scanner(System.in);
    static char[][] MAP = new char[3][3];
    static int count = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                MAP[i][j] = '-';
            }
        }
        hangO = -10;
        cotO = -10;
        while (true) {
            hienThiMap();
            nhapX();
            if (kiemTraThang()) {
                hienThiMap();
                break;
            }
            count++;
            if (count == 9) {
                System.out.println("hoa");
                break;
            }
            hienThiMap();
            nhapO();
            if (kiemTraThang()) {
                hienThiMap();
                break;
            }
            count++;

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

            hangX = sc.nextInt() - 1;
            System.out.println("nhap  cot ");
            cotX = sc.nextInt() - 1;
            if (hangX > 2) {
                System.out.println("ngoai khu vuc choi, nhap lai: ");
                hienThiMap();
            } else if (cotX > 2) {
                System.out.println("ngoai khu vuc choi, nhap lai: ");
                hienThiMap();
            } else if (MAP[hangX][cotX] == 'O') {
                System.out.println("trung O, nhap lai: ");
                hienThiMap();
            } else if (MAP[hangX][cotX] == 'X') {
                System.out.println("trung X, nhap lai: ");
                hienThiMap();
            } else {
                MAP[hangX][cotX] = 'X';
                break;
            }

        }

    }

    public static void nhapO() {
        System.out.println("nhap toa do O");
        while (true) {

            System.out.println("nhap hang ");
            hangO = sc.nextInt() - 1;
            System.out.println("nhap  cot ");
            cotO = sc.nextInt() - 1;
            if (hangO > 2) {
                System.out.println("ngoai khu vuc choi, nhap lai: ");
                hienThiMap();

            } else if (cotO > 2) {
                System.out.println("ngoai khu vuc choi, nhap lai: ");
                hienThiMap();
            } else if (MAP[hangO][cotO] == 'X') {
                System.out.println("trung X, nhap lai: ");
                hienThiMap();
            } else if (MAP[hangO][cotO] == 'O') {
                System.out.println("trung O, nhap lai: ");
                hienThiMap();
            } else {
                MAP[hangO][cotO] = 'O';
                break;
            }
        }

    }

    public static boolean kiemTraThang() {
        boolean check = false;
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                if (MAP[i][0] == MAP[i][1] && MAP[i][0] == MAP[i][2] && (MAP[i][0] == 'X'||MAP[i][0]=='O')) {
//                    System.out.println(MAP[i][0] + " thang");
//                    check = true;
//                }
//                if (MAP[0][j] == MAP[1][j] && MAP[0][j] == MAP[2][j] && (MAP[0][j] == 'X'||MAP[0][j]=='O')) {
//                    System.out.println(MAP[0][j] + " thang");
//                    check = true;
//                }
//                
//            }
//        }
//        if (MAP[0][0] == MAP[1][1] && MAP[0][0] == MAP[2][2] && (MAP[0][0] == 'O'||MAP[0][0] == 'X')) {
//            System.out.println(MAP[0][0] + " thang");
//            check = true;
//        }
//        if (MAP[0][2] == MAP[1][1] && MAP[2][0] == MAP[1][1] && (MAP[0][2] == 'O'||MAP[0][2] == 'O')) {
//            System.out.println(MAP[0][2] + " thang");
//            check = true;
//        }
        
        int[][] a = new int[3][3];
        for(int i = 0; i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=MAP[i][j];
            }
        }
        switch(){
            
        }
        return check;

    }

}
