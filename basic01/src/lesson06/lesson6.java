/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson06;

/**
 *
 * @author son maithanh
 */
public class lesson6 {

    public static void main(String[] args) {

        PhanSo p = new PhanSo();
        p.tuSo = 5;
        p.mauSo = 8;
        p.ten = "A";
        System.out.println(p.ten + ":" + p.tuSo + "/" + p.mauSo);
        PhanSo p1 = new PhanSo(3, 4);
        int a = 10;//initilize
        p.hienThi();
        PhanSo p3 = new PhanSo(3, 4, "b");
        p3.hienThi();
        PhanSo t = new PhanSo(40,32,"g");
        t.hienThi();
        t.rutGon();
        t.hienThi();

    }
}
