/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mosulola
 */
public class Binary extends Base{

    public Binary() {
    }

    public Binary(int[][] val) {
        super(val);
    }

    
    
    @Override
    public String toString() {
        int[][] a = super.getMatrix();
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%07d",Integer.parseInt(Integer.toBinaryString(a[i][0])));
            System.out.printf(" %07d",Integer.parseInt(Integer.toBinaryString(a[i][1])));
            System.out.println(" ");

            
        }
        return "";
    }
    
    
}
