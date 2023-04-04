/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.laurabuibas.csc325assignmentweek10;

/**
 * this garment factory creates professional garments
 * @author laurabuibas
 */
public class ProfessionalGarmentFactory implements GarmentFactory{

    // class constructor, calls the methods to create the specific garment variation
    public ProfessionalGarmentFactory() {
        createTop(); 
        createPant(); 
        createShoes(); 
    }

    // method creates a professional top
    @Override
    public Tops createTop() {
        return new ProfessionalTop(); 
    }

    // method creates a professional pant
    @Override
    public Pants createPant() {
        return new ProfessionalPant(); 
    }

    // method creates a professional shoe
    @Override
    public Shoes createShoes() {
        return new ProfessionalShoes();
    }
    
}
