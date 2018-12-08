/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laba8;

/**
 *
 * @author Admin
 */
public class Laba8 {

  /*
 * Copyright (c) 1994-1999 Sun Microsystems, Inc.
 * All Rights Reserved.
 */
/**
 * The main class Main is the starting point of the program.
 *
 * @version          1.3 02 June 2018
 * @author           Shiman Anna
 */

    public static void main(String[] args){


        int num = 12341;
        System.out.printf( "\nMax digit of %d is %d ", num,  MaxDigit.defineMax(num));
        System.out.printf( "\nIs %d palindrom? %b ", num, Palindrom.isPalindrom(num));
        System.out.printf( "\nIs perfect? %b", PerfectNumber.isPerfect(num));






    }

}
    

