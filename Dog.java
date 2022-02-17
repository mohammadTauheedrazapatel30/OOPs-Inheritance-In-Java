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
public class Dog extends Animal{
    
    public static void main(String[] args) {
        
        Dog dog = new Dog();
        
        Animal animal = dog;
        
        System.out.println(dog instanceof Animal);
        System.out.println(animal instanceof Dog);
        
        dog.move();
    }
     
    @Override
    public void move(){
         super.move();
         System.out.println("Dogs can walk and bark");
    }
 
}
