/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson4;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author son maithanh
 */
public class SapXep {

    public static void main(String[] args) {
        int a[] = {4, 2, 5, 1, 6, 3, 7, 8, 9};
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        phanSo ps1 = new phanSo();
        ps1.tuSo = 3;
        ps1.mauSo = 4;
        phanSo ps2 = new phanSo();
        ps2.tuSo = 4;
        ps2.mauSo = 5;
        phanSo psArray[] = {ps1,ps2};
        for (int i = 0; i < psArray.length; i++) {
            for (int j = i + 1; j < psArray.length; j++) {
                if (ps1.tuSo*ps2.mauSo-ps2.tuSo*ps1.mauSo<0) {
                    phanSo temp = psArray[i];
                    psArray[i] = psArray[j];
                    psArray[j] = temp;
                }
            }
        }
        System.out.println(psArray.tuSo[0]);
    }

}

class phanSo {

    int tuSo;
    int mauSo;
    
}
