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
public class NewClass {
    public static void main(String[] args) {
        int[] arr = {6,3,6,2,1};
        for(int i : arr){
            System.out.println(i);
        }
        
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap");//a/b
        String input =sc.nextLine();
        for(String s : input.split("/")){
            System.out.println(s);
        }
        
    }
        
}
