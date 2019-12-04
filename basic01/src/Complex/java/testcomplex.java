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
public class testcomplex {
    public static void main(String[] args) {
        complex x = new complex() ;
        x.shows();
        complex sp1= new complex(5);
        sp1.shows();
        complex sp2 = new complex(3,4);
        sp2.shows();
        complex sp3=new complex(4,5);
        sp3.shows();
        complex kq1=sp2.cong(sp3);
        kq1.shows();
        complex kq2=sp2.tru(sp3);
        kq2.shows();
        complex kq3=sp2.nhan(sp3);
        kq3.shows();
        complex kq4=sp2.chia(sp3);
        kq4.shows();
    }
}
