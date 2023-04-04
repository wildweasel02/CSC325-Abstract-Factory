/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.laurabuibas.csc325assignmentweek10;

/**
 * this garment factory creates party garments
 * @author laurabuibas
 */
public class PartyGarmentFactory implements GarmentFactory{
    // class constructor, calls the methods to create the specific garment variation    
    public PartyGarmentFactory() {
        createTop(); 
        createPant(); 
        createShoes(); 
    }
    
    // method creates a party top
    @Override
    public Tops createTop() {
        return new PartyTop(); 
    }

    // method creates a party pant
    @Override
    public Pants createPant() {
        return new PartyPants(); 
    }

    // method creates a party shoe
    @Override
    public Shoes createShoes() {
        return new PartyShoes(); 
    }
    
}
