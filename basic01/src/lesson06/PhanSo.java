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
public class PhanSo {

    //propreties
    String ten;
    int tuSo;
    int mauSo;

    PhanSo() {//default constructor
        ten = "chuadatten";
        tuSo = 1;
        mauSo = 1;

    }

    PhanSo(int a, int b) {//overload
        ten = "khong ten";
        tuSo = a;
        mauSo = b;
    }

    PhanSo(PhanSo p) {
        tuSo = p.tuSo;
        mauSo = p.mauSo;
    }
    //constructor

    public PhanSo(String ten, int tuSo, int mauSo) {
        this.ten = ten;
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    //methods
    void hienThi() {
        System.out.println(ten + ":" + tuSo + "/" + mauSo);
    }

    double giaTri() {
        double giatri = tuSo / (double) mauSo;
        return giatri;
    }

    PhanSo(int tuSo, int mauSo, String ten) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
        this.ten = ten;
    }

    PhanSo cong(PhanSo x) {
        PhanSo ketqua = new PhanSo();
        ketqua.tuSo = x.tuSo * this.mauSo + x.mauSo * this.tuSo;
        ketqua.mauSo = x.mauSo * this.mauSo;
        return ketqua;
    }

    void rutGon() {
        int uoc = 1;
        int ts = Math.abs(tuSo);
        int ms = Math.abs(mauSo);
        for (int i = ms; i > 0; i--) {
            if (ts % i == 0 && ms % i == 0) {
                uoc = i;
                break;
            }
        }
        tuSo /= uoc;
        mauSo /= uoc;
    }
}
