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

public class MaxDigit {
    public static int defineMax(int numb) {
        
        int max = getDigit(numb);//for max take last digit

        while (numb / 10 != 0) {
            int next = getDigit(numb = numb / 10);
            if (max < next) {
                max = next;
            }
        }
        return max;
    }

    public static int getDigit(int numb) {
        return numb % 10;
    }
}