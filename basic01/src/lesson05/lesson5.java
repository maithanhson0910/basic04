/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic01;

import java.util.Scanner;

/**
 *
 * @author son maithanh
 */
public class lesson5 {

    static Scanner sc = new Scanner(System.in);
    static int X, Y, ENDX, ENDY;
    static char[][] MAP = new char[10][10];
    static int count = 0;

    public static void main(String[] args) {
        X = 2;
        Y = 2;
        ENDX = (int) (Math.random() * 10);
        ENDY = (int) (Math.random() * 10);
        while (true) {
            if (ENDX == X && ENDY == Y) {
                ENDX = (int) (Math.random() * 10);
                ENDY = (int) (Math.random() * 10);
            } else {
                break;
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == X && j == Y) {
                    MAP[i][j] = 'X';
                } else if (i == ENDX && j == ENDY) {
                    MAP[i][j] = 'O';
                } else {
                    MAP[i][j] = '-';
                }

            }
        }

        while (true) {
            hienThiMap();
            char input = diChuyen();
            thayDoiToaDo(input);
            boolean check = checkThangThua();
            if (count <= 10) {
                if (check) {
                    System.out.println("ban thang");
                    break;
                }
            } else {
                System.out.println("ban thua");
                break;
            }
        }
    }

    private static void hienThiMap() {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(MAP[i][j] + " ");

            }
            System.out.println("");
        }

    }

    private static char diChuyen() {
        System.out.println("nhap di chuyen: ");
        String add = sc.nextLine();
        char x = add.charAt(0);
        return x;
    }

    private static void thayDoiToaDo(char x) {

        switch (x) {
            case 'w':
                MAP[X][Y] = '-';
                X = X - 1;
                if (X == -1) {
                    X = 9;
                }
                MAP[X][Y] = 'X';
                count++;
                break;
            case 'a':
                MAP[X][Y] = '-';
                Y = Y - 1;
                if (Y == -1) {
                    Y = 9;
                }
                MAP[X][Y] = 'X';
                count++;
                break;
            case 's':
                MAP[X][Y] = '-';
                X = X + 1;
                if (X == 10) {
                    X = 0;
                }
                MAP[X][Y] = 'X';
                count++;
                break;
            case 'd':
                MAP[X][Y] = '-';
                Y = Y + 1;
                if (Y == 10) {
                    Y = 0;
                }
                MAP[X][Y] = 'X';
                count++;
                break;

        }

    }

    private static boolean checkThangThua() {

        if (X == ENDX && Y == ENDY) {
            return true;
        }
        return false;

    }
}
