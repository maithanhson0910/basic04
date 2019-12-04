/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson05;

import java.util.Scanner;

/**
 *
 * @author son maithanh
 */
public class enemy {

    static Scanner sc = new Scanner(System.in);
    static int X, Y, ENDX, ENDY, ENIMYX, ENIMYY;
    static char[][] MAP = new char[10][10];
    static int count = 0;

    public static void main(String[] args) {
       
        X = 2;
        Y = 2;
        ENDX = (int) (Math.random() * 10);
        ENDY = (int) (Math.random() * 10);
        ENIMYX = (int) (Math.random() * 10);
        ENIMYY = (int) (Math.random() * 10);
        while (true) {
            if (ENDX == X && ENDY == Y && ENIMYX == X && ENIMYY == Y) {
                ENDX = (int) (Math.random() * 10);
                ENDY = (int) (Math.random() * 10);
                ENIMYX = (int) (Math.random() * 10);
                ENIMYY = (int) (Math.random() * 10);
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
                } else if (i == ENIMYX && j == ENIMYY) {
                    MAP[i][j] = 'E';
                } else {
                    MAP[i][j] = '-';
                }
            }
        }

        while (true) {
            hienThiMap();
            char input = diChuyen();
            thayDoiToaDo(input);
            chay();
            if (count<=10) {
                if (checkThangThua() == 1) {
                    System.out.println("ban thang");
                    hienThiMap();
                    break;
                } else if (checkThangThua() == -1) {
                    System.out.println("ban thua");
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
        int i = (int) (Math.random() * 4);

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
        switch (i) {
            case 1:
                MAP[ENDX][ENDY] = '-';
                ENDX = ENDX - 1;
                if (ENDX == -1) {
                    ENDX = 9;
                }
                MAP[ENDX][ENDY] = 'O';
                break;
            case 2:
                MAP[ENDX][ENDY] = '-';
                ENDX = ENDX + 1;
                if (ENDX == 10) {
                    ENDX = 0;
                }
                MAP[ENDX][ENDY] = 'O';
                break;
            case 3:
                MAP[ENDX][ENDY] = '-';
                ENDY = ENDY + 1;
                if (ENDY == 10) {
                    ENDY = 0;
                }
                MAP[ENDX][ENDY] = 'O';
                break;
            case 4:
                MAP[ENDX][ENDY] = '-';
                ENDY = ENDY - 1;
                if (ENDY == -1) {
                    ENDY = 9;
                }
                MAP[ENDX][ENDY] = 'O';
                break;
        }
        
    }

    private static int checkThangThua() {

        if (X == ENDX && Y == ENDY) {
            return 1;
        } else if (X == ENIMYX && Y == ENIMYY) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void chay() {
        if(ENIMYX-X<0&&ENIMYY-Y<0){
            enimy(3);
            return;
        } 
        if(ENIMYX-X>0&&ENIMYY-Y>0){
            enimy(4);
            return;
        }
        if(ENIMYX-X>0&&ENIMYY-Y<0){
            enimy(1);
            return;
        }
        if(ENIMYX-X<0&&ENIMYY-Y>0){
            enimy(2);
            return;
        }
        if(ENIMYX-X==0&&ENIMYY-Y<0){
            enimy(3);
            return;
        }
        if(ENIMYX-X<0&&ENIMYY-Y==0){
            enimy(2);
            return;
        }
        if(ENIMYX-X>0&&ENIMYY-Y==0){
            enimy(1);
            return;
        }
        if(ENIMYX-X==0&&ENIMYY-Y>0){
            enimy(4);
            return;
        }
    }

    public static void enimy(int j) {
        switch (j) {
            case 1:
                MAP[ENIMYX][ENIMYY] = '-';
                ENIMYX = ENIMYX - 1;
                if (ENIMYX == -1) {
                    ENIMYX = 9;
                }
                MAP[ENIMYX][ENIMYY] = 'E';
                break;
            case 2:
                MAP[ENIMYX][ENIMYY] = '-';
                ENIMYX = ENIMYX + 1;
                if (ENIMYX == 10) {
                    ENIMYX = 0;
                }
                MAP[ENIMYX][ENIMYY] = 'E';
                break;
            case 3:
                MAP[ENIMYX][ENIMYY] = '-';
                ENIMYY = ENIMYY + 1;
                if (ENIMYY == 10) {
                    ENIMYY = 0;
                }
                MAP[ENIMYX][ENIMYY] = 'E';
                break;
            case 4:
                MAP[ENIMYX][ENIMYY] = '-';
                ENIMYY = ENIMYY - 1;
                if (ENIMYY == -1) {
                    ENIMYY = 9;
                }
                MAP[ENIMYX][ENIMYY] = 'E';
                break;
        }
    }
}
