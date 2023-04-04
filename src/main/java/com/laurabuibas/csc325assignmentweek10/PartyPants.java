/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.laurabuibas.csc325assignmentweek10;

/**
 * this class is a party variation of the pants family
 * @author laurabuibas
 */
public class PartyPants implements Pants{
    // constructor, calls the method to match variation
    public PartyPants() { pants(); }
    
    // method shows that a party pant has been matched to the variation
    @Override
    public void pants() {
         System.out.println("A party pant is matched to the variation");
    }
    
}
