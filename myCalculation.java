/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qaswatech.corejava_2.inheritance;

/**
 *
 * @author Mohammad Tauheed
 */
public class myCalculation {
    
    int z;
    
    public void addition(int x, int y){
        z = x+y;
        System.out.println("Addition of x and y "+z);
    } 
    
    public void subtraction(int x, int y){
        z = x-y;
        System.out.println("Subtraction of x and y : "+z);
    }
    
    public void multiplication(int x, int y){
        z = x*y;
        System.out.println("multiplication "+z);
    }
}
