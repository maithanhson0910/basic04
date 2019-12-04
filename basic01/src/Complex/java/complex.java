/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson06.btvn;

/**
 *
 * @author son maithanh
 */
class complex {

    String loai = "SOTHUC";
    String ten;
    int phanthuc;
    int phanao;

    //default constructor
    public complex() {
        ten = "chuadatten";
        phanthuc = 1;
        phanao = 1;
    }

    public complex(int a) {
        this.phanthuc = a;
    }

    public complex(int phanthuc, int phanao) {

        this.phanthuc = phanthuc;
        this.phanao = phanao;
    }

    complex cong(complex sophuc) {
        complex ketqua = new complex();
        ketqua.phanthuc = this.phanthuc + sophuc.phanthuc;
        ketqua.phanao = this.phanao + sophuc.phanao;
        return ketqua;
    }

    complex tru(complex sophuc) {
        complex ketqua = new complex();
        ketqua.phanthuc = this.phanthuc - sophuc.phanthuc;
        ketqua.phanao = this.phanao - sophuc.phanao;
        return ketqua;
    }

    complex nhan(complex sophuc) {
        complex ketqua = new complex();
        ketqua.phanthuc = this.phanthuc * sophuc.phanthuc - this.phanao * sophuc.phanao;
        ketqua.phanao = this.phanthuc * sophuc.phanao + this.phanao * sophuc.phanthuc;
        return ketqua;
    }

    complex chia(complex sophuc) {
        complex ketqua = new complex();
        ketqua.phanthuc = (sophuc.phanthuc * this.phanthuc + this.phanao * sophuc.phanao) / (this.phanthuc ^ 2 + this.phanao ^ 2);
        ketqua.phanao = (this.phanthuc * sophuc.phanao - sophuc.phanthuc * this.phanao) / (this.phanthuc ^ 2 + this.phanao ^ 2);
        return ketqua;
    }

    void shows() {
        System.out.println(this.ten + " : " + this.phanthuc +" + "+ this.phanao + "*i");
    }
}
