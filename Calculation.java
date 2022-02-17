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
// extends keyword is used to inherit the properties of another class
public class Calculation extends myCalculation{
    
    
    public static void main(String[] args) {
      int z;
      
      Calculation calci = new Calculation();
      
      myCalculation mycal = calci;
      
      calci.addition(3, 5);
      calci.subtraction(5, 4);
      
      mycal.multiplication(3, 4);
    } 
}
