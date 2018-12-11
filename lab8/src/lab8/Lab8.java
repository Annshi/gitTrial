/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

/**
 *
 * @author Admin
 */
public class Lab8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 12341;
        System.out.printf( "\nMax digit of %d is %d ", num,  MaxDigit.defineMax(num));
        System.out.printf( "\nIs perfect? %b", PerfectNumber.isPerfect(num));                            
    }
    
}
