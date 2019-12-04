/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Point.java;

/**
 *
 * @author son maithanh
 */
public class point {
    String ten;
    int hoanhDo;
    int tungDo;
    int caoDo;
    public point(){
        this.ten = "null";
        this.hoanhDo=1;
        this.tungDo=1;
        this.caoDo=1;
        
    }
    public point(String ten,int hoanhdo,int tungdo,int caodo){
        this.ten = ten;
        this.hoanhDo=hoanhdo;
        this.tungDo=tungdo;
        this.caoDo=caodo;
        
    }
    void show(){
        System.out.println("toa do diem "+this.ten+" : ");
        System.out.println("hoanh do: "+this.hoanhDo);
        System.out.println("tung do: "+this.tungDo);
        System.out.println("cao do: "+this.caoDo);
    }
}
