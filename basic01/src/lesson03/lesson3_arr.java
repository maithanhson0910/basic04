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
public class lesson3_arr {

    public static void main(String[] args) {
        /*        TIM SO LON NHAT SO BE NHAT  
         int[] arr = new int[10];
         Scanner sc = new Scanner(System.in);
         for (int i = 0; i < arr.length; i++) {
         System.out.println("nhap mang: ");
         arr[i] = sc.nextInt();

         }

         for (int i = 0; i < arr.length; i++) {
         int temp = 0;
         int max = Integer.MIN_VALUE;
         int min = Integer.MAX_VALUE;
         if (arr[i] < arr[i + 1]) {
               
         if(arr[i]>max){
         max=arr[i];
         }
         if(arr[i]<min){
         min=arr[i];
         }
         System.out.println("so lon nhat: " + arr[0]);
         System.out.println("so be nhat: " + arr[9]);
         }

         }*/

        /*        TIM SO SO TRIONG MANG
         int[] arr = new int[10];
         Scanner sc = new Scanner(System.in);
         for (int i = 0; i < arr.length; i++) {
         System.out.println("nhap mang " + (i+1) +" ");
         arr[i] = sc.nextInt();

         }
         System.out.println("nhap so can tim: ");
         int x = sc.nextInt();
         int count = 0;
         for (int i = 0; i < arr.length; i++) {

         if (x==arr[i]) {
         count++;
         }

         }
         System.out.println(count);*/
        /*   
         char[] c = {'s','o','n'};
         System.out.println(c);
         String s = new String("son1234");
         String s1 = new String(c);
         String s2 = "son1234";
         System.out.println(s2.length());        
         System.out.println(s);
         char value = s1.charAt(0);
         System.out.println(value);
         String value2 = s1.substring(1);
         System.out.println(value2);
         sc.nextLine();
         */
       /* Scanner sc = new Scanner(System.in);
        System.out.println("nhap chuoi: ");
        String a = sc.nextLine();
        String b = "!@#$%^&*()";
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    System.out.println("mang cho ky tu dac biet");
                    break;
                }
            }
        }
        
        int[][] arr2chieu = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15}
        };
        */
         
        Scanner sc = new Scanner(System.in);
        int[][] arr1 = new int[3][4];
        for(int i = 0; i<3; i++){
            System.out.println("hang " +i);
            
            for(int j = 0; j<4;j++){
                System.out.println("cot "+j);
                arr1[i][j]=sc.nextInt();
                
            }
        }
       for(int i = 0; i<3; i++){
           for(int j = 0; j<4;j++){
               System.out.print(arr1[i][j]+ " ");
               
           }
           System.out.print("\r\n");
       }
    }
}


