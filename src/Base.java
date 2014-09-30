/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mosulola
 */
public class Base {

    private int SIZE = 2; //default 
    private int[][] a = new int[SIZE][SIZE];

    public Base() {
    }


    public Base(int[][] val) {
        SIZE = val.length;
        a = new int[SIZE][SIZE];
        for (int i = 0; i < val.length; i++) {
            for (int j = 0; j < val.length; j++) {
                a[i][j] = val[i][j];
            }
        }
    }

    public Base Tran() {

        int[][] T = new int[SIZE][SIZE];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                T[j][i] = a[i][j];
            }
        }
        return new Base(T);
    }
    
    public int getSize(){
        return this.SIZE;
    }
    
    public int[][] getMatrix(){
        
        return a;
        
    }
     @Override
    public String toString() { //ใช้ในการปริ้น Object
         for (int i = 0; i < a.length; i++) {
             for (int j = 0; j < a.length; j++) {
                 System.out.print(a[i][j]+" ");
             }
             System.out.println();
         }
        return "";
    }
}
