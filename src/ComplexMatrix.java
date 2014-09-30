/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mosulola
 */
public class ComplexMatrix extends Base{

    public ComplexMatrix() {
    }

    public ComplexMatrix(int[][] val) {
        super(val);
    }
    
       
    
    @Override
    public String toString() {
        int[][] a = super.getMatrix();
        
        
        System.out.println(a[0][0]+" "+(-a[0][1]));
        System.out.println(a[0][1]+" "+a[0][0]);
        System.out.println();
        System.out.println(a[1][0]+" "+(-a[1][1]));
        System.out.println(a[1][1]+" "+a[1][0]);
            
        return "";
    }

    
        
    
    
}
