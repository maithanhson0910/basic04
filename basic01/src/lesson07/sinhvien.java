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
class sinhvien {

    Scanner sc = new Scanner(System.in);
    String ten;
    int mssv;
    int tuoi;
    String sex;

    public sinhvien() {
        this.ten = "ten";
        this.mssv = 0;
        this.tuoi = 0;
        this.sex = "sex";
    }

    public sinhvien(String ten, int mssv, int tuoi, String sex) {
        this.ten = ten;
        this.mssv = mssv;
        this.tuoi = tuoi;
        this.sex = sex;
    }

    void show() {
        System.out.println("Ten sinh vien: " +this.ten);
        System.out.println("MSSV sinh vien: " + this.mssv);
        System.out.println("Tuoi sinh vien: " + this.tuoi);
        System.out.println("Gioi tinh: " + this.sex);
    }
    void themSV(){
        System.out.println("them so sinh vien: ");
        int a = sc.nextInt();
        
    }
    void nhapSV() {
        
        System.out.println("Ten sinh vien: ");
        this.ten = sc.nextLine();
        System.out.println("MSSV sinh vien: ");
        this.mssv = sc.nextInt();
        sc.nextLine();
        System.out.println("Tuoi sinh vien: ");
        this.tuoi = sc.nextInt();
        sc.nextLine();
        System.out.println("Gioi tinh: ");
        this.sex = sc.nextLine();
        
    }
    void suaSV(){
        
    }
    
    
}
