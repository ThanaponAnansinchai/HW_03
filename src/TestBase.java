
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mosulola
 */
public class TestBase {
    static int SIZE = 2;
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        int n[][] = new int[SIZE][SIZE]; // สร้าง Array เริ่มต้น
            
           
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    n[i][j] = sc.nextInt(); // วนรับค่า
                    
                } 
    } 
            Base AA = new Base(n);
            ComplexMatrix s = new ComplexMatrix(n);
            Binary ss = new Binary(n);
            BinaryComplex sss = new BinaryComplex(n);
            System.out.println(AA.Tran()+"");
            System.out.println(s);
            System.out.println(ss);
            System.out.println(sss);
            
        }
    
}
