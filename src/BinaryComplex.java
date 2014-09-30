/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mosulola
 */
public class BinaryComplex extends Binary{

    public BinaryComplex() {
    }

    public BinaryComplex(int[][] val) {
        super(val);
    }
    
    public String toString() {
        int[][] a = super.getMatrix();
        
        
        System.out.println(Integer.toBinaryString(a[0][0])+" "+Integer.toBinaryString(-a[0][1]));
        
        System.out.println(Integer.toBinaryString(a[0][1])+" "+Integer.toBinaryString(a[0][0]));
        System.out.println();
        System.out.println(Integer.toBinaryString(a[1][0])+" "+Integer.toBinaryString(-a[1][1]));
        System.out.println(Integer.toBinaryString(a[1][1])+" "+Integer.toBinaryString(a[1][0]));
            
        return "";
    }
    
}
