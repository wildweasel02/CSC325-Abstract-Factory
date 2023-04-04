/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.laurabuibas.csc325assignmentweek10;

/**
 * this class is a professional variation of the pants family
 * @author laurabuibas
 */
public class ProfessionalPant implements Pants{
    // constructor, calls the method to match variation
    public ProfessionalPant() { pants(); }
    
    // method shows that a professional pant has been matched to the variation
    @Override
    public void pants() {
         System.out.println("A professional pant is matched to the variation");
    }
    
}
