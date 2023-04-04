/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.laurabuibas.csc325assignmentweek10;

/**
 * this class is a professional variation of the tops family
 * @author laurabuibas
 */
public class ProfessionalTop implements Tops {
    // constructor, calls the method to match variation
    public ProfessionalTop() { tops(); }
    
    // method shows that a professional top has been matched to the variation
    @Override
    public void tops() {
        System.out.println("A professional top is matched to the variation");
    }
}
