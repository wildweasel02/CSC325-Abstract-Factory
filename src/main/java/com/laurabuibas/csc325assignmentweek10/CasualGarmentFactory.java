/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.laurabuibas.csc325assignmentweek10;

/**
 * this garment factory creates casual garments
 * @author laurabuibas
 */
public class CasualGarmentFactory implements GarmentFactory{
    // class constructor, calls the methods to create the specific garment variation
    public CasualGarmentFactory() {
        createTop(); 
        createPant(); 
        createShoes(); 
    }
    
    // method creates a casual top
    @Override
    public Tops createTop() {
        return new CasualTop(); 
    }

    // method creates a casual pant
    @Override
    public Pants createPant() {
        return new CasualPant(); 
    }

    // method creates a casual shoe
    @Override
    public Shoes createShoes() {
        return new CasualShoes(); 
    }
    
}
