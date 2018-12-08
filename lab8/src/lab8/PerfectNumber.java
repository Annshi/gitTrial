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
public class PerfectNumber {
    public static boolean isPerfect(int numb){
        return calcSumDividers(numb) == numb;
    }

    public static int calcSumDividers(int numb){
        int sum = 0;
        for(int i = 1; i < numb; i++){
            if(numb % i == 0){
                sum+= i;
            }
        }
        return sum;
    }
}
