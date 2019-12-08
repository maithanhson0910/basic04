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
public class PhanSo {

    public Scanner sc = new Scanner(System.in);
    private int tu, mau;

    void nhapPS() {
        System.out.println("nhap phan so: ");
        String input = sc.nextLine();
        String[] value = new String[2];
        value[0] = "";
        value[1] = "";
        int temp = 0;
        for (int i = 0; i < input.length(); i++) {

        }
    }

    public void cong(PhanSo p) {
        
        this.tu = this.tu * p.mau + this.mau * p.tu;
        this.mau = this.mau*p.mau;
       
    }

    void nhapTu() {
        System.out.println("nhap tu: ");
        this.tu = sc.nextInt();
    }

    void nhapMau() {
        System.out.println("nhap mau: ");
        this.mau = sc.nextInt();
    }

    PhanSo tong(PhanSo k) {
        PhanSo kq = new PhanSo();
        kq.tu = this.tu * k.mau + this.mau * k.tu;
        kq.mau = this.mau * k.mau;
        return kq;
    }

    public PhanSo() {

    }

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;

    }

    void hienthi() {
        System.out.println(tu + "/" + mau);
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }
    void rutgon(){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<this.mau;i++){
            if(this.tu%i==0){
                max=i;
            }
        }
        this.tu/=max;
        this.mau/=max;
    }
}
