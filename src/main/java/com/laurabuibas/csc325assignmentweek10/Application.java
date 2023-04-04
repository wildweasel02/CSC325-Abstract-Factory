/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.laurabuibas.csc325assignmentweek10;

/**
 *
 * @author laurabuibas
 */
public class Application {
    // member variables
     private GarmentFactory factory;
     private Tops top;
     private Pants pant;
     private Shoes shoes;

     // constructor, sets the factory to a specific factory variation
     public Application(GarmentFactory factory) {
         this.factory = factory; 
     }
     
     // creates a top with the variation based on the factory passed in
     public void createTop() { 
         this.top = factory.createTop();
     } 
     
     // creates pants with the variation based on the factory passed in
     public void createPants() { 
         this.pant = factory.createPant();
     } 
     
     // creates shoes with the variation based on the factory passed in
     public void createShoes() { 
         this.shoes = factory.createShoes();
     } 
}
